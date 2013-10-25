/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.impl;

import SensorDataWebGui.Graph;
import SensorDataWebGui.SensorDataWebGuiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#getXMin <em>XMin</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#getXMax <em>XMax</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#getYMin <em>YMin</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#getYMax <em>YMax</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.GraphImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphImpl extends EObjectImpl implements Graph {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMin() <em>XMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMin()
	 * @generated
	 * @ordered
	 */
	protected static final double XMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXMin() <em>XMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMin()
	 * @generated
	 * @ordered
	 */
	protected double xMin = XMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
	protected static final double XMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
	protected double xMax = XMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMin() <em>YMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMin()
	 * @generated
	 * @ordered
	 */
	protected static final double YMIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYMin() <em>YMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMin()
	 * @generated
	 * @ordered
	 */
	protected double yMin = YMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMax() <em>YMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMax()
	 * @generated
	 * @ordered
	 */
	protected static final double YMAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYMax() <em>YMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMax()
	 * @generated
	 * @ordered
	 */
	protected double yMax = YMAX_EDEFAULT;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorDataWebGuiPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXMin() {
		return xMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMin(double newXMin) {
		double oldXMin = xMin;
		xMin = newXMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__XMIN, oldXMin, xMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXMax() {
		return xMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMax(double newXMax) {
		double oldXMax = xMax;
		xMax = newXMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__XMAX, oldXMax, xMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYMin() {
		return yMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMin(double newYMin) {
		double oldYMin = yMin;
		yMin = newYMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__YMIN, oldYMin, yMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYMax() {
		return yMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMax(double newYMax) {
		double oldYMax = yMax;
		yMax = newYMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__YMAX, oldYMax, yMax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.GRAPH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensorDataWebGuiPackage.GRAPH__VISIBLE:
				return isVisible();
			case SensorDataWebGuiPackage.GRAPH__XMIN:
				return getXMin();
			case SensorDataWebGuiPackage.GRAPH__XMAX:
				return getXMax();
			case SensorDataWebGuiPackage.GRAPH__YMIN:
				return getYMin();
			case SensorDataWebGuiPackage.GRAPH__YMAX:
				return getYMax();
			case SensorDataWebGuiPackage.GRAPH__NAME:
				return getName();
			case SensorDataWebGuiPackage.GRAPH__DESCRIPTION:
				return getDescription();
			case SensorDataWebGuiPackage.GRAPH__ID:
				return getId();
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
			case SensorDataWebGuiPackage.GRAPH__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case SensorDataWebGuiPackage.GRAPH__XMIN:
				setXMin((Double)newValue);
				return;
			case SensorDataWebGuiPackage.GRAPH__XMAX:
				setXMax((Double)newValue);
				return;
			case SensorDataWebGuiPackage.GRAPH__YMIN:
				setYMin((Double)newValue);
				return;
			case SensorDataWebGuiPackage.GRAPH__YMAX:
				setYMax((Double)newValue);
				return;
			case SensorDataWebGuiPackage.GRAPH__NAME:
				setName((String)newValue);
				return;
			case SensorDataWebGuiPackage.GRAPH__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SensorDataWebGuiPackage.GRAPH__ID:
				setId((Integer)newValue);
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
			case SensorDataWebGuiPackage.GRAPH__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.GRAPH__XMIN:
				setXMin(XMIN_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.GRAPH__XMAX:
				setXMax(XMAX_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.GRAPH__YMIN:
				setYMin(YMIN_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.GRAPH__YMAX:
				setYMax(YMAX_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.GRAPH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.GRAPH__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.GRAPH__ID:
				setId(ID_EDEFAULT);
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
			case SensorDataWebGuiPackage.GRAPH__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case SensorDataWebGuiPackage.GRAPH__XMIN:
				return xMin != XMIN_EDEFAULT;
			case SensorDataWebGuiPackage.GRAPH__XMAX:
				return xMax != XMAX_EDEFAULT;
			case SensorDataWebGuiPackage.GRAPH__YMIN:
				return yMin != YMIN_EDEFAULT;
			case SensorDataWebGuiPackage.GRAPH__YMAX:
				return yMax != YMAX_EDEFAULT;
			case SensorDataWebGuiPackage.GRAPH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SensorDataWebGuiPackage.GRAPH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SensorDataWebGuiPackage.GRAPH__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(", xMin: ");
		result.append(xMin);
		result.append(", xMax: ");
		result.append(xMax);
		result.append(", yMin: ");
		result.append(yMin);
		result.append(", yMax: ");
		result.append(yMax);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
