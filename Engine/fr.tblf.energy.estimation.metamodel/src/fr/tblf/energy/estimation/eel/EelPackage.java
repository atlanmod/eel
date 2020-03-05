/**
 */
package fr.tblf.energy.estimation.eel;

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
 * @see fr.tblf.energy.estimation.eel.EelFactory
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
	String eNS_URI = "http://fr.tblf.energy.estimation/eel/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.tblf.energy.estimation.eel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EelPackage eINSTANCE = fr.tblf.energy.estimation.eel.impl.EelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.PlatformImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getPlatform()
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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.VariableImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getVariable()
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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasure()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TARGET_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TARGET_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__UNCERTAINTY = 3;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 4;

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
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.TypedMeasureImpl <em>Typed Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.TypedMeasureImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getTypedMeasure()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__TARGET_CLASS = MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE__TARGET_OPERATION = MEASURE__TARGET_OPERATION;

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
	 * The number of operations of the '<em>Typed Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureValueImpl <em>Measure Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureValueImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureValue()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureOCLImpl <em>Measure OCL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureOCLImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureOCL()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__TARGET_CLASS = MEASURE_VALUE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OCL__TARGET_OPERATION = MEASURE_VALUE__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureAttributeImpl <em>Measure Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureAttributeImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureAttribute()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__TARGET_CLASS = MEASURE_VALUE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_ATTRIBUTE__TARGET_OPERATION = MEASURE_VALUE__TARGET_OPERATION;

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
	 * The feature id for the '<em><b>Att</b></em>' reference.
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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureCastImpl <em>Measure Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureCastImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureCast()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

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
	 * The number of operations of the '<em>Measure Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CAST_OPERATION_COUNT = TYPED_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureBinaryOperationImpl <em>Measure Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureBinaryOperationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureBinaryOperation()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

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
	 * The number of operations of the '<em>Measure Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_OPERATION_OPERATION_COUNT = TYPED_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureBinaryProductOperationImpl <em>Measure Binary Product Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureBinaryProductOperationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureBinaryProductOperation()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__TARGET_CLASS = MEASURE_BINARY_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_PRODUCT_OPERATION__TARGET_OPERATION = MEASURE_BINARY_OPERATION__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureBinarySumOperationImpl <em>Measure Binary Sum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureBinarySumOperationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureBinarySumOperation()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__TARGET_CLASS = MEASURE_BINARY_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_BINARY_SUM_OPERATION__TARGET_OPERATION = MEASURE_BINARY_OPERATION__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.EnergyComputationImpl <em>Energy Computation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.EnergyComputationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getEnergyComputation()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__TARGET_CLASS = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_COMPUTATION__TARGET_OPERATION = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.PowerComputationImpl <em>Power Computation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.PowerComputationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getPowerComputation()
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
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__TARGET_CLASS = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_COMPUTATION__TARGET_OPERATION = MEASURE_BINARY_PRODUCT_OPERATION__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureUnboundOperationImpl <em>Measure Unbound Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureUnboundOperationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureUnboundOperation()
	 * @generated
	 */
	int MEASURE_UNBOUND_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__NAME = TYPED_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__TARGET_CLASS = TYPED_MEASURE__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION__TARGET_OPERATION = TYPED_MEASURE__TARGET_OPERATION;

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
	 * The number of operations of the '<em>Measure Unbound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_OPERATION_OPERATION_COUNT = TYPED_MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureUnboundSumOperationImpl <em>Measure Unbound Sum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureUnboundSumOperationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureUnboundSumOperation()
	 * @generated
	 */
	int MEASURE_UNBOUND_SUM_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__NAME = MEASURE_UNBOUND_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__TARGET_CLASS = MEASURE_UNBOUND_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_SUM_OPERATION__TARGET_OPERATION = MEASURE_UNBOUND_OPERATION__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureUnboundProductOperationImpl <em>Measure Unbound Product Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasureUnboundProductOperationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureUnboundProductOperation()
	 * @generated
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__NAME = MEASURE_UNBOUND_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__TARGET_CLASS = MEASURE_UNBOUND_OPERATION__TARGET_CLASS;

	/**
	 * The feature id for the '<em><b>Target Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_UNBOUND_PRODUCT_OPERATION__TARGET_OPERATION = MEASURE_UNBOUND_OPERATION__TARGET_OPERATION;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyImpl <em>Measurement Uncertainty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasurementUncertainty()
	 * @generated
	 */
	int MEASUREMENT_UNCERTAINTY = 16;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyInformationImpl <em>Measurement Uncertainty Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyInformationImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasurementUncertaintyInformation()
	 * @generated
	 */
	int MEASUREMENT_UNCERTAINTY_INFORMATION = 19;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.NormalDistributionImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getNormalDistribution()
	 * @generated
	 */
	int NORMAL_DISTRIBUTION = 17;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.IntervalImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 18;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.SamplingImpl <em>Sampling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.SamplingImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getSampling()
	 * @generated
	 */
	int SAMPLING = 20;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.IntegralImpl <em>Integral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.IntegralImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getIntegral()
	 * @generated
	 */
	int INTEGRAL = 21;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.impl.SampleImpl <em>Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.impl.SampleImpl
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getSample()
	 * @generated
	 */
	int SAMPLE = 22;

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
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.Visibility
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 23;

	/**
	 * The meta object id for the '{@link fr.tblf.energy.estimation.eel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.tblf.energy.estimation.eel.Type
	 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 24;


	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see fr.tblf.energy.estimation.eel.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.Platform#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.tblf.energy.estimation.eel.Platform#getName()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tblf.energy.estimation.eel.Platform#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.tblf.energy.estimation.eel.Platform#getVariables()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tblf.energy.estimation.eel.Platform#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see fr.tblf.energy.estimation.eel.Platform#getMeasures()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Measures();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.tblf.energy.estimation.eel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.tblf.energy.estimation.eel.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.tblf.energy.estimation.eel.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.Variable#getVibility <em>Vibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vibility</em>'.
	 * @see fr.tblf.energy.estimation.eel.Variable#getVibility()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Vibility();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see fr.tblf.energy.estimation.eel.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.Measure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.tblf.energy.estimation.eel.Measure#getName()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.tblf.energy.estimation.eel.Measure#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see fr.tblf.energy.estimation.eel.Measure#getTargetClass()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_TargetClass();

	/**
	 * Returns the meta object for the reference '{@link fr.tblf.energy.estimation.eel.Measure#getTargetOperation <em>Target Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Operation</em>'.
	 * @see fr.tblf.energy.estimation.eel.Measure#getTargetOperation()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_TargetOperation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tblf.energy.estimation.eel.Measure#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uncertainty</em>'.
	 * @see fr.tblf.energy.estimation.eel.Measure#getUncertainty()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Uncertainty();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.Measure#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.Measure#type()
	 * @generated
	 */
	EOperation getMeasure__Type();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.Measure#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.Measure#value()
	 * @generated
	 */
	EOperation getMeasure__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.TypedMeasure <em>Typed Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Measure</em>'.
	 * @see fr.tblf.energy.estimation.eel.TypedMeasure
	 * @generated
	 */
	EClass getTypedMeasure();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.TypedMeasure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.tblf.energy.estimation.eel.TypedMeasure#getType()
	 * @see #getTypedMeasure()
	 * @generated
	 */
	EAttribute getTypedMeasure_Type();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.TypedMeasure#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.TypedMeasure#type()
	 * @generated
	 */
	EOperation getTypedMeasure__Type();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Value</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureValue
	 * @generated
	 */
	EClass getMeasureValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.MeasureValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureValue#getValue()
	 * @see #getMeasureValue()
	 * @generated
	 */
	EAttribute getMeasureValue_Value();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.MeasureValue#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.MeasureValue#value()
	 * @generated
	 */
	EOperation getMeasureValue__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureOCL <em>Measure OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure OCL</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureOCL
	 * @generated
	 */
	EClass getMeasureOCL();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.MeasureOCL#getOclQuery <em>Ocl Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Query</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureOCL#getOclQuery()
	 * @see #getMeasureOCL()
	 * @generated
	 */
	EAttribute getMeasureOCL_OclQuery();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureAttribute <em>Measure Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Attribute</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureAttribute
	 * @generated
	 */
	EClass getMeasureAttribute();

	/**
	 * Returns the meta object for the reference '{@link fr.tblf.energy.estimation.eel.MeasureAttribute#getAtt <em>Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Att</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureAttribute#getAtt()
	 * @see #getMeasureAttribute()
	 * @generated
	 */
	EReference getMeasureAttribute_Att();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureCast <em>Measure Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Cast</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureCast
	 * @generated
	 */
	EClass getMeasureCast();

	/**
	 * Returns the meta object for the reference '{@link fr.tblf.energy.estimation.eel.MeasureCast#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureCast#getMeasure()
	 * @see #getMeasureCast()
	 * @generated
	 */
	EReference getMeasureCast_Measure();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureBinaryOperation <em>Measure Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Binary Operation</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureBinaryOperation
	 * @generated
	 */
	EClass getMeasureBinaryOperation();

	/**
	 * Returns the meta object for the reference '{@link fr.tblf.energy.estimation.eel.MeasureBinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureBinaryOperation#getLeft()
	 * @see #getMeasureBinaryOperation()
	 * @generated
	 */
	EReference getMeasureBinaryOperation_Left();

	/**
	 * Returns the meta object for the reference '{@link fr.tblf.energy.estimation.eel.MeasureBinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureBinaryOperation#getRight()
	 * @see #getMeasureBinaryOperation()
	 * @generated
	 */
	EReference getMeasureBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureBinaryProductOperation <em>Measure Binary Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Binary Product Operation</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureBinaryProductOperation
	 * @generated
	 */
	EClass getMeasureBinaryProductOperation();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.MeasureBinaryProductOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.MeasureBinaryProductOperation#value()
	 * @generated
	 */
	EOperation getMeasureBinaryProductOperation__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureBinarySumOperation <em>Measure Binary Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Binary Sum Operation</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureBinarySumOperation
	 * @generated
	 */
	EClass getMeasureBinarySumOperation();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.MeasureBinarySumOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.MeasureBinarySumOperation#value()
	 * @generated
	 */
	EOperation getMeasureBinarySumOperation__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.EnergyComputation <em>Energy Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Computation</em>'.
	 * @see fr.tblf.energy.estimation.eel.EnergyComputation
	 * @generated
	 */
	EClass getEnergyComputation();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.EnergyComputation#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.EnergyComputation#type()
	 * @generated
	 */
	EOperation getEnergyComputation__Type();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.EnergyComputation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.EnergyComputation#value()
	 * @generated
	 */
	EOperation getEnergyComputation__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.PowerComputation <em>Power Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Computation</em>'.
	 * @see fr.tblf.energy.estimation.eel.PowerComputation
	 * @generated
	 */
	EClass getPowerComputation();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.PowerComputation#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.PowerComputation#type()
	 * @generated
	 */
	EOperation getPowerComputation__Type();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.PowerComputation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.PowerComputation#value()
	 * @generated
	 */
	EOperation getPowerComputation__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureUnboundOperation <em>Measure Unbound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Unbound Operation</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureUnboundOperation
	 * @generated
	 */
	EClass getMeasureUnboundOperation();

	/**
	 * Returns the meta object for the reference list '{@link fr.tblf.energy.estimation.eel.MeasureUnboundOperation#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measures</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureUnboundOperation#getMeasures()
	 * @see #getMeasureUnboundOperation()
	 * @generated
	 */
	EReference getMeasureUnboundOperation_Measures();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureUnboundSumOperation <em>Measure Unbound Sum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Unbound Sum Operation</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureUnboundSumOperation
	 * @generated
	 */
	EClass getMeasureUnboundSumOperation();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.MeasureUnboundSumOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.MeasureUnboundSumOperation#value()
	 * @generated
	 */
	EOperation getMeasureUnboundSumOperation__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasureUnboundProductOperation <em>Measure Unbound Product Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Unbound Product Operation</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasureUnboundProductOperation
	 * @generated
	 */
	EClass getMeasureUnboundProductOperation();

	/**
	 * Returns the meta object for the '{@link fr.tblf.energy.estimation.eel.MeasureUnboundProductOperation#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see fr.tblf.energy.estimation.eel.MeasureUnboundProductOperation#value()
	 * @generated
	 */
	EOperation getMeasureUnboundProductOperation__Value();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasurementUncertainty <em>Measurement Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Uncertainty</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasurementUncertainty
	 * @generated
	 */
	EClass getMeasurementUncertainty();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tblf.energy.estimation.eel.MeasurementUncertainty#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasurementUncertainty#getInformation()
	 * @see #getMeasurementUncertainty()
	 * @generated
	 */
	EReference getMeasurementUncertainty_Information();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.MeasurementUncertainty#getStandardUncertainty <em>Standard Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Uncertainty</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasurementUncertainty#getStandardUncertainty()
	 * @see #getMeasurementUncertainty()
	 * @generated
	 */
	EAttribute getMeasurementUncertainty_StandardUncertainty();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.NormalDistribution <em>Normal Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Distribution</em>'.
	 * @see fr.tblf.energy.estimation.eel.NormalDistribution
	 * @generated
	 */
	EClass getNormalDistribution();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.NormalDistribution#getMeanValue <em>Mean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Value</em>'.
	 * @see fr.tblf.energy.estimation.eel.NormalDistribution#getMeanValue()
	 * @see #getNormalDistribution()
	 * @generated
	 */
	EAttribute getNormalDistribution_MeanValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.NormalDistribution#getStandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Deviation</em>'.
	 * @see fr.tblf.energy.estimation.eel.NormalDistribution#getStandardDeviation()
	 * @see #getNormalDistribution()
	 * @generated
	 */
	EAttribute getNormalDistribution_StandardDeviation();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see fr.tblf.energy.estimation.eel.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tblf.energy.estimation.eel.Interval#getLowerEndpoint <em>Lower Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Endpoint</em>'.
	 * @see fr.tblf.energy.estimation.eel.Interval#getLowerEndpoint()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_LowerEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.tblf.energy.estimation.eel.Interval#getUpperEndpoint <em>Upper Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Endpoint</em>'.
	 * @see fr.tblf.energy.estimation.eel.Interval#getUpperEndpoint()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_UpperEndpoint();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.MeasurementUncertaintyInformation <em>Measurement Uncertainty Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Uncertainty Information</em>'.
	 * @see fr.tblf.energy.estimation.eel.MeasurementUncertaintyInformation
	 * @generated
	 */
	EClass getMeasurementUncertaintyInformation();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.Sampling <em>Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampling</em>'.
	 * @see fr.tblf.energy.estimation.eel.Sampling
	 * @generated
	 */
	EClass getSampling();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tblf.energy.estimation.eel.Sampling#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samples</em>'.
	 * @see fr.tblf.energy.estimation.eel.Sampling#getSamples()
	 * @see #getSampling()
	 * @generated
	 */
	EReference getSampling_Samples();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.Sampling#getMeasurementProcedure <em>Measurement Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Procedure</em>'.
	 * @see fr.tblf.energy.estimation.eel.Sampling#getMeasurementProcedure()
	 * @see #getSampling()
	 * @generated
	 */
	EAttribute getSampling_MeasurementProcedure();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.Integral <em>Integral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integral</em>'.
	 * @see fr.tblf.energy.estimation.eel.Integral
	 * @generated
	 */
	EClass getIntegral();

	/**
	 * Returns the meta object for the reference '{@link fr.tblf.energy.estimation.eel.Integral#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval</em>'.
	 * @see fr.tblf.energy.estimation.eel.Integral#getInterval()
	 * @see #getIntegral()
	 * @generated
	 */
	EReference getIntegral_Interval();

	/**
	 * Returns the meta object for the attribute '{@link fr.tblf.energy.estimation.eel.Integral#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see fr.tblf.energy.estimation.eel.Integral#getFunction()
	 * @see #getIntegral()
	 * @generated
	 */
	EAttribute getIntegral_Function();

	/**
	 * Returns the meta object for class '{@link fr.tblf.energy.estimation.eel.Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample</em>'.
	 * @see fr.tblf.energy.estimation.eel.Sample
	 * @generated
	 */
	EClass getSample();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.tblf.energy.estimation.eel.Sample#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity</em>'.
	 * @see fr.tblf.energy.estimation.eel.Sample#getQuantity()
	 * @see #getSample()
	 * @generated
	 */
	EReference getSample_Quantity();

	/**
	 * Returns the meta object for enum '{@link fr.tblf.energy.estimation.eel.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see fr.tblf.energy.estimation.eel.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link fr.tblf.energy.estimation.eel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see fr.tblf.energy.estimation.eel.Type
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.PlatformImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getPlatform()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.VariableImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasure()
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
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__TARGET_CLASS = eINSTANCE.getMeasure_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Target Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__TARGET_OPERATION = eINSTANCE.getMeasure_TargetOperation();

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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.TypedMeasureImpl <em>Typed Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.TypedMeasureImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getTypedMeasure()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureValueImpl <em>Measure Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureValueImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureValue()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureOCLImpl <em>Measure OCL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureOCLImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureOCL()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureAttributeImpl <em>Measure Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureAttributeImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureAttribute()
		 * @generated
		 */
		EClass MEASURE_ATTRIBUTE = eINSTANCE.getMeasureAttribute();

		/**
		 * The meta object literal for the '<em><b>Att</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_ATTRIBUTE__ATT = eINSTANCE.getMeasureAttribute_Att();

		/**
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureCastImpl <em>Measure Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureCastImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureCast()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureBinaryOperationImpl <em>Measure Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureBinaryOperationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureBinaryOperation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureBinaryProductOperationImpl <em>Measure Binary Product Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureBinaryProductOperationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureBinaryProductOperation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureBinarySumOperationImpl <em>Measure Binary Sum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureBinarySumOperationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureBinarySumOperation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.EnergyComputationImpl <em>Energy Computation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.EnergyComputationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getEnergyComputation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.PowerComputationImpl <em>Power Computation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.PowerComputationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getPowerComputation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureUnboundOperationImpl <em>Measure Unbound Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureUnboundOperationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureUnboundOperation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureUnboundSumOperationImpl <em>Measure Unbound Sum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureUnboundSumOperationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureUnboundSumOperation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasureUnboundProductOperationImpl <em>Measure Unbound Product Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasureUnboundProductOperationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasureUnboundProductOperation()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyImpl <em>Measurement Uncertainty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasurementUncertainty()
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
		EAttribute MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY = eINSTANCE.getMeasurementUncertainty_StandardUncertainty();

		/**
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.NormalDistributionImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getNormalDistribution()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.IntervalImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getInterval()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyInformationImpl <em>Measurement Uncertainty Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.MeasurementUncertaintyInformationImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getMeasurementUncertaintyInformation()
		 * @generated
		 */
		EClass MEASUREMENT_UNCERTAINTY_INFORMATION = eINSTANCE.getMeasurementUncertaintyInformation();

		/**
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.SamplingImpl <em>Sampling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.SamplingImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getSampling()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.IntegralImpl <em>Integral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.IntegralImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getIntegral()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.impl.SampleImpl <em>Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.impl.SampleImpl
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getSample()
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
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.Visibility
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link fr.tblf.energy.estimation.eel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.tblf.energy.estimation.eel.Type
		 * @see fr.tblf.energy.estimation.eel.impl.EelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //EelPackage
