/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measure where the value corresponds to the value of an attribute in the decorated model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute#getAtt <em>Att</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasureAttribute()
 * @model
 * @generated
 */
public interface MeasureAttribute extends MeasureValue {
	/**
	 * Returns the value of the '<em><b>Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att</em>' attribute.
	 * @see #setAtt(String)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasureAttribute_Att()
	 * @model
	 * @generated
	 */
	String getAtt();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute#getAtt <em>Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att</em>' attribute.
	 * @see #getAtt()
	 * @generated
	 */
	void setAtt(String value);

} // MeasureAttribute
