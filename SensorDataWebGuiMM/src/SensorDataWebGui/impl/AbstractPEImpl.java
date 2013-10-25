/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.impl;

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.SensorDataWebGuiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract PE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getName <em>Name</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getView <em>View</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getNbrAllowedInputs <em>Nbr Allowed Inputs</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#isPersistentView <em>Persistent View</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getTransactionTime <em>Transaction Time</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getViewUsername <em>View Username</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.AbstractPEImpl#getViewPassword <em>View Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPEImpl extends EObjectImpl implements AbstractPE {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected String view = VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbrAllowedInputs() <em>Nbr Allowed Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrAllowedInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int NBR_ALLOWED_INPUTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbrAllowedInputs() <em>Nbr Allowed Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrAllowedInputs()
	 * @generated
	 * @ordered
	 */
	protected int nbrAllowedInputs = NBR_ALLOWED_INPUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistentView() <em>Persistent View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistentView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_VIEW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPersistentView() <em>Persistent View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistentView()
	 * @generated
	 * @ordered
	 */
	protected boolean persistentView = PERSISTENT_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidTime() <em>Valid Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected static final long VALID_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValidTime() <em>Valid Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected long validTime = VALID_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionTime() <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSACTION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransactionTime() <em>Transaction Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionTime()
	 * @generated
	 * @ordered
	 */
	protected long transactionTime = TRANSACTION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewUsername() <em>View Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewUsername() <em>View Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewUsername()
	 * @generated
	 * @ordered
	 */
	protected String viewUsername = VIEW_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewPassword() <em>View Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewPassword() <em>View Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewPassword()
	 * @generated
	 * @ordered
	 */
	protected String viewPassword = VIEW_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorDataWebGuiPackage.Literals.ABSTRACT_PE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(String newView) {
		String oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrAllowedInputs() {
		return nbrAllowedInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrAllowedInputs(int newNbrAllowedInputs) {
		int oldNbrAllowedInputs = nbrAllowedInputs;
		nbrAllowedInputs = newNbrAllowedInputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__NBR_ALLOWED_INPUTS, oldNbrAllowedInputs, nbrAllowedInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistentView() {
		return persistentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistentView(boolean newPersistentView) {
		boolean oldPersistentView = persistentView;
		persistentView = newPersistentView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__PERSISTENT_VIEW, oldPersistentView, persistentView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValidTime() {
		return validTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTime(long newValidTime) {
		long oldValidTime = validTime;
		validTime = newValidTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__VALID_TIME, oldValidTime, validTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransactionTime() {
		return transactionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionTime(long newTransactionTime) {
		long oldTransactionTime = transactionTime;
		transactionTime = newTransactionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__TRANSACTION_TIME, oldTransactionTime, transactionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewUsername() {
		return viewUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewUsername(String newViewUsername) {
		String oldViewUsername = viewUsername;
		viewUsername = newViewUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_USERNAME, oldViewUsername, viewUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewPassword() {
		return viewPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewPassword(String newViewPassword) {
		String oldViewPassword = viewPassword;
		viewPassword = newViewPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_PASSWORD, oldViewPassword, viewPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensorDataWebGuiPackage.ABSTRACT_PE__NAME:
				return getName();
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW:
				return getView();
			case SensorDataWebGuiPackage.ABSTRACT_PE__NBR_ALLOWED_INPUTS:
				return getNbrAllowedInputs();
			case SensorDataWebGuiPackage.ABSTRACT_PE__PERSISTENT_VIEW:
				return isPersistentView();
			case SensorDataWebGuiPackage.ABSTRACT_PE__DESCRIPTION:
				return getDescription();
			case SensorDataWebGuiPackage.ABSTRACT_PE__VALID_TIME:
				return getValidTime();
			case SensorDataWebGuiPackage.ABSTRACT_PE__TRANSACTION_TIME:
				return getTransactionTime();
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_USERNAME:
				return getViewUsername();
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_PASSWORD:
				return getViewPassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SensorDataWebGuiPackage.ABSTRACT_PE__NAME:
				setName((String)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW:
				setView((String)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__NBR_ALLOWED_INPUTS:
				setNbrAllowedInputs((Integer)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__PERSISTENT_VIEW:
				setPersistentView((Boolean)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VALID_TIME:
				setValidTime((Long)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__TRANSACTION_TIME:
				setTransactionTime((Long)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_USERNAME:
				setViewUsername((String)newValue);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_PASSWORD:
				setViewPassword((String)newValue);
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
			case SensorDataWebGuiPackage.ABSTRACT_PE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW:
				setView(VIEW_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__NBR_ALLOWED_INPUTS:
				setNbrAllowedInputs(NBR_ALLOWED_INPUTS_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__PERSISTENT_VIEW:
				setPersistentView(PERSISTENT_VIEW_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VALID_TIME:
				setValidTime(VALID_TIME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__TRANSACTION_TIME:
				setTransactionTime(TRANSACTION_TIME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_USERNAME:
				setViewUsername(VIEW_USERNAME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_PASSWORD:
				setViewPassword(VIEW_PASSWORD_EDEFAULT);
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
			case SensorDataWebGuiPackage.ABSTRACT_PE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW:
				return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
			case SensorDataWebGuiPackage.ABSTRACT_PE__NBR_ALLOWED_INPUTS:
				return nbrAllowedInputs != NBR_ALLOWED_INPUTS_EDEFAULT;
			case SensorDataWebGuiPackage.ABSTRACT_PE__PERSISTENT_VIEW:
				return persistentView != PERSISTENT_VIEW_EDEFAULT;
			case SensorDataWebGuiPackage.ABSTRACT_PE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SensorDataWebGuiPackage.ABSTRACT_PE__VALID_TIME:
				return validTime != VALID_TIME_EDEFAULT;
			case SensorDataWebGuiPackage.ABSTRACT_PE__TRANSACTION_TIME:
				return transactionTime != TRANSACTION_TIME_EDEFAULT;
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_USERNAME:
				return VIEW_USERNAME_EDEFAULT == null ? viewUsername != null : !VIEW_USERNAME_EDEFAULT.equals(viewUsername);
			case SensorDataWebGuiPackage.ABSTRACT_PE__VIEW_PASSWORD:
				return VIEW_PASSWORD_EDEFAULT == null ? viewPassword != null : !VIEW_PASSWORD_EDEFAULT.equals(viewPassword);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", view: ");
		result.append(view);
		result.append(", nbrAllowedInputs: ");
		result.append(nbrAllowedInputs);
		result.append(", persistentView: ");
		result.append(persistentView);
		result.append(", description: ");
		result.append(description);
		result.append(", validTime: ");
		result.append(validTime);
		result.append(", transactionTime: ");
		result.append(transactionTime);
		result.append(", viewUsername: ");
		result.append(viewUsername);
		result.append(", viewPassword: ");
		result.append(viewPassword);
		result.append(')');
		return result.toString();
	}

} //AbstractPEImpl
