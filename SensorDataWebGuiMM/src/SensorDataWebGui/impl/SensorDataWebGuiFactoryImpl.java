/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.impl;

import SensorDataWebGui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorDataWebGuiFactoryImpl extends EFactoryImpl implements SensorDataWebGuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorDataWebGuiFactory init() {
		try {
			SensorDataWebGuiFactory theSensorDataWebGuiFactory = (SensorDataWebGuiFactory)EPackage.Registry.INSTANCE.getEFactory("nl.utwente.ewi.gui"); 
			if (theSensorDataWebGuiFactory != null) {
				return theSensorDataWebGuiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensorDataWebGuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataWebGuiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB: return createStandardSensorDataWeb();
			case SensorDataWebGuiPackage.TUPLE_WINDOW: return createTupleWindow();
			case SensorDataWebGuiPackage.TIME_WINDOW: return createTimeWindow();
			case SensorDataWebGuiPackage.FIXED_WINDOW: return createFixedWindow();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT: return createProcessingElement();
			case SensorDataWebGuiPackage.SOURCE: return createSource();
			case SensorDataWebGuiPackage.GRAPH: return createGraph();
			case SensorDataWebGuiPackage.GRAPH_REFERENCE: return createGraphReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SensorDataWebGuiPackage.TRIGGER_TYPES:
				return createTriggerTypesFromString(eDataType, initialValue);
			case SensorDataWebGuiPackage.SOURCE_TYPES:
				return createSourceTypesFromString(eDataType, initialValue);
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT_TYPES:
				return createProcessingElementTypesFromString(eDataType, initialValue);
			case SensorDataWebGuiPackage.FUNCTOR_TYPES:
				return createFunctorTypesFromString(eDataType, initialValue);
			case SensorDataWebGuiPackage.INPUT_OUTPUT_MAPPING_TYPES:
				return createInputOutputMappingTypesFromString(eDataType, initialValue);
			case SensorDataWebGuiPackage.DIAGRAM_TYPES:
				return createDiagramTypesFromString(eDataType, initialValue);
			case SensorDataWebGuiPackage.DISTRIBUTION_TYPE:
				return createDistributionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SensorDataWebGuiPackage.TRIGGER_TYPES:
				return convertTriggerTypesToString(eDataType, instanceValue);
			case SensorDataWebGuiPackage.SOURCE_TYPES:
				return convertSourceTypesToString(eDataType, instanceValue);
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT_TYPES:
				return convertProcessingElementTypesToString(eDataType, instanceValue);
			case SensorDataWebGuiPackage.FUNCTOR_TYPES:
				return convertFunctorTypesToString(eDataType, instanceValue);
			case SensorDataWebGuiPackage.INPUT_OUTPUT_MAPPING_TYPES:
				return convertInputOutputMappingTypesToString(eDataType, instanceValue);
			case SensorDataWebGuiPackage.DIAGRAM_TYPES:
				return convertDiagramTypesToString(eDataType, instanceValue);
			case SensorDataWebGuiPackage.DISTRIBUTION_TYPE:
				return convertDistributionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardSensorDataWeb createStandardSensorDataWeb() {
		StandardSensorDataWebImpl standardSensorDataWeb = new StandardSensorDataWebImpl();
		return standardSensorDataWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleWindow createTupleWindow() {
		TupleWindowImpl tupleWindow = new TupleWindowImpl();
		return tupleWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeWindow createTimeWindow() {
		TimeWindowImpl timeWindow = new TimeWindowImpl();
		return timeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedWindow createFixedWindow() {
		FixedWindowImpl fixedWindow = new FixedWindowImpl();
		return fixedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElement createProcessingElement() {
		ProcessingElementImpl processingElement = new ProcessingElementImpl();
		return processingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphReference createGraphReference() {
		GraphReferenceImpl graphReference = new GraphReferenceImpl();
		return graphReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypes createTriggerTypesFromString(EDataType eDataType, String initialValue) {
		TriggerTypes result = TriggerTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTypes createSourceTypesFromString(EDataType eDataType, String initialValue) {
		SourceTypes result = SourceTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementTypes createProcessingElementTypesFromString(EDataType eDataType, String initialValue) {
		ProcessingElementTypes result = ProcessingElementTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingElementTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctorTypes createFunctorTypesFromString(EDataType eDataType, String initialValue) {
		FunctorTypes result = FunctorTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctorTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputMappingTypes createInputOutputMappingTypesFromString(EDataType eDataType, String initialValue) {
		InputOutputMappingTypes result = InputOutputMappingTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputOutputMappingTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramTypes createDiagramTypesFromString(EDataType eDataType, String initialValue) {
		DiagramTypes result = DiagramTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagramTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType createDistributionTypeFromString(EDataType eDataType, String initialValue) {
		DistributionType result = DistributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataWebGuiPackage getSensorDataWebGuiPackage() {
		return (SensorDataWebGuiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensorDataWebGuiPackage getPackage() {
		return SensorDataWebGuiPackage.eINSTANCE;
	}

} //SensorDataWebGuiFactoryImpl
