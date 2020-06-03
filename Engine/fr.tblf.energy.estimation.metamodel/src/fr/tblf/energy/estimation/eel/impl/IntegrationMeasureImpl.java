/**
 */
package fr.tblf.energy.estimation.eel.impl;

import fr.tblf.energy.estimation.eel.CompositeMeasure;
import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.IntegrationMeasure;

import java.math.BigDecimal;
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
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.IntegrationMeasureImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.IntegrationMeasureImpl#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.IntegrationMeasureImpl#getRightBound <em>Right Bound</em>}</li>
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
	 * The default value of the '{@link #getLeftBound() <em>Left Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBound()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LEFT_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftBound() <em>Left Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBound()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal leftBound = LEFT_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightBound() <em>Right Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBound()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RIGHT_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightBound() <em>Right Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBound()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal rightBound = RIGHT_BOUND_EDEFAULT;

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
			InternalEObject oldFunction = (InternalEObject)function;
			function = (CompositeMeasure)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EelPackage.INTEGRATION_MEASURE__FUNCTION, oldFunction, function));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRATION_MEASURE__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLeftBound() {
		return leftBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftBound(BigDecimal newLeftBound) {
		BigDecimal oldLeftBound = leftBound;
		leftBound = newLeftBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRATION_MEASURE__LEFT_BOUND, oldLeftBound, leftBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRightBound() {
		return rightBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightBound(BigDecimal newRightBound) {
		BigDecimal oldRightBound = rightBound;
		rightBound = newRightBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND, oldRightBound, rightBound));
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
				if (resolve) return getFunction();
				return basicGetFunction();
			case EelPackage.INTEGRATION_MEASURE__LEFT_BOUND:
				return getLeftBound();
			case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				return getRightBound();
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
				setFunction((CompositeMeasure)newValue);
				return;
			case EelPackage.INTEGRATION_MEASURE__LEFT_BOUND:
				setLeftBound((BigDecimal)newValue);
				return;
			case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				setRightBound((BigDecimal)newValue);
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
				setFunction((CompositeMeasure)null);
				return;
			case EelPackage.INTEGRATION_MEASURE__LEFT_BOUND:
				setLeftBound(LEFT_BOUND_EDEFAULT);
				return;
			case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				setRightBound(RIGHT_BOUND_EDEFAULT);
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
				return LEFT_BOUND_EDEFAULT == null ? leftBound != null : !LEFT_BOUND_EDEFAULT.equals(leftBound);
			case EelPackage.INTEGRATION_MEASURE__RIGHT_BOUND:
				return RIGHT_BOUND_EDEFAULT == null ? rightBound != null : !RIGHT_BOUND_EDEFAULT.equals(rightBound);
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
		result.append(" (leftBound: ");
		result.append(leftBound);
		result.append(", rightBound: ");
		result.append(rightBound);
		result.append(')');
		return result.toString();
	}

} //IntegrationMeasureImpl
