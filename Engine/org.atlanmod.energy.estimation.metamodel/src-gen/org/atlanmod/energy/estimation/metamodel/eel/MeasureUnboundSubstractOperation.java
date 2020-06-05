/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Unbound Substract Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasureUnboundSubstractOperation()
 * @model
 * @generated
 */
public interface MeasureUnboundSubstractOperation extends MeasureUnboundOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.measures -&gt; iterate(m: Measure; acc: Real = 0.0 | acc - m.value())'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureUnboundSubstractOperation
