/**
 */
package org.atlanmod.energy.estimation.metamodel.eel.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;

import org.atlanmod.energy.estimation.metamodel.eel.EelPackage;
import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryProductOperation;
import org.atlanmod.energy.estimation.metamodel.eel.PowerComputation;
import org.atlanmod.energy.estimation.metamodel.eel.Type;
import org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Computation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PowerComputationImpl extends MeasureBinaryProductOperationImpl implements PowerComputation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerComputationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.POWER_COMPUTATION;
	}

	/**
	 * The cached invocation delegate for the '{@link #type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #type()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal) EelPackage.Literals.POWER_COMPUTATION___TYPE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type type() {
		try {
			return (Type) TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
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
	protected static final EOperation.Internal.InvocationDelegate VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal) EelPackage.Literals.POWER_COMPUTATION___VALUE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal value() {
		try {
			return (BigDecimal) VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Measure.class) {
			switch (baseOperationID) {
			case EelPackage.MEASURE___TYPE:
				return EelPackage.POWER_COMPUTATION___TYPE;
			case EelPackage.MEASURE___VALUE:
				return EelPackage.POWER_COMPUTATION___VALUE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TypedMeasure.class) {
			switch (baseOperationID) {
			case EelPackage.TYPED_MEASURE___TYPE:
				return EelPackage.POWER_COMPUTATION___TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == MeasureBinaryProductOperation.class) {
			switch (baseOperationID) {
			case EelPackage.MEASURE_BINARY_PRODUCT_OPERATION___VALUE:
				return EelPackage.POWER_COMPUTATION___VALUE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EelPackage.POWER_COMPUTATION___TYPE:
			return type();
		case EelPackage.POWER_COMPUTATION___VALUE:
			return value();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PowerComputationImpl
