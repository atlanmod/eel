/**
 */
package org.naomod.tblf.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.naomod.tblf.petrinet.Net#getPlaces <em>Places</em>}</li>
 *   <li>{@link org.naomod.tblf.petrinet.Net#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.naomod.tblf.petrinet.Net#getFirst <em>First</em>}</li>
 * </ul>
 *
 * @see org.naomod.tblf.petrinet.PetrinetPackage#getNet()
 * @model
 * @generated
 */
public interface Net extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link org.naomod.tblf.petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see org.naomod.tblf.petrinet.PetrinetPackage#getNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.naomod.tblf.petrinet.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see org.naomod.tblf.petrinet.PetrinetPackage#getNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(Place)
	 * @see org.naomod.tblf.petrinet.PetrinetPackage#getNet_First()
	 * @model required="true"
	 * @generated
	 */
	Place getFirst();

	/**
	 * Sets the value of the '{@link org.naomod.tblf.petrinet.Net#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(Place value);

} // Net
