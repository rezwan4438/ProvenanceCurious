/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui.util;

import SensorDataWebGui.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SensorDataWebGui.SensorDataWebGuiPackage
 * @generated
 */
public class SensorDataWebGuiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensorDataWebGuiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDataWebGuiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SensorDataWebGuiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorDataWebGuiSwitch<Adapter> modelSwitch =
		new SensorDataWebGuiSwitch<Adapter>() {
			@Override
			public Adapter caseStandardSensorDataWeb(StandardSensorDataWeb object) {
				return createStandardSensorDataWebAdapter();
			}
			@Override
			public Adapter caseArc(Arc object) {
				return createArcAdapter();
			}
			@Override
			public Adapter caseAbstractPE(AbstractPE object) {
				return createAbstractPEAdapter();
			}
			@Override
			public Adapter caseTupleWindow(TupleWindow object) {
				return createTupleWindowAdapter();
			}
			@Override
			public Adapter caseTimeWindow(TimeWindow object) {
				return createTimeWindowAdapter();
			}
			@Override
			public Adapter caseFixedWindow(FixedWindow object) {
				return createFixedWindowAdapter();
			}
			@Override
			public Adapter caseProcessingElement(ProcessingElement object) {
				return createProcessingElementAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseGraph(Graph object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter caseGraphReference(GraphReference object) {
				return createGraphReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.StandardSensorDataWeb <em>Standard Sensor Data Web</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.StandardSensorDataWeb
	 * @generated
	 */
	public Adapter createStandardSensorDataWebAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.Arc
	 * @generated
	 */
	public Adapter createArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.AbstractPE <em>Abstract PE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.AbstractPE
	 * @generated
	 */
	public Adapter createAbstractPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.TupleWindow <em>Tuple Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.TupleWindow
	 * @generated
	 */
	public Adapter createTupleWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.TimeWindow <em>Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.TimeWindow
	 * @generated
	 */
	public Adapter createTimeWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.FixedWindow <em>Fixed Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.FixedWindow
	 * @generated
	 */
	public Adapter createFixedWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.ProcessingElement <em>Processing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.ProcessingElement
	 * @generated
	 */
	public Adapter createProcessingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SensorDataWebGui.GraphReference <em>Graph Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SensorDataWebGui.GraphReference
	 * @generated
	 */
	public Adapter createGraphReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SensorDataWebGuiAdapterFactory
