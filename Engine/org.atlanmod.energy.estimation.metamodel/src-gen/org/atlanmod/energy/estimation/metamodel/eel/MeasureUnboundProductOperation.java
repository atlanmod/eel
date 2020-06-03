/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Unbound Product Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measures computed by product of a non-finite set of measures
 * <!-- end-model-doc -->
 *
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasureUnboundProductOperation()
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
