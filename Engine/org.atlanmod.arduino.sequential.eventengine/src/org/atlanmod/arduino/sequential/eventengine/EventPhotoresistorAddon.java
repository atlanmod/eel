package org.atlanmod.arduino.sequential.eventengine;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.gemoc.sequential.model.arduino.AmbientLightSensor;
import org.gemoc.sequential.model.arduino.Pin;
import org.gemoc.sequential.model.arduino.Project;

public class EventPhotoresistorAddon implements IEngineAddon {
	
	
	Pin sensorPin;
	@Override
	public void aboutToExecuteStep(IExecutionEngine<?> engine, Step<?> stepToExecute) {
		if (sensorPin == null) {
			Project project = (Project) stepToExecute.getMseoccurrence().getMse().getCaller().eResource().getContents().get(0);
			sensorPin = (Pin) project.getBoards().get(0).eContents()
			.stream()
			.filter(eObject -> eObject instanceof Pin &&((Pin) eObject).eContents().get(0) instanceof AmbientLightSensor)
			.findAny().get();
			
			final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
			executor.schedule(new Runnable() {
			  @Override
			  public void run() {
			    try {
			    	System.out.println("Changed lightSensor value ");
					EventUtils.setPinLevel(sensorPin, 60);
				} catch (Exception e) {
					e.printStackTrace();
				}
			  }
			}, 5, TimeUnit.SECONDS);
			executor.schedule(new Runnable() {
				  @Override
				  public void run() {
				    try {
				    	System.out.println("Changed lightSensor value ");
						EventUtils.setPinLevel(sensorPin, 175);
					} catch (Exception e) {
						e.printStackTrace();
					}
				  }
				}, 8, TimeUnit.SECONDS);
		}		
		
		IEngineAddon.super.aboutToExecuteStep(engine, stepToExecute);
	}
}
