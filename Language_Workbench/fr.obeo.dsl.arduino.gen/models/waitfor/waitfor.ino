#include<avr/sleep.h>
int blue_led_1 = 2;
int IR_sensor_1 = 3;

void setup() {
	pinMode(blue_led_1, OUTPUT);
	pinMode(IR_sensor_1, INPUT);
	attachInterrupt(digitalPinToInterrupt(3), waitFor_3_CHANGE, CHANGE);
	set_sleep_mode(SLEEP_MODE_PWR_DOWN);
	
			
}
		
// the loop routine runs over and over again forever:
void loop() {
  sleep_enable();
	sleep_cpu();
	digitalWrite(blue_led_1, 1);
	delay(2000);
	digitalWrite(blue_led_1, 0);
}

void waitFor_3_CHANGE() {
	sleep_disable();
}	
