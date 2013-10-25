/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.impl;

import SensorDataWebGui.DistributionType;
import SensorDataWebGui.FunctorTypes;
import SensorDataWebGui.GraphReference;
import SensorDataWebGui.InputOutputMappingTypes;
import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.ProcessingElementTypes;
import SensorDataWebGui.SensorDataWebGuiPackage;
import SensorDataWebGui.SourceTypes;
import SensorDataWebGui.TriggerTypes;

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
 * An implementation of the model object '<em><b>Processing Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getTriggerpredicate <em>Triggerpredicate</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getPeType <em>Pe Type</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getFunctorType <em>Functor Type</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getInputOutputMappingType <em>Input Output Mapping Type</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getProcessingDelay <em>Processing Delay</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getProcessingDelayDistribution <em>Processing Delay Distribution</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.ProcessingElementImpl#getHasGraphReference <em>Has Graph Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessingElementImpl extends AbstractPEImpl implements ProcessingElement {
	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerTypes TRIGGER_TYPE_EDEFAULT = TriggerTypes.TUPLE;

	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected TriggerTypes triggerType = TRIGGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerpredicate() <em>Triggerpredicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerpredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGERPREDICATE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTriggerpredicate() <em>Triggerpredicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerpredicate()
	 * @generated
	 * @ordered
	 */
	protected String triggerpredicate = TRIGGERPREDICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeType() <em>Pe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingElementTypes PE_TYPE_EDEFAULT = ProcessingElementTypes.NOOP;

	/**
	 * The cached value of the '{@link #getPeType() <em>Pe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeType()
	 * @generated
	 * @ordered
	 */
	protected ProcessingElementTypes peType = PE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctorType() <em>Functor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctorType()
	 * @generated
	 * @ordered
	 */
	protected static final FunctorTypes FUNCTOR_TYPE_EDEFAULT = FunctorTypes.NOTAPPLICABLE;

	/**
	 * The cached value of the '{@link #getFunctorType() <em>Functor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctorType()
	 * @generated
	 * @ordered
	 */
	protected FunctorTypes functorType = FUNCTOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputOutputMappingType() <em>Input Output Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutputMappingType()
	 * @generated
	 * @ordered
	 */
	protected static final InputOutputMappingTypes INPUT_OUTPUT_MAPPING_TYPE_EDEFAULT = InputOutputMappingTypes.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getInputOutputMappingType() <em>Input Output Mapping Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOutputMappingType()
	 * @generated
	 * @ordered
	 */
	protected InputOutputMappingTypes inputOutputMappingType = INPUT_OUTPUT_MAPPING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessingDelay() <em>Processing Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSING_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProcessingDelay() <em>Processing Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingDelay()
	 * @generated
	 * @ordered
	 */
	protected int processingDelay = PROCESSING_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessingDelayDistribution() <em>Processing Delay Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingDelayDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final DistributionType PROCESSING_DELAY_DISTRIBUTION_EDEFAULT = DistributionType.POISSON;

	/**
	 * The cached value of the '{@link #getProcessingDelayDistribution() <em>Processing Delay Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingDelayDistribution()
	 * @generated
	 * @ordered
	 */
	protected DistributionType processingDelayDistribution = PROCESSING_DELAY_DISTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasGraphReference() <em>Has Graph Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasGraphReference()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphReference> hasGraphReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ProcessingElementImpl() {
		super();
		this.setNbrAllowedInputs(
				ProcessingElementTypes.getAllowedInput(
						this.getPeType().getValue()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypes getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerType(TriggerTypes newTriggerType) {
		TriggerTypes oldTriggerType = triggerType;
		triggerType = newTriggerType == null ? TRIGGER_TYPE_EDEFAULT : newTriggerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGER_TYPE, oldTriggerType, triggerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerpredicate() {
		return triggerpredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerpredicate(String newTriggerpredicate) {
		String oldTriggerpredicate = triggerpredicate;
		triggerpredicate = newTriggerpredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGERPREDICATE, oldTriggerpredicate, triggerpredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementTypes getPeType() {
		return peType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPeType(ProcessingElementTypes newPeType) {
		ProcessingElementTypes oldPeType = peType;
		peType = newPeType == null ? PE_TYPE_EDEFAULT : newPeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.PROCESSING_ELEMENT__PE_TYPE, oldPeType, peType));
		this.setNbrAllowedInputs(ProcessingElementTypes.getAllowedInput(newPeType.getValue()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctorTypes getFunctorType() {
		return functorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctorType(FunctorTypes newFunctorType) {
		FunctorTypes oldFunctorType = functorType;
		functorType = newFunctorType == null ? FUNCTOR_TYPE_EDEFAULT : newFunctorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.PROCESSING_ELEMENT__FUNCTOR_TYPE, oldFunctorType, functorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputMappingTypes getInputOutputMappingType() {
		return inputOutputMappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputOutputMappingType(InputOutputMappingTypes newInputOutputMappingType) {
		InputOutputMappingTypes oldInputOutputMappingType = inputOutputMappingType;
		inputOutputMappingType = newInputOutputMappingType == null ? INPUT_OUTPUT_MAPPING_TYPE_EDEFAULT : newInputOutputMappingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE, oldInputOutputMappingType, inputOutputMappingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessingDelay() {
		return processingDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingDelay(int newProcessingDelay) {
		int oldProcessingDelay = processingDelay;
		processingDelay = newProcessingDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY, oldProcessingDelay, processingDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType getProcessingDelayDistribution() {
		return processingDelayDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingDelayDistribution(DistributionType newProcessingDelayDistribution) {
		DistributionType oldProcessingDelayDistribution = processingDelayDistribution;
		processingDelayDistribution = newProcessingDelayDistribution == null ? PROCESSING_DELAY_DISTRIBUTION_EDEFAULT : newProcessingDelayDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION, oldProcessingDelayDistribution, processingDelayDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphReference> getHasGraphReference() {
		if (hasGraphReference == null) {
			hasGraphReference = new EObjectContainmentEList<GraphReference>(GraphReference.class, this, SensorDataWebGuiPackage.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE);
		}
		return hasGraphReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE:
				return ((InternalEList<?>)getHasGraphReference()).basicRemove(otherEnd, msgs);
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
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGER_TYPE:
				return getTriggerType();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGERPREDICATE:
				return getTriggerpredicate();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PE_TYPE:
				return getPeType();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__FUNCTOR_TYPE:
				return getFunctorType();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE:
				return getInputOutputMappingType();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY:
				return getProcessingDelay();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION:
				return getProcessingDelayDistribution();
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE:
				return getHasGraphReference();
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
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGER_TYPE:
				setTriggerType((TriggerTypes)newValue);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGERPREDICATE:
				setTriggerpredicate((String)newValue);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PE_TYPE:
				setPeType((ProcessingElementTypes)newValue);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__FUNCTOR_TYPE:
				setFunctorType((FunctorTypes)newValue);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE:
				setInputOutputMappingType((InputOutputMappingTypes)newValue);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY:
				setProcessingDelay((Integer)newValue);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION:
				setProcessingDelayDistribution((DistributionType)newValue);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE:
				getHasGraphReference().clear();
				getHasGraphReference().addAll((Collection<? extends GraphReference>)newValue);
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
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGER_TYPE:
				setTriggerType(TRIGGER_TYPE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGERPREDICATE:
				setTriggerpredicate(TRIGGERPREDICATE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PE_TYPE:
				setPeType(PE_TYPE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__FUNCTOR_TYPE:
				setFunctorType(FUNCTOR_TYPE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE:
				setInputOutputMappingType(INPUT_OUTPUT_MAPPING_TYPE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY:
				setProcessingDelay(PROCESSING_DELAY_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION:
				setProcessingDelayDistribution(PROCESSING_DELAY_DISTRIBUTION_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE:
				getHasGraphReference().clear();
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
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGER_TYPE:
				return triggerType != TRIGGER_TYPE_EDEFAULT;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGERPREDICATE:
				return TRIGGERPREDICATE_EDEFAULT == null ? triggerpredicate != null : !TRIGGERPREDICATE_EDEFAULT.equals(triggerpredicate);
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PE_TYPE:
				return peType != PE_TYPE_EDEFAULT;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__FUNCTOR_TYPE:
				return functorType != FUNCTOR_TYPE_EDEFAULT;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE:
				return inputOutputMappingType != INPUT_OUTPUT_MAPPING_TYPE_EDEFAULT;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY:
				return processingDelay != PROCESSING_DELAY_EDEFAULT;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION:
				return processingDelayDistribution != PROCESSING_DELAY_DISTRIBUTION_EDEFAULT;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE:
				return hasGraphReference != null && !hasGraphReference.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (triggerType: ");
		result.append(triggerType);
		result.append(", triggerpredicate: ");
		result.append(triggerpredicate);
		result.append(", peType: ");
		result.append(peType);
		result.append(", functorType: ");
		result.append(functorType);
		result.append(", inputOutputMappingType: ");
		result.append(inputOutputMappingType);
		result.append(", processingDelay: ");
		result.append(processingDelay);
		result.append(", processingDelayDistribution: ");
		result.append(processingDelayDistribution);
		result.append(')');
		return result.toString();
	}

} //ProcessingElementImpl
