#include<avr/sleep.h>

int pinToInterrupt = 3;

void setup() {
  // put your setup code here, to run once:
  attachInterrupt(digitalPinToInterrupt(pinToInterrupt), event, CHANGE);
  set_sleep_mode(SLEEP_MODE_PWR_DOWN);
  sleep_enable();
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(13, LOW);
  sleep_enable();
  sleep_cpu();
  event();
}

void event() {
    sleep_disable();
    digitalWrite(13, HIGH);
    delay(1000);
}
