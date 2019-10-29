/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.ExportWriter;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.SequenceOf;
import ccsds.fr.type.model.frtypes.SizeConstraint;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SequenceOfImpl extends StructuredSizeConstrainedTypeImpl implements SequenceOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.SEQUENCE_OF;
	}

	/**
	 * Write the SEQUENCE OF
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(ExportWriter.SEQUENCE + ExportWriter.BLANK);

		for (SizeConstraint c : getSizeConstraint()) {
			c.writeAsn1(indentLevel, output);
		}

		output.append(ExportWriter.BLANK + ExportWriter.OF + ExportWriter.INDENT);

		super.writeAsn1(indentLevel, output);
	}

} //SequenceOfImpl
