/**
 */
package fr.tblf.energy.estimation.eel;

import org.eclipse.emf.ecore.EAttribute;

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
 *   <li>{@link fr.tblf.energy.estimation.eel.MeasureAttribute#getAtt <em>Att</em>}</li>
 * </ul>
 *
 * @see fr.tblf.energy.estimation.eel.EelPackage#getMeasureAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isAttribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isAttribute='self.att.oclIsKindOf(ecore::EAttribute)'"
 * @generated
 */
public interface MeasureAttribute extends MeasureValue {
	/**
	 * Returns the value of the '<em><b>Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att</em>' reference.
	 * @see #setAtt(EAttribute)
	 * @see fr.tblf.energy.estimation.eel.EelPackage#getMeasureAttribute_Att()
	 * @model
	 * @generated
	 */
	EAttribute getAtt();

	/**
	 * Sets the value of the '{@link fr.tblf.energy.estimation.eel.MeasureAttribute#getAtt <em>Att</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att</em>' reference.
	 * @see #getAtt()
	 * @generated
	 */
	void setAtt(EAttribute value);

} // MeasureAttribute
