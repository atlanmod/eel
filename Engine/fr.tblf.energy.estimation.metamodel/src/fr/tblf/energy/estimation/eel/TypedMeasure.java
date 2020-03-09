/**
 */
package fr.tblf.energy.estimation.eel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Define Measure elements that have a hand-defined type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.TypedMeasure#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getTypedMeasure()
 * @model abstract="true"
 * @generated
 */
public interface TypedMeasure extends Measure {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.tblf.energy.estimation.eel.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.tblf.energy.estimation.eel.Type
	 * @see #setType(Type)
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getTypedMeasure_Type()
	 * @model required="true" transient="true" derived="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link fr.tblf.energy.estimation.eel.TypedMeasure#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.tblf.energy.estimation.eel.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.type'"
	 * @generated
	 */
	Type type();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='targetClass+\'.\'+ if subname &lt;&gt; null then subname else type().toString() endif'"
	 * @generated
	 */
	String name();

} // TypedMeasure
