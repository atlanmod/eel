/**
 */
package fr.tblf.energy.estimation.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Unbound Product Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getMeasureUnboundProductOperation()
 * @model
 * @generated
 */
public interface MeasureUnboundProductOperation extends MeasureUnboundOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.measures -&gt; iterate(m: Measure; acc: Real = 1.0 | acc * m.value())'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureUnboundProductOperation
