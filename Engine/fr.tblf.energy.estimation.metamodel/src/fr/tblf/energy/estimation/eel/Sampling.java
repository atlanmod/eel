/**
 */
package fr.tblf.energy.estimation.eel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.Sampling#getSamples <em>Samples</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.Sampling#getMeasurementProcedure <em>Measurement Procedure</em>}</li>
 * </ul>
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getSampling()
 * @model
 * @generated
 */
public interface Sampling extends MeasurementUncertaintyInformation {
	/**
	 * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tblf.energy.estimation.eel.Sample}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' containment reference list.
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getSampling_Samples()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sample> getSamples();

	/**
	 * Returns the value of the '<em><b>Measurement Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Procedure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Procedure</em>' attribute.
	 * @see #setMeasurementProcedure(String)
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getSampling_MeasurementProcedure()
	 * @model
	 * @generated
	 */
	String getMeasurementProcedure();

	/**
	 * Sets the value of the '{@link fr.tblf.energy.estimation.eel.Sampling#getMeasurementProcedure <em>Measurement Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Procedure</em>' attribute.
	 * @see #getMeasurementProcedure()
	 * @generated
	 */
	void setMeasurementProcedure(String value);

} // Sampling
