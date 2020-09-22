# Energy Estimation Language: EEL

## Content of the Repository

### Engine

This directory contains all the Eclipse plugins to perform energy estimations using EEL:

- The EEL meta-model: `org.atlanmod.energy.estimation.metamodel(.*)?`
- The EEL concrete syntax: `org.atlanmod.energy.estimation.dsl(.*)?`
- The EEL engine, that extends GEMOC's engine, and enables the estimation of energy consumption at runtime: `org.atlanmod.energy.estimation.engine` 
- An additional extension of GEMOC's engine, for ArduinoML, used to define events happening when simulating Arduino systems. `org.atlanmod.arduino.sequential.eventengine`

### Language_Workbench

This directory contains the Eclipse plugins that define ArduinoML:

- The ArduinoML meta-model: `org.gemoc.arduino.sequential.model(.*)?`
- ArduinoML operational semantics, defined with K3: `org.gemoc.arduino.sequential.k3dsa`
- An Acceleo plugin for generating C code for Arduino out of ArduinoML models: `fr.obeo.dsl.arduino.gen`
- GEMOC's XDSML plugin for linking together ArduinoML meta-model, and operational semantics: `org.gemoc.arduino.sequential.xdsml`

Note that all the plugins defined in `Language_Workbench` and `Engine` are meant to be imported in GEMOC's Language workbench.

### Modeling_Workbench

This directory contains the models to be executed in GEMOC.
They are all located in the same repository: `org.gemoc.arduino.sequential.models`.
It contains:
- ArduinoML models, with the `.arduino` extension, corresponding to the Arduino models used as benchmarks, and estimated in the evaluation.
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

## Video guide

Link: https://youtu.be/oZBt1Jiggvw

## Troubleshooting

    java.lang.ClassNotFoundException: org.eclipse.jgit.lfs.BuiltinLFS cannot be found by org.eclipse.egit.core_5.0.0.201806131550-r

This is not due to EEL, and thus can be ignored.

    class has been compiled by a more recent version of the Java Runtime (class file version 54.0), this version of the Java Runtime only recognizes class file versions up to 53.0

The compiler compliance level do not match the jdk used. To fix:
`Window > Preferences > Java > Compiler > Compiler compliance level > 9`

