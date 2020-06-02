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
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getSubname <em>Subname</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getTargetOperation <em>Target Operation</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl#getPost <em>Post</em>}</li>
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
	 * The default value of the '{@link #getSubname() <em>Subname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubname()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubname() <em>Subname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubname()
	 * @generated
	 * @ordered
	 */
	protected String subname = SUBNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected String targetClass = TARGET_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetOperation() <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetOperation() <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOperation()
	 * @generated
	 * @ordered
	 */
	protected String targetOperation = TARGET_OPERATION_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getPost() <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate POST__ESETTING_DELEGATE = ((EStructuralFeature.Internal)EelPackage.Literals.MEASURE__POST).getSettingDelegate();

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
	public String getSubname() {
		return subname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubname(String newSubname) {
		String oldSubname = subname;
		subname = newSubname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.MEASURE__SUBNAME, oldSubname, subname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(String newTargetClass) {
		String oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.MEASURE__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetOperation() {
		return targetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOperation(String newTargetOperation) {
		String oldTargetOperation = targetOperation;
		targetOperation = newTargetOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.MEASURE__TARGET_OPERATION, oldTargetOperation, targetOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPost() {
		return (Boolean)POST__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(Boolean newPost) {
		POST__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPost);
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
	 * The cached invocation delegate for the '{@link #name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #name()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)EelPackage.Literals.MEASURE___NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String name() {
		try {
			return (String)NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case EelPackage.MEASURE__SUBNAME:
				return getSubname();
			case EelPackage.MEASURE__TARGET_CLASS:
				return getTargetClass();
			case EelPackage.MEASURE__TARGET_OPERATION:
				return getTargetOperation();
			case EelPackage.MEASURE__POST:
				return getPost();
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
			case EelPackage.MEASURE__SUBNAME:
				setSubname((String)newValue);
				return;
			case EelPackage.MEASURE__TARGET_CLASS:
				setTargetClass((String)newValue);
				return;
			case EelPackage.MEASURE__TARGET_OPERATION:
				setTargetOperation((String)newValue);
				return;
			case EelPackage.MEASURE__POST:
				setPost((Boolean)newValue);
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
			case EelPackage.MEASURE__SUBNAME:
				setSubname(SUBNAME_EDEFAULT);
				return;
			case EelPackage.MEASURE__TARGET_CLASS:
				setTargetClass(TARGET_CLASS_EDEFAULT);
				return;
			case EelPackage.MEASURE__TARGET_OPERATION:
				setTargetOperation(TARGET_OPERATION_EDEFAULT);
				return;
			case EelPackage.MEASURE__POST:
				POST__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case EelPackage.MEASURE__SUBNAME:
				return SUBNAME_EDEFAULT == null ? subname != null : !SUBNAME_EDEFAULT.equals(subname);
			case EelPackage.MEASURE__TARGET_CLASS:
				return TARGET_CLASS_EDEFAULT == null ? targetClass != null : !TARGET_CLASS_EDEFAULT.equals(targetClass);
			case EelPackage.MEASURE__TARGET_OPERATION:
				return TARGET_OPERATION_EDEFAULT == null ? targetOperation != null : !TARGET_OPERATION_EDEFAULT.equals(targetOperation);
			case EelPackage.MEASURE__POST:
				return POST__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case EelPackage.MEASURE___NAME:
				return name();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (subname: ");
		result.append(subname);
		result.append(", targetClass: ");
		result.append(targetClass);
		result.append(", targetOperation: ");
		result.append(targetOperation);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
