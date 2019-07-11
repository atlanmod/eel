/**
 */
package org.naomod.tblf.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.naomod.tblf.petrinet.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link org.naomod.tblf.petrinet.Transition#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.naomod.tblf.petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.naomod.tblf.petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.naomod.tblf.petrinet.PetrinetPackage#getTransition_Input()
	 * @model
	 * @generated
	 */
	EList<Place> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.naomod.tblf.petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.naomod.tblf.petrinet.PetrinetPackage#getTransition_Output()
	 * @model
	 * @generated
	 */
	EList<Place> getOutput();

} // Transition
