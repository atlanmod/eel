#include<avr/sleep.h>
int infrared_sensor = 2;
int built_in_led = 13;

void setup() {
	pinMode(infrared_sensor, INPUT);
	pinMode(built_in_led, OUTPUT);
	attachInterrupt(digitalPinToInterrupt(2), waitFor_infrared_sensor_RISING, RISING);
	set_sleep_mode(SLEEP_MODE_PWR_DOWN);
	sleep_enable();
			
}
		
// the loop routine runs over and over again forever:
void loop() {
	sleep_cpu();
	if (digitalRead(infrared_sensor)  == 1) {
		digitalWrite(built_in_led, 1);
		delay(1000);
		digitalWrite(built_in_led, 0);
	}
}

void waitFor_infrared_sensor_RISING() {
	sleep_disable();
}	

