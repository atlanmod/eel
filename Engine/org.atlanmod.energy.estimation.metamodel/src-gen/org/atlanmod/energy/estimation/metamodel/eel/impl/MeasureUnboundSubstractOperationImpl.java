/**
 */
package org.atlanmod.energy.estimation.metamodel.eel.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;

import org.atlanmod.energy.estimation.metamodel.eel.EelPackage;
import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSubstractOperation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Unbound Substract Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MeasureUnboundSubstractOperationImpl extends MeasureUnboundOperationImpl
		implements MeasureUnboundSubstractOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureUnboundSubstractOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.MEASURE_UNBOUND_SUBSTRACT_OPERATION;
	}

	/**
	 * The cached invocation delegate for the '{@link #value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #value()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal) EelPackage.Literals.MEASURE_UNBOUND_SUBSTRACT_OPERATION___VALUE)
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
			case EelPackage.MEASURE___VALUE:
				return EelPackage.MEASURE_UNBOUND_SUBSTRACT_OPERATION___VALUE;
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
		case EelPackage.MEASURE_UNBOUND_SUBSTRACT_OPERATION___VALUE:
			return value();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MeasureUnboundSubstractOperationImpl
