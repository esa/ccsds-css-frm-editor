/**
 */
package ccsds.fr.type.model.frtypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asn1 Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ccsds.fr.type.model.frtypes.FrtypesPackage#getAsn1Writer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Asn1Writer extends EObject {

	/**
	 * @generated NOT
	 */
	public static final String BEGIN = "BEGIN";

	/**
	 * @generated NOT
	 */
	public static final String END = "END";

	/**
	 * @generated NOT
	 */
	public static final String DEFINITIONS = "DEFINITIONS";

	/**
	 * @generated NOT
	 */
	public static final String EXPORTS = "EXPORTS";

	/**
	 * @generated NOT
	 */
	public static final String IMPORTS = "IMPORTS";

	/**
	 * @generated NOT
	 */
	public static final String LCBRACE = "{";

	/**
	 * @generated NOT
	 */
	public static final String RCBRACE = "}";

	/**
	 * @generated NOT
	 */
	public static final String ASSIGN = "::=";

	/**
	 * @generated NOT
	 */
	public static final String TAG_BEGIN = "[";

	/**
	 * @generated NOT
	 */
	public static final String TAG_END = "]";

	/**
	 * @generated NOT
	 */
	public static final String LPAREN = "(";

	/**
	 * @generated NOT
	 */
	public static final String RPAREN = ")";

	/**
	 * @generated NOT
	 */
	public static final String LBRACKET = "[";

	/**
	 * @generated NOT
	 */
	public static final String RBRACKET = "]";
	
	
	/**
	 * @generated NOT
	 */
	public static final String SEP = ",";

	/**
	 * @generated NOT
	 */
	public static final String SEMI_COLON = ";";
	
	/**
	 * @generated NOT
	 */
	public static final String DELIM = ";";

	/**
	 * @generated NOT
	 */
	public static final String OR = " | ";

	/**
	 * @generated NOT
	 */
	public static final String AND = " ^ ";

	/**
	 * @generated NOT
	 */
	public static final String UNTIL = " .. ";

	/**
	 * @generated NOT
	 */
	public static final String OPTIONAL = "OPTIONAL";

	/**
	 * @generated NOT
	 */
	public static final String IMPLICIT = "IMPLICIT";	

	/**
	 * @generated NOT
	 */
	public static final String TAGS = "TAGS";	
	
	/**
	 * @generated NOT
	 */
	public static final String SIZE = "SIZE";

	/**
	 * @generated NOT
	 */
	public static final String FROM = "FROM";

	/**
	 * @generated NOT
	 */
	public static final String COMMENT = "--";

	/**
	 * @generated NOT
	 */
	public static final String INDENT = "\t ";

	/**
	 * @generated NOT
	 */
	public static final String BLANK = " ";

	/**
	 * @generated NOT
	 */
	public static final String NULL = "NULL";

	/**
	 * @generated NOT
	 */
	public static final String BOOLEAN = "BOOLEAN";

	/**
	 * @generated NOT
	 */
	public static final String OBJECT_IDENTIFIER = "OBJECT IDENTIFIER";

	/**
	 * @generated NOT
	 */
	public static final String REAL = "REAL";

	/**
	 * @generated NOT
	 */
	public static final String INTEGER = "INTEGER";

	/**
	 * @generated NOT
	 */
	public static final String ENUMERATED = "ENUMERATED";

	/**
	 * @generated NOT
	 */
	public static final String BIT_STRING = "BIT STRING";

	/**
	 * @generated NOT
	 */
	public static final String OCTET_STRING = "OCTET STRING";

	/**
	 * @generated NOT
	 */
	public static final String CHARACTER_STRING = "CHARACTER STRING";

	/**
	 * @generated NOT
	 */
	public static final String SEQUENCE = "SEQUENCE";

	/**
	 * @generated NOT
	 */
	public static final String OF = "OF";

	/**
	 * @generated NOT
	 */
	public static final String SET = "SET";

	/**
	 * @generated NOT
	 */
	public static final String CHOICE = "CHOICE";

	/**
	 * Returns a string for the given indentation level
	 * @generated NOT 
	 */
	public default String getIndent(int indentLevel) {
		String indent = "";
		for (int level = 0; level < indentLevel; level++) {
			indent += INDENT;
		}
		return indent;
	}

	/**
	 * Adds the indentation required for the given level to the output
	 * @generated NOT 
	 */
	public default void indent(int indentLevel, StringBuffer output) {
		if (getIndent(indentLevel).length() > 0) {
			output.append(getIndent(indentLevel));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model outputDataType="ccsds.fr.type.model.frtypes.StringBuffer"
	 * @generated
	 */
	void writeAsn1(int indentLevel, StringBuffer output);

} // Asn1Writer
