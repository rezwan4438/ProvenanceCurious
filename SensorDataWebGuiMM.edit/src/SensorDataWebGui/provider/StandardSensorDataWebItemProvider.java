/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.provider;


import SensorDataWebGui.SensorDataWebGuiFactory;
import SensorDataWebGui.SensorDataWebGuiPackage;
import SensorDataWebGui.StandardSensorDataWeb;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link SensorDataWebGui.StandardSensorDataWeb} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardSensorDataWebItemProvider
	extends ItemProviderAdapter
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
	public StandardSensorDataWebItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDiagramTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StandardSensorDataWeb_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StandardSensorDataWeb_name_feature", "_UI_StandardSensorDataWeb_type"),
				 SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StandardSensorDataWeb_diagramType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StandardSensorDataWeb_diagramType_feature", "_UI_StandardSensorDataWeb_type"),
				 SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE,
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
			childrenFeatures.add(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES);
			childrenFeatures.add(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS);
			childrenFeatures.add(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH);
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
	 * This returns StandardSensorDataWeb.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StandardSensorDataWeb"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StandardSensorDataWeb)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StandardSensorDataWeb_type") :
			getString("_UI_StandardSensorDataWeb_type") + " " + label;
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

		switch (notification.getFeatureID(StandardSensorDataWeb.class)) {
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__NAME:
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES:
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS:
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH:
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
				(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES,
				 SensorDataWebGuiFactory.eINSTANCE.createProcessingElement()));

		newChildDescriptors.add
			(createChildParameter
				(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES,
				 SensorDataWebGuiFactory.eINSTANCE.createSource()));

		newChildDescriptors.add
			(createChildParameter
				(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS,
				 SensorDataWebGuiFactory.eINSTANCE.createTupleWindow()));

		newChildDescriptors.add
			(createChildParameter
				(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS,
				 SensorDataWebGuiFactory.eINSTANCE.createTimeWindow()));

		newChildDescriptors.add
			(createChildParameter
				(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS,
				 SensorDataWebGuiFactory.eINSTANCE.createFixedWindow()));

		newChildDescriptors.add
			(createChildParameter
				(SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH,
				 SensorDataWebGuiFactory.eINSTANCE.createGraph()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SensorDataWebGuiEditPlugin.INSTANCE;
	}

}
