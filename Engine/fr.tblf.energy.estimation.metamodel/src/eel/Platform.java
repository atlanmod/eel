/**
 */
package eel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eel.Platform#getName <em>Name</em>}</li>
 *   <li>{@link eel.Platform#getEstimations <em>Estimations</em>}</li>
 *   <li>{@link eel.Platform#getVariables <em>Variables</em>}</li>
 *   <li>{@link eel.Platform#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see eel.EelPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject {
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
	 * @see eel.EelPackage#getPlatform_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eel.Platform#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Estimations</b></em>' containment reference list.
	 * The list contents are of type {@link eel.Estimation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimations</em>' containment reference list.
	 * @see eel.EelPackage#getPlatform_Estimations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Estimation> getEstimations();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link eel.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see eel.EelPackage#getPlatform_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link eel.MetaClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see eel.EelPackage#getPlatform_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaClass> getTargets();

} // Platform
