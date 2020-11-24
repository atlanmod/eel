package org.atlanmod.energy.estimation.smm;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.atlanmod.energy.estimation.metamodel.eel.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.omg.smm.MeasureLibrary;
import org.eclipse.modisco.omg.smm.Measurement;
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
	public SmmModeler(ResourceSet resourceSet) {	
		model = SmmFactory.eINSTANCE.createSmmModel();
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());        
        
		Resource resource = resourceSet.createResource(URI.createURI(new File("smmModelToMM.xmi").toURI().toString()));
		resource.getContents().add(model);
		
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
		MeasureLibrary mlibrary = SmmFactory.eINSTANCE.createMeasureLibrary();
		mlibrary.setName(platform.getName());
		model.getLibrairies().add(mlibrary);		
		
		Observation observation = SmmFactory.eINSTANCE.createObservation();
		model.getObservations().add(observation);
		
		platform.getMeasures().forEach(measure -> {
			org.eclipse.modisco.omg.smm.Measure smmMeasure = createMeasure(measure);
			mlibrary.getMeasureElements().add(smmMeasure);
			ObservedMeasure observedMeasure = SmmFactory.eINSTANCE.createObservedMeasure();
			observedMeasure.setMeasure(smmMeasure);
			observation.getObservedMeasures().add(observedMeasure);
			eelToSmm.put(measure, observedMeasure);
		});
		
	}
	
	/** 
	 * Create a SMM {@link org.eclipse.modisco.omg.smm.Measure} out of an EEL {@link Measure}
	 * @param eelMeasure an EEL {@link Measure}
	 * @return a SMM {@link org.eclipse.modisco.omg.smm.Measure}
	 */
	protected org.eclipse.modisco.omg.smm.Measure createMeasure(Measure eelMeasure) {
		org.eclipse.modisco.omg.smm.Measure smmMeasure = SmmFactory.eINSTANCE.createDirectMeasure();
		StringBuilder sb = new StringBuilder();
		sb.append(eelMeasure.getTargetClass());		
		
		if (!(eelMeasure.getTargetOperation() == null || eelMeasure.getTargetOperation() == "")) {
			sb.append("#");
			sb.append(eelMeasure.getTargetOperation());
		}
			
		smmMeasure.setName(sb.toString());
		
		return smmMeasure;
	}
	
	/**
	 * Transforms the element executed by the engine to the Object looked for the Modeler.
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
	abstract public Measurement persistMeasurement(Measure eelMeasure, T estimation, U target);
	
	public Resource saveModel() {
		try {
			Predicate<ObservedMeasure> predicate = obsMeasure -> obsMeasure.getMeasurements().isEmpty();
			
			// We remove observed measure with no elements in it to ease analysis.
			model.getObservations().forEach(observation -> {
				observation.getObservedMeasures().removeIf(predicate);
			});
			
			model.eResource().save(Collections.EMPTY_MAP);			
		} catch (IOException e) {
			System.out.println("Could not save the model.");
			e.printStackTrace();
		}
		return model.eResource();
	}
	
}
