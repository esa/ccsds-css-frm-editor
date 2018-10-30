/**
 */
package ccsds.fr.type.model.frtypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>String Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getStringType()
 * @model
 * @generated
 */
public enum StringType implements Enumerator {
	/**
	 * The '<em><b>BMP String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMP_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	BMP_STRING(0, "BMPString", "BMPString"),

	/**
	 * The '<em><b>IA5 String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IA5_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	IA5_STRING(1, "IA5String", "IA5String"),

	/**
	 * The '<em><b>General String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_STRING(2, "GeneralString", "GeneralString"),

	/**
	 * The '<em><b>Graphic String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHIC_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHIC_STRING(3, "GraphicString", "GraphicString"),

	/**
	 * The '<em><b>Numeric String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC_STRING(4, "NumericString", "NumericString"),

	/**
	 * The '<em><b>Printable String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINTABLE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	PRINTABLE_STRING(5, "PrintableString", "PrintableString"),

	/**
	 * The '<em><b>Teletex String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TELETEX_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	TELETEX_STRING(6, "TeletexString", "TeletexString"),

	/**
	 * The '<em><b>Univarsal String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVARSAL_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	UNIVARSAL_STRING(7, "UnivarsalString", "UnivarsalString"),

	/**
	 * The '<em><b>UTF8 String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF8_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	UTF8_STRING(8, "UTF8String", "UTF8String"),

	/**
	 * The '<em><b>Videotex String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEOTEX_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEOTEX_STRING(9, "VideotexString", "VideotexString"),

	/**
	 * The '<em><b>Visible String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISIBLE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	VISIBLE_STRING(10, "VisibleString", "VisibleString");

	/**
	 * The '<em><b>BMP String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BMP String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BMP_STRING
	 * @model name="BMPString"
	 * @generated
	 * @ordered
	 */
	public static final int BMP_STRING_VALUE = 0;

	/**
	 * The '<em><b>IA5 String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IA5 String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IA5_STRING
	 * @model name="IA5String"
	 * @generated
	 * @ordered
	 */
	public static final int IA5_STRING_VALUE = 1;

	/**
	 * The '<em><b>General String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_STRING
	 * @model name="GeneralString"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_STRING_VALUE = 2;

	/**
	 * The '<em><b>Graphic String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Graphic String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAPHIC_STRING
	 * @model name="GraphicString"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHIC_STRING_VALUE = 3;

	/**
	 * The '<em><b>Numeric String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeric String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_STRING
	 * @model name="NumericString"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_STRING_VALUE = 4;

	/**
	 * The '<em><b>Printable String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Printable String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINTABLE_STRING
	 * @model name="PrintableString"
	 * @generated
	 * @ordered
	 */
	public static final int PRINTABLE_STRING_VALUE = 5;

	/**
	 * The '<em><b>Teletex String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Teletex String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TELETEX_STRING
	 * @model name="TeletexString"
	 * @generated
	 * @ordered
	 */
	public static final int TELETEX_STRING_VALUE = 6;

	/**
	 * The '<em><b>Univarsal String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Univarsal String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIVARSAL_STRING
	 * @model name="UnivarsalString"
	 * @generated
	 * @ordered
	 */
	public static final int UNIVARSAL_STRING_VALUE = 7;

	/**
	 * The '<em><b>UTF8 String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF8 String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF8_STRING
	 * @model name="UTF8String"
	 * @generated
	 * @ordered
	 */
	public static final int UTF8_STRING_VALUE = 8;

	/**
	 * The '<em><b>Videotex String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Videotex String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIDEOTEX_STRING
	 * @model name="VideotexString"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEOTEX_STRING_VALUE = 9;

	/**
	 * The '<em><b>Visible String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Visible String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISIBLE_STRING
	 * @model name="VisibleString"
	 * @generated
	 * @ordered
	 */
	public static final int VISIBLE_STRING_VALUE = 10;

	/**
	 * An array of all the '<em><b>String Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StringType[] VALUES_ARRAY = new StringType[] { BMP_STRING, IA5_STRING, GENERAL_STRING,
			GRAPHIC_STRING, NUMERIC_STRING, PRINTABLE_STRING, TELETEX_STRING, UNIVARSAL_STRING, UTF8_STRING,
			VIDEOTEX_STRING, VISIBLE_STRING, };

	/**
	 * A public read-only list of all the '<em><b>String Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StringType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>String Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringType get(int value) {
		switch (value) {
		case BMP_STRING_VALUE:
			return BMP_STRING;
		case IA5_STRING_VALUE:
			return IA5_STRING;
		case GENERAL_STRING_VALUE:
			return GENERAL_STRING;
		case GRAPHIC_STRING_VALUE:
			return GRAPHIC_STRING;
		case NUMERIC_STRING_VALUE:
			return NUMERIC_STRING;
		case PRINTABLE_STRING_VALUE:
			return PRINTABLE_STRING;
		case TELETEX_STRING_VALUE:
			return TELETEX_STRING;
		case UNIVARSAL_STRING_VALUE:
			return UNIVARSAL_STRING;
		case UTF8_STRING_VALUE:
			return UTF8_STRING;
		case VIDEOTEX_STRING_VALUE:
			return VIDEOTEX_STRING;
		case VISIBLE_STRING_VALUE:
			return VISIBLE_STRING;
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
	private StringType(int value, String name, String literal) {
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

} //StringType
