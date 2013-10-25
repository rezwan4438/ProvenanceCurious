/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getTriggerpredicate <em>Triggerpredicate</em>}</li>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getPeType <em>Pe Type</em>}</li>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getFunctorType <em>Functor Type</em>}</li>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getInputOutputMappingType <em>Input Output Mapping Type</em>}</li>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getProcessingDelay <em>Processing Delay</em>}</li>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getProcessingDelayDistribution <em>Processing Delay Distribution</em>}</li>
 *   <li>{@link SensorDataWebGui.ProcessingElement#getHasGraphReference <em>Has Graph Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement()
 * @model
 * @generated
 */
public interface ProcessingElement extends AbstractPE {
	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link SensorDataWebGui.TriggerTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see SensorDataWebGui.TriggerTypes
	 * @see #setTriggerType(TriggerTypes)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_TriggerType()
	 * @model default="0"
	 * @generated
	 */
	TriggerTypes getTriggerType();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.ProcessingElement#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see SensorDataWebGui.TriggerTypes
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(TriggerTypes value);

	/**
	 * Returns the value of the '<em><b>Triggerpredicate</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggerpredicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggerpredicate</em>' attribute.
	 * @see #setTriggerpredicate(String)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_Triggerpredicate()
	 * @model default=""
	 * @generated
	 */
	String getTriggerpredicate();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.ProcessingElement#getTriggerpredicate <em>Triggerpredicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggerpredicate</em>' attribute.
	 * @see #getTriggerpredicate()
	 * @generated
	 */
	void setTriggerpredicate(String value);

	/**
	 * Returns the value of the '<em><b>Pe Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link SensorDataWebGui.ProcessingElementTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pe Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pe Type</em>' attribute.
	 * @see SensorDataWebGui.ProcessingElementTypes
	 * @see #setPeType(ProcessingElementTypes)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_PeType()
	 * @model default="0"
	 * @generated
	 */
	ProcessingElementTypes getPeType();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.ProcessingElement#getPeType <em>Pe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pe Type</em>' attribute.
	 * @see SensorDataWebGui.ProcessingElementTypes
	 * @see #getPeType()
	 * @generated
	 */
	void setPeType(ProcessingElementTypes value);

	/**
	 * Returns the value of the '<em><b>Functor Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link SensorDataWebGui.FunctorTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functor Type</em>' attribute.
	 * @see SensorDataWebGui.FunctorTypes
	 * @see #setFunctorType(FunctorTypes)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_FunctorType()
	 * @model default="0"
	 * @generated
	 */
	FunctorTypes getFunctorType();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.ProcessingElement#getFunctorType <em>Functor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functor Type</em>' attribute.
	 * @see SensorDataWebGui.FunctorTypes
	 * @see #getFunctorType()
	 * @generated
	 */
	void setFunctorType(FunctorTypes value);

	/**
	 * Returns the value of the '<em><b>Input Output Mapping Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link SensorDataWebGui.InputOutputMappingTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Output Mapping Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Output Mapping Type</em>' attribute.
	 * @see SensorDataWebGui.InputOutputMappingTypes
	 * @see #setInputOutputMappingType(InputOutputMappingTypes)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_InputOutputMappingType()
	 * @model default="0"
	 * @generated
	 */
	InputOutputMappingTypes getInputOutputMappingType();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.ProcessingElement#getInputOutputMappingType <em>Input Output Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Output Mapping Type</em>' attribute.
	 * @see SensorDataWebGui.InputOutputMappingTypes
	 * @see #getInputOutputMappingType()
	 * @generated
	 */
	void setInputOutputMappingType(InputOutputMappingTypes value);

	/**
	 * Returns the value of the '<em><b>Processing Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Delay</em>' attribute.
	 * @see #setProcessingDelay(int)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_ProcessingDelay()
	 * @model
	 * @generated
	 */
	int getProcessingDelay();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.ProcessingElement#getProcessingDelay <em>Processing Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Delay</em>' attribute.
	 * @see #getProcessingDelay()
	 * @generated
	 */
	void setProcessingDelay(int value);

	/**
	 * Returns the value of the '<em><b>Processing Delay Distribution</b></em>' attribute.
	 * The literals are from the enumeration {@link SensorDataWebGui.DistributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Delay Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Delay Distribution</em>' attribute.
	 * @see SensorDataWebGui.DistributionType
	 * @see #setProcessingDelayDistribution(DistributionType)
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_ProcessingDelayDistribution()
	 * @model
	 * @generated
	 */
	DistributionType getProcessingDelayDistribution();

	/**
	 * Sets the value of the '{@link SensorDataWebGui.ProcessingElement#getProcessingDelayDistribution <em>Processing Delay Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Delay Distribution</em>' attribute.
	 * @see SensorDataWebGui.DistributionType
	 * @see #getProcessingDelayDistribution()
	 * @generated
	 */
	void setProcessingDelayDistribution(DistributionType value);

	/**
	 * Returns the value of the '<em><b>Has Graph Reference</b></em>' containment reference list.
	 * The list contents are of type {@link SensorDataWebGui.GraphReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Graph Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Graph Reference</em>' containment reference list.
	 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElement_HasGraphReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphReference> getHasGraphReference();

} // ProcessingElement
