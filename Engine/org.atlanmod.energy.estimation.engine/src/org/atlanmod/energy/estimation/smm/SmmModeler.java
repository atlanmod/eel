package org.atlanmod.energy.estimation.smm;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Predicate;

import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation;
import org.atlanmod.energy.estimation.metamodel.eel.Platform;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.omg.smm.AbstractMeasureElement;
import org.eclipse.modisco.omg.smm.BaseMeasureRelationship;
import org.eclipse.modisco.omg.smm.CollectiveMeasure;
import org.eclipse.modisco.omg.smm.DimensionalMeasure;
import org.eclipse.modisco.omg.smm.DimensionalMeasurement;
import org.eclipse.modisco.omg.smm.MeasureLibrary;
import org.eclipse.modisco.omg.smm.Measurement;
import org.eclipse.modisco.omg.smm.MeasurementRelationship;
import org.eclipse.modisco.omg.smm.Observation;
import org.eclipse.modisco.omg.smm.ObservedMeasure;
import org.eclipse.modisco.omg.smm.SmmFactory;
import org.eclipse.modisco.omg.smm.SmmModel;

/**
 * SMM Modeler abstract class.
 * It defines the signatures for the concrete modelers and initialize the SMM model.  
 * @param <T> The datatype of the estimations
 * @param <U> The datatype of the entities targeted by EEL
 */

public abstract class SmmModeler<T, U extends EObject> {
	protected SmmModel model;
	protected HashMap<Measure, ObservedMeasure> eelToSmm;
	
	/**
	 * 
	 * @param resourceSet the ResourceSet containing EEL model and executable models
	 */
	public SmmModeler(SmmModel model) {

		this.model = model;
		eelToSmm = new HashMap<>();
		
	}
		
	/**
	 * Add into the SMM model the {@link org.eclipse.modisco.omg.smm.Measure}s created out of EEL {@link Measure}
	 * TODO: Currently, each couple of EEL Model / xDSL Execution corresponds to only one SMM Model. This is wrong.
	 * Future updates should consider at least single SMM model / EEL Platform with MULTIPLE model execution in it.
	 * Each model execution would be stored in a single SMM {@link Observation}, 
	 * reusing already defined {@link org.eclipse.modisco.omg.smm.Measure}s and {@link ObservedMeasure}s. 
	 * This is definitely important to implement for fostering better reusability of our estimation models. 
	 * @param platform a EEL {@link Platform}
	 */
	public void initializeSmmModelWithEelPlatform(Platform platform) {
		MeasureLibrary mlibrary;				
		
		// Check if the SMM model already contains a MeasureLibrary corresponding to the chosen platform.
		Optional<MeasureLibrary> optMeasureLibrary = model.getLibrairies().stream().filter(lib -> platform.getName().equals(lib.getName())).findAny();
		if (optMeasureLibrary.isPresent())
			mlibrary = optMeasureLibrary.get();
		else {
			mlibrary = SmmFactory.eINSTANCE.createMeasureLibrary();
			mlibrary.setName(platform.getName());
			model.getLibrairies().add(mlibrary);		
		}
		
		// An Observation per couple <execution , SmmModeler> 
		Observation observation = SmmFactory.eINSTANCE.createObservation();		
		model.getObservations().add(observation);
		
		// All Measures defined with EEL are also modeled with SMM, with an attached Observed Measure. 
		modelEelMeasureWithSMM(platform, mlibrary, observation);
		
		// Now that all measures are modeled with SMM, relationships have to be defined as well.
		// We consider measures that have an unbound number of dependencies. This should be extended to other measures too: binaries, functions, ...
		createRelationshipsBetweenMeasurements(platform);
	}
	
	/**
	 * Add into the {@link MeasureLibrary} all the EEL {@link Measure}s 
	 * @param platform the Eel {@link Platform}
	 * @param mlibrary the SMM {@link MeasureLibrary}
	 * @param observation the SMM {@link Observation}
	 */
	private void modelEelMeasureWithSMM(Platform platform, MeasureLibrary mlibrary, Observation observation) {
		platform.getMeasures().forEach(measure -> {
			org.eclipse.modisco.omg.smm.Measure smmMeasure = createMeasure(measure);
			ObservedMeasure observedMeasure = SmmFactory.eINSTANCE.createObservedMeasure();
			
			//Check if the SMM model already contains the Measure. 
			Optional<AbstractMeasureElement> optMeasure = mlibrary.getMeasureElements().stream()
					.filter(measureElement -> measureElement instanceof org.eclipse.modisco.omg.smm.Measure && 
							smmMeasure.getName().equals(measureElement.getName()))
					.findFirst();
			
			if (!optMeasure.isPresent()) {				
				mlibrary.getMeasureElements().add(smmMeasure);
				
				observedMeasure.setMeasure(smmMeasure);
			} else {
				observedMeasure.setMeasure((org.eclipse.modisco.omg.smm.Measure) optMeasure.get());
			}
							
			observedMeasure.setMeasure(smmMeasure);
			observation.getObservedMeasures().add(observedMeasure);
			eelToSmm.put(measure, observedMeasure);
		});
	}
	
	/**
	 * Create the {@link MeasurementRelationship} in the SMM Model based on the EEL {@link Measure}s
	 * @param platform the EEL {@link Platform}
	 */
	private void createRelationshipsBetweenMeasurements(Platform platform) {
		platform.getMeasures().stream()
		.filter(measure -> measure instanceof MeasureUnboundOperation)
		.map(measure -> (MeasureUnboundOperation) measure)
		.forEach(eelMeasure -> {
			CollectiveMeasure smmMeasure = (CollectiveMeasure) eelToSmm.get(eelMeasure).getMeasure();
			eelMeasure.getMeasures().forEach(eelDependency -> {					
				org.eclipse.modisco.omg.smm.Measure smmDependency = eelToSmm.get(eelDependency).getMeasure();
				// If the relationship does not exist, we create it.
				if (smmMeasure.getMeasureRelationships().stream().noneMatch(smmRs -> smmRs.getTo().equals(smmDependency))) {
					BaseMeasureRelationship measureRelationship = SmmFactory.eINSTANCE.createBaseMeasureRelationship();
					measureRelationship.setFrom(smmMeasure);
					measureRelationship.setTo((DimensionalMeasure) smmDependency);
					smmMeasure.getMeasureRelationships().add(measureRelationship);
				}
					
					
			});
		});			
	}
	
	/** 
	 * Create a SMM {@link org.eclipse.modisco.omg.smm.Measure} out of an EEL {@link Measure}
	 * @param eelMeasure an EEL {@link Measure}
	 * @return a SMM {@link org.eclipse.modisco.omg.smm.Measure}
	 */
	protected org.eclipse.modisco.omg.smm.Measure createMeasure(Measure eelMeasure) {
		org.eclipse.modisco.omg.smm.Measure smmMeasure;
		if (eelMeasure instanceof MeasureUnboundOperation) { 
			// this is a collective measure that depends on other measures.
			smmMeasure = SmmFactory.eINSTANCE.createCollectiveMeasure();
		} else {
			smmMeasure = SmmFactory.eINSTANCE.createDirectMeasure();
		}
		 
		StringBuilder sb = new StringBuilder();
		sb.append(eelMeasure.getTargetClass());		
		sb.append(".");
		sb.append(eelMeasure.getSubname());
		if (!(eelMeasure.getTargetOperation() == null || eelMeasure.getTargetOperation() == "")) {
			sb.append("#");
			sb.append(eelMeasure.getTargetOperation());
		}
			
		smmMeasure.setName(sb.toString());
		
		return smmMeasure;
	}
	
	/**
	 * Transforms the element executed by the engine to the Object looked for the Modeler.
	 * This method needs to be overriden by subclass modelers to define how to get the measurand.
	 * @param caller the object executed by the Engine, usually EObjects.
	 * @return U 
	 */
	abstract public U callerToTarget(EObject caller);
	
	/**
	 * Persist inside the SMM model the estimation produced by EEL, during the execution.
	 * @param eelMeasure a {@link Measure}
	 * @param estimation the estimation produced by EEL. Type is parameterized as EEL can produce many datatypes.
	 * @param target the element to be referenced as Measurand by the {@link Measurement} returned.
	 * @return an SMM {@link Measurement}
	 */
	public Measurement persistMeasurement(Measure eelMeasure, T estimation, U target) {
		System.out.println("Persisting "+eelMeasure+" value: "+estimation+" to "+ target);
		DimensionalMeasurement measurement = SmmFactory.eINSTANCE.createDirectMeasurement();
		// FIXME: This is only viable for simple estimations and dimensional measurements
		// Future update should consider other kinds of measurements
		measurement.setValue((double) estimation); 
		measurement.setName(String.format("%s: %s", getName(target), estimation.toString()));
		measurement.setMeasurand(target);		
		ObservedMeasure observedMeasure = eelToSmm.get(eelMeasure);
		
		if (observedMeasure != null) {
			 observedMeasure.getMeasurements().add(measurement);			
		} else {
			System.out.println("Error, cannot find corresponding observed measure! "+eelMeasure.getName()+"."+eelMeasure.getSubname());
		}
		
		return measurement;	
	}
	
	private static String getName(EObject eObject) {
		for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
	        if (eAttribute.getName().equals("name")) {
	            String name = (String) eObject.eGet(eAttribute);
	            return name;
	        }           
	    }
		return eObject.eClass().getName();
	}
	
	public Resource saveModel() {
		try {
			Predicate<ObservedMeasure> predicate = obsMeasure -> obsMeasure.getMeasurements().isEmpty();
			
			// We remove observed measure with no elements in it to ease analysis.
			model.getObservations().forEach(observation -> {
				observation.getObservedMeasures().removeIf(predicate);
			});
			
			model.eResource().save(Collections.EMPTY_MAP);			
		} catch (IOException e) {
			System.out.println("An error occured while saving the model: "+e.getMessage());			
		}
		return model.eResource();
	}
	
}
