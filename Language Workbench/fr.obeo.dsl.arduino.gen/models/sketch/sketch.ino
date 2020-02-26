#include<avr/sleep.h>
int led = 3;
int led2 = 4;
int led3 = 5;
int sensor = 2;

void setup() {
	pinMode(led, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
	pinMode(sensor, INPUT);			
}
		
// the loop routine runs over and over again forever:
void loop() {
	if (digitalRead(sensor)  == 0) {
		digitalWrite(led, 1);
		delay(2000);
		digitalWrite(led2, 1);
    delay(2000);
    digitalWrite(led3, 1);
    delay(2000);
		digitalWrite(led, 0);
    digitalWrite(led2, 0);
    digitalWrite(led3, 0);
	}
}
