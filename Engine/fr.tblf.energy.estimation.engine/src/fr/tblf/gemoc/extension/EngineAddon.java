package fr.tblf.gemoc.extension;

import java.io.File;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.eclipse.ocl.pivot.utilities.ParserException;

import fr.tblf.energy.estimation.eel.Measure;
import fr.tblf.energy.estimation.eel.MeasureAttribute;
import fr.tblf.energy.estimation.eel.MeasureBinaryOperation;
import fr.tblf.energy.estimation.eel.MeasureCast;
import fr.tblf.energy.estimation.eel.MeasureOCL;
import fr.tblf.energy.estimation.eel.Platform;

public class EngineAddon implements IEngineAddon {

	public static File MODEL;
	private Platform platform;
	private OCL ocl = OCL.newInstance();
	private Map<String, Measure> mapClassEstimation;
	private long durationOfSequentialStep;
	
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
								resourceSet.getResource(URI.createFileURI(p.toUri().toURL().toString()), true);
								
							} catch (MalformedURLException e) {
								e.printStackTrace();
							}
						});
				
				Resource resource = resourceSet.getResources().stream().filter(r -> r.getURI().toString().endsWith(".eel")).findFirst().get();
				
				if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof Platform) {
					platform = (Platform) resource.getContents().get(0);					
				} else {
					throw new Exception("Could not load the model in the resource set");
				}
				
				mapClassEstimation = new HashMap<>();
				resource.getAllContents().forEachRemaining(eObject -> {
					if (eObject instanceof Measure && ((Measure) eObject).getTargetClass() != null) {
						EObject target = EcoreUtil.resolve(((EObject) ((Measure) eObject).getTargetClass()), resourceSet);
						System.out.println("Loaded target "+target);
						mapClassEstimation.put(((Measure) eObject).getTargetClass().getName(), (Measure)eObject);
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
		displayPlatformMeasurement(platform);
		IEngineAddon.super.engineStarted(executionEngine);
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		durationOfSequentialStep = System.currentTimeMillis();		
	}
	
	
	public void stepExecuted(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		durationOfSequentialStep = System.currentTimeMillis() - durationOfSequentialStep;
		System.out.println("Step lasted "+durationOfSequentialStep);
		
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();		
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction(); 								
		
		System.out.println("Running step on object "+caller);
				
		//TODO : Operation estimation. right now this is only the class
		if (mapClassEstimation.get(caller.eClass().getName()) != null) {
			System.out.println("Found a measure targeting the executed element");
			Measure m = mapClassEstimation.get(caller.eClass().getName());
			updateMeasure(m, caller);
			System.out.println(m.value());
		}
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
	}
	
	private void updateMeasure(MeasureAttribute m, EObject caller) {
		System.out.println("Updating Measure "+m.getName());
		EAttribute att = m.getAtt();
		Object object = caller.eGet(caller.eClass().getEAttributes().stream().filter(eAtt -> eAtt.getName().equals(att.getName())).findFirst().get());
		
		m.setValue(BigDecimal.valueOf(Long.valueOf(object.toString())));
	}
	
	private void updateMeasure(MeasureOCL m, EObject caller) {
		System.out.println("Updating Measure "+m.getName());
		String query = m.getOclQuery();
		try {
			OCLHelper helper = ocl.createOCLHelper(caller.eClass());
			ExpressionInOCL expression = helper.createQuery(query);
			m.setValue(BigDecimal.valueOf(Long.valueOf(ocl.evaluate(caller, expression).toString())));			
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	private void updateMeasure(MeasureBinaryOperation m, EObject caller) {
		System.out.println("Updating Measure "+m.getName());
		updateMeasure(m.getLeft(), caller);
		updateMeasure(m.getRight(), caller);
	}
	
	private void updateMeasure(MeasureCast m, EObject caller) {
		System.out.println("Updating Measure "+m.getName());
		updateMeasure(m.getMeasure(), caller);
	}
	
	private void updateMeasure(Measure m, EObject caller) {
		if (m instanceof MeasureBinaryOperation) {
			updateMeasure((MeasureBinaryOperation) m, caller);
		} else
		if (m instanceof MeasureOCL) {
			updateMeasure((MeasureOCL) m, caller);
		} else
		if (m instanceof MeasureAttribute) {
			updateMeasure((MeasureAttribute) m, caller);
		} else
		if (m instanceof MeasureCast) {
			updateMeasure((MeasureCast) m, caller);
		}
	}
	
	public static void displayPlatformMeasurement(Platform p) {
		
		p.getMeasures().forEach(m -> {
			topDownTreeAnalysis(m, (Measure measure) -> {
				System.out.print(measure.getName() +" " +measure.type()+" : "+measure.eClass().getName());
				if (measure.getTargetClass() != null)
					System.out.print(" -> "+measure.getTargetClass());
				if (measure.getTargetOperation() != null)
					System.out.print(" -> "+measure.getTargetOperation());
				
				System.out.println("");
				return null;
			}); 
		});
		
		System.out.println("");
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
