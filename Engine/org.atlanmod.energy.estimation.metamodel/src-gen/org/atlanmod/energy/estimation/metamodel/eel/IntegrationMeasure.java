/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getFunction <em>Function</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getRightBound <em>Right Bound</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getIntegrationMeasure()
 * @model
 * @generated
 */
public interface IntegrationMeasure extends CompositeMeasure {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(CompositeMeasure)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getIntegrationMeasure_Function()
	 * @model required="true"
	 * @generated
	 */
	CompositeMeasure getFunction();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CompositeMeasure value);

	/**
	 * Returns the value of the '<em><b>Left Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Bound</em>' attribute.
	 * @see #setLeftBound(BigDecimal)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getIntegrationMeasure_LeftBound()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getLeftBound();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getLeftBound <em>Left Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Bound</em>' attribute.
	 * @see #getLeftBound()
	 * @generated
	 */
	void setLeftBound(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Right Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Bound</em>' attribute.
	 * @see #setRightBound(BigDecimal)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getIntegrationMeasure_RightBound()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getRightBound();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getRightBound <em>Right Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Bound</em>' attribute.
	 * @see #getRightBound()
	 * @generated
	 */
	void setRightBound(BigDecimal value);

} // IntegrationMeasure
