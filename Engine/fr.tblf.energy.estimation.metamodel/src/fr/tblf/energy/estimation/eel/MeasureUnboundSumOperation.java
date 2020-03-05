/**
 */
package fr.tblf.energy.estimation.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Unbound Sum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getMeasureUnboundSumOperation()
 * @model
 * @generated
 */
public interface MeasureUnboundSumOperation extends MeasureUnboundOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.measures -&gt; collect(m | m.oclAsType(Measure).value()) -&gt; sum()'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureUnboundSumOperation
