/**
 */
package fr.tblf.energy.estimation.eel.impl;

import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.LogisticMeasure;
import fr.tblf.energy.estimation.eel.Measure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logistic Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.LogisticMeasureImpl#getL <em>L</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.LogisticMeasureImpl#getK <em>K</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.LogisticMeasureImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.LogisticMeasureImpl#getX <em>X</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogisticMeasureImpl extends CompositeMeasureImpl implements LogisticMeasure {
	/**
	 * The cached value of the '{@link #getL() <em>L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected Measure l;

	/**
	 * The cached value of the '{@link #getK() <em>K</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getK()
	 * @generated
	 * @ordered
	 */
	protected Measure k;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected Measure x0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Measure x;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogisticMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.LOGISTIC_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getL() {
		if (l != null && l.eIsProxy()) {
			InternalEObject oldL = (InternalEObject)l;
			l = (Measure)eResolveProxy(oldL);
			if (l != oldL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.LOGISTIC_MEASURE__L, oldL, l));
			}
		}
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetL() {
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL(Measure newL) {
		Measure oldL = l;
		l = newL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.LOGISTIC_MEASURE__L, oldL, l));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getK() {
		if (k != null && k.eIsProxy()) {
			InternalEObject oldK = (InternalEObject)k;
			k = (Measure)eResolveProxy(oldK);
			if (k != oldK) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.LOGISTIC_MEASURE__K, oldK, k));
			}
		}
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetK() {
		return k;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setK(Measure newK) {
		Measure oldK = k;
		k = newK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.LOGISTIC_MEASURE__K, oldK, k));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getX0() {
		if (x0 != null && x0.eIsProxy()) {
			InternalEObject oldX0 = (InternalEObject)x0;
			x0 = (Measure)eResolveProxy(oldX0);
			if (x0 != oldX0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.LOGISTIC_MEASURE__X0, oldX0, x0));
			}
		}
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetX0() {
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX0(Measure newX0) {
		Measure oldX0 = x0;
		x0 = newX0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.LOGISTIC_MEASURE__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getX() {
		if (x != null && x.eIsProxy()) {
			InternalEObject oldX = (InternalEObject)x;
			x = (Measure)eResolveProxy(oldX);
			if (x != oldX) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.LOGISTIC_MEASURE__X, oldX, x));
			}
		}
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Measure newX) {
		Measure oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.LOGISTIC_MEASURE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EelPackage.LOGISTIC_MEASURE__L:
				if (resolve) return getL();
				return basicGetL();
			case EelPackage.LOGISTIC_MEASURE__K:
				if (resolve) return getK();
				return basicGetK();
			case EelPackage.LOGISTIC_MEASURE__X0:
				if (resolve) return getX0();
				return basicGetX0();
			case EelPackage.LOGISTIC_MEASURE__X:
				if (resolve) return getX();
				return basicGetX();
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
			case EelPackage.LOGISTIC_MEASURE__L:
				setL((Measure)newValue);
				return;
			case EelPackage.LOGISTIC_MEASURE__K:
				setK((Measure)newValue);
				return;
			case EelPackage.LOGISTIC_MEASURE__X0:
				setX0((Measure)newValue);
				return;
			case EelPackage.LOGISTIC_MEASURE__X:
				setX((Measure)newValue);
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
			case EelPackage.LOGISTIC_MEASURE__L:
				setL((Measure)null);
				return;
			case EelPackage.LOGISTIC_MEASURE__K:
				setK((Measure)null);
				return;
			case EelPackage.LOGISTIC_MEASURE__X0:
				setX0((Measure)null);
				return;
			case EelPackage.LOGISTIC_MEASURE__X:
				setX((Measure)null);
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
			case EelPackage.LOGISTIC_MEASURE__L:
				return l != null;
			case EelPackage.LOGISTIC_MEASURE__K:
				return k != null;
			case EelPackage.LOGISTIC_MEASURE__X0:
				return x0 != null;
			case EelPackage.LOGISTIC_MEASURE__X:
				return x != null;
		}
		return super.eIsSet(featureID);
	}

} //LogisticMeasureImpl
