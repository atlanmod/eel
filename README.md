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

Before running the Arduino executable model, be sure to set the current energy-estimation model using the `Energy > Set model` button located on the tool bar:
![image](https://user-images.githubusercontent.com/6909730/83507178-7ca7af00-a4c8-11ea-930a-4e0cd01df1b1.png)

Set the energy estimation addon in the corresponding view:
![image](https://user-images.githubusercontent.com/6909730/83507530-f8096080-a4c8-11ea-9ef5-c65df61c42c2.png)

Then the Arduino model can be executed, as shown here:
![image](https://user-images.githubusercontent.com/6909730/83507311-b082d480-a4c8-11ea-8253-4464d1b09a4d.png)

Running the model will dynamically perform the Energy measurements, and print them in your console. Feel free to extend the engine for enabling more energy estimation management.


