# EEL

## Dependencies

Gemoc Studio: http://gemoc.org/studio.html

## How to install

Import all the repositories inside the Engine directory and language workbench into Gemoc Studio, and start a new runtime environment.

In the runtime window, import the petrinet model project from Modeling Workbench.
This project contains a `.petrinet` model defined with a basic Xtext syntax, and a `.eel` file defining the energy estimation formulaes associated to each Transition.

## How to run

Before running the petrinet executable model, be sure to set the current energy-estimation model using the `Energy > Set model` button located on the tool bar.

Running the model will dynamically perform the Energy measurements, and print them in your console. Feel free to extend the engine for enabling more energy estimation management.
