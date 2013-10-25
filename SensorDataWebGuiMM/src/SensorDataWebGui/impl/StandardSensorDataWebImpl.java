/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.impl;

import SensorDataWebGui.AbstractPE;
import SensorDataWebGui.Arc;
import SensorDataWebGui.DiagramTypes;
import SensorDataWebGui.Graph;
import SensorDataWebGui.SensorDataWebGuiPackage;
import SensorDataWebGui.StandardSensorDataWeb;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Sensor Data Web</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SensorDataWebGui.impl.StandardSensorDataWebImpl#getName <em>Name</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.StandardSensorDataWebImpl#getContainsPEs <em>Contains PEs</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.StandardSensorDataWebImpl#getContainsArcs <em>Contains Arcs</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.StandardSensorDataWebImpl#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link SensorDataWebGui.impl.StandardSensorDataWebImpl#getContainsGraph <em>Contains Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardSensorDataWebImpl extends EObjectImpl implements StandardSensorDataWeb {
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
	 * The cached value of the '{@link #getContainsPEs() <em>Contains PEs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPEs()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPE> containsPEs;

	/**
	 * The cached value of the '{@link #getContainsArcs() <em>Contains Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> containsArcs;

	/**
	 * The default value of the '{@link #getDiagramType() <em>Diagram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramType()
	 * @generated
	 * @ordered
	 */
	protected static final DiagramTypes DIAGRAM_TYPE_EDEFAULT = DiagramTypes.STANDARD;

	/**
	 * The cached value of the '{@link #getDiagramType() <em>Diagram Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramType()
	 * @generated
	 * @ordered
	 */
	protected DiagramTypes diagramType = DIAGRAM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsGraph() <em>Contains Graph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsGraph()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> containsGraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardSensorDataWebImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorDataWebGuiPackage.Literals.STANDARD_SENSOR_DATA_WEB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPE> getContainsPEs() {
		if (containsPEs == null) {
			containsPEs = new EObjectContainmentEList<AbstractPE>(AbstractPE.class, this, SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES);
		}
		return containsPEs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getContainsArcs() {
		if (containsArcs == null) {
			containsArcs = new EObjectContainmentEList<Arc>(Arc.class, this, SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS);
		}
		return containsArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramTypes getDiagramType() {
		return diagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramType(DiagramTypes newDiagramType) {
		DiagramTypes oldDiagramType = diagramType;
		diagramType = newDiagramType == null ? DIAGRAM_TYPE_EDEFAULT : newDiagramType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE, oldDiagramType, diagramType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Graph> getContainsGraph() {
		if (containsGraph == null) {
			containsGraph = new EObjectContainmentEList<Graph>(Graph.class, this, SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH);
		}
		return containsGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES:
				return ((InternalEList<?>)getContainsPEs()).basicRemove(otherEnd, msgs);
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS:
				return ((InternalEList<?>)getContainsArcs()).basicRemove(otherEnd, msgs);
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH:
				return ((InternalEList<?>)getContainsGraph()).basicRemove(otherEnd, msgs);
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
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__NAME:
				return getName();
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES:
				return getContainsPEs();
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS:
				return getContainsArcs();
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE:
				return getDiagramType();
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH:
				return getContainsGraph();
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
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__NAME:
				setName((String)newValue);
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES:
				getContainsPEs().clear();
				getContainsPEs().addAll((Collection<? extends AbstractPE>)newValue);
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS:
				getContainsArcs().clear();
				getContainsArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE:
				setDiagramType((DiagramTypes)newValue);
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH:
				getContainsGraph().clear();
				getContainsGraph().addAll((Collection<? extends Graph>)newValue);
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
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES:
				getContainsPEs().clear();
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS:
				getContainsArcs().clear();
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE:
				setDiagramType(DIAGRAM_TYPE_EDEFAULT);
				return;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH:
				getContainsGraph().clear();
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
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_PES:
				return containsPEs != null && !containsPEs.isEmpty();
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_ARCS:
				return containsArcs != null && !containsArcs.isEmpty();
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__DIAGRAM_TYPE:
				return diagramType != DIAGRAM_TYPE_EDEFAULT;
			case SensorDataWebGuiPackage.STANDARD_SENSOR_DATA_WEB__CONTAINS_GRAPH:
				return containsGraph != null && !containsGraph.isEmpty();
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
		result.append(", diagramType: ");
		result.append(diagramType);
		result.append(')');
		return result.toString();
	}

} //StandardSensorDataWebImpl
