/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SensorDataWebGui.SensorDataWebGuiFactory
 * @model kind="package"
 * @generated
 */
public interface SensorDataWebGuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SensorDataWebGui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "nl.utwente.ewi.gui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdwgui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorDataWebGuiPackage eINSTANCE = SensorDataWebGui.impl.SensorDataWebGuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.StandardSensorDataWebImpl <em>Standard Sensor Data Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.StandardSensorDataWebImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getStandardSensorDataWeb()
	 * @generated
	 */
	int STANDARD_SENSOR_DATA_WEB = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SENSOR_DATA_WEB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains PEs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SENSOR_DATA_WEB__CONTAINS_PES = 1;

	/**
	 * The feature id for the '<em><b>Contains Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS = 2;

	/**
	 * The feature id for the '<em><b>Diagram Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Contains Graph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH = 4;

	/**
	 * The number of structural features of the '<em>Standard Sensor Data Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_SENSOR_DATA_WEB_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.ArcImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 1;

	/**
	 * The feature id for the '<em><b>Window Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__WINDOW_PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = 1;

	/**
	 * The feature id for the '<em><b>Arc From PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ARC_FROM_PE = 2;

	/**
	 * The feature id for the '<em><b>Arc To PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ARC_TO_PE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__VALID_TIME = 5;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TRANSACTION_TIME = 6;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.AbstractPEImpl <em>Abstract PE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.AbstractPEImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getAbstractPE()
	 * @generated
	 */
	int ABSTRACT_PE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__NAME = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__VIEW = 1;

	/**
	 * The feature id for the '<em><b>Nbr Allowed Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__NBR_ALLOWED_INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Persistent View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__PERSISTENT_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__VALID_TIME = 5;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__TRANSACTION_TIME = 6;

	/**
	 * The feature id for the '<em><b>View Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__VIEW_USERNAME = 7;

	/**
	 * The feature id for the '<em><b>View Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE__VIEW_PASSWORD = 8;

	/**
	 * The number of structural features of the '<em>Abstract PE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.TupleWindowImpl <em>Tuple Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.TupleWindowImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getTupleWindow()
	 * @generated
	 */
	int TUPLE_WINDOW = 3;

	/**
	 * The feature id for the '<em><b>Window Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW__WINDOW_PREDICATE = ARC__WINDOW_PREDICATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Arc From PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW__ARC_FROM_PE = ARC__ARC_FROM_PE;

	/**
	 * The feature id for the '<em><b>Arc To PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW__ARC_TO_PE = ARC__ARC_TO_PE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW__DESCRIPTION = ARC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW__VALID_TIME = ARC__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW__TRANSACTION_TIME = ARC__TRANSACTION_TIME;

	/**
	 * The number of structural features of the '<em>Tuple Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_WINDOW_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.TimeWindowImpl <em>Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.TimeWindowImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getTimeWindow()
	 * @generated
	 */
	int TIME_WINDOW = 4;

	/**
	 * The feature id for the '<em><b>Window Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__WINDOW_PREDICATE = ARC__WINDOW_PREDICATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Arc From PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__ARC_FROM_PE = ARC__ARC_FROM_PE;

	/**
	 * The feature id for the '<em><b>Arc To PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__ARC_TO_PE = ARC__ARC_TO_PE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__DESCRIPTION = ARC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__VALID_TIME = ARC__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW__TRANSACTION_TIME = ARC__TRANSACTION_TIME;

	/**
	 * The number of structural features of the '<em>Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_WINDOW_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.FixedWindowImpl <em>Fixed Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.FixedWindowImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getFixedWindow()
	 * @generated
	 */
	int FIXED_WINDOW = 5;

	/**
	 * The feature id for the '<em><b>Window Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW__WINDOW_PREDICATE = ARC__WINDOW_PREDICATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>Arc From PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW__ARC_FROM_PE = ARC__ARC_FROM_PE;

	/**
	 * The feature id for the '<em><b>Arc To PE</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW__ARC_TO_PE = ARC__ARC_TO_PE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW__DESCRIPTION = ARC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW__VALID_TIME = ARC__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW__TRANSACTION_TIME = ARC__TRANSACTION_TIME;

	/**
	 * The number of structural features of the '<em>Fixed Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_WINDOW_FEATURE_COUNT = ARC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.ProcessingElementImpl <em>Processing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.ProcessingElementImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getProcessingElement()
	 * @generated
	 */
	int PROCESSING_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__NAME = ABSTRACT_PE__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__VIEW = ABSTRACT_PE__VIEW;

	/**
	 * The feature id for the '<em><b>Nbr Allowed Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__NBR_ALLOWED_INPUTS = ABSTRACT_PE__NBR_ALLOWED_INPUTS;

	/**
	 * The feature id for the '<em><b>Persistent View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__PERSISTENT_VIEW = ABSTRACT_PE__PERSISTENT_VIEW;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__DESCRIPTION = ABSTRACT_PE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__VALID_TIME = ABSTRACT_PE__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__TRANSACTION_TIME = ABSTRACT_PE__TRANSACTION_TIME;

	/**
	 * The feature id for the '<em><b>View Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__VIEW_USERNAME = ABSTRACT_PE__VIEW_USERNAME;

	/**
	 * The feature id for the '<em><b>View Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__VIEW_PASSWORD = ABSTRACT_PE__VIEW_PASSWORD;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__TRIGGER_TYPE = ABSTRACT_PE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Triggerpredicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__TRIGGERPREDICATE = ABSTRACT_PE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__PE_TYPE = ABSTRACT_PE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__FUNCTOR_TYPE = ABSTRACT_PE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Output Mapping Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE = ABSTRACT_PE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Processing Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__PROCESSING_DELAY = ABSTRACT_PE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Processing Delay Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION = ABSTRACT_PE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Graph Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE = ABSTRACT_PE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Processing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ELEMENT_FEATURE_COUNT = ABSTRACT_PE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.SourceImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = ABSTRACT_PE__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__VIEW = ABSTRACT_PE__VIEW;

	/**
	 * The feature id for the '<em><b>Nbr Allowed Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NBR_ALLOWED_INPUTS = ABSTRACT_PE__NBR_ALLOWED_INPUTS;

	/**
	 * The feature id for the '<em><b>Persistent View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PERSISTENT_VIEW = ABSTRACT_PE__PERSISTENT_VIEW;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DESCRIPTION = ABSTRACT_PE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Valid Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__VALID_TIME = ABSTRACT_PE__VALID_TIME;

	/**
	 * The feature id for the '<em><b>Transaction Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TRANSACTION_TIME = ABSTRACT_PE__TRANSACTION_TIME;

	/**
	 * The feature id for the '<em><b>View Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__VIEW_USERNAME = ABSTRACT_PE__VIEW_USERNAME;

	/**
	 * The feature id for the '<em><b>View Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__VIEW_PASSWORD = ABSTRACT_PE__VIEW_PASSWORD;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TIMEOUT = ABSTRACT_PE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LOCATION = ABSTRACT_PE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sample Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SAMPLE_TIME = ABSTRACT_PE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sample Time Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SAMPLE_TIME_DISTRIBUTION = ABSTRACT_PE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Graph Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__HAS_GRAPH_REFERENCE = ABSTRACT_PE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_TYPE = ABSTRACT_PE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = ABSTRACT_PE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.GraphImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 8;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__VISIBLE = 0;

	/**
	 * The feature id for the '<em><b>XMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__XMIN = 1;

	/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__XMAX = 2;

	/**
	 * The feature id for the '<em><b>YMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__YMIN = 3;

	/**
	 * The feature id for the '<em><b>YMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__YMAX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ID = 7;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.impl.GraphReferenceImpl <em>Graph Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.impl.GraphReferenceImpl
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getGraphReference()
	 * @generated
	 */
	int GRAPH_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REFERENCE__ID = 0;

	/**
	 * The number of structural features of the '<em>Graph Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.TriggerTypes <em>Trigger Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.TriggerTypes
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getTriggerTypes()
	 * @generated
	 */
	int TRIGGER_TYPES = 10;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.SourceTypes <em>Source Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.SourceTypes
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getSourceTypes()
	 * @generated
	 */
	int SOURCE_TYPES = 11;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.ProcessingElementTypes <em>Processing Element Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.ProcessingElementTypes
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getProcessingElementTypes()
	 * @generated
	 */
	int PROCESSING_ELEMENT_TYPES = 12;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.FunctorTypes <em>Functor Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.FunctorTypes
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getFunctorTypes()
	 * @generated
	 */
	int FUNCTOR_TYPES = 13;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.InputOutputMappingTypes <em>Input Output Mapping Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.InputOutputMappingTypes
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getInputOutputMappingTypes()
	 * @generated
	 */
	int INPUT_OUTPUT_MAPPING_TYPES = 14;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.DiagramTypes <em>Diagram Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.DiagramTypes
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getDiagramTypes()
	 * @generated
	 */
	int DIAGRAM_TYPES = 15;

	/**
	 * The meta object id for the '{@link SensorDataWebGui.DistributionType <em>Distribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SensorDataWebGui.DistributionType
	 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getDistributionType()
	 * @generated
	 */
	int DISTRIBUTION_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.StandardSensorDataWeb <em>Standard Sensor Data Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Sensor Data Web</em>'.
	 * @see SensorDataWebGui.StandardSensorDataWeb
	 * @generated
	 */
	EClass getStandardSensorDataWeb();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.StandardSensorDataWeb#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SensorDataWebGui.StandardSensorDataWeb#getName()
	 * @see #getStandardSensorDataWeb()
	 * @generated
	 */
	EAttribute getStandardSensorDataWeb_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SensorDataWebGui.StandardSensorDataWeb#getContainsPEs <em>Contains PEs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains PEs</em>'.
	 * @see SensorDataWebGui.StandardSensorDataWeb#getContainsPEs()
	 * @see #getStandardSensorDataWeb()
	 * @generated
	 */
	EReference getStandardSensorDataWeb_ContainsPEs();

	/**
	 * Returns the meta object for the containment reference list '{@link SensorDataWebGui.StandardSensorDataWeb#getContainsArcs <em>Contains Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Arcs</em>'.
	 * @see SensorDataWebGui.StandardSensorDataWeb#getContainsArcs()
	 * @see #getStandardSensorDataWeb()
	 * @generated
	 */
	EReference getStandardSensorDataWeb_ContainsArcs();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.StandardSensorDataWeb#getDiagramType <em>Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram Type</em>'.
	 * @see SensorDataWebGui.StandardSensorDataWeb#getDiagramType()
	 * @see #getStandardSensorDataWeb()
	 * @generated
	 */
	EAttribute getStandardSensorDataWeb_DiagramType();

	/**
	 * Returns the meta object for the containment reference list '{@link SensorDataWebGui.StandardSensorDataWeb#getContainsGraph <em>Contains Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Graph</em>'.
	 * @see SensorDataWebGui.StandardSensorDataWeb#getContainsGraph()
	 * @see #getStandardSensorDataWeb()
	 * @generated
	 */
	EReference getStandardSensorDataWeb_ContainsGraph();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see SensorDataWebGui.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Arc#getWindowPredicate <em>Window Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Predicate</em>'.
	 * @see SensorDataWebGui.Arc#getWindowPredicate()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_WindowPredicate();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Arc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SensorDataWebGui.Arc#getName()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Name();

	/**
	 * Returns the meta object for the reference '{@link SensorDataWebGui.Arc#getArcFromPE <em>Arc From PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arc From PE</em>'.
	 * @see SensorDataWebGui.Arc#getArcFromPE()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_ArcFromPE();

	/**
	 * Returns the meta object for the reference '{@link SensorDataWebGui.Arc#getArcToPE <em>Arc To PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arc To PE</em>'.
	 * @see SensorDataWebGui.Arc#getArcToPE()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_ArcToPE();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Arc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SensorDataWebGui.Arc#getDescription()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Description();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Arc#getValidTime <em>Valid Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Time</em>'.
	 * @see SensorDataWebGui.Arc#getValidTime()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_ValidTime();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Arc#getTransactionTime <em>Transaction Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Time</em>'.
	 * @see SensorDataWebGui.Arc#getTransactionTime()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_TransactionTime();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.AbstractPE <em>Abstract PE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract PE</em>'.
	 * @see SensorDataWebGui.AbstractPE
	 * @generated
	 */
	EClass getAbstractPE();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SensorDataWebGui.AbstractPE#getName()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_Name();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see SensorDataWebGui.AbstractPE#getView()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_View();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getNbrAllowedInputs <em>Nbr Allowed Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Allowed Inputs</em>'.
	 * @see SensorDataWebGui.AbstractPE#getNbrAllowedInputs()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_NbrAllowedInputs();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#isPersistentView <em>Persistent View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent View</em>'.
	 * @see SensorDataWebGui.AbstractPE#isPersistentView()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_PersistentView();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SensorDataWebGui.AbstractPE#getDescription()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_Description();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getValidTime <em>Valid Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Time</em>'.
	 * @see SensorDataWebGui.AbstractPE#getValidTime()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_ValidTime();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getTransactionTime <em>Transaction Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Time</em>'.
	 * @see SensorDataWebGui.AbstractPE#getTransactionTime()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_TransactionTime();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getViewUsername <em>View Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Username</em>'.
	 * @see SensorDataWebGui.AbstractPE#getViewUsername()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_ViewUsername();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.AbstractPE#getViewPassword <em>View Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Password</em>'.
	 * @see SensorDataWebGui.AbstractPE#getViewPassword()
	 * @see #getAbstractPE()
	 * @generated
	 */
	EAttribute getAbstractPE_ViewPassword();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.TupleWindow <em>Tuple Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Window</em>'.
	 * @see SensorDataWebGui.TupleWindow
	 * @generated
	 */
	EClass getTupleWindow();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.TimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Window</em>'.
	 * @see SensorDataWebGui.TimeWindow
	 * @generated
	 */
	EClass getTimeWindow();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.FixedWindow <em>Fixed Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Window</em>'.
	 * @see SensorDataWebGui.FixedWindow
	 * @generated
	 */
	EClass getFixedWindow();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.ProcessingElement <em>Processing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Element</em>'.
	 * @see SensorDataWebGui.ProcessingElement
	 * @generated
	 */
	EClass getProcessingElement();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.ProcessingElement#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getTriggerType()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_TriggerType();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.ProcessingElement#getTriggerpredicate <em>Triggerpredicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggerpredicate</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getTriggerpredicate()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_Triggerpredicate();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.ProcessingElement#getPeType <em>Pe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pe Type</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getPeType()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_PeType();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.ProcessingElement#getFunctorType <em>Functor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functor Type</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getFunctorType()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_FunctorType();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.ProcessingElement#getInputOutputMappingType <em>Input Output Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Output Mapping Type</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getInputOutputMappingType()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_InputOutputMappingType();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.ProcessingElement#getProcessingDelay <em>Processing Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Delay</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getProcessingDelay()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_ProcessingDelay();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.ProcessingElement#getProcessingDelayDistribution <em>Processing Delay Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Delay Distribution</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getProcessingDelayDistribution()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EAttribute getProcessingElement_ProcessingDelayDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link SensorDataWebGui.ProcessingElement#getHasGraphReference <em>Has Graph Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Graph Reference</em>'.
	 * @see SensorDataWebGui.ProcessingElement#getHasGraphReference()
	 * @see #getProcessingElement()
	 * @generated
	 */
	EReference getProcessingElement_HasGraphReference();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see SensorDataWebGui.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Source#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see SensorDataWebGui.Source#getTimeout()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Source#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see SensorDataWebGui.Source#getLocation()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Location();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Source#getSampleTime <em>Sample Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Time</em>'.
	 * @see SensorDataWebGui.Source#getSampleTime()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_SampleTime();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Source#getSampleTimeDistribution <em>Sample Time Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Time Distribution</em>'.
	 * @see SensorDataWebGui.Source#getSampleTimeDistribution()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_SampleTimeDistribution();

	/**
	 * Returns the meta object for the containment reference list '{@link SensorDataWebGui.Source#getHasGraphReference <em>Has Graph Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Graph Reference</em>'.
	 * @see SensorDataWebGui.Source#getHasGraphReference()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_HasGraphReference();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Source#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see SensorDataWebGui.Source#getSourceType()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_SourceType();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see SensorDataWebGui.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see SensorDataWebGui.Graph#isVisible()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Visible();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#getXMin <em>XMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMin</em>'.
	 * @see SensorDataWebGui.Graph#getXMin()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_XMin();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#getXMax <em>XMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMax</em>'.
	 * @see SensorDataWebGui.Graph#getXMax()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_XMax();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#getYMin <em>YMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMin</em>'.
	 * @see SensorDataWebGui.Graph#getYMin()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_YMin();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#getYMax <em>YMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMax</em>'.
	 * @see SensorDataWebGui.Graph#getYMax()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_YMax();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SensorDataWebGui.Graph#getName()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Name();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SensorDataWebGui.Graph#getDescription()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Description();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.Graph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SensorDataWebGui.Graph#getId()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Id();

	/**
	 * Returns the meta object for class '{@link SensorDataWebGui.GraphReference <em>Graph Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Reference</em>'.
	 * @see SensorDataWebGui.GraphReference
	 * @generated
	 */
	EClass getGraphReference();

	/**
	 * Returns the meta object for the attribute '{@link SensorDataWebGui.GraphReference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SensorDataWebGui.GraphReference#getId()
	 * @see #getGraphReference()
	 * @generated
	 */
	EAttribute getGraphReference_Id();

	/**
	 * Returns the meta object for enum '{@link SensorDataWebGui.TriggerTypes <em>Trigger Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Types</em>'.
	 * @see SensorDataWebGui.TriggerTypes
	 * @generated
	 */
	EEnum getTriggerTypes();

	/**
	 * Returns the meta object for enum '{@link SensorDataWebGui.SourceTypes <em>Source Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Types</em>'.
	 * @see SensorDataWebGui.SourceTypes
	 * @generated
	 */
	EEnum getSourceTypes();

	/**
	 * Returns the meta object for enum '{@link SensorDataWebGui.ProcessingElementTypes <em>Processing Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Element Types</em>'.
	 * @see SensorDataWebGui.ProcessingElementTypes
	 * @generated
	 */
	EEnum getProcessingElementTypes();

	/**
	 * Returns the meta object for enum '{@link SensorDataWebGui.FunctorTypes <em>Functor Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Functor Types</em>'.
	 * @see SensorDataWebGui.FunctorTypes
	 * @generated
	 */
	EEnum getFunctorTypes();

	/**
	 * Returns the meta object for enum '{@link SensorDataWebGui.InputOutputMappingTypes <em>Input Output Mapping Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Output Mapping Types</em>'.
	 * @see SensorDataWebGui.InputOutputMappingTypes
	 * @generated
	 */
	EEnum getInputOutputMappingTypes();

	/**
	 * Returns the meta object for enum '{@link SensorDataWebGui.DiagramTypes <em>Diagram Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diagram Types</em>'.
	 * @see SensorDataWebGui.DiagramTypes
	 * @generated
	 */
	EEnum getDiagramTypes();

	/**
	 * Returns the meta object for enum '{@link SensorDataWebGui.DistributionType <em>Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distribution Type</em>'.
	 * @see SensorDataWebGui.DistributionType
	 * @generated
	 */
	EEnum getDistributionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensorDataWebGuiFactory getSensorDataWebGuiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.StandardSensorDataWebImpl <em>Standard Sensor Data Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.StandardSensorDataWebImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getStandardSensorDataWeb()
		 * @generated
		 */
		EClass STANDARD_SENSOR_DATA_WEB = eINSTANCE.getStandardSensorDataWeb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_SENSOR_DATA_WEB__NAME = eINSTANCE.getStandardSensorDataWeb_Name();

		/**
		 * The meta object literal for the '<em><b>Contains PEs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_SENSOR_DATA_WEB__CONTAINS_PES = eINSTANCE.getStandardSensorDataWeb_ContainsPEs();

		/**
		 * The meta object literal for the '<em><b>Contains Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS = eINSTANCE.getStandardSensorDataWeb_ContainsArcs();

		/**
		 * The meta object literal for the '<em><b>Diagram Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE = eINSTANCE.getStandardSensorDataWeb_DiagramType();

		/**
		 * The meta object literal for the '<em><b>Contains Graph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH = eINSTANCE.getStandardSensorDataWeb_ContainsGraph();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.ArcImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Window Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__WINDOW_PREDICATE = eINSTANCE.getArc_WindowPredicate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__NAME = eINSTANCE.getArc_Name();

		/**
		 * The meta object literal for the '<em><b>Arc From PE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__ARC_FROM_PE = eINSTANCE.getArc_ArcFromPE();

		/**
		 * The meta object literal for the '<em><b>Arc To PE</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__ARC_TO_PE = eINSTANCE.getArc_ArcToPE();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__DESCRIPTION = eINSTANCE.getArc_Description();

		/**
		 * The meta object literal for the '<em><b>Valid Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__VALID_TIME = eINSTANCE.getArc_ValidTime();

		/**
		 * The meta object literal for the '<em><b>Transaction Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__TRANSACTION_TIME = eINSTANCE.getArc_TransactionTime();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.AbstractPEImpl <em>Abstract PE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.AbstractPEImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getAbstractPE()
		 * @generated
		 */
		EClass ABSTRACT_PE = eINSTANCE.getAbstractPE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__NAME = eINSTANCE.getAbstractPE_Name();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__VIEW = eINSTANCE.getAbstractPE_View();

		/**
		 * The meta object literal for the '<em><b>Nbr Allowed Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__NBR_ALLOWED_INPUTS = eINSTANCE.getAbstractPE_NbrAllowedInputs();

		/**
		 * The meta object literal for the '<em><b>Persistent View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__PERSISTENT_VIEW = eINSTANCE.getAbstractPE_PersistentView();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__DESCRIPTION = eINSTANCE.getAbstractPE_Description();

		/**
		 * The meta object literal for the '<em><b>Valid Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__VALID_TIME = eINSTANCE.getAbstractPE_ValidTime();

		/**
		 * The meta object literal for the '<em><b>Transaction Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__TRANSACTION_TIME = eINSTANCE.getAbstractPE_TransactionTime();

		/**
		 * The meta object literal for the '<em><b>View Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__VIEW_USERNAME = eINSTANCE.getAbstractPE_ViewUsername();

		/**
		 * The meta object literal for the '<em><b>View Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PE__VIEW_PASSWORD = eINSTANCE.getAbstractPE_ViewPassword();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.TupleWindowImpl <em>Tuple Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.TupleWindowImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getTupleWindow()
		 * @generated
		 */
		EClass TUPLE_WINDOW = eINSTANCE.getTupleWindow();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.TimeWindowImpl <em>Time Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.TimeWindowImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getTimeWindow()
		 * @generated
		 */
		EClass TIME_WINDOW = eINSTANCE.getTimeWindow();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.FixedWindowImpl <em>Fixed Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.FixedWindowImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getFixedWindow()
		 * @generated
		 */
		EClass FIXED_WINDOW = eINSTANCE.getFixedWindow();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.ProcessingElementImpl <em>Processing Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.ProcessingElementImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getProcessingElement()
		 * @generated
		 */
		EClass PROCESSING_ELEMENT = eINSTANCE.getProcessingElement();

		/**
		 * The meta object literal for the '<em><b>Trigger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__TRIGGER_TYPE = eINSTANCE.getProcessingElement_TriggerType();

		/**
		 * The meta object literal for the '<em><b>Triggerpredicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__TRIGGERPREDICATE = eINSTANCE.getProcessingElement_Triggerpredicate();

		/**
		 * The meta object literal for the '<em><b>Pe Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__PE_TYPE = eINSTANCE.getProcessingElement_PeType();

		/**
		 * The meta object literal for the '<em><b>Functor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__FUNCTOR_TYPE = eINSTANCE.getProcessingElement_FunctorType();

		/**
		 * The meta object literal for the '<em><b>Input Output Mapping Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE = eINSTANCE.getProcessingElement_InputOutputMappingType();

		/**
		 * The meta object literal for the '<em><b>Processing Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__PROCESSING_DELAY = eINSTANCE.getProcessingElement_ProcessingDelay();

		/**
		 * The meta object literal for the '<em><b>Processing Delay Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION = eINSTANCE.getProcessingElement_ProcessingDelayDistribution();

		/**
		 * The meta object literal for the '<em><b>Has Graph Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE = eINSTANCE.getProcessingElement_HasGraphReference();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.SourceImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TIMEOUT = eINSTANCE.getSource_Timeout();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__LOCATION = eINSTANCE.getSource_Location();

		/**
		 * The meta object literal for the '<em><b>Sample Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SAMPLE_TIME = eINSTANCE.getSource_SampleTime();

		/**
		 * The meta object literal for the '<em><b>Sample Time Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SAMPLE_TIME_DISTRIBUTION = eINSTANCE.getSource_SampleTimeDistribution();

		/**
		 * The meta object literal for the '<em><b>Has Graph Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__HAS_GRAPH_REFERENCE = eINSTANCE.getSource_HasGraphReference();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SOURCE_TYPE = eINSTANCE.getSource_SourceType();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.GraphImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__VISIBLE = eINSTANCE.getGraph_Visible();

		/**
		 * The meta object literal for the '<em><b>XMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__XMIN = eINSTANCE.getGraph_XMin();

		/**
		 * The meta object literal for the '<em><b>XMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__XMAX = eINSTANCE.getGraph_XMax();

		/**
		 * The meta object literal for the '<em><b>YMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__YMIN = eINSTANCE.getGraph_YMin();

		/**
		 * The meta object literal for the '<em><b>YMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__YMAX = eINSTANCE.getGraph_YMax();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__NAME = eINSTANCE.getGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__DESCRIPTION = eINSTANCE.getGraph_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__ID = eINSTANCE.getGraph_Id();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.impl.GraphReferenceImpl <em>Graph Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.impl.GraphReferenceImpl
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getGraphReference()
		 * @generated
		 */
		EClass GRAPH_REFERENCE = eINSTANCE.getGraphReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_REFERENCE__ID = eINSTANCE.getGraphReference_Id();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.TriggerTypes <em>Trigger Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.TriggerTypes
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getTriggerTypes()
		 * @generated
		 */
		EEnum TRIGGER_TYPES = eINSTANCE.getTriggerTypes();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.SourceTypes <em>Source Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.SourceTypes
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getSourceTypes()
		 * @generated
		 */
		EEnum SOURCE_TYPES = eINSTANCE.getSourceTypes();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.ProcessingElementTypes <em>Processing Element Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.ProcessingElementTypes
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getProcessingElementTypes()
		 * @generated
		 */
		EEnum PROCESSING_ELEMENT_TYPES = eINSTANCE.getProcessingElementTypes();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.FunctorTypes <em>Functor Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.FunctorTypes
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getFunctorTypes()
		 * @generated
		 */
		EEnum FUNCTOR_TYPES = eINSTANCE.getFunctorTypes();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.InputOutputMappingTypes <em>Input Output Mapping Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.InputOutputMappingTypes
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getInputOutputMappingTypes()
		 * @generated
		 */
		EEnum INPUT_OUTPUT_MAPPING_TYPES = eINSTANCE.getInputOutputMappingTypes();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.DiagramTypes <em>Diagram Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.DiagramTypes
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getDiagramTypes()
		 * @generated
		 */
		EEnum DIAGRAM_TYPES = eINSTANCE.getDiagramTypes();

		/**
		 * The meta object literal for the '{@link SensorDataWebGui.DistributionType <em>Distribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SensorDataWebGui.DistributionType
		 * @see SensorDataWebGui.impl.SensorDataWebGuiPackageImpl#getDistributionType()
		 * @generated
		 */
		EEnum DISTRIBUTION_TYPE = eINSTANCE.getDistributionType();

	}

} //SensorDataWebGuiPackage
