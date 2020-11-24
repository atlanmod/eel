package org.atlanmod.energy.estimation.smm;

import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.omg.smm.DimensionalMeasurement;
import org.eclipse.modisco.omg.smm.Measurement;
import org.eclipse.modisco.omg.smm.ObservedMeasure;
import org.eclipse.modisco.omg.smm.SmmFactory;

public class SmmModelerToModel extends SmmModeler<Double, EObject> {

	public SmmModelerToModel(ResourceSet resourceSet) {
		super(resourceSet);
	}

	@Override
	public EObject callerToTarget(EObject caller) {
		return caller;
	}

	@Override
	public Measurement persistMeasurement(Measure eelMeasure, Double estimation, EObject target) {
		System.out.println("Persisting "+eelMeasure+" value: "+estimation+" to "+ target);
		DimensionalMeasurement measurement = SmmFactory.eINSTANCE.createDirectMeasurement();
		measurement.setValue(estimation);
		measurement.setMeasurand(target);		
		ObservedMeasure observedMeasure = eelToSmm.get(eelMeasure);
		
		if (observedMeasure != null) {
			 observedMeasure.getMeasurements().add(measurement);			
		}
		
		return measurement;	
	}

}
