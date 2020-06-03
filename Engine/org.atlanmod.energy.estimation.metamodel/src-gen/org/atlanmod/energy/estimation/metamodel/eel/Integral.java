/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Integral#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Integral#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getIntegral()
 * @model
 * @generated
 */
public interface Integral extends MeasurementUncertaintyInformation {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' reference.
	 * @see #setInterval(Interval)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getIntegral_Interval()
	 * @model required="true"
	 * @generated
	 */
	Interval getInterval();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Integral#getInterval <em>Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Interval value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getIntegral_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Integral#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

} // Integral
