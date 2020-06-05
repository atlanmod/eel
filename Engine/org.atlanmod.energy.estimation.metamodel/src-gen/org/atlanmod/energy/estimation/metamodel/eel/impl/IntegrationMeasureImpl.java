/**
 */
package org.atlanmod.energy.estimation.metamodel.eel.impl;

import org.atlanmod.energy.estimation.metamodel.eel.CompositeMeasure;
import org.atlanmod.energy.estimation.metamodel.eel.EelPackage;
import org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure;

import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntegrationMeasureImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntegrationMeasureImpl#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntegrationMeasureImpl#getRightBound <em>Right Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegrationMeasureImpl extends CompositeMeasureImpl implements IntegrationMeasure {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected CompositeMeasure function;

	/**
	 * The cached value of the '{@link #getLeftBound() <em>Left Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBound()
	 * @generated
	 * @ordered
	 */
	protected Measure leftBound;

	/**
	 * The cached value of the '{@link #getRightBound() <em>Right Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBound()
	 * @generated
	 * @ordered
	 */
	protected Measure rightBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.INTEGRATION_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMeasure getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (CompositeMeasure) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.INTEGRATION_MEASURE__FUNCTION,
							oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMeasure basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(CompositeMeasure newFunction) {
		CompositeMeasure oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRATION_MEASURE__FUNCTION, oldFunction,
					function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getLeftBound() {
		if (leftBound != null && leftBound.eIsProxy()) {
			InternalEObject oldLeftBound = (InternalEObject) leftBound;
			leftBound = (Measure) eResolveProxy(oldLeftBound);
			if (leftBound != oldLeftBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EelPackage.INTEGRATION_MEASURE__LEFT_BOUND, oldLeftBound, leftBound));
			}
		}
		return leftBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetLeftBound() {
		return leftBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftBound(Measure newLeftBound) {
		Measure oldLeftBound = leftBound;
		leftBound = newLeftBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRATION_MEASURE__LEFT_BOUND,
					oldLeftBound, leftBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getRightBound() {
		if (rightBound != null && rightBound.eIsProxy()) {
			InternalEObject oldRightBound = (InternalEObject) rightBound;
			rightBound = (Measure) eResolveProxy(oldRightBound);
			if (rightBound != oldRightBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND, oldRightBound, rightBound));
			}
		}
		return rightBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure basicGetRightBound() {
		return rightBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightBound(Measure newRightBound) {
		Measure oldRightBound = rightBound;
		rightBound = newRightBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND,
					oldRightBound, rightBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EelPackage.INTEGRATION_MEASURE__FUNCTION:
			if (resolve)
				return getFunction();
			return basicGetFunction();
		case EelPackage.INTEGRATION_MEASURE__LEFT_BOUND:
			if (resolve)
				return getLeftBound();
			return basicGetLeftBound();
		case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
			if (resolve)
				return getRightBound();
			return basicGetRightBound();
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
		case EelPackage.INTEGRATION_MEASURE__FUNCTION:
			setFunction((CompositeMeasure) newValue);
			return;
		case EelPackage.INTEGRATION_MEASURE__LEFT_BOUND:
			setLeftBound((Measure) newValue);
			return;
		case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
			setRightBound((Measure) newValue);
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
		case EelPackage.INTEGRATION_MEASURE__FUNCTION:
			setFunction((CompositeMeasure) null);
			return;
		case EelPackage.INTEGRATION_MEASURE__LEFT_BOUND:
			setLeftBound((Measure) null);
			return;
		case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
			setRightBound((Measure) null);
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
		case EelPackage.INTEGRATION_MEASURE__FUNCTION:
			return function != null;
		case EelPackage.INTEGRATION_MEASURE__LEFT_BOUND:
			return leftBound != null;
		case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
			return rightBound != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegrationMeasureImpl
