/**
 */
package org.atlanmod.energy.estimation.metamodel.eel.impl;

import java.lang.reflect.InvocationTargetException;

import org.atlanmod.energy.estimation.metamodel.eel.EelPackage;
import org.atlanmod.energy.estimation.metamodel.eel.Measure;
import org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration;
import org.atlanmod.energy.estimation.metamodel.eel.Type;
import org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Time Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RealTimeDurationImpl extends MeasureValueImpl implements RealTimeDuration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealTimeDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EelPackage.Literals.REAL_TIME_DURATION;
	}

	/**
	 * The cached invocation delegate for the '{@link #type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #type()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal) EelPackage.Literals.REAL_TIME_DURATION___TYPE)
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Measure.class) {
			switch (baseOperationID) {
			case EelPackage.MEASURE___TYPE:
				return EelPackage.REAL_TIME_DURATION___TYPE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == TypedMeasure.class) {
			switch (baseOperationID) {
			case EelPackage.TYPED_MEASURE___TYPE:
				return EelPackage.REAL_TIME_DURATION___TYPE;
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
		case EelPackage.REAL_TIME_DURATION___TYPE:
			return type();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RealTimeDurationImpl
