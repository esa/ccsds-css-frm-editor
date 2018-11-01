/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;


// End of user code

/**
 * 
 * 
 */
public interface FromModulePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the importedTypes
	 * 
	 */
	public EList getImportedTypes();

	/**
	 * Defines a new importedTypes
	 * @param newValue the new importedTypes to set
	 * 
	 */
	public void setImportedTypes(EList newValue);

	/**
	 * Add a value to the importedTypes multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToImportedTypes(Object newValue);

	/**
	 * Remove a value to the importedTypes multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToImportedTypes(Object newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
