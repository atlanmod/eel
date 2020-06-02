# EEL

## Dependencies

Gemoc Studio: http://gemoc.org/studio.html

## How to install

Import all the repositories inside the Engine directory and Language workbench into Gemoc Studio, and start a new runtime environment.
The considered projects are the following:
- ArduinoML (Language, Operational Semantics, Acceleo Code Generator)
- EEL (Language, GEMOC's Engine extension)
- ArduinoML event engine (GEMOC's Engine extension to change the state of executed models at runtime)

In the runtime window, import the model project from the Modeling Workbench folder.
This project contains `.arduino` models defined with Xtext syntax, and `.eel` files defining the energy estimation formulaes associated to each ArduinoML operation.
These EEL models estimate two platforms: a first one considering a Arduino Uno Rev 3, Kingbright LEDs with the reference L-53MDBL. Infrared sensors Velleman VMA 330, servo motors TowerPro SG90 and photoresistors GL55.
A second one considering a Arduino Pro mini with L-7113ID red LEDs.

## How to run

Before running the Arduino executable model, be sure to set the current energy-estimation model using the `Energy > Set model` button located on the tool bar.

Running the model will dynamically perform the Energy measurements, and print them in your console. Feel free to extend the engine for enabling more energy estimation management.
