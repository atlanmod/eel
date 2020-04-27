#include <Wire.h>
#include <Adafruit_INA219.h> // You will need to download this library

Adafruit_INA219 sensor219; // Declare and instance of INA219
float current = 0; // Measure in milli amps

void setup(void)
{ 
  Serial.begin(115200);
  // Connect to WiFi
   
   sensor219.begin();
   sensor219.setCalibration_16V_400mA();   
}

void loop() {
  current = sensor219.getCurrent_mA();  
  
  Serial.print(micros());  
  Serial.print(";");  
  Serial.println(current, 5); 
  delay(10);
}
