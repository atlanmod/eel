/**
 */
package fr.tblf.energy.estimation.eel;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.Variable#getValue <em>Value</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.Variable#getName <em>Name</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.Variable#getVibility <em>Vibility</em>}</li>
 * </ul>
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
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
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link fr.tblf.energy.estimation.eel.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.tblf.energy.estimation.eel.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vibility</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.tblf.energy.estimation.eel.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vibility</em>' attribute.
	 * @see fr.tblf.energy.estimation.eel.Visibility
	 * @see #setVibility(Visibility)
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getVariable_Vibility()
	 * @model required="true"
	 * @generated
	 */
	Visibility getVibility();

	/**
	 * Sets the value of the '{@link fr.tblf.energy.estimation.eel.Variable#getVibility <em>Vibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vibility</em>' attribute.
	 * @see fr.tblf.energy.estimation.eel.Visibility
	 * @see #getVibility()
	 * @generated
	 */
	void setVibility(Visibility value);

} // Variable
