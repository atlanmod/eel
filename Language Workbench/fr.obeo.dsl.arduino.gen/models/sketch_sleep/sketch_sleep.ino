#include<avr/sleep.h>
int led = 2;
int sensor = 3;

void setup() {
	pinMode(led, OUTPUT);
	pinMode(sensor, INPUT);
	attachInterrupt(digitalPinToInterrupt(3), waitFor_3_FALLING, FALLING);
	set_sleep_mode(SLEEP_MODE_PWR_DOWN);
			
}
		
// the loop routine runs over and over again forever:
void loop() {
  sleep_enable();
	sleep_cpu();
	digitalWrite(led, 1);
	delay(5000);
	digitalWrite(led, 0);
}

void waitFor_3_FALLING() {
	sleep_disable();
}	
