/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.Set;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SetImpl extends StructuredDifferentTypeImpl implements Set {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.SET;
	}

	/**
	 * Write the SET
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(ExportWriter.SET);
		super.writeAsn1(indentLevel, output);
	}

	/**
	 * Write the  sequence to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid) {
		XmlHelper.writeStructuredDifferentType(indentLevel, output, XmlHelper.ALL, this, getElements(), oid);
	}
} //SetImpl
