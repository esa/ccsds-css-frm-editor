/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface PermittedAlphabetConstraintPropertiesEditionPart {

	/**
	 * @return the values
	 * 
	 */
	public EList getValues();

	/**
	 * Defines a new values
	 * @param newValue the new values to set
	 * 
	 */
	public void setValues(EList newValue);

	/**
	 * Add a value to the values multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToValues(Object newValue);

	/**
	 * Remove a value to the values multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToValues(Object newValue);


	/**
	 * @return the type
	 * 
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initType(Object input, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);





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
