package org.atlanmod.energy.estimation.engine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

import org.atlanmod.energy.estimation.engine.calculus.CompositeMeasureCalculus;
import org.atlanmod.energy.estimation.metamodel.eel.CompositeMeasure;
import org.atlanmod.energy.estimation.metamodel.eel.ExponentialMeasure;
import org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure;
import org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure;
import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureCast;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureOCL;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation;
import org.atlanmod.energy.estimation.metamodel.eel.Platform;
import org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration;
import org.atlanmod.energy.estimation.smm.SmmModeler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.modisco.omg.smm.SmmFactory;
import org.eclipse.modisco.omg.smm.SmmModel;
import org.eclipse.modisco.omg.smm.SmmPackage;
import org.eclipse.modisco.omg.smm.impl.SmmModelImpl;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.eclipse.ocl.pivot.utilities.ParserException;

public class EngineAddon implements IEngineAddon {

	public static File MODEL;
	private Platform platform;
	private OCL ocl = OCL.newInstance();
	private Map<String, Measure> mapClassEstimation;
	private Map<String, Long> stepDurations;
	private ArrayList<SmmModeler<?,?>> smmModelers; //TODO: future update should enable multiple modelers at the same time
	
	@Override
	public void engineAboutToStart(IExecutionEngine<?> executionEngine)  {				
		
		IExecutionContext<?, ?, ?> ctx = executionEngine.getExecutionContext();		
		try {
			if (MODEL == null) { // We check that the model has been defined by the user.
				throw new FileNotFoundException("No model chosen ! Please choose an energy estimation model !");
			}
	
			System.out.println("Loading model ...");
			
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(URI.createURI(MODEL.toURI().toString()), true); 
			
			// We verify that the EEL model is properly loaded.
			if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof Platform) {
				platform = (Platform) resource.getContents().get(0);					
			} else {
				throw new IOException("Could not load the EEL model in the resource set");
			}
			
			// We need the meta-model of the language under execution. 
			// We simply check that it is in the executed model's repository.
			// This could be improved by letting the user specify in the GUI its model and meta-model
			Files	.walk(MODEL.getParentFile().toPath())
					.filter(p -> p.toFile().getName().endsWith(".ecore"))
					.forEach(p -> {
						try {
							System.out.println("Loading metamodel "+p.toFile().getName());								
							resourceSet.createResource(URI.createFileURI(p.toUri().toURL().toString()));
							
						} catch (MalformedURLException  e) {
							e.printStackTrace();
						}
					});		
			
			mapClassEstimation = new TreeMap<>();
			stepDurations = new HashMap<>();
			
			// Mapping of the targets defined in EEL to the meta classes defined by the xDSL
			resource.getAllContents().forEachRemaining(eObject -> {
				if (eObject instanceof Measure && ((Measure) eObject).getTargetClass() != null && ((Measure) eObject).getTargetOperation() != null) {
					//EObject target = EcoreUtil.resolve(((EObject) ((Measure) eObject).getTargetClass()), resourceSet);
					//System.out.println("Loaded target "+target);
					
					mapClassEstimation.put(((Measure) eObject).getTargetClass()+"#"+((Measure) eObject).getTargetOperation(), (Measure)eObject);
				}
			});
										
			System.out.println(platform.getName()+" estimation model loaded");
			initializeModelers(ctx, resourceSet);								
		} catch (IOException e) {
			System.out.println("An error occured while loading the EEL model.");
			e.printStackTrace();
			IEngineAddon.super.engineStopped(executionEngine);
		}
		IEngineAddon.super.engineAboutToStart(executionEngine);
	}
	
	/**
	 * Initialize the SMM models according to the options provided to the {@link IExecutionContext}.
	 * @param ctx the {@link IExecutionContext}.
	 * @param resourceSet a {@link ResourceSet}.
	 * @throws IOException if the smm model cannot be loaded nor created 
	 */
	private void initializeModelers(IExecutionContext<?,?,?> ctx, ResourceSet resourceSet) throws IOException {
		smmModelers = new ArrayList<>();
		Boolean isSmmModelToXMM = ctx.getRunConfiguration().getAttribute("org.atlanmod.energy.estimation.engine.smm_metamodel", false);
		Boolean isSmmModelToXModel = ctx.getRunConfiguration().getAttribute("org.atlanmod.energy.estimation.engine.smm_model", false);
		String smmModelFileAsString = ctx.getRunConfiguration().getAttribute("org.atlanmod.energy.estimation.engine.smm_file", "SmmModel");
		
		if(! isSmmModelToXMM && !isSmmModelToXModel) {
			return;
		}
		
		File xModelFile = new File(MODEL.getAbsolutePath());		
		File xModelRepositoryFile = new File(xModelFile.getParent());
		
		if (!xModelRepositoryFile.exists())
			xModelRepositoryFile.mkdirs();
		
		File smmModelFile = new File(xModelRepositoryFile, smmModelFileAsString);			
		
		SmmModel smmModel;
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());        
        SmmPackage.eINSTANCE.eClass(); // Loading SMM 
        
		if (smmModelFile.exists()) { // Loading the SMM Model
			Resource smmResource = resourceSet.getResource(URI.createURI(smmModelFile.toURI().toString()), true);
			smmModel = (SmmModelImpl) smmResource.getContents().get(0);			
		} else { // Creating the SMM Model
			smmModelFile.createNewFile();
			smmModel = SmmFactory.eINSTANCE.createSmmModel();
			Resource smmResource = resourceSet.createResource(URI.createURI(smmModelFile.toURI().toString()));
			smmResource.getContents().add(smmModel);
		}
		
		if (isSmmModelToXMM) {
			smmModelers.add(new SmmModeler<Double, EClass>(smmModel) {
				@Override
				public EClass callerToTarget(EObject caller) { 
					return caller.eClass();
				}				
			});
		} 
		
		if (isSmmModelToXModel) {
			smmModelers.add(new SmmModeler<Double, EObject>(smmModel) {
				@Override
				public EObject callerToTarget(EObject caller) { 
					return caller;
				}				
			});
		}
		
		smmModelers.forEach(smmModeler -> smmModeler.initializeSmmModelWithEelPlatform(platform));
	}
	
	@Override
	public void engineStarted(IExecutionEngine<?> executionEngine) {				
		IEngineAddon.super.engineStarted(executionEngine);
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {			
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();		
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction();
		String callerClass = caller.getClass().getInterfaces()[0].getSimpleName();		
		String callerOperation = operation.getName();
		String classOperation = callerClass.concat("#").concat(callerOperation);
		Measure m = mapClassEstimation.get(classOperation);
		
		stepDurations.put(classOperation, Long.valueOf(System.currentTimeMillis()));
		
		if (m != null && !(hasRealTimeDuration(m))) {			
			updateMeasure(m, caller, operation);
			try {
				BigDecimal output = m.value();
				System.out.println(classOperation+" consumed "+output);	
				
				manageEstimation(m, caller);
				
			} catch (Exception e) {				
				System.out.println(m.getName()+" - "+m.getSubname()+" cannot compute energy consumption");
			}		
		}
		
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
	}
	
	/**
	 * Models the estimation provided by EEL with SMM, using the defined Modelers.
	 * @param m a EEL {@link Measure}.
	 * @param caller the {@link EObject} under execution.
	 */
	@SuppressWarnings("unchecked")
	private void manageEstimation(Measure m, EObject caller) {
		for (SmmModeler smm : smmModelers) {
			smm.persistMeasurement(m, m.value().doubleValue(), smm.callerToTarget(caller));
		}				
	}
		

	@Override
	public void stepExecuted(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();						
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction();
		String callerClass = caller.getClass().getInterfaces()[0].getSimpleName();
		String callerOperation = operation.getName();
		String classOperation = callerClass.concat("#").concat(callerOperation);
		Measure m = mapClassEstimation.get(classOperation);		
		Long duration = System.currentTimeMillis() - stepDurations.get(classOperation);
		
		stepDurations.put(classOperation, Long.valueOf(duration));
		
		if (m != null && (hasRealTimeDuration(m))) {			
			updateMeasure(m, caller, operation);
			System.out.println(classOperation+" consumed "+m.value());
			manageEstimation(m, caller);
		}		
		
		IEngineAddon.super.stepExecuted(engine, stepToExecute);
	}
	
	@Override
	public void engineStopped(IExecutionEngine<?> engine) {
		if (smmModelers.size() > 0) {
			Resource resource = smmModelers.get(0).saveModel();
			System.out.println(resource.getURI()+ " saved.");
		}
		IEngineAddon.super.engineStopped(engine);
	}
	
	private void updateMeasure(MeasureAttribute m, EObject caller, EOperation operation) {
		
		String att = m.getAtt();
		Object object = caller.eGet(caller.eClass().getEAttributes().stream().filter(eAtt -> eAtt.getName().equals(att)).findFirst().get());		
		m.setValue(BigDecimal.valueOf(Long.valueOf(object.toString())));
	}
	
	private void updateMeasure(MeasureOCL m, EObject caller, EOperation operation) {
		String query = m.getOclQuery();
		
		try {
			OCLHelper helper = ocl.createOCLHelper(caller.eClass());
			ExpressionInOCL expression = helper.createQuery(query);
			m.setValue(new BigDecimal(ocl.evaluate(caller, expression).toString()));
		} catch (ParserException e) {
			System.err.println("Could not run query "+query+" \n on "+caller.getClass());
			e.printStackTrace();
		}		
	}
	
	private void updateMeasure(MeasureUnboundOperation m, EObject caller, EOperation operation) {
		m.getMeasures().forEach(measure -> updateMeasure(measure, caller, operation));
	}

	private void updateMeasure(MeasureBinaryOperation m, EObject caller, EOperation operation) {
		updateMeasure(m.getLeft(), caller, operation);
		updateMeasure(m.getRight(), caller, operation);
	}
	
	private void updateMeasure(MeasureCast m, EObject caller, EOperation operation) {
		updateMeasure(m.getMeasure(), caller, operation);
	}
	
	private void updateMeasure(RealTimeDuration m, EObject caller, EOperation operation) {
		String callerClass = caller.getClass().getInterfaces()[0].getSimpleName();		
		String callerOperation = operation.getName();
		String classOperation = callerClass.concat("#").concat(callerOperation);
		m.setValue(BigDecimal.valueOf(stepDurations.get(classOperation)));
	}
	
	private void updateMeasure(CompositeMeasure m, EObject caller, EOperation operation) {
		if (m instanceof LogisticMeasure) {
			LogisticMeasure lm = (LogisticMeasure) m;
			
			updateMeasure(lm.getK(), caller, operation);
			updateMeasure(lm.getL(), caller, operation);
			updateMeasure(lm.getX(), caller, operation);
			updateMeasure(lm.getX0(), caller, operation);		
						
			m.setValue(BigDecimal.valueOf(CompositeMeasureCalculus.computeLogisticFunction(lm)));
		} else if (m instanceof ExponentialMeasure) {
			updateMeasure(((ExponentialMeasure) m).getX(), caller, operation);
			m.setValue(BigDecimal.valueOf(CompositeMeasureCalculus.computeExponentialFunction((ExponentialMeasure) m)));
		} else if (m instanceof IntegrationMeasure) {
			updateMeasure(((IntegrationMeasure) m).getFunction(), caller, operation);
			updateMeasure(((IntegrationMeasure) m).getLeftBound(), caller, operation);
			updateMeasure(((IntegrationMeasure) m).getRightBound(), caller, operation);
			m.setValue(BigDecimal.valueOf(CompositeMeasureCalculus.computeIntegralFunction((IntegrationMeasure) m))); 
		}		
	}
	private void updateMeasure(Measure m, EObject caller, EOperation operation) {
		if (m instanceof MeasureBinaryOperation) {
			updateMeasure((MeasureBinaryOperation) m, caller, operation);
		} else
		if (m instanceof MeasureOCL) {
			updateMeasure((MeasureOCL) m, caller, operation);
		} else
		if (m instanceof MeasureAttribute) {
			updateMeasure((MeasureAttribute) m, caller, operation);
		} else
		if (m instanceof MeasureCast) {
			updateMeasure((MeasureCast) m, caller, operation);
		} else 
		if (m instanceof RealTimeDuration) {
			updateMeasure((RealTimeDuration) m, caller, operation);
		} else 
		if (m instanceof MeasureUnboundOperation) {
			updateMeasure((MeasureUnboundOperation) m, caller, operation);
		} else
		if (m instanceof CompositeMeasure) {
			updateMeasure((CompositeMeasure) m, caller, operation);
		}
		
		//System.out.println(m.getName()+" : "+m.value()+" "+m.type().getLiteral());
	}	
	
	public static boolean hasRealTimeDuration(Measure m) {					
		if (m.getPost()) {
			return true;
		} 
		
		if (m instanceof MeasureUnboundOperation) {
			return ((MeasureUnboundOperation) m).getMeasures().stream().anyMatch(EngineAddon::hasRealTimeDuration); 
		}
		
		if (m instanceof MeasureBinaryOperation) {
			return hasRealTimeDuration(((MeasureBinaryOperation) m).getLeft()) || hasRealTimeDuration(((MeasureBinaryOperation) m).getRight());
		}
		
		return false;		
	}

	public static void displayPlatformMeasurement(Platform p) {
		
		p.getMeasures().forEach(m -> {
			topDownTreeAnalysis(m, (Measure measure) -> {				
				if (measure.getTargetClass() != null)
					System.out.println(" -> "+measure.getTargetClass());
				if (measure.getTargetOperation() != null)
					System.out.println(" -> "+measure.getTargetOperation());
								
				return null;
			}); 
		});			
	}
	
	public static void topDownTreeAnalysis(Measure m, Function<Measure, Void> function) {
		function.apply(m);
		System.out.print("\t");
		m.eContents().stream()
		.filter(o -> o instanceof Measure)
		.map(o -> (Measure) o)
		.forEach(containedMeasure -> topDownTreeAnalysis(containedMeasure, function));
	}
}
