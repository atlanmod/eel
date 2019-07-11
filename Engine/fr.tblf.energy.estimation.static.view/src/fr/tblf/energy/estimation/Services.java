package fr.tblf.energy.estimation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.internal.values.RealValueImpl;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.OCLHelper;
import org.eclipse.ocl.pivot.utilities.ParserException;

import eel.Estimation;
import eel.MetaClass;
import eel.Variable;

/**
 * The services class used by VSM.
 */
public class Services {

	private OCL ocl = OCL.newInstance();
	
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public List<Estimation> getEstimations(EObject self) {
    	final ArrayList<Estimation> estimations = new ArrayList<>();
        		
		self.eResource()
		.getResourceSet()
		.getResources()
		.stream()
		.filter(r -> r.getURI().toString().endsWith(".eel"))
		.forEach(r -> r.getAllContents().forEachRemaining(re -> {	
			if (re instanceof Estimation) {
				Estimation estimation = (Estimation) re;
				MetaClass metaClass = estimation.getTarget() instanceof MetaClass ? (MetaClass) estimation.getTarget() : (MetaClass) estimation.getTarget().eContainer(); 
				String className = metaClass.getName();    
				
				try {					
					Class<?> clazz = self.getClass().getClassLoader().loadClass(className);

					if (clazz.isAssignableFrom(self.getClass())) {
						estimations.add(estimation);
					}						
				} catch (ClassNotFoundException e) { 
					e.printStackTrace();
				}
			}
		}));			
		
    	return estimations;
    }
    
	public String generateNameEE(EObject self) {
		final ArrayList<Estimation> estimations = new ArrayList<>();
		
		self.eResource()
		.getResourceSet()
		.getResources()
		.stream()
		.filter(r -> r.getURI().toString().endsWith(".eel"))
		.forEach(r -> r.getAllContents().forEachRemaining(re -> {	
			if (re instanceof Estimation) {
				Estimation estimation = (Estimation) re;
				MetaClass metaClass = estimation.getTarget() instanceof MetaClass ? (MetaClass) estimation.getTarget() : (MetaClass) estimation.getTarget().eContainer(); 
				String className = metaClass.getName();    
				
				try {					
					Class<?> clazz = self.getClass().getClassLoader().loadClass(className);

					if (clazz.isAssignableFrom(self.getClass())) {
						estimations.add(estimation);
					}						
				} catch (ClassNotFoundException e) { 
					e.printStackTrace();
				}
			}
		}));			
		
		String name = self.eClass().getName();
		EStructuralFeature nameFeature = self.eClass().getEStructuralFeature("name");
		
		if (name != null) {
			name = name.concat(" :: ").concat(self.eGet(nameFeature).toString());
		}
		
		evaluateEstimationOnObject(estimations.get(0), self);
		
		return name + ((estimations.size() > 0 ? (" => " +String.valueOf(evaluateEstimationOnObject(estimations.get(0), self))) : ""));
	}
	
	private double evaluateEstimationOnObject(Estimation estimation, EObject eObject) {
		OCLHelper helper;
		Double result = 2.;
		try {
			helper = ocl.createOCLHelper(eObject.eClass());
			String formula = sanitizedFormula(estimation);
			ExpressionInOCL expressionInOCL = helper.createQuery(formula);
			Object object = ocl.evaluate(eObject, expressionInOCL);
			RealValueImpl val = (RealValueImpl) object;
			result = val.asDouble()	;		
			
		} catch (ParserException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Generates an executable OCL query from the formula of an estimation.
	 * Clears the variables by their values using the {@link Estimation} {@link Variable}s
	 * @param estimation an {@link Estimation}
	 * @return an OCL Query as a {@link String}
	 */
	private String sanitizedFormula(Estimation estimation) {
		StringBuilder formula = new StringBuilder(estimation.getFormula());
		List<Variable> variables = estimation.getVariables();
		
		variables.forEach(variable -> {
			replaceAll(formula, "$"+variable.getName(), String.valueOf(variable.getValue())); 
		});
		
		return formula.toString();
	}
	
	//https://stackoverflow.com/a/3472705/7158736
	public static void replaceAll(StringBuilder builder, String from, String to)
	{
	    int index = builder.indexOf(from);
	    while (index != -1)
	    {
	        builder.replace(index, index + from.length(), to);
	        index += to.length(); // Move to the end of the replacement
	        index = builder.indexOf(from, index);
	    }
	}
	
	static void methodA(int i) {
		if (i == 0) {
			System.out.println("something1()");
		} else {
			System.out.println("something2()");
		}
	}
}
