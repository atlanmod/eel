/**
 */
package eel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Changes the type of a Measure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eel.MeasureCast#getMeasure <em>Measure</em>}</li>
 * </ul>
 *
 * @see eel.EelPackage#getMeasureCast()
 * @model
 * @generated
 */
public interface MeasureCast extends TypedMeasure {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' reference.
	 * @see #setMeasure(Measure)
	 * @see eel.EelPackage#getMeasureCast_Measure()
	 * @model required="true"
	 * @generated
	 */
	Measure getMeasure();

	/**
	 * Sets the value of the '{@link eel.MeasureCast#getMeasure <em>Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Measure value);

} // MeasureCast
