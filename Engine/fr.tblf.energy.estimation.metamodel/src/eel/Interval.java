/**
 */
package eel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eel.Interval#getLowerEndpoint <em>Lower Endpoint</em>}</li>
 *   <li>{@link eel.Interval#getUpperEndpoint <em>Upper Endpoint</em>}</li>
 * </ul>
 *
 * @see eel.EelPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends MeasurementUncertaintyInformation {
	/**
	 * Returns the value of the '<em><b>Lower Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Endpoint</em>' containment reference.
	 * @see #setLowerEndpoint(Measure)
	 * @see eel.EelPackage#getInterval_LowerEndpoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Measure getLowerEndpoint();

	/**
	 * Sets the value of the '{@link eel.Interval#getLowerEndpoint <em>Lower Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Endpoint</em>' containment reference.
	 * @see #getLowerEndpoint()
	 * @generated
	 */
	void setLowerEndpoint(Measure value);

	/**
	 * Returns the value of the '<em><b>Upper Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Endpoint</em>' containment reference.
	 * @see #setUpperEndpoint(Measure)
	 * @see eel.EelPackage#getInterval_UpperEndpoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Measure getUpperEndpoint();

	/**
	 * Sets the value of the '{@link eel.Interval#getUpperEndpoint <em>Upper Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Endpoint</em>' containment reference.
	 * @see #getUpperEndpoint()
	 * @generated
	 */
	void setUpperEndpoint(Measure value);

} // Interval
