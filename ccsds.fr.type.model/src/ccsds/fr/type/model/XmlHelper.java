package ccsds.fr.type.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.SimpleType;
import ccsds.fr.type.model.frtypes.SizeConstraint;
import ccsds.fr.type.model.frtypes.StructuredSizeConstrainedType;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceExternal;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.ValueRangeConstraint;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;

/**
 * Helper to write XSD 
 */
public class XmlHelper {
	
	public static final String NAMED = "Named";

	public static final String GENERAL_XSD = "frm_type_definitions.xsd";

	public static final String STRATA_TYPES_XSD = "AbstractFrStrataParameterSets.xsd";
	
	public static final String ALL_EXCEPT = "ALL EXCEPT";
	
	public static final String CLASSIFIER = "classifier";
	
	public static final String leftBracket = "<";

	public static final String rightBracket = ">";
	
	public static final String SLASH = "/";
	
	public static String NS_XSD_PREFIX = "xsd";
	
	public static final String CSSM_PREFIX = "cssm";
	
	public static final String CSSM_NS = "urn:ccsds:schema:cssm:1.0.0"; 
	
	public static final String CSSM_SCHEMA_PARAM = "SchemaCssmAbstractParameter-v1_0_0.xsd";
	
	public static final String COLON = ":";
	
	public static final String CSSM_ABSTRACT_PARAM = CSSM_PREFIX + COLON + "AbstractParameter"; 
	
	public static final String CSSM_ABSTRACT_PARAM_TYPE = CSSM_PREFIX + COLON + "AbstractParameterType"; 
	
	public static final String BLANK = " ";
	
	public static final String QUOT = "\"";
	
	public static final String EQUAL = "=";
	
	public static final String SCHEMA = "schema";
	
	public static final String SUBSTITUTION_GROUP = "substitutionGroup";
	
	public static final String XSD_NS = "http://www.w3.org/2001/XMLSchema";
	
	public static final String XMLNS = "xmlns";
	
	public static final String targetNamespace = "targetNamespace";
	
	public static final String elementFormDefault = "elementFormDefault";

	public static final String elementFormDefaultVal = "qualified";

	public static final String attributeFormDefault = "attributeFormDefault";
	
	public static final String attributeFormDefaultVal = "unqualified";
	
	public static final String nameSpace = "namespace";

	public static final String schemaLocation = "schemaLocation";
	
	public static final String version = "version";
	
	public static final String versionVal = "1.0.0";
	
	public static final String FRM_NS = "urn:ccsds:schema:frm:" + versionVal;
	
	public static final String NAME = "name";
	
	public static final String ABSTRACT = "abstract";
	
	public static final String ALL = "all";
	
	public static final String BIT_STRING = "BitString";
	
	public static final String BOOLEAN = NS_XSD_PREFIX + COLON + "boolean";
	
	public static final String CHOICE = "choice";
	
	public static final String COMMENT_START = "<!--";

	public static final String COMMENT_END = "-->";

	public static final String COMPLEX_CONTENT = "complexContent";
	
	public static final String COMPLEX_TYPE = "complexType";
	
	public static final String ATTRIBUTE = "attribute";

	public static final String BASE = "base";

	public static final String DOUBLE = NS_XSD_PREFIX + COLON + "double";	

	public static final String ELEMENT = "element";
	
	public static final String ENUMERATION = "enumeration";

	public static final String EXTENSION = "extension";
	
	public static final String FINAL = "final";

	public static final String FIXED = "fixed";
	
	public static final String HEX_BINARY = NS_XSD_PREFIX + COLON + "hexBinary";	
	
	public static final String INCLUDE = "include";
	
	public static final String IMPORT = "import";
	
	public static final String INTEGER = NS_XSD_PREFIX + COLON + "integer";

	public static final String MAX_OCCURS = "maxOccurs";
	
	public static final String MIN_INCLUSIVE = "minInclusive";
	
	public static final String MIN_OCCURS = "minOccurs";

	public static final String MIN_LENGTH = "minLength";	
	
	public static final String MAX_INCLUSIVE = "maxInclusive";	

	public static final String MAX_LENGTH = "maxLength";	
	
	public static final String NORMALIZED_STRING = NS_XSD_PREFIX + COLON + "normalizedString";
	
	public static final String OBJECT_IDENTIFIER = "ObjectIdentifier";
	
	public static final String OPTIONAL = "optional";	
	
	public static final String PATTERN = "pattern";
	
	public static final String RESTRICTION = "restriction";

	public static final String REQUIRED = "required";

	public static final String SEQUENCE = "sequence";
	
	public static final String SIMPLE_CONTENT = "simpleContent"; 
	
	public static final String SIMPLE_TYPE = "simpleType";

	public static final String STRING = NS_XSD_PREFIX + COLON + "string";

	public static final String TOKEN = NS_XSD_PREFIX + COLON + "token";
	
	public static final String TYPE = "type";
	
	public static final String USE = "use";
	
	public static final String VALUE = "value";

	/**
	 * Writes an XML start element for the given name and attributes
	 * @param output
	 * @param element
	 * @param attributes
	 */
	public static void writeStartElement(StringBuffer output, int indentLevel, String element, XmlAttribute... attributes) {
		doBreakIndent(output, indentLevel);
		output.append(leftBracket);		
		output.append(NS_XSD_PREFIX);
		output.append(COLON);
		output.append(element);
		
		if(attributes != null) {
			output.append(BLANK);
			for(XmlAttribute a : attributes) {
				if(a != null) {
					output.append(a.toString());
					output.append(BLANK);
				}
			}
			
		}
		
		output.append(rightBracket);		
	}

	/**
	 * Writes a complete XML element for the given name and attributes
	 * @param output
	 * @param element
	 * @param attributes
	 */
	public static void writeElement(StringBuffer output, int indentLevel, String element, XmlAttribute... attributes) {
		doBreakIndent(output, indentLevel);
		output.append(leftBracket);		
		output.append(NS_XSD_PREFIX);
		output.append(COLON);
		output.append(element);
		
		if(attributes != null) {
			for(XmlAttribute a : attributes) {
				output.append(BLANK);
				output.append(a.toString());
			}
			output.append(BLANK);
		}
		
		output.append(SLASH + rightBracket);
		//doBreakIndent(output, indent);
	}		
	
	/**
	 * Writes an XML end element for the given element
	 * @param output
	 * @param element
	 */
	public static void writeEndElement(StringBuffer output, int indentLevel, String element) {		
		doBreakIndent(output, indentLevel);
		output.append(leftBracket);
		output.append(SLASH);
		output.append(NS_XSD_PREFIX);
		output.append(COLON);
		output.append(element);
		output.append(rightBracket);
		//doBreakIndent(output, indent);
	}
	
	/**
	 * Check if object or it's parent is a TypeDefinition and return the type attribute or null
	 * @param object	The FRM object
	 * @return			The name of the parent as a name=... attribute or null
	 */
	public static XmlAttribute getTypeNameAttr(EObject object) {
		if (object.eContainer() instanceof TypeDefinition && 
				((TypeDefinition)object.eContainer()).getName() != null) {
			return new XmlAttribute(NAME, ((TypeDefinition)object.eContainer()).getName());
		} else if(object instanceof TypeDefinition) {
			return new XmlAttribute(NAME, ((TypeDefinition)object).getName());
		}
		
		return null;
	}
	
	/**
	 * Returns the parent name as an XML attribute extended by 'Named' or null
	 * @param object
	 * @return
	 */
	public static XmlAttribute getNamedTypeNameAttr(EObject object) {
		XmlAttribute attr = getTypeNameAttr(object);
		
		return new XmlAttribute(attr.getName(), attr.getValue() + NAMED);
	}
	
	/**
	 * Writes the comment of a TypeDefinition parent of the given object
	 * @param output		The comment is written to this output
	 * @param object		The parent of the given object is searched for the parent
	 */
	public static void writeComment(StringBuffer output, int indentLevel, EObject object) {
		if(indentLevel <= 1) { // break for top-level items		
			doBreakIndent(output, indentLevel);
		}
		String comment = null;
		
		if(object.eContainer() instanceof TypeDefinition && 
				((TypeDefinition)object.eContainer()).getComment() != null) {
			comment = ((TypeDefinition)object.eContainer()).getComment();
		}
		
		if(object.eContainer() instanceof Element && 
				((Element)object.eContainer()).getComment() != null) {
			comment = ((Element)object.eContainer()).getComment();
		}
		
		if (comment != null) {
			output.append(COMMENT_START);
			doBreakIndent(output, indentLevel);
			output.append(comment);
			doBreakIndent(output, indentLevel);
			output.append(COMMENT_END);
		}
		//doBreakIndent(output, indentLevel);
	}
	
	/**
	 * Writes the enum restrictions for the given named values
	 * @param output		The restriction 
	 * @param namedValues
	 */
	public static void writeEnumRestrictions(StringBuffer output, int indentLevel, EList<NamedValue> namedValues) {	
		//doBreakIndent(output, indentLevel+1);
		writeStartElement(output, indentLevel+1, RESTRICTION, new XmlAttribute(BASE, TOKEN));
		for(NamedValue nv : namedValues) {			
			writeElement(output, indentLevel+2, ENUMERATION, new XmlAttribute(VALUE, nv.getName()));
		}
		
		writeEndElement(output, indentLevel+1, RESTRICTION);
	}

	/**
	 * Writes the enum restrictions for the given named values
	 * @param output		The restriction 
	 * @param namedValues
	 */
	public static void writeSingleValueRestrictions(StringBuffer output, int indentLevel, String base, EList<String> values) {	
		//doBreakIndent(output, indentLevel+1);
		writeStartElement(output, indentLevel+1, RESTRICTION, new XmlAttribute(BASE, base));
		
		String pattern = new String();
		Iterator<String> iter = values.iterator();
		while(iter.hasNext()) {			
			pattern += iter.next();
			if(iter.hasNext()) {
				pattern += ExportWriter.OR_NO_BLANK;
			}
		}		
		
		writeElement(output, indentLevel, XmlHelper.PATTERN, new XmlAttribute(XmlHelper.VALUE, pattern));		
		writeEndElement(output, indentLevel+1, RESTRICTION);
	}	

	/**
	 * Writes the enum restrictions for the given named values
	 * @param output		The restriction 
	 * @param namedValues
	 */
	public static void writeRangeConstraint(StringBuffer output, int indentLevel, String base, EList<ValueRangeConstraint> ranges) {	
		//doBreakIndent(output, indentLevel+1);

		// for XSD we (can) take only one range constraint  - take the first one
		if(ranges.size() > 0) {
			ValueRangeConstraint range = ranges.get(0);
			
			writeStartElement(output, indentLevel+1, RESTRICTION, new XmlAttribute(BASE, base));				
			writeElement(output, indentLevel+2, MIN_INCLUSIVE, new XmlAttribute(VALUE, range.getMin()));
			writeElement(output, indentLevel+2, MAX_INCLUSIVE, new XmlAttribute(VALUE, range.getMax()));		
			writeEndElement(output, indentLevel+1, RESTRICTION);
		} else if(ranges.size() > 1) {
			FrTypesUtil.warn("Multiple range constraints detected: " + ranges.size());
		}
	}	
	
	/**
	 * Writes the size constraints as restrictions 
	 * @param output
	 * @param indentLevel
	 * @param base
	 * @param sizeConstraints
	 */
	public static void writeSizeConstraint(StringBuffer output, int indentLevel, String base, EList<SizeConstraint> sizeConstraints) {	
		writeStartElement(output, indentLevel+1, RESTRICTION, new XmlAttribute(BASE, base));				
		writeSizeConstraintContent(output, indentLevel, base, sizeConstraints);
		writeEndElement(output, indentLevel+1, RESTRICTION);
	}		
	
	/**
	 * Write the size constraints as minLength maxLength elements 
	 * @param output
	 * @param indentLevel
	 * @param base
	 * @param sizeConstraints
	 */
	public static void writeSizeConstraintContent(StringBuffer output, int indentLevel, String base, EList<SizeConstraint> sizeConstraints) {
		// in XSD we can only write one!
		if(sizeConstraints.size() > 0) {
			SizeConstraint sizeContraint = sizeConstraints.get(0);
			writeElement(output, indentLevel+2, MIN_LENGTH, new XmlAttribute(VALUE, new Long(sizeContraint.getMin()).toString()));
			writeElement(output, indentLevel+2, MAX_LENGTH, new XmlAttribute(VALUE, new Long(sizeContraint.getMax()).toString()));		
		} else if(sizeConstraints.size() > 1) {
			FrTypesUtil.warn("Multiple size constraints detected: " + sizeConstraints.size());
		}

	}
	
	/**
	 * Write indentation to the output
	 * @param output		The receiver of the indent
	 * @param indentLevel	The level to indent
	 */
	public static void doIndent(StringBuffer output, int indentLevel) {		
		for (int level = 0; level < indentLevel; level++) {
			output.append(ExportWriter.BLANK);
		}		
	}
	
	/**
	 * Write line break and indentation to the output
	 * @param output		The receiver of the indent
	 * @param indentLevel	The level to indent
	 */
	public static void doBreakIndent(StringBuffer output, int indentLevel) {
		output.append(System.lineSeparator());
		doIndent(output, indentLevel);
	}
	
	/**
	 * Creates an XSD attribute specification for the given argument name, type, use
	 * @param output
	 * @param indentLevel
	 * @param name
	 * @param type
	 * @param use
	 */
	public static void writeAttributeSpec(StringBuffer output, int indentLevel, String name, String type, String use) {
		writeElement(output, indentLevel, XmlHelper.ATTRIBUTE, 
				new XmlAttribute(XmlHelper.NAME, name),
				new XmlAttribute(XmlHelper.TYPE, type),
				new XmlAttribute(XmlHelper.USE, use));
	}

	/**
	 * Writes the attribute element specification as a non-empty <attribute>
	 * @param output
	 * @param indentLevel
	 * @param name
	 * @param use
	 */
	public static void writeAttributeStart(StringBuffer output, int indentLevel, String name, String use) {
		writeStartElement(output, indentLevel, ATTRIBUTE, new XmlAttribute(NAME, name), new XmlAttribute(USE, use));
	}

	/**
	 * Write the attribute end element </attribute>
	 * @param output
	 * @param indentLevel
	 */
	public static void writeAttributeEnd(StringBuffer output, int indentLevel) {
		writeEndElement(output, indentLevel, ATTRIBUTE);
	}
	
	
	/**
	 * Creates a fixed attribute specification of type xsd:string for the given fixed value.
	 * @param output
	 * @param indentLevel
	 * @param name
	 * @param fixedValue
	 */
	public static void writeFixedStringAttributeSpec(StringBuffer output, int indentLevel, String name, String fixedValue) {
		writeElement(output, indentLevel, XmlHelper.ATTRIBUTE, 
				new XmlAttribute(XmlHelper.NAME, name),
				new XmlAttribute(XmlHelper.TYPE, XmlHelper.STRING),
				new XmlAttribute(XmlHelper.FIXED, fixedValue));
	}
	
	
	/**
	 * Convenience function to write the OID value as an attribute definition
	 * @param output
	 * @param indentLevel
	 * @param oid
	 */
	public static void writeOidAttribute(StringBuffer output, int indentLevel, ObjectIdentifier oid) {
		if(oid != null) {
			oid.writeXsd(indentLevel, output, oid);
		}
	}
	
	/**
	 * Writes a complex type with elements below
	 * @param indentLevel
	 * @param output
	 * @param typeName		The type name to write (sequence, choice, all)
	 * @param object		The object to which the type shall correspond
	 * @param elements		The child elements of the given object
	 * @param oid			The oid to which this object corresponds or null for pure type definitions
	 */
	public static void writeStructuredDifferentType(int indentLevel, StringBuffer output, String typeName, EObject object, EList<Type> elements, ObjectIdentifier oid) {
		XmlHelper.writeComment(output, indentLevel, object);

		StringBuffer typeOutput = new StringBuffer();
		int typeIndent = indentLevel;
			
		if(oid != null) {
			typeIndent++;			
		}

		XmlHelper.writeStartElement(typeOutput, typeIndent+1, typeName);
		int idx = 0;
		for(Type t : elements) {
			if(t instanceof Element) {
				t.writeXsd(typeIndent+2, typeOutput, null);
			} else { // we have to include an artifical element for XSD
				XmlHelper.writeStartElement(typeOutput, indentLevel, XmlHelper.ELEMENT, new XmlAttribute(XmlHelper.NAME, Integer.toString(idx)));
				t.writeXsd(typeIndent+2, typeOutput, null);
				XmlHelper.writeEndElement(typeOutput, indentLevel, XmlHelper.ELEMENT);
				idx++;
			}
		}
		XmlHelper.writeEndElement(typeOutput, typeIndent+1, typeName);
		
		if(oid != null) {		
			writeComplexNamedType(indentLevel, output, getNamedTypeNameAttr(object), getTypeNameAttr(object), oid, object);
		}
		
		XmlHelper.doBreakIndent(output, indentLevel);
		XmlHelper.writeStartElement(output, typeIndent, XmlHelper.COMPLEX_TYPE, XmlHelper.getTypeNameAttr(object));
		output.append(typeOutput);
		XmlHelper.writeEndElement(output, typeIndent+1, XmlHelper.COMPLEX_TYPE);
		
	}

	/**
	 * Writes a complex type with elements below
	 * @param indentLevel
	 * @param output
	 * @param typeName		The type name to write (sequence, choice, all)
	 * @param object		The object to which the type shall correspond
	 * @param elements		The child elements of the given object
	 * @param oid			The oid to which this object corresponds or null for pure type definitions
	 */
	public static void writeStructuredSameType(int indentLevel, StringBuffer output, StructuredSizeConstrainedType object, Type type, ObjectIdentifier oid) {
		XmlHelper.writeComment(output, indentLevel, object);

		StringBuffer typeOutput = new StringBuffer();
		int typeIndent = indentLevel;
			
		if(oid != null) {
			typeIndent++;			
		}

		List<XmlAttribute> attributes = new LinkedList<XmlAttribute>();
		if(object.getSizeConstraint() != null && object.getSizeConstraint().size() > 0) {
			// we can only write one size constraint
			attributes.add(new XmlAttribute(MIN_OCCURS, Long.toString(object.getSizeConstraint().get(0).getMin())));
			attributes.add(new XmlAttribute(MAX_OCCURS, Long.toString(object.getSizeConstraint().get(0).getMax())));
		}
		
		XmlHelper.writeStartElement(typeOutput, typeIndent+1, SEQUENCE, attributes.toArray(new XmlAttribute[0]));
		if(type instanceof Element) {			
			type.writeXsd(typeIndent+2, typeOutput, null);			
		} else {
			XmlHelper.writeStartElement(typeOutput, indentLevel+2, XmlHelper.ELEMENT, new XmlAttribute(XmlHelper.NAME, "element"));
			type.writeXsd(typeIndent+3, typeOutput, null);
			XmlHelper.writeEndElement(typeOutput, indentLevel+2, XmlHelper.ELEMENT);
		}
		XmlHelper.writeEndElement(typeOutput, typeIndent+1, SEQUENCE);
		
		if(oid != null) {
			writeComplexNamedType(indentLevel, output, getNamedTypeNameAttr(object), getTypeNameAttr(object), oid, object);
		}
		
		XmlHelper.doBreakIndent(output, indentLevel);
		XmlHelper.writeStartElement(output, typeIndent, XmlHelper.COMPLEX_TYPE, XmlHelper.getTypeNameAttr(object));
		output.append(typeOutput);
		XmlHelper.writeEndElement(output, typeIndent+1, XmlHelper.COMPLEX_TYPE);
	}	
	
	/**
	 * Returns true if the type, or the referenced type is a simple type.
	 * The check for local type references is recursive, i.e. follows
	 * the potentially cascaded local type references 
	 * @param t
	 * @return true for simple types
	 */
	public static final boolean isSimpleType(Type t) {
		if(t instanceof SimpleType) {
			return true;
		}
		
		if(t instanceof TypeReferenceLocal) {
			try {
				return isSimpleType(((TypeReferenceLocal)t).getTypeDefinition().getType());
			} catch(Exception e) {
				return false;
			}
		}
		
		if(t instanceof TypeReferenceExternal && ((TypeReferenceExternal)t).isComplexType() == false) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Writes a named type specification with a value attribute for a simple type 
	 * @param indentLevel	Indent level
	 * @param output		The output written to this string buffer
	 * @param namedType		The name attribute of the generated complex type and the fixed classifier attribute
	 * @param typeName		The type of the generated value attribute 
	 * @param oid			The oid is used to construct a fixed iod attribute with the stringified OID
	 */
	public static void writeSimpleNamedType(int indentLevel, StringBuffer output, XmlAttribute namedType, XmlAttribute typeName, ObjectIdentifier oid, EObject object) {
//		XmlHelper.writeElement(output, indentLevel, XmlHelper.ELEMENT, 
//				new XmlAttribute(XmlHelper.NAME, firstCharLowerCase(namedType.getValue())),
//				new XmlAttribute(XmlHelper.TYPE, namedType.getValue()),
//				new XmlAttribute(XmlHelper.SUBSTITUTION_GROUP, getFrBaseElement(ExportWriterContext.instance().getCurrentBaseType())));
		
		XmlHelper.writeStartElement(output, indentLevel, XmlHelper.COMPLEX_TYPE, namedType);
		
		XmlHelper.writeStartElement(output, indentLevel+1, XmlHelper.COMPLEX_CONTENT);
		//XmlHelper.writeStartElement(output, indentLevel+2, XmlHelper.EXTENSION, new XmlAttribute(XmlHelper.BASE, XmlHelper.CSSM_ABSTRACT_PARAM_TYPE));
		XmlHelper.writeStartElement(output, indentLevel+2, XmlHelper.EXTENSION, 
				new XmlAttribute(XmlHelper.BASE, ExportWriterContext.instance().getCurrentBaseType()));
		
		XmlHelper.writeAttributeSpec(output, indentLevel+3, XmlHelper.VALUE, typeName.getValue(), XmlHelper.REQUIRED);
		XmlHelper.writeFixedStringAttributeSpec(output, indentLevel+3, XmlHelper.CLASSIFIER, typeName.getValue());
		XmlHelper.writeOidAttribute(output, indentLevel+3, oid);

		XmlHelper.writeEndElement(output, indentLevel+2, XmlHelper.EXTENSION);
		XmlHelper.writeEndElement(output, indentLevel+1, XmlHelper.COMPLEX_CONTENT);
		
		XmlHelper.writeEndElement(output, indentLevel, XmlHelper.COMPLEX_TYPE);		
	}
	
	/**
	 * Writes a named type specification with for a complex type    
	 * @param indentLevel	Indent level
	 * @param output		The output written to this string buffer
	 * @param namedType		The name attribute of the generated complex type and the fixed classifier attribute
	 * @param typeName		The type of the generated extension element 
	 * @param oid			The oid is used to construct a fixed iod attribute with the stringified OID
	 */
	public static void writeComplexNamedType(int indentLevel, StringBuffer output, XmlAttribute namedType, XmlAttribute typeName, ObjectIdentifier oid, EObject object) {
//		XmlHelper.writeElement(output, indentLevel, XmlHelper.ELEMENT, 
//				new XmlAttribute(XmlHelper.NAME, firstCharLowerCase(namedType.getValue())),
//				new XmlAttribute(XmlHelper.TYPE, namedType.getValue()),
//				new XmlAttribute(XmlHelper.SUBSTITUTION_GROUP, getFrBaseElement(ExportWriterContext.instance().getCurrentStratumElement())));
		
		XmlHelper.writeStartElement(output, indentLevel, XmlHelper.COMPLEX_TYPE, namedType);
		XmlHelper.writeStartElement(output, indentLevel+1, XmlHelper.COMPLEX_CONTENT);
		//XmlHelper.writeStartElement(output, indentLevel+2, XmlHelper.EXTENSION, new XmlAttribute(XmlHelper.BASE, XmlHelper.CSSM_ABSTRACT_PARAM_TYPE));
		XmlHelper.writeStartElement(output, indentLevel+2, XmlHelper.EXTENSION, 
				new XmlAttribute(XmlHelper.BASE, ExportWriterContext.instance().getCurrentBaseType()));
		
		XmlHelper.writeStartElement(output, indentLevel+3, XmlHelper.SEQUENCE);
		XmlHelper.writeElement(output, indentLevel+3, XmlHelper.ELEMENT, 
				new XmlAttribute(XmlHelper.NAME, typeName.getValue()),
				new XmlAttribute(XmlHelper.TYPE, typeName.getValue()));
		XmlHelper.writeEndElement(output, indentLevel+3, XmlHelper.SEQUENCE);
		
		XmlHelper.writeOidAttribute(output, indentLevel+3, oid);
		XmlHelper.writeFixedStringAttributeSpec(output, indentLevel+3, XmlHelper.CLASSIFIER, typeName.getValue());
		XmlHelper.writeEndElement(output, indentLevel+2, XmlHelper.EXTENSION);
		XmlHelper.writeEndElement(output, indentLevel+1, XmlHelper.COMPLEX_CONTENT);
		XmlHelper.writeEndElement(output, indentLevel, XmlHelper.COMPLEX_TYPE);
	}	
	
	/**
	 * Makes the first cha lowercase
	 * @param s
	 * @return
	 */
	public static String firstCharLowerCase(String s) {
		if(s != null && s.length() > 0 && Character.isUpperCase(s.charAt(0))) {
			StringBuffer l = new StringBuffer(s);
			l.setCharAt(0, Character.toLowerCase(s.charAt(0)));
			
			return l.toString();
		}
		
		return s;
	}
	
	/**
	 * Returns the XSD type name for the given classifier
	 * @param frClassifier	
	 * @return	The XSD FR type name
	 */
	public static String getFrBaseType(String frClassifier) {
		return frClassifier + "Type";
	}

	/**
	 * Returns the XSD type name for the given startum
	 * @param stratumName	
	 * @return	The XSD FR type name
	 */
	public static String getFrStratumType(String stratumName) {
		return XmlHelper.removeBlanks(stratumName + "StratumType");
	}
	
	
	/**
	 * Returns the XSD element name for the given classifier
	 * @param frClassifier	
	 * @return	The XSD FR element name
	 */
	public static String getFrBaseElement(String frClassifier) {
		return frClassifier + "Element";
	}
	
	/**
	 * Removes blanks from the given string
	 * @param s
	 * @return The string without blanks
	 */
	public static String removeBlanks(String s) {
		if(s != null) {
			return s.replace(" ", "");
		}
		
		return s;
	}

	/**
	 * Construct an element name for the given stratum.
	 * Example: apertureStratumParameters for Aperture
	 * @param stratumName
	 * @return
	 */
	public static String getFrStratumElementName(String stratumName) {
		return removeBlanks(firstCharLowerCase(stratumName + "StratumParameters"));
	}
}
