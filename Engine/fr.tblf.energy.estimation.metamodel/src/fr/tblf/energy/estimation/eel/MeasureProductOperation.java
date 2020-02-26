/**
 */
package fr.tblf.energy.estimation.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Product Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiplies the value of two measures. No type checking
 * <!-- end-model-doc -->
 *
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getMeasureProductOperation()
 * @model
 * @generated
 */
public interface MeasureProductOperation extends MeasureOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.left.value() * self.right.value()'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureProductOperation
