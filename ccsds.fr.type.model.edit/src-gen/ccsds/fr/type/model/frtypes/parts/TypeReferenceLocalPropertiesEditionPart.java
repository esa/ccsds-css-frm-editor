/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface TypeReferenceLocalPropertiesEditionPart {

	/**
	 * @return the typeDefinition
	 * 
	 */
	public EObject getTypeDefinition();

	/**
	 * Init the typeDefinition
	 * @param settings the combo setting
	 */
	public void initTypeDefinition(EObjectFlatComboSettings settings);

	/**
	 * Defines a new typeDefinition
	 * @param newValue the new typeDefinition to set
	 * 
	 */
	public void setTypeDefinition(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTypeDefinitionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the typeDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTypeDefinition(ViewerFilter filter);

	/**
	 * Adds the given filter to the typeDefinition edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTypeDefinition(ViewerFilter filter);





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
