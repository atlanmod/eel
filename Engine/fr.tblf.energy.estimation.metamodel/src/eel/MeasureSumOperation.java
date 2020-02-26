/**
 */
package eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Sum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sums the value of two measures. No type checking
 * <!-- end-model-doc -->
 *
 *
 * @see eel.EelPackage#getMeasureSumOperation()
 * @model
 * @generated
 */
public interface MeasureSumOperation extends MeasureOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.left.value() + self.right.value()'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureSumOperation
