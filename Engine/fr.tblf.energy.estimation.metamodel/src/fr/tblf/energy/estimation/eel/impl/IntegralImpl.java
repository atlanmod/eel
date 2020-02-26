/**
 */
package fr.tblf.energy.estimation.eel.impl;

import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.Integral;
import fr.tblf.energy.estimation.eel.Interval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.IntegralImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.IntegralImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegralImpl extends MeasurementUncertaintyInformationImpl implements Integral {
	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected Interval interval;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.INTEGRAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval getInterval() {
		if (interval != null && interval.eIsProxy()) {
			InternalEObject oldInterval = (InternalEObject)interval;
			interval = (Interval)eResolveProxy(oldInterval);
			if (interval != oldInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.INTEGRAL__INTERVAL, oldInterval, interval));
			}
		}
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval basicGetInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(Interval newInterval) {
		Interval oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRAL__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRAL__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EelPackage.INTEGRAL__INTERVAL:
				if (resolve) return getInterval();
				return basicGetInterval();
			case EelPackage.INTEGRAL__FUNCTION:
				return getFunction();
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
			case EelPackage.INTEGRAL__INTERVAL:
				setInterval((Interval)newValue);
				return;
			case EelPackage.INTEGRAL__FUNCTION:
				setFunction((String)newValue);
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
			case EelPackage.INTEGRAL__INTERVAL:
				setInterval((Interval)null);
				return;
			case EelPackage.INTEGRAL__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
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
			case EelPackage.INTEGRAL__INTERVAL:
				return interval != null;
			case EelPackage.INTEGRAL__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
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
		result.append(" (function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} //IntegralImpl
