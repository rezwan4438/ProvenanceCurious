/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SensorDataWebGui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processing Element Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SensorDataWebGui.SensorDataWebGuiPackage#getProcessingElementTypes()
 * @model
 * @generated
 */
public enum ProcessingElementTypes implements Enumerator {
	/**
	 * The '<em><b>Noop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOOP_VALUE
	 * @generated
	 * @ordered
	 */
	NOOP(0, "noop", "noop"),

	/**
	 * The '<em><b>Crossproduct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSSPRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	CROSSPRODUCT(1, "crossproduct", "crossproduct"),

	/**
	 * The '<em><b>Delta Selector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELTA_SELECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DELTA_SELECTOR(2, "deltaSelector", "deltaSelector"),

	/**
	 * The '<em><b>Functor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTOR(3, "functor", "functor"),

	/**
	 * The '<em><b>Interval Selector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_SELECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	INTERVAL_SELECTOR(4, "intervalSelector", "intervalSelector"),

	/**
	 * The '<em><b>Projector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECTOR(5, "projector", "projector"),

	/**
	 * The '<em><b>Replay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	REPLAY(6, "replay", "replay"),

	/**
	 * The '<em><b>Selector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTOR(7, "selector", "selector"),

	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN(8, "join", "join");

	/**
	 * The '<em><b>Noop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Noop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOOP
	 * @model name="noop"
	 * @generated
	 * @ordered
	 */
	public static final int NOOP_VALUE = 0;

	/**
	 * The '<em><b>Crossproduct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Crossproduct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSSPRODUCT
	 * @model name="crossproduct"
	 * @generated
	 * @ordered
	 */
	public static final int CROSSPRODUCT_VALUE = 1;

	/**
	 * The '<em><b>Delta Selector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delta Selector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELTA_SELECTOR
	 * @model name="deltaSelector"
	 * @generated
	 * @ordered
	 */
	public static final int DELTA_SELECTOR_VALUE = 2;

	/**
	 * The '<em><b>Functor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTOR
	 * @model name="functor"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTOR_VALUE = 3;

	/**
	 * The '<em><b>Interval Selector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interval Selector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_SELECTOR
	 * @model name="intervalSelector"
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL_SELECTOR_VALUE = 4;

	/**
	 * The '<em><b>Projector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Projector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROJECTOR
	 * @model name="projector"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECTOR_VALUE = 5;

	/**
	 * The '<em><b>Replay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Replay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLAY
	 * @model name="replay"
	 * @generated
	 * @ordered
	 */
	public static final int REPLAY_VALUE = 6;

	/**
	 * The '<em><b>Selector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTOR
	 * @model name="selector"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTOR_VALUE = 7;

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @model name="join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_VALUE = 8;

	/**
	 * An array of all the '<em><b>Processing Element Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessingElementTypes[] VALUES_ARRAY =
		new ProcessingElementTypes[] {
			NOOP,
			CROSSPRODUCT,
			DELTA_SELECTOR,
			FUNCTOR,
			INTERVAL_SELECTOR,
			PROJECTOR,
			REPLAY,
			SELECTOR,
			JOIN,
		};

	/**
	 * An array of number of allowed inputs for '<em><b>Processing Element Types</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private static final int[] ALLOWED_INPUT_ARRAY =
		new int[] {
			1, //NOOP,
			2, //CROSSPRODUCT,
			1, //DELTA_SELECTOR,
			1, //FUNCTOR,
			1, //INTERVAL_SELECTOR,
			1, //PROJECTOR,
			1, //REPLAY,
			1, //SELECTOR,
			2, //JOIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Processing Element Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessingElementTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processing Element Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingElementTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingElementTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Element Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingElementTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingElementTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Element Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessingElementTypes get(int value) {
		switch (value) {
			case NOOP_VALUE: return NOOP;
			case CROSSPRODUCT_VALUE: return CROSSPRODUCT;
			case DELTA_SELECTOR_VALUE: return DELTA_SELECTOR;
			case FUNCTOR_VALUE: return FUNCTOR;
			case INTERVAL_SELECTOR_VALUE: return INTERVAL_SELECTOR;
			case PROJECTOR_VALUE: return PROJECTOR;
			case REPLAY_VALUE: return REPLAY;
			case SELECTOR_VALUE: return SELECTOR;
			case JOIN_VALUE: return JOIN;
		}
		return null;
	}

	public static int getAllowedInput(int value) {
		return ALLOWED_INPUT_ARRAY[value];
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProcessingElementTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProcessingElementTypes
