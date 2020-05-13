package org.atlanmod.arduino.sequential.eventengine;

import java.lang.reflect.Field;

import org.gemoc.sequential.model.arduino.Pin;
import org.gemoc.sequential.model.arduino.impl.PinImpl;

public class EventUtils {
	
	public static void setPinLevel(Pin pin, int value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = PinImpl.class.getDeclaredField("level");
		field.setAccessible(true);
		field.set(pin, value); 
	}
}
