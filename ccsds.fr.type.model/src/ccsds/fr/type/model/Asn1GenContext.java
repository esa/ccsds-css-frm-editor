package ccsds.fr.type.model;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.NamedValue;
import ccsds.fr.type.model.frtypes.TypeDefinition;

/**
 * Provide some context for ASN.1 generation 
 */
public class Asn1GenContext {

	private boolean generating = false;
	
	private static Asn1GenContext instance;
	
	private CompoundCommand compoundCommand;
	
	private EditingDomain editingDomain;
	
	/**
	 * Private constructor to prevent instantiation
	 */
	private Asn1GenContext() {
		
	}
	
	public static Asn1GenContext instance() {
		if(instance == null) {
			instance = new Asn1GenContext();
		}
		
		return instance;
	}
	
	public void setGeneration(boolean genarating) {
		this.generating = genarating;
	}
	
	public boolean getGenerating() {
		return this.generating;
	}

	public CompoundCommand getCompoundCommand() {
		return compoundCommand;
	}

	public void setCompoundCommand(CompoundCommand compoundCommand) {
		this.compoundCommand = compoundCommand;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}
	
	/**
	 * Create a set command for the element name of the given element if the given name is different
	 * @param element	The element to update
	 * @param name		The name to update the element
	 * 
	 * @return true if the element name 
	 */
	public boolean updateElementName(Element element, String name) {
		if(this.editingDomain == null) {
			return false;
		}
		
		if(this.compoundCommand == null) {
			return false;
		}
		
		if(element.getName().equals(name) == false) {
			SetCommand setName = new SetCommand(editingDomain, element,
					element.eClass().getEStructuralFeature(FrtypesPackage.ELEMENT__NAME),
					name);
			
			compoundCommand.append(setName);					
			return true;
		}
		
		return false;
	}

	/**
	 * Create a set command for the element name of the given element if the given name is different
	 * @param nv	The element to update
	 * @param name		The name to update the element
	 * 
	 * @return true if the element name 
	 */
	public boolean updateName(NamedValue nv, String name) {
		if(this.editingDomain == null) {
			return false;
		}
		
		if(this.compoundCommand == null) {
			return false;
		}
		
		if(nv.getName().equals(name) == false) {
			SetCommand setName = new SetCommand(editingDomain, nv,
					nv.eClass().getEStructuralFeature(FrtypesPackage.NAMED_VALUE__NAME),
					name);
			
			compoundCommand.append(setName);					
			return true;
		}
		
		return false;
	}	

	/**
	 * Create a set command for the type definition name of the given element if the given name is different
	 * @param td	The element to update
	 * @param name		The name to update the element
	 * 
	 * @return true if the element name 
	 */
	public boolean updateName(TypeDefinition td, String name) {
		if(this.editingDomain == null) {
			return false;
		}
		
		if(this.compoundCommand == null) {
			return false;
		}
		
		if(td.getName().equals(name) == false) {
			SetCommand setName = new SetCommand(editingDomain, td,
					td.eClass().getEStructuralFeature(FrtypesPackage.TYPE_DEFINITION__NAME),
					name);
			
			compoundCommand.append(setName);					
			return true;
		}
		
		return false;
	}		
	
}