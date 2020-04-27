#include<avr/sleep.h>
int blueLed = 9;
int sensor = 0;

void setup() {
  pinMode(blueLed, OUTPUT);
}
    
// the loop routine runs over and over again forever:
void loop() {
  int lightCal = 0; 
  lightCal = digitalRead(sensor); 
  while (true) {
    int lightVal = 0; 
    lightVal = digitalRead(sensor); 
    int minLightChange = 0; 
    minLightChange = lightCal  - 50; 
    if (lightVal  < minLightChange) {
      digitalWrite(blueLed, 1);
    } else {
      digitalWrite(blueLed, 0);
    } 
    delay(2000);
  }
}
