package org.atlanmod.arduino.sequential.eventengine;

import java.lang.reflect.Field;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.gemoc.sequential.model.arduino.BooleanModuleGet;
import org.gemoc.sequential.model.arduino.IntegerModuleGet;
import org.gemoc.sequential.model.arduino.Pin;
import org.gemoc.sequential.model.arduino.WaitFor;
import org.gemoc.sequential.model.arduino.impl.PinImpl;


public class EventIRLoopAddon implements IEngineAddon {
	int cpt = 0;
	boolean running = false;
	
	@Override
	public void engineAboutToStart(IExecutionEngine<?> executionEngine) {
		System.out.println("Starting Engine");
		IEngineAddon.super.engineAboutToStart(executionEngine);
	}
	
	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();
		String name = stepToExecute.getMseoccurrence().getMse().getAction().getName();
		System.out.println(name+" <- "+caller);
		if (caller instanceof BooleanModuleGet && !running) {
			running = true;
			new Thread(() -> {
				System.out.println("Created thread for changing IntegerModuleGet pin value");
				try {
					Thread.sleep(2000);
					waitForChangePin((BooleanModuleGet) caller);				
				} catch (InterruptedException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}									
			}).start();
		}		
	
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
			
	}
	

	public void waitForChangePin(BooleanModuleGet module) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.out.println("Changing pin value");
		
		Pin pin = ((Pin) module.getModule().eContainer());
		Field field = PinImpl.class.getDeclaredField("level");
		field.setAccessible(true);
		field.set(pin, Integer.valueOf(0).intValue()); 
		
	}
}
