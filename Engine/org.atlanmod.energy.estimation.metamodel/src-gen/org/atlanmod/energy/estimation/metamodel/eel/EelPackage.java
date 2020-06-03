/**
 */
package org.atlanmod.energy.estimation.metamodel.eel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.atlanmod.energy.estimation.metamodel.eel.EelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface EelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.atlanmod.org/eel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.atlanmod.energy.estimation.eel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EelPackage eINSTANCE = org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.PlatformImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__MEASURES = 2;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.VariableImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Vibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VIBILITY = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SUBNAME = 1;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TARGET_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TARGET_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__POST = 4;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__UNCERTAINTY = 5;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE___TYPE = 0;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE___VALUE = 1;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE___NAME = 2;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.TypedMeasureImpl <em>Typed Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.TypedMeasureImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getTypedMeasure()
	 * @generated
	 */
	int TYPED_MEASURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__SUBNAME = MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__TARGET_CLASS = MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__TARGET_OPERATION = MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__POST = MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__UNCERTAINTY = MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__TYPE = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE___VALUE = MEASURE___VALUE;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE___TYPE = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE___NAME = MEASURE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureValueImpl <em>Measure Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureValueImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureValue()
	 * @generated
	 */
	int MEASURE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__NAME = TYPED_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__SUBNAME = TYPED_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__POST = TYPED_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__UNCERTAINTY = TYPED_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__TYPE = TYPED_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__VALUE = TYPED_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_FEATURE_COUNT = TYPED_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE___TYPE = TYPED_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE___NAME = TYPED_MEASURE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE___VALUE = TYPED_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measure Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_OPERATION_COUNT = TYPED_MEASURE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureOCLImpl <em>Measure OCL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureOCLImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureOCL()
	 * @generated
	 */
	int MEASURE_OCL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__NAME = MEASURE_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__SUBNAME = MEASURE_VALUE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__TARGET_CLASS = MEASURE_VALUE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__TARGET_OPERATION = MEASURE_VALUE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__POST = MEASURE_VALUE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__UNCERTAINTY = MEASURE_VALUE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__TYPE = MEASURE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__VALUE = MEASURE_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__OCL_QUERY = MEASURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure OCL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL_FEATURE_COUNT = MEASURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL___TYPE = MEASURE_VALUE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL___NAME = MEASURE_VALUE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL___VALUE = MEASURE_VALUE___VALUE;

	/**
	 * The number of operations of the '<em>Measure OCL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL_OPERATION_COUNT = MEASURE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureAttributeImpl <em>Measure Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureAttributeImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureAttribute()
	 * @generated
	 */
	int MEASURE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__NAME = MEASURE_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__SUBNAME = MEASURE_VALUE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__TARGET_CLASS = MEASURE_VALUE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__TARGET_OPERATION = MEASURE_VALUE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__POST = MEASURE_VALUE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__UNCERTAINTY = MEASURE_VALUE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__TYPE = MEASURE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__VALUE = MEASURE_VALUE__VALUE;

	/**
	 * The feature id for the '<em><b>Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__ATT = MEASURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE_FEATURE_COUNT = MEASURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE___TYPE = MEASURE_VALUE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE___NAME = MEASURE_VALUE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE___VALUE = MEASURE_VALUE___VALUE;

	/**
	 * The number of operations of the '<em>Measure Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE_OPERATION_COUNT = MEASURE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureCastImpl <em>Measure Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureCastImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureCast()
	 * @generated
	 */
	int MEASURE_CAST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__NAME = TYPED_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__SUBNAME = TYPED_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__POST = TYPED_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__UNCERTAINTY = TYPED_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__TYPE = TYPED_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__MEASURE = TYPED_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST_FEATURE_COUNT = TYPED_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST___VALUE = TYPED_MEASURE___VALUE;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST___TYPE = TYPED_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST___NAME = TYPED_MEASURE___NAME;

	/**
	 * The number of operations of the '<em>Measure Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST_OPERATION_COUNT = TYPED_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryOperationImpl <em>Measure Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryOperationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureBinaryOperation()
	 * @generated
	 */
	int MEASURE_BINARY_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__NAME = TYPED_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__SUBNAME = TYPED_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__POST = TYPED_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__UNCERTAINTY = TYPED_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__TYPE = TYPED_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__LEFT = TYPED_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__RIGHT = TYPED_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measure Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION_FEATURE_COUNT = TYPED_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION___VALUE = TYPED_MEASURE___VALUE;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION___TYPE = TYPED_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION___NAME = TYPED_MEASURE___NAME;

	/**
	 * The number of operations of the '<em>Measure Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION_OPERATION_COUNT = TYPED_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryProductOperationImpl <em>Measure Binary Product Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryProductOperationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureBinaryProductOperation()
	 * @generated
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__NAME = MEASURE_BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__SUBNAME = MEASURE_BINARY_OPERATION__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__TARGET_CLASS = MEASURE_BINARY_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__TARGET_OPERATION = MEASURE_BINARY_OPERATION__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__POST = MEASURE_BINARY_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__UNCERTAINTY = MEASURE_BINARY_OPERATION__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__TYPE = MEASURE_BINARY_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__LEFT = MEASURE_BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__RIGHT = MEASURE_BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Measure Binary Product Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION_FEATURE_COUNT = MEASURE_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION___TYPE = MEASURE_BINARY_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION___NAME = MEASURE_BINARY_OPERATION___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION___VALUE = MEASURE_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measure Binary Product Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION_OPERATION_COUNT = MEASURE_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinarySumOperationImpl <em>Measure Binary Sum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinarySumOperationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureBinarySumOperation()
	 * @generated
	 */
	int MEASURE_BINARY_SUM_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__NAME = MEASURE_BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__SUBNAME = MEASURE_BINARY_OPERATION__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__TARGET_CLASS = MEASURE_BINARY_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__TARGET_OPERATION = MEASURE_BINARY_OPERATION__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__POST = MEASURE_BINARY_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__UNCERTAINTY = MEASURE_BINARY_OPERATION__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__TYPE = MEASURE_BINARY_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__LEFT = MEASURE_BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__RIGHT = MEASURE_BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Measure Binary Sum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION_FEATURE_COUNT = MEASURE_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION___TYPE = MEASURE_BINARY_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION___NAME = MEASURE_BINARY_OPERATION___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION___VALUE = MEASURE_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measure Binary Sum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION_OPERATION_COUNT = MEASURE_BINARY_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.EnergyComputationImpl <em>Energy Computation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EnergyComputationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getEnergyComputation()
	 * @generated
	 */
	int ENERGY_COMPUTATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__NAME = MEASURE_BINARY_PRODUCT_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__SUBNAME = MEASURE_BINARY_PRODUCT_OPERATION__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__TARGET_CLASS = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__TARGET_OPERATION = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__POST = MEASURE_BINARY_PRODUCT_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__UNCERTAINTY = MEASURE_BINARY_PRODUCT_OPERATION__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__TYPE = MEASURE_BINARY_PRODUCT_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__LEFT = MEASURE_BINARY_PRODUCT_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__RIGHT = MEASURE_BINARY_PRODUCT_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Energy Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION_FEATURE_COUNT = MEASURE_BINARY_PRODUCT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION___NAME = MEASURE_BINARY_PRODUCT_OPERATION___NAME;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION___TYPE = MEASURE_BINARY_PRODUCT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION___VALUE = MEASURE_BINARY_PRODUCT_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Energy Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION_OPERATION_COUNT = MEASURE_BINARY_PRODUCT_OPERATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.PowerComputationImpl <em>Power Computation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.PowerComputationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getPowerComputation()
	 * @generated
	 */
	int POWER_COMPUTATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__NAME = MEASURE_BINARY_PRODUCT_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__SUBNAME = MEASURE_BINARY_PRODUCT_OPERATION__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__TARGET_CLASS = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__TARGET_OPERATION = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__POST = MEASURE_BINARY_PRODUCT_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__UNCERTAINTY = MEASURE_BINARY_PRODUCT_OPERATION__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__TYPE = MEASURE_BINARY_PRODUCT_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__LEFT = MEASURE_BINARY_PRODUCT_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__RIGHT = MEASURE_BINARY_PRODUCT_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Power Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION_FEATURE_COUNT = MEASURE_BINARY_PRODUCT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION___NAME = MEASURE_BINARY_PRODUCT_OPERATION___NAME;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION___TYPE = MEASURE_BINARY_PRODUCT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION___VALUE = MEASURE_BINARY_PRODUCT_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION_OPERATION_COUNT = MEASURE_BINARY_PRODUCT_OPERATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.RealTimeDurationImpl <em>Real Time Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.RealTimeDurationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getRealTimeDuration()
	 * @generated
	 */
	int REAL_TIME_DURATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__NAME = MEASURE_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__SUBNAME = MEASURE_VALUE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__TARGET_CLASS = MEASURE_VALUE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__TARGET_OPERATION = MEASURE_VALUE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__POST = MEASURE_VALUE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__UNCERTAINTY = MEASURE_VALUE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__TYPE = MEASURE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION__VALUE = MEASURE_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Real Time Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION_FEATURE_COUNT = MEASURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION___NAME = MEASURE_VALUE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION___VALUE = MEASURE_VALUE___VALUE;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION___TYPE = MEASURE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Time Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_DURATION_OPERATION_COUNT = MEASURE_VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundOperationImpl <em>Measure Unbound Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundOperationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureUnboundOperation()
	 * @generated
	 */
	int MEASURE_UNBOUND_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__NAME = TYPED_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__SUBNAME = TYPED_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__POST = TYPED_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__UNCERTAINTY = TYPED_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__TYPE = TYPED_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__MEASURES = TYPED_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Unbound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION_FEATURE_COUNT = TYPED_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION___VALUE = TYPED_MEASURE___VALUE;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION___TYPE = TYPED_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION___NAME = TYPED_MEASURE___NAME;

	/**
	 * The number of operations of the '<em>Measure Unbound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION_OPERATION_COUNT = TYPED_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundSumOperationImpl <em>Measure Unbound Sum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundSumOperationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureUnboundSumOperation()
	 * @generated
	 */
	int MEASURE_UNBOUND_SUM_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__NAME = MEASURE_UNBOUND_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__SUBNAME = MEASURE_UNBOUND_OPERATION__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__TARGET_CLASS = MEASURE_UNBOUND_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__TARGET_OPERATION = MEASURE_UNBOUND_OPERATION__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__POST = MEASURE_UNBOUND_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__UNCERTAINTY = MEASURE_UNBOUND_OPERATION__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__TYPE = MEASURE_UNBOUND_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__MEASURES = MEASURE_UNBOUND_OPERATION__MEASURES;

	/**
	 * The number of structural features of the '<em>Measure Unbound Sum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION_FEATURE_COUNT = MEASURE_UNBOUND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION___TYPE = MEASURE_UNBOUND_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION___NAME = MEASURE_UNBOUND_OPERATION___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION___VALUE = MEASURE_UNBOUND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measure Unbound Sum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION_OPERATION_COUNT = MEASURE_UNBOUND_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundProductOperationImpl <em>Measure Unbound Product Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundProductOperationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureUnboundProductOperation()
	 * @generated
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__NAME = MEASURE_UNBOUND_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__SUBNAME = MEASURE_UNBOUND_OPERATION__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__TARGET_CLASS = MEASURE_UNBOUND_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__TARGET_OPERATION = MEASURE_UNBOUND_OPERATION__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__POST = MEASURE_UNBOUND_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__UNCERTAINTY = MEASURE_UNBOUND_OPERATION__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__TYPE = MEASURE_UNBOUND_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__MEASURES = MEASURE_UNBOUND_OPERATION__MEASURES;

	/**
	 * The number of structural features of the '<em>Measure Unbound Product Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION_FEATURE_COUNT = MEASURE_UNBOUND_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION___TYPE = MEASURE_UNBOUND_OPERATION___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION___NAME = MEASURE_UNBOUND_OPERATION___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION___VALUE = MEASURE_UNBOUND_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measure Unbound Product Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION_OPERATION_COUNT = MEASURE_UNBOUND_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyImpl <em>Measurement Uncertainty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasurementUncertainty()
	 * @generated
	 */
	int MEASUREMENT_UNCERTAINTY = 17;

	/**
	 * The feature id for the '<em><b>Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNCERTAINTY__INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Standard Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY = 1;

	/**
	 * The number of structural features of the '<em>Measurement Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNCERTAINTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measurement Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNCERTAINTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyInformationImpl <em>Measurement Uncertainty Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyInformationImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasurementUncertaintyInformation()
	 * @generated
	 */
	int MEASUREMENT_UNCERTAINTY_INFORMATION = 20;

	/**
	 * The number of structural features of the '<em>Measurement Uncertainty Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Measurement Uncertainty Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_UNCERTAINTY_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.NormalDistributionImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getNormalDistribution()
	 * @generated
	 */
	int NORMAL_DISTRIBUTION = 18;

	/**
	 * The feature id for the '<em><b>Mean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__MEAN_VALUE = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION__STANDARD_DEVIATION = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_FEATURE_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Normal Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DISTRIBUTION_OPERATION_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.IntervalImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 19;

	/**
	 * The feature id for the '<em><b>Lower Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LOWER_ENDPOINT = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__UPPER_ENDPOINT = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.SamplingImpl <em>Sampling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.SamplingImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getSampling()
	 * @generated
	 */
	int SAMPLING = 21;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING__SAMPLES = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurement Procedure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING__MEASUREMENT_PROCEDURE = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_FEATURE_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sampling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_OPERATION_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntegralImpl <em>Integral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.IntegralImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getIntegral()
	 * @generated
	 */
	int INTEGRAL = 22;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRAL__INTERVAL = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRAL__FUNCTION = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_FEATURE_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_OPERATION_COUNT = MEASUREMENT_UNCERTAINTY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.SampleImpl <em>Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.SampleImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getSample()
	 * @generated
	 */
	int SAMPLE = 23;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE__QUANTITY = 0;

	/**
	 * The number of structural features of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.CompositeMeasureImpl <em>Composite Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.CompositeMeasureImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getCompositeMeasure()
	 * @generated
	 */
	int COMPOSITE_MEASURE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__NAME = MEASURE_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__SUBNAME = MEASURE_VALUE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__TARGET_CLASS = MEASURE_VALUE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__TARGET_OPERATION = MEASURE_VALUE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__POST = MEASURE_VALUE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__UNCERTAINTY = MEASURE_VALUE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__TYPE = MEASURE_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE__VALUE = MEASURE_VALUE__VALUE;

	/**
	 * The number of structural features of the '<em>Composite Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE_FEATURE_COUNT = MEASURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE___TYPE = MEASURE_VALUE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE___NAME = MEASURE_VALUE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE___VALUE = MEASURE_VALUE___VALUE;

	/**
	 * The number of operations of the '<em>Composite Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MEASURE_OPERATION_COUNT = MEASURE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.LogisticMeasureImpl <em>Logistic Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.LogisticMeasureImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getLogisticMeasure()
	 * @generated
	 */
	int LOGISTIC_MEASURE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__NAME = COMPOSITE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__SUBNAME = COMPOSITE_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__TARGET_CLASS = COMPOSITE_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__TARGET_OPERATION = COMPOSITE_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__POST = COMPOSITE_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__UNCERTAINTY = COMPOSITE_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__TYPE = COMPOSITE_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__VALUE = COMPOSITE_MEASURE__VALUE;

	/**
	 * The feature id for the '<em><b>L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__L = COMPOSITE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>K</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__K = COMPOSITE_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__X0 = COMPOSITE_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE__X = COMPOSITE_MEASURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Logistic Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE_FEATURE_COUNT = COMPOSITE_MEASURE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE___TYPE = COMPOSITE_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE___NAME = COMPOSITE_MEASURE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE___VALUE = COMPOSITE_MEASURE___VALUE;

	/**
	 * The number of operations of the '<em>Logistic Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_MEASURE_OPERATION_COUNT = COMPOSITE_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.ExponentialMeasureImpl <em>Exponential Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.ExponentialMeasureImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getExponentialMeasure()
	 * @generated
	 */
	int EXPONENTIAL_MEASURE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__NAME = COMPOSITE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__SUBNAME = COMPOSITE_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__TARGET_CLASS = COMPOSITE_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__TARGET_OPERATION = COMPOSITE_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__POST = COMPOSITE_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__UNCERTAINTY = COMPOSITE_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__TYPE = COMPOSITE_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__VALUE = COMPOSITE_MEASURE__VALUE;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE__X = COMPOSITE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE_FEATURE_COUNT = COMPOSITE_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE___TYPE = COMPOSITE_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE___NAME = COMPOSITE_MEASURE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE___VALUE = COMPOSITE_MEASURE___VALUE;

	/**
	 * The number of operations of the '<em>Exponential Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_MEASURE_OPERATION_COUNT = COMPOSITE_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.TailMeasureImpl <em>Tail Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.TailMeasureImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getTailMeasure()
	 * @generated
	 */
	int TAIL_MEASURE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__NAME = COMPOSITE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__SUBNAME = COMPOSITE_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__TARGET_CLASS = COMPOSITE_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__TARGET_OPERATION = COMPOSITE_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__POST = COMPOSITE_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__UNCERTAINTY = COMPOSITE_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__TYPE = COMPOSITE_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE__VALUE = COMPOSITE_MEASURE__VALUE;

	/**
	 * The number of structural features of the '<em>Tail Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE_FEATURE_COUNT = COMPOSITE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE___TYPE = COMPOSITE_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE___NAME = COMPOSITE_MEASURE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE___VALUE = COMPOSITE_MEASURE___VALUE;

	/**
	 * The number of operations of the '<em>Tail Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAIL_MEASURE_OPERATION_COUNT = COMPOSITE_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntegrationMeasureImpl <em>Integration Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.IntegrationMeasureImpl
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getIntegrationMeasure()
	 * @generated
	 */
	int INTEGRATION_MEASURE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__NAME = COMPOSITE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Subname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__SUBNAME = COMPOSITE_MEASURE__SUBNAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__TARGET_CLASS = COMPOSITE_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__TARGET_OPERATION = COMPOSITE_MEASURE__TARGET_OPERATION;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__POST = COMPOSITE_MEASURE__POST;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__UNCERTAINTY = COMPOSITE_MEASURE__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__TYPE = COMPOSITE_MEASURE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__VALUE = COMPOSITE_MEASURE__VALUE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__FUNCTION = COMPOSITE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__LEFT_BOUND = COMPOSITE_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE__RIGHT_BOUND = COMPOSITE_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integration Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE_FEATURE_COUNT = COMPOSITE_MEASURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE___TYPE = COMPOSITE_MEASURE___TYPE;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE___NAME = COMPOSITE_MEASURE___NAME;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE___VALUE = COMPOSITE_MEASURE___VALUE;

	/**
	 * The number of operations of the '<em>Integration Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_MEASURE_OPERATION_COUNT = COMPOSITE_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Visibility
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 29;

	/**
	 * The meta object id for the '{@link org.atlanmod.energy.estimation.metamodel.eel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Type
	 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 30;

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Platform#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Platform#getName()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.atlanmod.energy.estimation.metamodel.eel.Platform#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Platform#getVariables()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.atlanmod.energy.estimation.metamodel.eel.Platform#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Platform#getMeasures()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Measures();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Variable#getVibility <em>Vibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vibility</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Variable#getVibility()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Vibility();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#getName()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getSubname <em>Subname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subname</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#getSubname()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Subname();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetClass()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_TargetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetOperation <em>Target Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Operation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#getTargetOperation()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_TargetOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#getPost()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Post();

	/**
	 * Returns the meta object for the containment reference '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uncertainty</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#getUncertainty()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Uncertainty();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#type()
	 * @generated
	 */
	EOperation getMeasure__Type();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#value()
	 * @generated
	 */
	EOperation getMeasure__Value();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.Measure#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Measure#name()
	 * @generated
	 */
	EOperation getMeasure__Name();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure <em>Typed Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure
	 * @generated
	 */
	EClass getTypedMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure#getType()
	 * @see #getTypedMeasure()
	 * @generated
	 */
	EAttribute getTypedMeasure_Type();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure#type()
	 * @generated
	 */
	EOperation getTypedMeasure__Type();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.TypedMeasure#name()
	 * @generated
	 */
	EOperation getTypedMeasure__Name();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Value</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureValue
	 * @generated
	 */
	EClass getMeasureValue();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureValue#getValue()
	 * @see #getMeasureValue()
	 * @generated
	 */
	EAttribute getMeasureValue_Value();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureValue#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureValue#value()
	 * @generated
	 */
	EOperation getMeasureValue__Value();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureOCL <em>Measure OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure OCL</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureOCL
	 * @generated
	 */
	EClass getMeasureOCL();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureOCL#getOclQuery <em>Ocl Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Query</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureOCL#getOclQuery()
	 * @see #getMeasureOCL()
	 * @generated
	 */
	EAttribute getMeasureOCL_OclQuery();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute <em>Measure Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Attribute</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute
	 * @generated
	 */
	EClass getMeasureAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute#getAtt <em>Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Att</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureAttribute#getAtt()
	 * @see #getMeasureAttribute()
	 * @generated
	 */
	EAttribute getMeasureAttribute_Att();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureCast <em>Measure Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Cast</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureCast
	 * @generated
	 */
	EClass getMeasureCast();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureCast#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureCast#getMeasure()
	 * @see #getMeasureCast()
	 * @generated
	 */
	EReference getMeasureCast_Measure();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation <em>Measure Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Binary Operation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation
	 * @generated
	 */
	EClass getMeasureBinaryOperation();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation#getLeft()
	 * @see #getMeasureBinaryOperation()
	 * @generated
	 */
	EReference getMeasureBinaryOperation_Left();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryOperation#getRight()
	 * @see #getMeasureBinaryOperation()
	 * @generated
	 */
	EReference getMeasureBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryProductOperation <em>Measure Binary Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Binary Product Operation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryProductOperation
	 * @generated
	 */
	EClass getMeasureBinaryProductOperation();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryProductOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinaryProductOperation#value()
	 * @generated
	 */
	EOperation getMeasureBinaryProductOperation__Value();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinarySumOperation <em>Measure Binary Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Binary Sum Operation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinarySumOperation
	 * @generated
	 */
	EClass getMeasureBinarySumOperation();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureBinarySumOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureBinarySumOperation#value()
	 * @generated
	 */
	EOperation getMeasureBinarySumOperation__Value();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation <em>Energy Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Computation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation
	 * @generated
	 */
	EClass getEnergyComputation();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation#type()
	 * @generated
	 */
	EOperation getEnergyComputation__Type();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.EnergyComputation#value()
	 * @generated
	 */
	EOperation getEnergyComputation__Value();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.PowerComputation <em>Power Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Computation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.PowerComputation
	 * @generated
	 */
	EClass getPowerComputation();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.PowerComputation#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.PowerComputation#type()
	 * @generated
	 */
	EOperation getPowerComputation__Type();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.PowerComputation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.PowerComputation#value()
	 * @generated
	 */
	EOperation getPowerComputation__Value();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration <em>Real Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Time Duration</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration
	 * @generated
	 */
	EClass getRealTimeDuration();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.RealTimeDuration#type()
	 * @generated
	 */
	EOperation getRealTimeDuration__Type();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation <em>Measure Unbound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Unbound Operation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation
	 * @generated
	 */
	EClass getMeasureUnboundOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measures</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundOperation#getMeasures()
	 * @see #getMeasureUnboundOperation()
	 * @generated
	 */
	EReference getMeasureUnboundOperation_Measures();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSumOperation <em>Measure Unbound Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Unbound Sum Operation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSumOperation
	 * @generated
	 */
	EClass getMeasureUnboundSumOperation();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSumOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundSumOperation#value()
	 * @generated
	 */
	EOperation getMeasureUnboundSumOperation__Value();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundProductOperation <em>Measure Unbound Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Unbound Product Operation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundProductOperation
	 * @generated
	 */
	EClass getMeasureUnboundProductOperation();

	/**
	 * Returns the meta object for the '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundProductOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasureUnboundProductOperation#value()
	 * @generated
	 */
	EOperation getMeasureUnboundProductOperation__Value();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty <em>Measurement Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Uncertainty</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty
	 * @generated
	 */
	EClass getMeasurementUncertainty();

	/**
	 * Returns the meta object for the containment reference '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getInformation()
	 * @see #getMeasurementUncertainty()
	 * @generated
	 */
	EReference getMeasurementUncertainty_Information();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getStandardUncertainty <em>Standard Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Uncertainty</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty#getStandardUncertainty()
	 * @see #getMeasurementUncertainty()
	 * @generated
	 */
	EAttribute getMeasurementUncertainty_StandardUncertainty();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution <em>Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Distribution</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution
	 * @generated
	 */
	EClass getNormalDistribution();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution#getMeanValue <em>Mean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Value</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution#getMeanValue()
	 * @see #getNormalDistribution()
	 * @generated
	 */
	EAttribute getNormalDistribution_MeanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.NormalDistribution#getStandardDeviation()
	 * @see #getNormalDistribution()
	 * @generated
	 */
	EAttribute getNormalDistribution_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the containment reference '{@link org.atlanmod.energy.estimation.metamodel.eel.Interval#getLowerEndpoint <em>Lower Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Endpoint</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Interval#getLowerEndpoint()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_LowerEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.atlanmod.energy.estimation.metamodel.eel.Interval#getUpperEndpoint <em>Upper Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Endpoint</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Interval#getUpperEndpoint()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_UpperEndpoint();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertaintyInformation <em>Measurement Uncertainty Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Uncertainty Information</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertaintyInformation
	 * @generated
	 */
	EClass getMeasurementUncertaintyInformation();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampling</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Sampling
	 * @generated
	 */
	EClass getSampling();

	/**
	 * Returns the meta object for the containment reference list '{@link org.atlanmod.energy.estimation.metamodel.eel.Sampling#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samples</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Sampling#getSamples()
	 * @see #getSampling()
	 * @generated
	 */
	EReference getSampling_Samples();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Sampling#getMeasurementProcedure <em>Measurement Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Procedure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Sampling#getMeasurementProcedure()
	 * @see #getSampling()
	 * @generated
	 */
	EAttribute getSampling_MeasurementProcedure();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.Integral <em>Integral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integral</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Integral
	 * @generated
	 */
	EClass getIntegral();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.Integral#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Integral#getInterval()
	 * @see #getIntegral()
	 * @generated
	 */
	EReference getIntegral_Interval();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.Integral#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Integral#getFunction()
	 * @see #getIntegral()
	 * @generated
	 */
	EAttribute getIntegral_Function();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Sample
	 * @generated
	 */
	EClass getSample();

	/**
	 * Returns the meta object for the containment reference list '{@link org.atlanmod.energy.estimation.metamodel.eel.Sample#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Sample#getQuantity()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_Quantity();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.CompositeMeasure <em>Composite Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.CompositeMeasure
	 * @generated
	 */
	EClass getCompositeMeasure();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure <em>Logistic Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure
	 * @generated
	 */
	EClass getLogisticMeasure();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>L</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getL()
	 * @see #getLogisticMeasure()
	 * @generated
	 */
	EReference getLogisticMeasure_L();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>K</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getK()
	 * @see #getLogisticMeasure()
	 * @generated
	 */
	EReference getLogisticMeasure_K();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getX0 <em>X0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X0</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getX0()
	 * @see #getLogisticMeasure()
	 * @generated
	 */
	EReference getLogisticMeasure_X0();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.LogisticMeasure#getX()
	 * @see #getLogisticMeasure()
	 * @generated
	 */
	EReference getLogisticMeasure_X();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.ExponentialMeasure <em>Exponential Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.ExponentialMeasure
	 * @generated
	 */
	EClass getExponentialMeasure();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.ExponentialMeasure#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.ExponentialMeasure#getX()
	 * @see #getExponentialMeasure()
	 * @generated
	 */
	EReference getExponentialMeasure_X();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.TailMeasure <em>Tail Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tail Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.TailMeasure
	 * @generated
	 */
	EClass getTailMeasure();

	/**
	 * Returns the meta object for class '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure <em>Integration Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Measure</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure
	 * @generated
	 */
	EClass getIntegrationMeasure();

	/**
	 * Returns the meta object for the reference '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getFunction()
	 * @see #getIntegrationMeasure()
	 * @generated
	 */
	EReference getIntegrationMeasure_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getLeftBound <em>Left Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Bound</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getLeftBound()
	 * @see #getIntegrationMeasure()
	 * @generated
	 */
	EAttribute getIntegrationMeasure_LeftBound();

	/**
	 * Returns the meta object for the attribute '{@link org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getRightBound <em>Right Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Bound</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.IntegrationMeasure#getRightBound()
	 * @see #getIntegrationMeasure()
	 * @generated
	 */
	EAttribute getIntegrationMeasure_RightBound();

	/**
	 * Returns the meta object for enum '{@link org.atlanmod.energy.estimation.metamodel.eel.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.atlanmod.energy.estimation.metamodel.eel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.atlanmod.energy.estimation.metamodel.eel.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EelFactory getEelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.PlatformImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__NAME = eINSTANCE.getPlatform_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__VARIABLES = eINSTANCE.getPlatform_Variables();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__MEASURES = eINSTANCE.getPlatform_Measures();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.VariableImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Vibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VIBILITY = eINSTANCE.getVariable_Vibility();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__NAME = eINSTANCE.getMeasure_Name();

		/**
		 * The meta object literal for the '<em><b>Subname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__SUBNAME = eINSTANCE.getMeasure_Subname();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__TARGET_CLASS = eINSTANCE.getMeasure_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Target Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__TARGET_OPERATION = eINSTANCE.getMeasure_TargetOperation();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__POST = eINSTANCE.getMeasure_Post();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__UNCERTAINTY = eINSTANCE.getMeasure_Uncertainty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE___TYPE = eINSTANCE.getMeasure__Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE___VALUE = eINSTANCE.getMeasure__Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE___NAME = eINSTANCE.getMeasure__Name();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.TypedMeasureImpl <em>Typed Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.TypedMeasureImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getTypedMeasure()
		 * @generated
		 */
		EClass TYPED_MEASURE = eINSTANCE.getTypedMeasure();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_MEASURE__TYPE = eINSTANCE.getTypedMeasure_Type();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPED_MEASURE___TYPE = eINSTANCE.getTypedMeasure__Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPED_MEASURE___NAME = eINSTANCE.getTypedMeasure__Name();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureValueImpl <em>Measure Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureValueImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureValue()
		 * @generated
		 */
		EClass MEASURE_VALUE = eINSTANCE.getMeasureValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_VALUE__VALUE = eINSTANCE.getMeasureValue_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE_VALUE___VALUE = eINSTANCE.getMeasureValue__Value();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureOCLImpl <em>Measure OCL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureOCLImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureOCL()
		 * @generated
		 */
		EClass MEASURE_OCL = eINSTANCE.getMeasureOCL();

		/**
		 * The meta object literal for the '<em><b>Ocl Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_OCL__OCL_QUERY = eINSTANCE.getMeasureOCL_OclQuery();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureAttributeImpl <em>Measure Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureAttributeImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureAttribute()
		 * @generated
		 */
		EClass MEASURE_ATTRIBUTE = eINSTANCE.getMeasureAttribute();

		/**
		 * The meta object literal for the '<em><b>Att</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_ATTRIBUTE__ATT = eINSTANCE.getMeasureAttribute_Att();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureCastImpl <em>Measure Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureCastImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureCast()
		 * @generated
		 */
		EClass MEASURE_CAST = eINSTANCE.getMeasureCast();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CAST__MEASURE = eINSTANCE.getMeasureCast_Measure();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryOperationImpl <em>Measure Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryOperationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureBinaryOperation()
		 * @generated
		 */
		EClass MEASURE_BINARY_OPERATION = eINSTANCE.getMeasureBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_BINARY_OPERATION__LEFT = eINSTANCE.getMeasureBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_BINARY_OPERATION__RIGHT = eINSTANCE.getMeasureBinaryOperation_Right();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryProductOperationImpl <em>Measure Binary Product Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinaryProductOperationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureBinaryProductOperation()
		 * @generated
		 */
		EClass MEASURE_BINARY_PRODUCT_OPERATION = eINSTANCE.getMeasureBinaryProductOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE_BINARY_PRODUCT_OPERATION___VALUE = eINSTANCE.getMeasureBinaryProductOperation__Value();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinarySumOperationImpl <em>Measure Binary Sum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureBinarySumOperationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureBinarySumOperation()
		 * @generated
		 */
		EClass MEASURE_BINARY_SUM_OPERATION = eINSTANCE.getMeasureBinarySumOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE_BINARY_SUM_OPERATION___VALUE = eINSTANCE.getMeasureBinarySumOperation__Value();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.EnergyComputationImpl <em>Energy Computation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EnergyComputationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getEnergyComputation()
		 * @generated
		 */
		EClass ENERGY_COMPUTATION = eINSTANCE.getEnergyComputation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENERGY_COMPUTATION___TYPE = eINSTANCE.getEnergyComputation__Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENERGY_COMPUTATION___VALUE = eINSTANCE.getEnergyComputation__Value();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.PowerComputationImpl <em>Power Computation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.PowerComputationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getPowerComputation()
		 * @generated
		 */
		EClass POWER_COMPUTATION = eINSTANCE.getPowerComputation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POWER_COMPUTATION___TYPE = eINSTANCE.getPowerComputation__Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POWER_COMPUTATION___VALUE = eINSTANCE.getPowerComputation__Value();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.RealTimeDurationImpl <em>Real Time Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.RealTimeDurationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getRealTimeDuration()
		 * @generated
		 */
		EClass REAL_TIME_DURATION = eINSTANCE.getRealTimeDuration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REAL_TIME_DURATION___TYPE = eINSTANCE.getRealTimeDuration__Type();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundOperationImpl <em>Measure Unbound Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundOperationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureUnboundOperation()
		 * @generated
		 */
		EClass MEASURE_UNBOUND_OPERATION = eINSTANCE.getMeasureUnboundOperation();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_UNBOUND_OPERATION__MEASURES = eINSTANCE.getMeasureUnboundOperation_Measures();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundSumOperationImpl <em>Measure Unbound Sum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundSumOperationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureUnboundSumOperation()
		 * @generated
		 */
		EClass MEASURE_UNBOUND_SUM_OPERATION = eINSTANCE.getMeasureUnboundSumOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE_UNBOUND_SUM_OPERATION___VALUE = eINSTANCE.getMeasureUnboundSumOperation__Value();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundProductOperationImpl <em>Measure Unbound Product Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasureUnboundProductOperationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasureUnboundProductOperation()
		 * @generated
		 */
		EClass MEASURE_UNBOUND_PRODUCT_OPERATION = eINSTANCE.getMeasureUnboundProductOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEASURE_UNBOUND_PRODUCT_OPERATION___VALUE = eINSTANCE.getMeasureUnboundProductOperation__Value();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyImpl <em>Measurement Uncertainty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasurementUncertainty()
		 * @generated
		 */
		EClass MEASUREMENT_UNCERTAINTY = eINSTANCE.getMeasurementUncertainty();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_UNCERTAINTY__INFORMATION = eINSTANCE.getMeasurementUncertainty_Information();

		/**
		 * The meta object literal for the '<em><b>Standard Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY = eINSTANCE
				.getMeasurementUncertainty_StandardUncertainty();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.NormalDistributionImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getNormalDistribution()
		 * @generated
		 */
		EClass NORMAL_DISTRIBUTION = eINSTANCE.getNormalDistribution();

		/**
		 * The meta object literal for the '<em><b>Mean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_DISTRIBUTION__MEAN_VALUE = eINSTANCE.getNormalDistribution_MeanValue();

		/**
		 * The meta object literal for the '<em><b>Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL_DISTRIBUTION__STANDARD_DEVIATION = eINSTANCE.getNormalDistribution_StandardDeviation();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.IntervalImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Lower Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__LOWER_ENDPOINT = eINSTANCE.getInterval_LowerEndpoint();

		/**
		 * The meta object literal for the '<em><b>Upper Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__UPPER_ENDPOINT = eINSTANCE.getInterval_UpperEndpoint();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyInformationImpl <em>Measurement Uncertainty Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.MeasurementUncertaintyInformationImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getMeasurementUncertaintyInformation()
		 * @generated
		 */
		EClass MEASUREMENT_UNCERTAINTY_INFORMATION = eINSTANCE.getMeasurementUncertaintyInformation();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.SamplingImpl <em>Sampling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.SamplingImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getSampling()
		 * @generated
		 */
		EClass SAMPLING = eINSTANCE.getSampling();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLING__SAMPLES = eINSTANCE.getSampling_Samples();

		/**
		 * The meta object literal for the '<em><b>Measurement Procedure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLING__MEASUREMENT_PROCEDURE = eINSTANCE.getSampling_MeasurementProcedure();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntegralImpl <em>Integral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.IntegralImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getIntegral()
		 * @generated
		 */
		EClass INTEGRAL = eINSTANCE.getIntegral();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRAL__INTERVAL = eINSTANCE.getIntegral_Interval();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRAL__FUNCTION = eINSTANCE.getIntegral_Function();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.SampleImpl <em>Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.SampleImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getSample()
		 * @generated
		 */
		EClass SAMPLE = eINSTANCE.getSample();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE__QUANTITY = eINSTANCE.getSample_Quantity();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.CompositeMeasureImpl <em>Composite Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.CompositeMeasureImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getCompositeMeasure()
		 * @generated
		 */
		EClass COMPOSITE_MEASURE = eINSTANCE.getCompositeMeasure();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.LogisticMeasureImpl <em>Logistic Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.LogisticMeasureImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getLogisticMeasure()
		 * @generated
		 */
		EClass LOGISTIC_MEASURE = eINSTANCE.getLogisticMeasure();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_MEASURE__L = eINSTANCE.getLogisticMeasure_L();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_MEASURE__K = eINSTANCE.getLogisticMeasure_K();

		/**
		 * The meta object literal for the '<em><b>X0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_MEASURE__X0 = eINSTANCE.getLogisticMeasure_X0();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGISTIC_MEASURE__X = eINSTANCE.getLogisticMeasure_X();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.ExponentialMeasureImpl <em>Exponential Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.ExponentialMeasureImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getExponentialMeasure()
		 * @generated
		 */
		EClass EXPONENTIAL_MEASURE = eINSTANCE.getExponentialMeasure();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL_MEASURE__X = eINSTANCE.getExponentialMeasure_X();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.TailMeasureImpl <em>Tail Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.TailMeasureImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getTailMeasure()
		 * @generated
		 */
		EClass TAIL_MEASURE = eINSTANCE.getTailMeasure();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.impl.IntegrationMeasureImpl <em>Integration Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.IntegrationMeasureImpl
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getIntegrationMeasure()
		 * @generated
		 */
		EClass INTEGRATION_MEASURE = eINSTANCE.getIntegrationMeasure();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_MEASURE__FUNCTION = eINSTANCE.getIntegrationMeasure_Function();

		/**
		 * The meta object literal for the '<em><b>Left Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION_MEASURE__LEFT_BOUND = eINSTANCE.getIntegrationMeasure_LeftBound();

		/**
		 * The meta object literal for the '<em><b>Right Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATION_MEASURE__RIGHT_BOUND = eINSTANCE.getIntegrationMeasure_RightBound();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.Visibility
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link org.atlanmod.energy.estimation.metamodel.eel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.atlanmod.energy.estimation.metamodel.eel.Type
		 * @see org.atlanmod.energy.estimation.metamodel.eel.impl.EelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //EelPackage
