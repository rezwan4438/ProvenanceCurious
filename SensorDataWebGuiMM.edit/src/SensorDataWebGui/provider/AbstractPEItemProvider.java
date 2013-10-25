/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.provider;


import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.SensorDataWebGuiPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link SensorDataWebGui.AbstractPE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractPEItemProvider
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
	public AbstractPEItemProvider(AdapterFactory adapterFactory) {
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
			addViewPropertyDescriptor(object);
			addNbrAllowedInputsPropertyDescriptor(object);
			addPersistentViewPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addValidTimePropertyDescriptor(object);
			addTransactionTimePropertyDescriptor(object);
			addViewUsernamePropertyDescriptor(object);
			addViewPasswordPropertyDescriptor(object);
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
				 getString("_UI_AbstractPE_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_name_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_view_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_view_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__VIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nbr Allowed Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbrAllowedInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_nbrAllowedInputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_nbrAllowedInputs_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__NBR_ALLOWED_INPUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistent View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_persistentView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_persistentView_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__PERSISTENT_VIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_description_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valid Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_validTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_validTime_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__VALID_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transaction Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_transactionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_transactionTime_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__TRANSACTION_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the View Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_viewUsername_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_viewUsername_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__VIEW_USERNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the View Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPE_viewPassword_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPE_viewPassword_feature", "_UI_AbstractPE_type"),
				 SensorDataWebGuiPackage.Literals.ABSTRACT_PE__VIEW_PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractPE)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractPE_type") :
			getString("_UI_AbstractPE_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractPE.class)) {
			case SensorDataWebGuiPackage.ABSTRACT_PE__NAME:
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW:
			case SensorDataWebGuiPackage.ABSTRACT_PE__NBR_ALLOWED_INPUTS:
			case SensorDataWebGuiPackage.ABSTRACT_PE__PERSISTENT_VIEW:
			case SensorDataWebGuiPackage.ABSTRACT_PE__DESCRIPTION:
			case SensorDataWebGuiPackage.ABSTRACT_PE__VALID_TIME:
			case SensorDataWebGuiPackage.ABSTRACT_PE__TRANSACTION_TIME:
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_USERNAME:
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_PASSWORD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
