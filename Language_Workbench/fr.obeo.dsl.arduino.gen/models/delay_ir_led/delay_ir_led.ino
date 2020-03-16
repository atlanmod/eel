#include<avr/sleep.h>
int blue_led_1 = 2;
int IR_sensor_1 = 3;

void setup() {
	pinMode(blue_led_1, OUTPUT);
	pinMode(IR_sensor_1, INPUT);
			
}
		
// the loop routine runs over and over again forever:
void loop() {
	if (digitalRead(IR_sensor_1) == 0) {
		digitalWrite(blue_led_1, 1);
		delay(2000);
		digitalWrite(blue_led_1, 0);
	}
}
