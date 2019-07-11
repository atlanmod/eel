/**
 */
package eel.impl;

import eel.EelPackage;
import eel.Estimation;
import eel.MetaClass;
import eel.Platform;
import eel.Variable;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eel.impl.PlatformImpl#getName <em>Name</em>}</li>
 *   <li>{@link eel.impl.PlatformImpl#getEstimations <em>Estimations</em>}</li>
 *   <li>{@link eel.impl.PlatformImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link eel.impl.PlatformImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends MinimalEObjectImpl.Container implements Platform {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstimations() <em>Estimations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimations()
	 * @generated
	 * @ordered
	 */
	protected EList<Estimation> estimations;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaClass> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.PLATFORM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Estimation> getEstimations() {
		if (estimations == null) {
			estimations = new EObjectContainmentEList<Estimation>(Estimation.class, this, EelPackage.PLATFORM__ESTIMATIONS);
		}
		return estimations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, EelPackage.PLATFORM__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaClass> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<MetaClass>(MetaClass.class, this, EelPackage.PLATFORM__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EelPackage.PLATFORM__ESTIMATIONS:
				return ((InternalEList<?>)getEstimations()).basicRemove(otherEnd, msgs);
			case EelPackage.PLATFORM__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case EelPackage.PLATFORM__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EelPackage.PLATFORM__NAME:
				return getName();
			case EelPackage.PLATFORM__ESTIMATIONS:
				return getEstimations();
			case EelPackage.PLATFORM__VARIABLES:
				return getVariables();
			case EelPackage.PLATFORM__TARGETS:
				return getTargets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EelPackage.PLATFORM__NAME:
				setName((String)newValue);
				return;
			case EelPackage.PLATFORM__ESTIMATIONS:
				getEstimations().clear();
				getEstimations().addAll((Collection<? extends Estimation>)newValue);
				return;
			case EelPackage.PLATFORM__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case EelPackage.PLATFORM__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends MetaClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EelPackage.PLATFORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EelPackage.PLATFORM__ESTIMATIONS:
				getEstimations().clear();
				return;
			case EelPackage.PLATFORM__VARIABLES:
				getVariables().clear();
				return;
			case EelPackage.PLATFORM__TARGETS:
				getTargets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EelPackage.PLATFORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EelPackage.PLATFORM__ESTIMATIONS:
				return estimations != null && !estimations.isEmpty();
			case EelPackage.PLATFORM__VARIABLES:
				return variables != null && !variables.isEmpty();
			case EelPackage.PLATFORM__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PlatformImpl
