/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface SetOfPropertiesEditionPart {



	/**
	 * Init the sizeConstraint
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSizeConstraint(ReferencesTableSettings settings);

	/**
	 * Update the sizeConstraint
	 * @param newValue the sizeConstraint to update
	 * 
	 */
	public void updateSizeConstraint();

	/**
	 * Adds the given filter to the sizeConstraint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSizeConstraint(ViewerFilter filter);

	/**
	 * Adds the given filter to the sizeConstraint edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSizeConstraint(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the sizeConstraint table
	 * 
	 */
	public boolean isContainedInSizeConstraintTable(EObject element);





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
