/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.provider;


import SensorDataWebGui.ProcessingElement;
import SensorDataWebGui.SensorDataWebGuiFactory;
import SensorDataWebGui.SensorDataWebGuiPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link SensorDataWebGui.ProcessingElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingElementItemProvider
	extends AbstractPEItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTriggerTypePropertyDescriptor(object);
			addTriggerpredicatePropertyDescriptor(object);
			addPeTypePropertyDescriptor(object);
			addFunctorTypePropertyDescriptor(object);
			addInputOutputMappingTypePropertyDescriptor(object);
			addProcessingDelayPropertyDescriptor(object);
			addProcessingDelayDistributionPropertyDescriptor(object);
			addSourceTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Trigger Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_triggerType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_triggerType_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__TRIGGER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triggerpredicate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerpredicatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_triggerpredicate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_triggerpredicate_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__TRIGGERPREDICATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pe Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_peType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_peType_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__PE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Functor Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctorTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_functorType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_functorType_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__FUNCTOR_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Output Mapping Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputOutputMappingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_inputOutputMappingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_inputOutputMappingType_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_processingDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_processingDelay_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__PROCESSING_DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Delay Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingDelayDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_processingDelayDistribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_processingDelayDistribution_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingElement_sourceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingElement_sourceType_feature", "_UI_ProcessingElement_type"),
				 SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__SOURCE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProcessingElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessingElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessingElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessingElement_type") :
			getString("_UI_ProcessingElement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ProcessingElement.class)) {
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGER_TYPE:
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__TRIGGERPREDICATE:
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PE_TYPE:
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__FUNCTOR_TYPE:
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__INPUT_OUTPUT_MAPPING_TYPE:
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY:
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__PROCESSING_DELAY_DISTRIBUTION:
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__SOURCE_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SensorDataWebGuiPackage.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SensorDataWebGuiPackage.Literals.PROCESSING_ELEMENT__HAS_GRAPH_REFERENCE,
				 SensorDataWebGuiFactory.eINSTANCE.createGraphReference()));
	}

}
