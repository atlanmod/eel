/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getInformation <em>Information</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getStandardUncertainty <em>Standard Uncertainty</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasurementUncertainty()
 * @model
 * @generated
 */
public interface MeasurementUncertainty extends EObject {
	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference.
	 * @see #setInformation(MeasurementUncertaintyInformation)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasurementUncertainty_Information()
	 * @model containment="true"
	 * @generated
	 */
	MeasurementUncertaintyInformation getInformation();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getInformation <em>Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' containment reference.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(MeasurementUncertaintyInformation value);

	/**
	 * Returns the value of the '<em><b>Standard Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Uncertainty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Uncertainty</em>' attribute.
	 * @see #setStandardUncertainty(BigDecimal)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasurementUncertainty_StandardUncertainty()
	 * @model
	 * @generated
	 */
	BigDecimal getStandardUncertainty();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getStandardUncertainty <em>Standard Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Uncertainty</em>' attribute.
	 * @see #getStandardUncertainty()
	 * @generated
	 */
	void setStandardUncertainty(BigDecimal value);

} // MeasurementUncertainty
