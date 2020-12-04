package org.atlanmod.energy.estimation.design;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.omg.smm.DimensionalMeasurement;
import org.eclipse.modisco.omg.smm.Measure;
import org.eclipse.modisco.omg.smm.MeasureLibrary;
import org.eclipse.modisco.omg.smm.Measurement;
import org.eclipse.modisco.omg.smm.Observation;
import org.eclipse.modisco.omg.smm.SmmModel;

/**
 * The services class used by VSM.
 */
public class Services {
	private HashMap<Measure, Integer> measureDepth;	
	private int DEPTH = 0;
	private double MAX_VALUE = 0;
	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.###");
    private static boolean isDisplayMeasure = false;
    private HashMap<EObject, Double> measurandValueMap;
    
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    /**
     * Map the number of observation to the color gradient and return the closest defined color.
     * @param observation
     * @return
     */
    public int computeObservationColor(Observation observation) {
    	SmmModel model = (SmmModel) observation.eContainer();
    	List<Observation> observations = model.getObservations();
    	observations = observations.stream().sorted(Comparator.comparing(Observation::getDescription)).collect(Collectors.toList());
    	// observations are sorted.
    	int colors = 10;
    	double max = Double.parseDouble(observations.get(observations.size()-1).getDescription());
    	return (int) Math.floor((Double.parseDouble(observation.getDescription()) * colors)/max);     	
    }
    
    public String computeObservationName(Observation observation) {
    	String name = observation.getName();    	
    	Double value = Double.parseDouble(observation.getDescription());
    	return name + '\n' + DECIMAL_FORMAT.format(value);
    }
    
    /**
     * Return all the measures used in a provided {@link Observation}
     * @param observation
     * @return
     */
    public List<Measure> getMeasures(Observation observation) {
    	return observation.getObservedMeasures()
    			.stream()
    			.map(om -> getDependenciesReq(om.getMeasure()))
    			.flatMap(List::stream)
    			.collect(Collectors.toList());
    	
//    	return observation.getObservedMeasures().stream().map(om -> om.getMeasure()).collect(Collectors.toList());
    }
    
    public List<Measure> getDependenciesReq(Measure measure) {
    	if (measure == null)
    		return java.util.Collections.emptyList();
    	    	
    	List<Measure> measures = measure.getMeasureRelationships()
    			.stream()
    			.map(rs -> getDependenciesReq(rs.getTo()))
    			.flatMap(List::stream)
    			.collect(Collectors.toList());
    	
    	measures.add(measure);
    	return measures;
    }
    
    public Collection<Measure> getDependencies(Measure measure) {
    	return measure.getMeasureRelationships().stream().map(rs -> rs.getTo()).collect(Collectors.toList());    	
    }
    
    /**
     * Map the depth of the measure tree to the color gradient and 
     * return the closest defined color corresponding to the depth of the current measure.
     * @param measure
     * @return
     */
    public int computeMeasureColor(Measure measure) {
    	int colors = 9;
    	if (measureDepth == null || measureDepth.get(measure) == null) {
    		MeasureLibrary library = (MeasureLibrary) measure.eContainer();
    		buildMeasureDepthMap(library);    		
    	}
    	int depth = measureDepth.get(measure);
    	return (int) Math.floor((colors * depth) / DEPTH);		
    }
	
    /**
     * Compute the depth of each measure.
     * FIXME: performance improvement: start from root and depth first search
     * @param lib
     */
	private void buildMeasureDepthMap(MeasureLibrary lib) {
		measureDepth = new HashMap<Measure, Integer>();
		
		lib.getMeasureElements().forEach(measure -> {
			addMeasureToDepthMap((Measure) measure, 0);  
		});
	
	}
	
	/**
	 * Recursively add the measure and its depth in a static hashmap
	 * @param m
	 * @param depth
	 */
	private void addMeasureToDepthMap(Measure m, int depth) {		
		if (measureDepth.get(m) == null || measureDepth.get(m) < depth) 
			measureDepth.put(m,  depth);
		
		if (depth > DEPTH) DEPTH = depth; // max depth reached.
 		
		m.getMeasureRelationships().forEach(rs -> {
			addMeasureToDepthMap(rs.getTo(), depth + 1);
		});
	}
	
	/**
	 * Map the consumption of a measurement in the total consumption of an observation to the color scale
	 * @param m
	 * @return
	 */
	public int computeMeasurementColor(Measurement m) {
    	int colors = 9;
		Observation observation = (Observation) m.eContainer().eContainer();
		double observationConsumption = Double.parseDouble(observation.getDescription());
		return (int) Math.floor((((DimensionalMeasurement) m).getValue() * colors) / observationConsumption );		
	}
	
	public boolean isDisplayMeasure(Measure measure) {
		return isDisplayMeasure;
	}
	
	public void switchDisplayMeasure(EObject caller) {
		isDisplayMeasure = ! isDisplayMeasure;
	}
	
	/**
	 * Returns all the measurands for a given {@link Observation}
	 * @param observation the {@link Observation}
	 * @return a {@link Collection} of {@link EObject}
	 */
	public Collection<EObject> getAllMeasurands(Observation observation) {
		EObject measurand = observation.getObservedMeasures().get(0).getMeasurements().get(0).getMeasurand();
		Collection<EObject> objects;

		if (measurand instanceof EClass) {
			objects = ((EClass) measurand).getEPackage().eContents();		
		} else {
			objects = new ArrayList<>();
			measurand.eResource().getAllContents().forEachRemaining(eobject -> objects.add(eobject));
		}
		
		computePerMeasurandTotal(observation);
		
		return objects;
	}

	/**
	 * For each measurand, associates the total energy consumption.	 * 
	 * @param observation an {@link Observation}
	 */
	private void computePerMeasurandTotal(Observation observation) {
		measurandValueMap = new HashMap<>();
		
		observation.getObservedMeasures().forEach(observedMeasure -> {
			observedMeasure.getMeasurements().stream()
			.filter(DimensionalMeasurement.class::isInstance)
			.map(DimensionalMeasurement.class::cast)
			.forEach(measurement -> {
				EObject measurand = measurement.getMeasurand();				
				if (measurandValueMap.containsKey(measurand)) {
					measurandValueMap.compute(measurand, (k,v) -> measurement.getValue() + v); 
				} else {
					measurandValueMap.put(measurand, measurement.getValue());
				}				
			});
		});
				
		// get a random measurand that we use as a starting point to get the root of the model.
		// this can be eventually improved performance-wise.
		EObject measurand = observation.getObservedMeasures().get(0).getMeasurements().get(0).getMeasurand(); 	
		EObject root = getRoot(measurand);
		computeEContainerMeasurandTotal(root);				
	}

	/**
	 * Recursively get the root element in an EMF model
	 * @param measurand an {@link EObject}
	 * @return the root, an {@link EObject}
	 */
	private EObject getRoot(EObject measurand) {
		if (measurand.eContainer() == null) {
			return measurand;
		} else return getRoot(measurand.eContainer());
	}
	
	/**
	 * Depth first search algorithm. For each node, recursively compute the sum of the values its children, and put it in the map 
	 * @param object an {@link EObject}
	 * @return the value computed for the {@link EObject}
	 */
	private double computeEContainerMeasurandTotal(EObject object) {			
		final double childrenValue = object.eContents()
				.stream()
				.map(containedObject -> computeEContainerMeasurandTotal(containedObject))
				.reduce(0.0d, (d1, d2) -> d1+d2);					

		measurandValueMap.merge(object, childrenValue, (v1,v2) -> v1+v2);
		
		if (measurandValueMap.get(object) > MAX_VALUE) MAX_VALUE = measurandValueMap.get(object);
		return measurandValueMap.get(object);
	}

	/**
	 * Build the name of an {@link EObject} using its name {@link EAttribute} if it has one
	 * Or using the name of its corresponding {@link EClass}
	 * @param object
	 * @return a {@link String}
	 */
	public String getNameOrClass(EObject object) {
		StringBuilder builder = new StringBuilder();
		EClass clazz = object.eClass();
		Optional<EAttribute> nameAttribute = clazz.getEAllAttributes()
				.stream()
				.filter(attribute -> "name".equals(attribute.getName()))
				.findFirst();
		
		if (nameAttribute.isPresent())
			builder.append(object.eGet(nameAttribute.get()));
		
		builder.append(":");
		builder.append(clazz.getName());
		
		return builder.toString();
	}
	
	/**
	 * Compute the color scheme of a measurand according to its total energy consumption 
	 * @param eobject
	 * @return an {@link Integer} corresponding to the color;
	 */
	public int computeMeasurandColor(EObject eobject) {
		int colors = 9;
		double value = measurandValueMap.get(eobject);
    	return (int) Math.floor((colors * value) / MAX_VALUE);			
	}
}
