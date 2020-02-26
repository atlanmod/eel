/**
 */
package fr.tblf.energy.estimation.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measure with a type and a value hand-defined by the user
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.MeasureValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getMeasureValue()
 * @model
 * @generated
 */
public interface MeasureValue extends TypedMeasure {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getMeasureValue_Value()
	 * @model
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link fr.tblf.energy.estimation.eel.MeasureValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.value'"
	 * @generated
	 */
	BigDecimal value();

} // MeasureValue
