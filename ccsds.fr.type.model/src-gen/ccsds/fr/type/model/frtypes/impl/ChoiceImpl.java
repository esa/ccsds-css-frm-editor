/**
 */
package ccsds.fr.type.model.frtypes.impl;

import ccsds.fr.type.model.frtypes.Asn1Writer;
import ccsds.fr.type.model.frtypes.Choice;
import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.util.FrTypesUtil;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChoiceImpl extends StructuredDifferentTypeImpl implements Choice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.CHOICE;
	}

	/**
	 * Write the CHOICE
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {
		output.append(Asn1Writer.CHOICE);
		
		// ensure there are tags when writing
		int lastTag = -1;
		for(int idx=0; idx<getElements().size(); idx++) {
			if(getElements().get(idx) instanceof Element) {
				Element element = (Element)getElements().get(idx);
				if(element.getTag() == null) {					
					EditingDomain ed = FrTypesUtil.getEditingDomainFor(element);
					if(ed != null) {
						SetCommand setTag = new SetCommand(ed, element, 
								element.eClass().getEStructuralFeature(FrtypesPackage.ELEMENT__TAG), Integer.toString(lastTag + 1));
						ed.getCommandStack().execute(setTag); // TODO think about a compound command for ASN.1 generation
					} else {
						element.setTag(Integer.toString(lastTag + 1));
					}						
					lastTag++;
				} else {
					try {
						lastTag = Integer.parseInt(element.getTag());
					} catch(NumberFormatException nfe) {
						lastTag++; // invalid tag format - unknown tag value
					}
					
				}
			}
		}
		
		super.writeAsn1(indentLevel, output);
	}

} //ChoiceImpl
