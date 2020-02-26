/**
 */
package eel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Define the measure computed through operations between measures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eel.MeasureOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link eel.MeasureOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see eel.EelPackage#getMeasureOperation()
 * @model abstract="true"
 * @generated
 */
public interface MeasureOperation extends Measure {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Measure)
	 * @see eel.EelPackage#getMeasureOperation_Left()
	 * @model
	 * @generated
	 */
	Measure getLeft();

	/**
	 * Sets the value of the '{@link eel.MeasureOperation#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Measure value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Measure)
	 * @see eel.EelPackage#getMeasureOperation_Right()
	 * @model
	 * @generated
	 */
	Measure getRight();

	/**
	 * Sets the value of the '{@link eel.MeasureOperation#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Measure value);

} // MeasureOperation
