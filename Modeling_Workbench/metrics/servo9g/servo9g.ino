#include<avr/sleep.h>
#include <Servo.h>  
Servo servo;        
int servoPin = 9;
void setup() {
  servo.attach(servoPin);          
          
}
    
// the loop routine runs over and over again forever:
void loop() {
  servo.write(90); 
  delay(500); 
  servo.write(180); 
  delay(500); 
  servo.write(0); 
  delay(500);
}
