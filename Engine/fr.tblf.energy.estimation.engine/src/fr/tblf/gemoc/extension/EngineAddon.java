package fr.tblf.gemoc.extension;

import java.io.File;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.eclipse.ocl.pivot.utilities.ParserException;

import fr.tblf.energy.estimation.eel.CompositeMeasure;
import fr.tblf.energy.estimation.eel.ExponentialMeasure;
import fr.tblf.energy.estimation.eel.IntegrationMeasure;
import fr.tblf.energy.estimation.eel.LogisticMeasure;
import fr.tblf.energy.estimation.eel.Measure;
import fr.tblf.energy.estimation.eel.MeasureAttribute;
import fr.tblf.energy.estimation.eel.MeasureBinaryOperation;
import fr.tblf.energy.estimation.eel.MeasureCast;
import fr.tblf.energy.estimation.eel.MeasureOCL;
import fr.tblf.energy.estimation.eel.MeasureUnboundOperation;
import fr.tblf.energy.estimation.eel.Platform;
import fr.tblf.energy.estimation.eel.RealTimeDuration;
import fr.tblf.gemoc.extension.calculus.CompositeMeasureCalculus;

public class EngineAddon implements IEngineAddon {

	public static File MODEL;
	private Platform platform;
	private OCL ocl = OCL.newInstance();
	private Map<String, Measure> mapClassEstimation;
	private Map<String, Long> stepDurations;
	private long durationBeforeExecution;
	private long durationAfterExecution;
	private Measure systemPower;
	
	@Override
	public void engineAboutToStart(IExecutionEngine<?> executionEngine) {	
		if (MODEL == null) {
			System.out.println("No model chosen ! Please choose an energy estimation model !");
		} else {
			System.out.println("Loading model ...");
			try {
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResource(URI.createURI(MODEL.toURI().toString()), true);
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
				
				Resource resource = resourceSet.getResources().stream().filter(r -> r.getURI().toString().endsWith(".eel")).findFirst().get();
				
				if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof Platform) {
					platform = (Platform) resource.getContents().get(0);					
				} else {
					throw new Exception("Could not load the model in the resource set");
				}
				
				mapClassEstimation = new TreeMap<>();
				stepDurations = new HashMap<>();
				resource.getAllContents().forEachRemaining(eObject -> {
					if (eObject instanceof Measure && ((Measure) eObject).getTargetClass() != null && ((Measure) eObject).getTargetOperation() != null) {
						//EObject target = EcoreUtil.resolve(((EObject) ((Measure) eObject).getTargetClass()), resourceSet);
						//System.out.println("Loaded target "+target);
						
						mapClassEstimation.put(((Measure) eObject).getTargetClass()+"#"+((Measure) eObject).getTargetOperation(), (Measure)eObject);
					}
				});
				System.out.println(platform.getName()+" estimation model loaded");
			} catch (Exception e) {
				e.printStackTrace();
			}									
		}
		IEngineAddon.super.engineAboutToStart(executionEngine);
	}
	
	@Override
	public void engineStarted(IExecutionEngine<?> executionEngine) {
		
		System.out.println("Engine started ");
		// Find the model classloader		 		
		//variableRegistry = new VariableRegistry();
		//displayPlatformMeasurement(platform);
		IEngineAddon.super.engineStarted(executionEngine);
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {			
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();		
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction();
		String callerClass = caller.getClass().getInterfaces()[0].getSimpleName();		
		String callerOperation = operation.getName();
		String classOperation = callerClass.concat("#").concat(callerOperation);
		System.out.println(classOperation);
		Measure m = mapClassEstimation.get(classOperation);
		
		stepDurations.put(classOperation, Long.valueOf(System.currentTimeMillis()));
		
		if (m != null && !(hasRealTimeDuration(m))) {			
			updateMeasure(m, caller, operation);
			try {
				System.out.println(classOperation+" consumed "+m.value());	
			} catch (Exception e) {
				System.out.println(m.getName()+" - "+m.getSubname()+" cannot compute energy consumption");
			}
			
		}
		
//		updateMeasure(systemPower, caller, operation);
//		System.out.println("power: "+systemPower.value());
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
	}
	
	
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
			System.out.println("lasted "+duration);
			updateMeasure(m, caller, operation);
			System.out.println(classOperation+" consumed "+m.value());			
		}		
		
		IEngineAddon.super.stepExecuted(engine, stepToExecute);
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
			System.out.println("Updating logistic measure");
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
