/**
 */
package fr.tblf.energy.estimation.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Computation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Computes an energy : multiplies a power by a duration, and forces the typing to Type::Energy
 * <!-- end-model-doc -->
 *
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getPowerComputation()
 * @model
 * @generated
 */
public interface PowerComputation extends MeasureProductOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Type::Power'"
	 * @generated
	 */
	Type type();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.left.value() * self.right.value()' pre_isCurrentAndVoltage='(self.left.type() = Type::Voltage and self.right.type() = Type::Current) or (self.right.type() = Type::Current and self.left.type() = Type::Voltage)'"
	 * @generated
	 */
	BigDecimal value();

} // PowerComputation
