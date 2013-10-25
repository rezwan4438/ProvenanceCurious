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
 * A representation of the literals of the enumeration '<em><b>Source Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SensorDataWebGui.SensorDataWebGuiPackage#getSourceTypes()
 * @model
 * @generated
 */
public enum SourceTypes implements Enumerator {
	/**
	 * The '<em><b>Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY(0, "memory", "memory"),

	/**
	 * The '<em><b>Gsn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GSN_VALUE
	 * @generated
	 * @ordered
	 */
	GSN(1, "gsn", "gsn"),

	/**
	 * The '<em><b>Bt Inquery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BT_INQUERY_VALUE
	 * @generated
	 * @ordered
	 */
	BT_INQUERY(2, "btInquery", "btInquery"),

	/**
	 * The '<em><b>Itoo Hammer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITOO_HAMMER_VALUE
	 * @generated
	 * @ordered
	 */
	ITOO_HAMMER(3, "itooHammer", "itooHammer"),

	/**
	 * The '<em><b>Freehand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEHAND_VALUE
	 * @generated
	 * @ordered
	 */
	FREEHAND(4, "freehand", "freehand"),

	/**
	 * The '<em><b>Sparql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARQL_VALUE
	 * @generated
	 * @ordered
	 */
	SPARQL(5, "sparql", "sparql");

	/**
	 * The '<em><b>Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY
	 * @model name="memory"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VALUE = 0;

	/**
	 * The '<em><b>Gsn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gsn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GSN
	 * @model name="gsn"
	 * @generated
	 * @ordered
	 */
	public static final int GSN_VALUE = 1;

	/**
	 * The '<em><b>Bt Inquery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bt Inquery</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BT_INQUERY
	 * @model name="btInquery"
	 * @generated
	 * @ordered
	 */
	public static final int BT_INQUERY_VALUE = 2;

	/**
	 * The '<em><b>Itoo Hammer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Itoo Hammer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITOO_HAMMER
	 * @model name="itooHammer"
	 * @generated
	 * @ordered
	 */
	public static final int ITOO_HAMMER_VALUE = 3;

	/**
	 * The '<em><b>Freehand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Freehand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREEHAND
	 * @model name="freehand"
	 * @generated
	 * @ordered
	 */
	public static final int FREEHAND_VALUE = 4;

	/**
	 * The '<em><b>Sparql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sparql</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPARQL
	 * @model name="sparql"
	 * @generated
	 * @ordered
	 */
	public static final int SPARQL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Source Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceTypes[] VALUES_ARRAY =
		new SourceTypes[] {
			MEMORY,
			GSN,
			BT_INQUERY,
			ITOO_HAMMER,
			FREEHAND,
			SPARQL,
		};

	/**
	 * A public read-only list of all the '<em><b>Source Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SourceTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Source Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceTypes get(int value) {
		switch (value) {
			case MEMORY_VALUE: return MEMORY;
			case GSN_VALUE: return GSN;
			case BT_INQUERY_VALUE: return BT_INQUERY;
			case ITOO_HAMMER_VALUE: return ITOO_HAMMER;
			case FREEHAND_VALUE: return FREEHAND;
			case SPARQL_VALUE: return SPARQL;
		}
		return null;
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
	private SourceTypes(int value, String name, String literal) {
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
	
} //SourceTypes
