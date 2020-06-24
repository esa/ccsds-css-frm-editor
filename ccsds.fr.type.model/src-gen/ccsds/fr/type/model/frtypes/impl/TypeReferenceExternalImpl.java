/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.TypeReferenceExternal;
import java.lang.Boolean;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference External</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.TypeReferenceExternalImpl#getName <em>Name</em>}</li>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.TypeReferenceExternalImpl#isComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeReferenceExternalImpl extends TypeImpl implements TypeReferenceExternal {
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
	 * The default value of the '{@link #isComplexType() <em>Complex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplexType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLEX_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComplexType() <em>Complex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplexType()
	 * @generated
	 * @ordered
	 */
	protected boolean complexType = COMPLEX_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceExternalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.TYPE_REFERENCE_EXTERNAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.TYPE_REFERENCE_EXTERNAL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplexType() {
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexType(boolean newComplexType) {
		boolean oldComplexType = complexType;
		complexType = newComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE,
					oldComplexType, complexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__NAME:
			return getName();
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE:
			return isComplexType();
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
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__NAME:
			setName((String) newValue);
			return;
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE:
			setComplexType((Boolean) newValue);
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
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE:
			setComplexType(COMPLEX_TYPE_EDEFAULT);
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
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FrtypesPackage.TYPE_REFERENCE_EXTERNAL__COMPLEX_TYPE:
			return complexType != COMPLEX_TYPE_EDEFAULT;
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
		result.append(", complexType: ");
		result.append(complexType);
		result.append(')');
		return result.toString();
	}

	/**
	 * Write the type reference
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {

		if (getName() != null) {
			output.append(getName());
		} else {
			output.append("external type reference: name not set");
		}
	}

	/**
	 * Write the  external type reference to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		// we do not know if a complex or a simple type?! for the moment go for a complex type
		XmlHelper.writeComment(output, indentLevel, this);

		int typeIndent = indentLevel;
		StringBuffer typeOutput = new StringBuffer();

		if(isComplexType() == true) {
			XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE, XmlHelper.getTypeNameAttr(this));
			XmlHelper.writeElement(typeOutput, indentLevel, XmlHelper.EXTENSION,
					new XmlAttribute(XmlHelper.BASE, getName()));
			XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE);
	
			if (oid != null) {
				XmlHelper.writeComplexNamedType(indentLevel, output, XmlHelper.getNamedTypeNameAttr(this),
						XmlHelper.getTypeNameAttr(this), oid, this);
			}
		} else {
			XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE, XmlHelper.getTypeNameAttr(this));
			XmlHelper.writeElement(typeOutput, indentLevel, XmlHelper.RESTRICTION,
					new XmlAttribute(XmlHelper.BASE, getName()));
			XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE);
	
			if (oid != null) {
				XmlHelper.writeSimpleNamedType(indentLevel, output, XmlHelper.getNamedTypeNameAttr(this),
						XmlHelper.getTypeNameAttr(this), oid, this);
			}		
		}
		output.append(typeOutput);
	}

} //TypeReferenceExternalImpl
