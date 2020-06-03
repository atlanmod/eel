/**
 */
package org.atlanmod.energy.estimation.metamodel.eel.impl;

import org.atlanmod.energy.estimation.metamodel.eel.EelPackage;
import org.atlanmod.energy.estimation.metamodel.eel.Interval;
import org.atlanmod.energy.estimation.metamodel.eel.Measure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntervalImpl#getLowerEndpoint <em>Lower Endpoint</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntervalImpl#getUpperEndpoint <em>Upper Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalImpl extends MeasurementUncertaintyInformationImpl implements Interval {
	/**
	 * The cached value of the '{@link #getLowerEndpoint() <em>Lower Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Measure lowerEndpoint;

	/**
	 * The cached value of the '{@link #getUpperEndpoint() <em>Upper Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Measure upperEndpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getLowerEndpoint() {
		return lowerEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerEndpoint(Measure newLowerEndpoint, NotificationChain msgs) {
		Measure oldLowerEndpoint = lowerEndpoint;
		lowerEndpoint = newLowerEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EelPackage.INTERVAL__LOWER_ENDPOINT, oldLowerEndpoint, newLowerEndpoint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerEndpoint(Measure newLowerEndpoint) {
		if (newLowerEndpoint != lowerEndpoint) {
			NotificationChain msgs = null;
			if (lowerEndpoint != null)
				msgs = ((InternalEObject) lowerEndpoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EelPackage.INTERVAL__LOWER_ENDPOINT, null, msgs);
			if (newLowerEndpoint != null)
				msgs = ((InternalEObject) newLowerEndpoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EelPackage.INTERVAL__LOWER_ENDPOINT, null, msgs);
			msgs = basicSetLowerEndpoint(newLowerEndpoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTERVAL__LOWER_ENDPOINT, newLowerEndpoint,
					newLowerEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getUpperEndpoint() {
		return upperEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperEndpoint(Measure newUpperEndpoint, NotificationChain msgs) {
		Measure oldUpperEndpoint = upperEndpoint;
		upperEndpoint = newUpperEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EelPackage.INTERVAL__UPPER_ENDPOINT, oldUpperEndpoint, newUpperEndpoint);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperEndpoint(Measure newUpperEndpoint) {
		if (newUpperEndpoint != upperEndpoint) {
			NotificationChain msgs = null;
			if (upperEndpoint != null)
				msgs = ((InternalEObject) upperEndpoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EelPackage.INTERVAL__UPPER_ENDPOINT, null, msgs);
			if (newUpperEndpoint != null)
				msgs = ((InternalEObject) newUpperEndpoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EelPackage.INTERVAL__UPPER_ENDPOINT, null, msgs);
			msgs = basicSetUpperEndpoint(newUpperEndpoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTERVAL__UPPER_ENDPOINT, newUpperEndpoint,
					newUpperEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EelPackage.INTERVAL__LOWER_ENDPOINT:
			return basicSetLowerEndpoint(null, msgs);
		case EelPackage.INTERVAL__UPPER_ENDPOINT:
			return basicSetUpperEndpoint(null, msgs);
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
		case EelPackage.INTERVAL__LOWER_ENDPOINT:
			return getLowerEndpoint();
		case EelPackage.INTERVAL__UPPER_ENDPOINT:
			return getUpperEndpoint();
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
		case EelPackage.INTERVAL__LOWER_ENDPOINT:
			setLowerEndpoint((Measure) newValue);
			return;
		case EelPackage.INTERVAL__UPPER_ENDPOINT:
			setUpperEndpoint((Measure) newValue);
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
		case EelPackage.INTERVAL__LOWER_ENDPOINT:
			setLowerEndpoint((Measure) null);
			return;
		case EelPackage.INTERVAL__UPPER_ENDPOINT:
			setUpperEndpoint((Measure) null);
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
		case EelPackage.INTERVAL__LOWER_ENDPOINT:
			return lowerEndpoint != null;
		case EelPackage.INTERVAL__UPPER_ENDPOINT:
			return upperEndpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //IntervalImpl
