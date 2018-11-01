/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ModulePropertiesEditionPart {



	/**
	 * Init the typeDefinition
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTypeDefinition(ReferencesTableSettings settings);

	/**
	 * Update the typeDefinition
	 * @param newValue the typeDefinition to update
	 * 
	 */
	public void updateTypeDefinition();

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
	 * @return true if the given element is contained inside the typeDefinition table
	 * 
	 */
	public boolean isContainedInTypeDefinitionTable(EObject element);


	/**
	 * @return the oid
	 * 
	 */
	public String getOid();

	/**
	 * Defines a new oid
	 * @param newValue the new oid to set
	 * 
	 */
	public void setOid(String newValue);


	/**
	 * @return the exports
	 * 
	 */
	public EList getExports();

	/**
	 * Defines a new exports
	 * @param newValue the new exports to set
	 * 
	 */
	public void setExports(EList newValue);

	/**
	 * Add a value to the exports multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToExports(Object newValue);

	/**
	 * Remove a value to the exports multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToExports(Object newValue);


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
	 * Init the imports
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initImports(ReferencesTableSettings settings);

	/**
	 * Update the imports
	 * @param newValue the imports to update
	 * 
	 */
	public void updateImports();

	/**
	 * Adds the given filter to the imports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToImports(ViewerFilter filter);

	/**
	 * Adds the given filter to the imports edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToImports(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the imports table
	 * 
	 */
	public boolean isContainedInImportsTable(EObject element);





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
