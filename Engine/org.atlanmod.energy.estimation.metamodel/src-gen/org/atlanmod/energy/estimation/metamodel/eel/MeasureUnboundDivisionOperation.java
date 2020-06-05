/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Unbound Division Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasureUnboundDivisionOperation()
 * @model
 * @generated
 */
public interface MeasureUnboundDivisionOperation extends MeasureUnboundOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.measures -&gt; iterate(m: Measure; acc: Real = 1.0 |  m.value() / acc)'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureUnboundDivisionOperation
