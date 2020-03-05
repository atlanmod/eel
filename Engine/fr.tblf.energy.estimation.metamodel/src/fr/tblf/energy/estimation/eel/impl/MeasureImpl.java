/**
 */
package fr.tblf.energy.estimation.eel.impl;

import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.Measure;
import fr.tblf.energy.estimation.eel.MeasurementUncertainty;
import fr.tblf.energy.estimation.eel.Type;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getTargetOperation <em>Target Operation</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeasureImpl extends MinimalEObjectImpl.Container implements Measure {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)EelPackage.Literals.MEASURE__NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected EClass targetClass;

	/**
	 * The cached value of the '{@link #getTargetOperation() <em>Target Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation targetOperation;

	/**
	 * The cached value of the '{@link #getUncertainty() <em>Uncertainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainty()
	 * @generated
	 * @ordered
	 */
	protected MeasurementUncertainty uncertainty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (EClass)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.MEASURE__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(EClass newTargetClass) {
		EClass oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.MEASURE__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTargetOperation() {
		if (targetOperation != null && targetOperation.eIsProxy()) {
			InternalEObject oldTargetOperation = (InternalEObject)targetOperation;
			targetOperation = (EOperation)eResolveProxy(oldTargetOperation);
			if (targetOperation != oldTargetOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.MEASURE__TARGET_OPERATION, oldTargetOperation, targetOperation));
			}
		}
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetTargetOperation() {
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOperation(EOperation newTargetOperation) {
		EOperation oldTargetOperation = targetOperation;
		targetOperation = newTargetOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.MEASURE__TARGET_OPERATION, oldTargetOperation, targetOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUncertainty getUncertainty() {
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUncertainty(MeasurementUncertainty newUncertainty, NotificationChain msgs) {
		MeasurementUncertainty oldUncertainty = uncertainty;
		uncertainty = newUncertainty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EelPackage.MEASURE__UNCERTAINTY, oldUncertainty, newUncertainty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertainty(MeasurementUncertainty newUncertainty) {
		if (newUncertainty != uncertainty) {
			NotificationChain msgs = null;
			if (uncertainty != null)
				msgs = ((InternalEObject)uncertainty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EelPackage.MEASURE__UNCERTAINTY, null, msgs);
			if (newUncertainty != null)
				msgs = ((InternalEObject)newUncertainty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EelPackage.MEASURE__UNCERTAINTY, null, msgs);
			msgs = basicSetUncertainty(newUncertainty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.MEASURE__UNCERTAINTY, newUncertainty, newUncertainty));
	}

	/**
	 * The cached invocation delegate for the '{@link #type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #type()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)EelPackage.Literals.MEASURE___TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type type() {
		try {
			return (Type)TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #value()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)EelPackage.Literals.MEASURE___VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal value() {
		try {
			return (BigDecimal)VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EelPackage.MEASURE__UNCERTAINTY:
				return basicSetUncertainty(null, msgs);
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
			case EelPackage.MEASURE__NAME:
				return getName();
			case EelPackage.MEASURE__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case EelPackage.MEASURE__TARGET_OPERATION:
				if (resolve) return getTargetOperation();
				return basicGetTargetOperation();
			case EelPackage.MEASURE__UNCERTAINTY:
				return getUncertainty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EelPackage.MEASURE__NAME:
				setName((String)newValue);
				return;
			case EelPackage.MEASURE__TARGET_CLASS:
				setTargetClass((EClass)newValue);
				return;
			case EelPackage.MEASURE__TARGET_OPERATION:
				setTargetOperation((EOperation)newValue);
				return;
			case EelPackage.MEASURE__UNCERTAINTY:
				setUncertainty((MeasurementUncertainty)newValue);
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
			case EelPackage.MEASURE__NAME:
				NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case EelPackage.MEASURE__TARGET_CLASS:
				setTargetClass((EClass)null);
				return;
			case EelPackage.MEASURE__TARGET_OPERATION:
				setTargetOperation((EOperation)null);
				return;
			case EelPackage.MEASURE__UNCERTAINTY:
				setUncertainty((MeasurementUncertainty)null);
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
			case EelPackage.MEASURE__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case EelPackage.MEASURE__TARGET_CLASS:
				return targetClass != null;
			case EelPackage.MEASURE__TARGET_OPERATION:
				return targetOperation != null;
			case EelPackage.MEASURE__UNCERTAINTY:
				return uncertainty != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EelPackage.MEASURE___TYPE:
				return type();
			case EelPackage.MEASURE___VALUE:
				return value();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MeasureImpl
