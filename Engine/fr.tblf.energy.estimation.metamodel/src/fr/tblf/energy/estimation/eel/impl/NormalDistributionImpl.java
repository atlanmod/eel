/**
 */
package fr.tblf.energy.estimation.eel.impl;

import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.NormalDistribution;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.NormalDistributionImpl#getMeanValue <em>Mean Value</em>}</li>
 *   <li>{@link fr.tblf.energy.estimation.eel.impl.NormalDistributionImpl#getStandardDeviation <em>Standard Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalDistributionImpl extends MeasurementUncertaintyInformationImpl implements NormalDistribution {
	/**
	 * The cached setting delegate for the '{@link #getMeanValue() <em>Mean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanValue()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MEAN_VALUE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)EelPackage.Literals.NORMAL_DISTRIBUTION__MEAN_VALUE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STANDARD_DEVIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)EelPackage.Literals.NORMAL_DISTRIBUTION__STANDARD_DEVIATION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.NORMAL_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getMeanValue() {
		return (BigDecimal)MEAN_VALUE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanValue(BigDecimal newMeanValue) {
		MEAN_VALUE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newMeanValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getStandardDeviation() {
		return (BigDecimal)STANDARD_DEVIATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardDeviation(BigDecimal newStandardDeviation) {
		STANDARD_DEVIATION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newStandardDeviation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EelPackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				return getMeanValue();
			case EelPackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				return getStandardDeviation();
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
			case EelPackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				setMeanValue((BigDecimal)newValue);
				return;
			case EelPackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				setStandardDeviation((BigDecimal)newValue);
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
			case EelPackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				MEAN_VALUE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case EelPackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				STANDARD_DEVIATION__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case EelPackage.NORMAL_DISTRIBUTION__MEAN_VALUE:
				return MEAN_VALUE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case EelPackage.NORMAL_DISTRIBUTION__STANDARD_DEVIATION:
				return STANDARD_DEVIATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //NormalDistributionImpl
