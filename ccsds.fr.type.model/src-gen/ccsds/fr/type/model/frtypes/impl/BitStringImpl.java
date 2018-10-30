/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.BitString;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit String</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BitStringImpl extends SimpleSizeConstrainedTypeImpl implements BitString {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.BIT_STRING;
	}

	/**
	 * Write the BIT STRING
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(Asn1Writer.BIT_STRING);
		super.writeAsn1(indentLevel, output); // write constraints		

	}
} //BitStringImpl
