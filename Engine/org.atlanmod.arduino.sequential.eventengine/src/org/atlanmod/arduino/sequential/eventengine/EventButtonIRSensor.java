package org.atlanmod.arduino.sequential.eventengine;

import java.lang.reflect.Field;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.gemoc.sequential.model.arduino.BinaryIntegerExpression;
import org.gemoc.sequential.model.arduino.BooleanModuleGet;
import org.gemoc.sequential.model.arduino.InfraRedSensor;
import org.gemoc.sequential.model.arduino.IntegerVariable;
import org.gemoc.sequential.model.arduino.Pin;
import org.gemoc.sequential.model.arduino.VariableAssignment;
import org.gemoc.sequential.model.arduino.impl.PinImpl;


public class EventButtonIRSensor implements IEngineAddon {
	int cpt = 0;
	boolean running = false;
	boolean activated = false;
	@Override
	public void engineAboutToStart(IExecutionEngine<?> executionEngine) {
		System.out.println("Starting Engine");
		IEngineAddon.super.engineAboutToStart(executionEngine);
	}
	
	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		
		EObject caller = stepToExecute.getMseoccurrence().getMse().getCaller();
		String name = stepToExecute.getMseoccurrence().getMse().getAction().getName();		
		if (caller instanceof BooleanModuleGet && name.equals("evaluate") && !running) {
			
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
		} else if (running && !activated && caller instanceof BooleanModuleGet && ((BooleanModuleGet) caller).getModule() instanceof InfraRedSensor) {
			System.out.println("Querying the sensor");
			activated = true;
			new Thread(() -> {
				System.out.println("Created thread for changing InfraredSensor pin value");
				try {
					Thread.sleep(4000);					
					detectPresence((InfraRedSensor) ((BooleanModuleGet) caller).getModule());					
					Thread.sleep(6000);
					cancelPresence((InfraRedSensor) ((BooleanModuleGet) caller).getModule());
				} catch (InterruptedException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}									
			}).start();
		}
		
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
			
	}
	
	public void detectPresence(InfraRedSensor sensor) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.out.println("sensor detects presence !");
		
		Pin pin = ((Pin) sensor.eContainer());
		Field field = PinImpl.class.getDeclaredField("level");
		field.setAccessible(true);		
		field.set(pin, Integer.valueOf(0).intValue()); 		
	}
	
	public void cancelPresence(InfraRedSensor sensor) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.out.println("sensor detects presence !");
		
		Pin pin = ((Pin) sensor.eContainer());
		Field field = PinImpl.class.getDeclaredField("level");
		field.setAccessible(true);		
		field.set(pin, Integer.valueOf(1).intValue()); 		
	}
	
	public void waitForChangePin(BooleanModuleGet module) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.out.println("Changing pin value of module "+module.getModule().getName());
		
		Pin pin = ((Pin) module.getModule().eContainer());
		Field field = PinImpl.class.getDeclaredField("level");
		field.setAccessible(true);
		field.set(pin, Integer.valueOf(1).intValue()); 
		
	}
}
