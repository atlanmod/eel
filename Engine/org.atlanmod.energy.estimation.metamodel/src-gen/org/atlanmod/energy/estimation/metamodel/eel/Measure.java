/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root measure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getName <em>Name</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getSubname <em>Subname</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetOperation <em>Target Operation</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getPost <em>Post</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasure()
 * @model abstract="true"
 * @generated
 */
public interface Measure extends EObject {
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
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasure_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='name()'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subname</em>' attribute.
	 * @see #setSubname(String)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasure_Subname()
	 * @model
	 * @generated
	 */
	String getSubname();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getSubname <em>Subname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subname</em>' attribute.
	 * @see #getSubname()
	 * @generated
	 */
	void setSubname(String value);

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' attribute.
	 * @see #setTargetClass(String)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasure_TargetClass()
	 * @model
	 * @generated
	 */
	String getTargetClass();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetClass <em>Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' attribute.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(String value);

	/**
	 * Returns the value of the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Operation</em>' attribute.
	 * @see #setTargetOperation(String)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasure_TargetOperation()
	 * @model
	 * @generated
	 */
	String getTargetOperation();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetOperation <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operation</em>' attribute.
	 * @see #getTargetOperation()
	 * @generated
	 */
	void setTargetOperation(String value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(Boolean)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasure_Post()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='false'"
	 * @generated
	 */
	Boolean getPost();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Boolean value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uncertainty</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' containment reference.
	 * @see #setUncertainty(MeasurementUncertainty)
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getMeasure_Uncertainty()
	 * @model containment="true"
	 * @generated
	 */
	MeasurementUncertainty getUncertainty();

	/**
	 * Sets the value of the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getUncertainty <em>Uncertainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' containment reference.
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(MeasurementUncertainty value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='null'"
	 * @generated
	 */
	Type type();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='0'"
	 * @generated
	 */
	BigDecimal value();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\'\''"
	 * @generated
	 */
	String name();

} // Measure
