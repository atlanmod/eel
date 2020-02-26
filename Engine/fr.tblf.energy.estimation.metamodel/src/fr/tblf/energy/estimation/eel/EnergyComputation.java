/**
 */
package fr.tblf.energy.estimation.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Computation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Computes an energy : multiplies a power by a duration, and forces the typing to Type::Energy
 * <!-- end-model-doc -->
 *
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getEnergyComputation()
 * @model
 * @generated
 */
public interface EnergyComputation extends MeasureProductOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Type::Energy'"
	 * @generated
	 */
	Type type();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.left.value() * self.right.value()' pre_isPowerAndDuration='(self.left.type() = Type::Power and self.right.type() = Type::Duration) or (self.right.type() = Type::Power and self.left.type() = Type::Duration)'"
	 * @generated
	 */
	BigDecimal value();

} // EnergyComputation
