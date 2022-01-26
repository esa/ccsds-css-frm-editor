/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.ExportWriterContext;
import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.SequenceOf;
import ccsds.fr.type.model.frtypes.SetOf;
import ccsds.fr.type.model.frtypes.StructuredType;
import ccsds.fr.type.model.frtypes.Type;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;

import java.lang.Boolean;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ElementImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.ElementImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends TypeImpl implements Element {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FrtypesPackage.ELEMENT__TYPE,
					oldType, newType);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.ELEMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FrtypesPackage.ELEMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.ELEMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.ELEMENT__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.ELEMENT__OPTIONAL, oldOptional,
					optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.ELEMENT__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrtypesPackage.ELEMENT__TYPE:
			return basicSetType(null, msgs);
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
		case FrtypesPackage.ELEMENT__NAME:
			return getName();
		case FrtypesPackage.ELEMENT__TYPE:
			return getType();
		case FrtypesPackage.ELEMENT__TAG:
			return getTag();
		case FrtypesPackage.ELEMENT__OPTIONAL:
			return isOptional();
		case FrtypesPackage.ELEMENT__COMMENT:
			return getComment();
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
		case FrtypesPackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case FrtypesPackage.ELEMENT__TYPE:
			setType((Type) newValue);
			return;
		case FrtypesPackage.ELEMENT__TAG:
			setTag((String) newValue);
			return;
		case FrtypesPackage.ELEMENT__OPTIONAL:
			setOptional((Boolean) newValue);
			return;
		case FrtypesPackage.ELEMENT__COMMENT:
			setComment((String) newValue);
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
		case FrtypesPackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FrtypesPackage.ELEMENT__TYPE:
			setType((Type) null);
			return;
		case FrtypesPackage.ELEMENT__TAG:
			setTag(TAG_EDEFAULT);
			return;
		case FrtypesPackage.ELEMENT__OPTIONAL:
			setOptional(OPTIONAL_EDEFAULT);
			return;
		case FrtypesPackage.ELEMENT__COMMENT:
			setComment(COMMENT_EDEFAULT);
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
		case FrtypesPackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FrtypesPackage.ELEMENT__TYPE:
			return type != null;
		case FrtypesPackage.ELEMENT__TAG:
			return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
		case FrtypesPackage.ELEMENT__OPTIONAL:
			return optional != OPTIONAL_EDEFAULT;
		case FrtypesPackage.ELEMENT__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", tag: ");
		result.append(tag);
		result.append(", optional: ");
		result.append(optional);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

	/**
	 * Returns true if element name generation should be suppressed.
	 * this is a workaround addressing limitaiton of jASN.1 (up to at least 11.2):
	 * Elements of SET OF / SEQUENCE OF cannot have a name and a following type definition. 
	 * @return true if the element name should be suppressed
	 */
	private boolean suppressElementName() {
		try {
			if ((eContainer() instanceof SetOf || eContainer() instanceof SequenceOf) && getType() != null) {
				FrTypesUtil.log("ASN.1 generation: Suppress element name generation for " + getName() + " below "
						+ eContainer().eClass().getName());
				return true;
			}
		} catch (Exception e) {
			// OK
		}

		return false;
	}

	/**
	 * Write the component of a structured type
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		if (this.comment != null && this.comment.length() > 0) {
			output.append(System.lineSeparator());
			indent(indentLevel, output);
			output.append(FrTypesUtil.createAsnComment(this.comment, indentLevel) + System.lineSeparator());
			//indent(indentLevel, output);
		}

		super.writeAsn1(indentLevel, output);

		indent(indentLevel, output);

		if (this.getName() != null && suppressElementName() == false) {
			String validName = FrTypesUtil.getValidElementName(getName(),
					ExportWriterContext.instance().getGenerating());
			if (validName.equals(getName()) == false) {
				ExportWriterContext.instance().updateElementName(this, validName);
			}

			output.append(String.format("%1$-30s", validName));
		} else if (suppressElementName() == false) {
			output.append("name not set for element");
		}

		if (getTag() != null) {
			output.append(ExportWriter.INDENT + ExportWriter.LBRACKET + getTag() + ExportWriter.RBRACKET
					+ ExportWriter.INDENT);
		}

		if (getType() != null) {
			output.append(ExportWriter.INDENT);
			getType().writeAsn1(indentLevel, output);
		} else if (getName() != null) {
			output.append("error no-type-set-for-component-" + getName());
		} else {
			output.append("error no-type-set-for-component");
		}

		if (this.optional == true) {
			// if there is e.g. a SEQUENCE spanning over several lines, we want the OPTIONAL following: } OPTIONAL 
			if(output.lastIndexOf(System.lineSeparator()) == (output.length() - System.lineSeparator().length())) {
				output.delete(output.length() - System.lineSeparator().length(), output.length());				
			}
			output.append(ExportWriter.BLANK + ExportWriter.OPTIONAL);			
		}
	}

	/**
	 * Write the  sequence to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {
		StringBuffer typeOutput = new StringBuffer();
		int typeIndent = indentLevel + 1;

		XmlHelper.writeComment(output, indentLevel, this);

		List<XmlAttribute> attributes = new LinkedList<XmlAttribute>();
		attributes.add(new XmlAttribute(XmlHelper.NAME, getName()));
		if (this.optional == true) {
			attributes.add(new XmlAttribute(XmlHelper.MIN_OCCURS, Integer.toString(0)));
		}

		try {
			if (getType() instanceof TypeReferenceLocal) {
				TypeReferenceLocal tr = (TypeReferenceLocal) getType();
				if (XmlHelper.isSimpleType(tr.getTypeDefinition().getType())) {
					XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE);
					XmlHelper.writeAttributeSpec(typeOutput, typeIndent + 1, XmlHelper.VALUE,
							tr.getTypeDefinition().getName(), XmlHelper.REQUIRED);
					XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE);
				} else if (tr.getTypeDefinition().getType() instanceof StructuredType) {
					attributes.add(new XmlAttribute(XmlHelper.TYPE, tr.getTypeDefinition().getName()));
				}
			} else if (XmlHelper.isSimpleType(getType())) {
				XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE);
				XmlHelper.writeAttributeStart(typeOutput, typeIndent + 1, XmlHelper.VALUE, XmlHelper.REQUIRED);
				getType().writeXsd(typeIndent + 2, typeOutput, null, properties);
				XmlHelper.writeAttributeEnd(typeOutput, typeIndent + 1);
				XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE);
			} else if (getType() instanceof StructuredType) {
				getType().writeXsd(indentLevel, typeOutput, null, properties);
			}
		} catch (Exception e) {
			FrTypesUtil.warn("Failed to construct type from local type referecen for element " + getName() + ": " + e);
			e.printStackTrace();
		}

		XmlHelper.writeStartElement(output, indentLevel, XmlHelper.ELEMENT, attributes.toArray(new XmlAttribute[0]));
		if (typeOutput != null) {
			output.append(typeOutput);
		}
		XmlHelper.writeEndElement(output, indentLevel, XmlHelper.ELEMENT);

	}

} //ElementImpl
