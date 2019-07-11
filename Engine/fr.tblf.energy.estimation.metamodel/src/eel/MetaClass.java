/**
 */
package eel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eel.MetaClass#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see eel.EelPackage#getMetaClass()
 * @model
 * @generated
 */
public interface MetaClass extends Target {

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link eel.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see eel.EelPackage#getMetaClass_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();
} // MetaClass
