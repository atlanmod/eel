# Energy Estimation Language: EEL

## General information

This is the implementation of EEL (Energy Estimation Language), presented in the SLE 2020 paper "Annotating Executable DSLs with Energy Estimation Formulas".
Note that GEMOC Studio 3.2.0 do not work on MacOS.

## Content of the Repository

### Engine

This directory contains all the Eclipse plugins to perform energy estimations using EEL:

- The EEL meta-model: `org.atlanmod.energy.estimation.metamodel(.*)?`
- The EEL concrete syntax: `org.atlanmod.energy.estimation.dsl(.*)?`
- The EEL engine, that extends GEMOC's engine, and enables the estimation of energy consumption at runtime: `org.atlanmod.energy.estimation.engine` 
- An additional extension of GEMOC's engine, for ArduinoML, used to define events happening when simulating Arduino systems. `org.atlanmod.arduino.sequential.eventengine`

### Language_Workbench

This directory contains the Eclipse plugins that define ArduinoML.
We provide minor changes to the operational semantics, first described [here](https://github.com/gemoc/arduinomodeling)
This directory contains: 

- The ArduinoML meta-model: `org.gemoc.arduino.sequential.model(.*)?`
- ArduinoML operational semantics, defined with K3: `org.gemoc.arduino.sequential.k3dsa`
- An Acceleo plugin for generating C code for Arduino out of ArduinoML models: `fr.obeo.dsl.arduino.gen`
- GEMOC's XDSML plugin for linking together ArduinoML meta-model, and operational semantics: `org.gemoc.arduino.sequential.xdsml`

Note that all the plugins defined in `Language_Workbench` and `Engine` are meant to be imported in GEMOC's Language workbench.

### Modeling_Workbench

This directory contains the models to be executed in GEMOC.
They are all located in the same repository: `org.gemoc.arduino.sequential.models`.
It contains:
- ArduinoML models, with the `.arduino` extension, corresponding to the Arduino models used as benchmarks, and estimated in the evaluation of the paper.
  - `activeWaitIRBlueLED.arduino` corresponds to the Arduino model in Figure 2.
  - `waitForIRBlueLED.arduino` corresponds to the Arduino model in Figure 5.
  - `blink.arduino`, `photoresistor.arduino` and `servo9g.arduino` corresponds to the models used as benchmarks in Figure 8.
  - `servoIrButton.arduino` is the model in Figure 9.
- EEL models, with the `.eel` extension
  - `model.eel` corresponds to the excerpt in Listing 1.
- The additional EEL models in the `usecases` repository, define with EEL the energy estimation formulas for the existing languages from the state-of-the-art.

Note that the `metrics` directory contains all the measurements performed for the evaluation of the paper, in `.mat` Octave files, as well as the Arduino C code generated.
These results were compared with the energy estimations provided by EEL.


## Installation guide

This artifact evaluation is performed on [GEMOC Studio V3.2.0](http://gemoc.org/studio_releases/eclipse_package/updatesite/2020/06/16/V3.2.0.html).
It relies on xText, which needs Java ≥ 9. We used Java 9.0.4 for the evaluation.

### Language workbench configuration

1. Start GEMOC and create a new workspace. Make sure that the JRE version used by GEMOC is Java 9, as well as the Compiler Compliance.
2. `File > Import > General > Existing Projects into Workspace`
3. Pick `eel/language_workbench` directory
4. Same for `eel/engine` directory.
5. `Run > Run configuration > New Eclipse Application`
   1. Make sure that the product is `gemoc_studio`, and the execution environment is Java 9.
6. Run (Gemoc might throw some errors related to egit, but that's not related to our app.)

### Modeling workbench configuration

1. Switch to the new Gemoc Runtime Window
2. `File > Import > General > Existing Projects into Workspace`
3. Pick `eel/modeling_workbench`
4. Open the `blink.arduino` and the `model.eel` models, to make sure that the plugins are properly loaded.

### Execution

1. In the Gemoc Runtime, click on the `Energy > Estimation model > Set model`
2. Select `model.eel`, validate. A `Done` message should appear in the console, confirming that the energy estimation model is properly loaded.
3. `Run > Run configuration > Executable model with Gemoc Java Engine`
4. Complete the configuration with the following data:
   1. Model to execute: `blink.arduino`
   2. Language: `org.gemoc.arduino.sequential.arduino.Arduino`
   3. Main method: `org.gemoc.arduino.sequential.k3dsa.Project_ExecutableAspect.main(org.gemoc.sequential.model.arduino.Project)`
   4. Main model element path: `Project` (This is the root of the Arduino model)
5. In the Engine addon tab, check `Energy estimation`.
6. Run. The energy estimations should be printed, at runtime, in the Language workbench.

### Additional executions

1. Many more Arduino models are available, and an other EEL model that estimates a Arduino Mini platform. They correspond to the usecases presented in the paper. 
2. Changing the EEL model can be done through `Energy > Estimation model > Load model`, and selecting the other EEL model.
3. Some Arduino models require external inputs. These are defined in the event addon. Thus, running the `waitForIRBlueLed.arduino` model requires to check the `Event addon` in the Engine addon tab, along with the `Energy estimation`.


### Analysis

Our EEL engine can automatically persist measures and measurements in a metamodel conforming to the SMM standard.
In the `engine addon` tab, several options are available:

![options](https://user-images.githubusercontent.com/6909730/101187095-350b0700-3654-11eb-9384-c30da89a1f69.PNG)

1. The first one enables the modeled estimations to refer to the xDSL.
2. The second one enables the modeled estimations to refer to the executed model.
3. The third one refers to the SMM model that will be created, or that will be extended with additional estimations.

A Sirius representation can be created on top of this SMM model, three views are available:

1. The observation view displays the SMM model. Each model execution corresponds to one `Observation`. Furthermore, each EEL model used corresponds to one `MeasureLibrary`.
The color of the observations refers to the total energy estimation of the model, compared to the other observations. This can be used to find the less energy consuming scenarios. 

![image](https://user-images.githubusercontent.com/6909730/101187811-1f4a1180-3655-11eb-8d14-ede5b396a27b.png)

2. Measures can be double-clicked to display the EEL model. The dependencies between eel estimations can be displayed, and are helpful for understanding how the estimations are computed.

![image](https://user-images.githubusercontent.com/6909730/101187871-34bf3b80-3655-11eb-85e3-2825a18b6fd6.png)

3. Observations can be double-clicked to display the SMM `Measurements`. Each measurement corresponds to one EEL energy estimation, and refer either to the xDSL or to the executed model. The relationship between `Measurements` can be followed to retrace the execution of the model. 

![image](https://user-images.githubusercontent.com/6909730/101187999-66380700-3655-11eb-9323-8e98d158b4f0.png)

4. This view can be customized in order to display the executed model, or the xDSL it conforms to. As usual, the color scheme can be used to locate energy consuming behaviour.

![image](https://user-images.githubusercontent.com/6909730/101188449-08f08580-3656-11eb-83d1-f4c0429a718d.png)

5. Finally, the measures used to perform the estimations can also be added to the view. 

![image](https://user-images.githubusercontent.com/6909730/101188799-7dc3bf80-3656-11eb-817f-cdfe213be4ed.png)


## Video guide

Link: https://youtu.be/MgnarNZ2q6E

## Troubleshooting

    java.lang.ClassNotFoundException: org.eclipse.jgit.lfs.BuiltinLFS cannot be found by org.eclipse.egit.core_5.0.0.201806131550-r

This is not due to EEL, and thus can be ignored.

    class has been compiled by a more recent version of the Java Runtime (class file version 54.0), this version of the Java Runtime only recognizes class file versions up to 53.0

The compiler compliance level do not match the jdk used. To fix:
`Window > Preferences > Java > Compiler > Compiler compliance level > 9`

