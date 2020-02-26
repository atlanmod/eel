package fr.tblf.gemoc.extension;

public class VariableRegistry {

	//private Map<EObject, Collection<Local>> map;
	private boolean isInitialized;
	
	public VariableRegistry() {
	//	map = new HashMap<EObject, Collection<Local>>();
		isInitialized = false;
	}
	
	/**
	 * Initializes a registry in which every EObject in the executableModel with an energy estimation defined 
	 * is associated with its local variables, usable during the estimation
	 * @param mapClassEstimation a {@link Map} associating {@link Class} to {@link Estimation} 
	 * @param executableModel a {@link Resource} from an executable model.
	 */
//	public void initialize(Map<Class<?>, Estimation> mapClassEstimation, Resource executableModel) {
//		
//		executableModel.getAllContents().forEachRemaining(eObject -> {
//			Estimation estimation = getEstimation(eObject, mapClassEstimation);
//			if (estimation != null && estimation.getVariables().size() > 0) {
//				HashSet<Local> variables = new HashSet<>();
//				
//				estimation.getVariables().stream().filter(variable -> variable instanceof Local)
//				.map(variable -> (Local) variable)
//				.forEach(variable -> {
//					Local clone = EelFactory.eINSTANCE.createLocal();
//					clone.setName(variable.getName());
//					clone.setValue(variable.getValue());
//					clone.setFormula(variable.getFormula());	
//					variables.add(clone);
//				});
//				
//				map.put(eObject, variables);
//			}
//		});	
//		
//		isInitialized = true;
//		System.out.println("initialized");
//		map.forEach((eobject, variables) -> System.out.println(eobject+" : "+variables.size()+" items"));
//	}
//	
//	public Estimation getEstimation(EObject eObject, Map<Class<?>, Estimation> mapClassEstimation) {
//		Set<Entry<Class<?>, Estimation>> entrySet = mapClassEstimation.entrySet();
//		
//		for (Entry<Class<?>, Estimation> entry : entrySet) {
//			if (entry.getKey() != null && entry.getKey().isInstance(eObject)) {								
//				return entry.getValue();
//			}
//		}				
//		return null;
//	}
//	
//	public boolean isInitialized() { 
//		return isInitialized; 
//	}
//	
//	public Collection<Local> getVariables(EObject eObject) {
//		return map.get(eObject);
//	}

	
	
}
