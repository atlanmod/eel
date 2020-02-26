/**
 */
package eel.impl;

import eel.EelPackage;
import eel.Sample;
import eel.Sampling;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eel.impl.SamplingImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link eel.impl.SamplingImpl#getMeasurementProcedure <em>Measurement Procedure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SamplingImpl extends MeasurementUncertaintyInformationImpl implements Sampling {
	/**
	 * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Sample> samples;

	/**
	 * The default value of the '{@link #getMeasurementProcedure() <em>Measurement Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementProcedure()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASUREMENT_PROCEDURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasurementProcedure() <em>Measurement Procedure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementProcedure()
	 * @generated
	 * @ordered
	 */
	protected String measurementProcedure = MEASUREMENT_PROCEDURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.SAMPLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sample> getSamples() {
		if (samples == null) {
			samples = new EObjectContainmentEList<Sample>(Sample.class, this, EelPackage.SAMPLING__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasurementProcedure() {
		return measurementProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementProcedure(String newMeasurementProcedure) {
		String oldMeasurementProcedure = measurementProcedure;
		measurementProcedure = newMeasurementProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EelPackage.SAMPLING__MEASUREMENT_PROCEDURE, oldMeasurementProcedure, measurementProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EelPackage.SAMPLING__SAMPLES:
				return ((InternalEList<?>)getSamples()).basicRemove(otherEnd, msgs);
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
			case EelPackage.SAMPLING__SAMPLES:
				return getSamples();
			case EelPackage.SAMPLING__MEASUREMENT_PROCEDURE:
				return getMeasurementProcedure();
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
			case EelPackage.SAMPLING__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends Sample>)newValue);
				return;
			case EelPackage.SAMPLING__MEASUREMENT_PROCEDURE:
				setMeasurementProcedure((String)newValue);
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
			case EelPackage.SAMPLING__SAMPLES:
				getSamples().clear();
				return;
			case EelPackage.SAMPLING__MEASUREMENT_PROCEDURE:
				setMeasurementProcedure(MEASUREMENT_PROCEDURE_EDEFAULT);
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
			case EelPackage.SAMPLING__SAMPLES:
				return samples != null && !samples.isEmpty();
			case EelPackage.SAMPLING__MEASUREMENT_PROCEDURE:
				return MEASUREMENT_PROCEDURE_EDEFAULT == null ? measurementProcedure != null : !MEASUREMENT_PROCEDURE_EDEFAULT.equals(measurementProcedure);
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
		result.append(" (measurementProcedure: ");
		result.append(measurementProcedure);
		result.append(')');
		return result.toString();
	}

} //SamplingImpl
