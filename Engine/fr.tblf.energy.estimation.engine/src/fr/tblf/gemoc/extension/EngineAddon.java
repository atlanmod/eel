package fr.tblf.gemoc.extension;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.eclipse.ocl.pivot.utilities.ParserException;

import eel.Estimation;
import eel.MetaClass;
import eel.Operation;
import eel.Platform;
import eel.Variable;
import eel.Visibility;

public class EngineAddon implements IEngineAddon {

	public static File MODEL;
	private Platform platform;
	
	private Map<Class<?>, Estimation> mapClassEstimation;
	private Map<Step<?>, Long> mapOperationConsumption;
	
	private ClassLoader loader;
	private OCL ocl;
	private VariableRegistry variableRegistry;
	
	
	@Override
	public void engineAboutToStart(IExecutionEngine<?> executionEngine) {
		ocl = OCL.newInstance();
		if (MODEL == null) {
			System.out.println("No model chosen ! Please choose an energy estimation model !");
		} else {
			System.out.println("Loading model ...");
			try {
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResource(URI.createURI(MODEL.toURI().toString()), true);
				
				Resource resource = resourceSet.getResources().stream().filter(r -> r.getURI().toString().endsWith(".eel")).findFirst().get();
				
				if (resource.getContents().size() > 0 && resource.getContents().get(0) instanceof Platform) {
					platform = (Platform) resource.getContents().get(0);					
				} else {
					throw new Exception("Could not load the model in the resource set");
				}
				
				mapClassEstimation = new HashMap<>();
				
				System.out.println(platform.getName()+" estimation model loaded");
			} catch (Exception e) {
				e.printStackTrace();
			}									
		}
		mapOperationConsumption = new HashMap<>();
		IEngineAddon.super.engineAboutToStart(executionEngine);
	}
	
	@Override
	public void engineStarted(IExecutionEngine<?> executionEngine) {
		
		// Find the model classloader
		loader = executionEngine.getExecutionContext().getResourceModel().getContents().get(0).getClass().getClassLoader(); 
		
		platform.getEstimations().forEach(estimation -> {
			// https://www.eclipse.org/forums/index.php/mv/msg/304086/813841/#msg_813841
			
			String classQN;
			if (estimation.getTarget() instanceof Operation) {
				//If the target is an operation, we fetch the containing meta class 
				classQN = ((MetaClass)(estimation.getTarget().eContainer())).getName();
			} else {
				classQN = estimation.getTarget().getName();	
			}
					
			Class<?> clazz;
			try {
				clazz = loader.loadClass(classQN);
				System.out.println(clazz.getName()+" estimation successfully loaded.");
				mapClassEstimation.put(clazz, estimation);				
			} catch (ClassNotFoundException e) {			 
				e.printStackTrace();
			}	
					
		});
		
		variableRegistry = new VariableRegistry();
		IEngineAddon.super.engineStarted(executionEngine);
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		if (!variableRegistry.isInitialized())
			variableRegistry.initialize(mapClassEstimation, stepToExecute.getMseoccurrence().getMse().getCaller().eResource());
		
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();
		EOperation operation = stepToExecute.getMseoccurrence().getMse().getAction(); 								
		
		for (Entry<Class<?>, Estimation> entry : mapClassEstimation.entrySet()) {			
			
			if (entry.getKey() != null && entry.getKey().isInstance(caller) && entry.getValue().getTarget().getName().equals(operation.getName())) {								
				evaluateQueryOnObject(engine, caller, entry.getValue());
			} 
		}
		mapOperationConsumption.put(stepToExecute, RAPLMonitor.getEnergy());
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
	}

	@Override
	public void stepExecuted(IExecutionEngine<?> engine, Step<?> stepExecuted) {
		Long after = RAPLMonitor.getEnergy();
		EOperation eOperation = stepExecuted.getMseoccurrence().getMse().getAction();		
		System.out.println(eOperation.getName()+" consumed "+String.valueOf(after - mapOperationConsumption.get(stepExecuted))+" uj");
		
		IEngineAddon.super.stepExecuted(engine, stepExecuted);		
	}
	
	private void evaluateQueryOnObject(IExecutionEngine<?> executionEngine, EObject target, Estimation estimation) {
		OCLHelper helper;
		try {
			helper = ocl.createOCLHelper(target.eClass());
			String formula = sanitizedFormula(estimation);
			System.out.println(formula);
			ExpressionInOCL expressionInOCL = helper.createQuery(formula);
		
			System.out.println(ocl.evaluate(target, expressionInOCL)+" uJ ");
		} catch (ParserException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Generates an executable OCL query from the formula of an estimation.
	 * Clears the variables by their values using the {@link Estimation} {@link Variable}s
	 * @param estimation an {@link Estimation}
	 * @return an OCL Query as a {@link String}
	 */
	private String sanitizedFormula(Estimation estimation) {
		StringBuilder formula = new StringBuilder(estimation.getFormula());
		List<Variable> variables = estimation.getVariables();
		
		variables.stream().filter(variable -> Visibility.GLOBAL.equals(variable.getVibility())).forEach(variable -> {
			replaceAll(formula, variable.getName(), String.valueOf(variable.getValue())); 
		});
		
		final StringBuilder sb = new StringBuilder();
		
		if (variables.stream().filter(variable -> Visibility.LOCAL.equals(variable.getVibility())).count() > 0) {
			sb.append("let ");
			
			variables.stream().filter(variable -> Visibility.LOCAL.equals(variable.getVibility())).forEach(variable -> {
				sb.append(variable.getName()+" : Real = "+variable.getValue()+" ,");
			});
			
			sb.deleteCharAt(sb.length()-1);
			sb.append(" in ");
		}
		
		return sb.toString().concat(formula.toString());
	}

	//https://stackoverflow.com/a/3472705/7158736
	public static void replaceAll(StringBuilder builder, String from, String to)
	{
	    int index = builder.indexOf(from);
	    while (index != -1)
	    {
	        builder.replace(index, index + from.length(), to);
	        index += to.length(); // Move to the end of the replacement
	        index = builder.indexOf(from, index);
	    }
	}

}
