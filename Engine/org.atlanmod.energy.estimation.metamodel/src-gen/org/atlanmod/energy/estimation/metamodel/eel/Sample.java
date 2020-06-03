/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.Sample#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getSample()
 * @model
 * @generated
 */
public interface Sample extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.atlanmod.energy.estimation.metamodel.eel.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference list.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EelPackage#getSample_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measure> getQuantity();

} // Sample
