/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ObjectIdentifierImpl extends SimpleTypeImpl implements ObjectIdentifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.OBJECT_IDENTIFIER;
	}

	/**
	 * Write the OBJECT IDENTIFIER
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(Asn1Writer.OBJECT_IDENTIFIER);
		super.writeAsn1(indentLevel, output); // write constraints
	}

} //ObjectIdentifierImpl