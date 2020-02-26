int built_in_led = 13;
int motion_sensor = 2;

void setup() {
	pinMode(13, OUTPUT);
	pinMode(2, INPUT);
}
		
// the loop routine runs over and over again forever:
void loop() {
	if (digitalRead(motion_sensor)  == 1) {
					digitalWrite(built_in_led, 1);
							delay(1000);
							digitalWrite(built_in_led, 0);
			}
}
