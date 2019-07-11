/**
 */
package org.naomod.tblf.petrinet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.naomod.tblf.petrinet.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link org.naomod.tblf.petrinet.Place#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.naomod.tblf.petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see org.naomod.tblf.petrinet.PetrinetPackage#getPlace_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link org.naomod.tblf.petrinet.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Transition)
	 * @see org.naomod.tblf.petrinet.PetrinetPackage#getPlace_To()
	 * @model
	 * @generated
	 */
	Transition getTo();

	/**
	 * Sets the value of the '{@link org.naomod.tblf.petrinet.Place#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Transition value);

} // Place
