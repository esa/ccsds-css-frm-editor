/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface FunctionalResourceModelPropertiesEditionPart {



	/**
	 * Init the functionalResourceSet
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFunctionalResourceSet(ReferencesTableSettings settings);

	/**
	 * Update the functionalResourceSet
	 * @param newValue the functionalResourceSet to update
	 * 
	 */
	public void updateFunctionalResourceSet();

	/**
	 * Adds the given filter to the functionalResourceSet edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFunctionalResourceSet(ViewerFilter filter);

	/**
	 * Adds the given filter to the functionalResourceSet edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResourceSet(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the functionalResourceSet table
	 * 
	 */
	public boolean isContainedInFunctionalResourceSetTable(EObject element);




	/**
	 * Init the functionalResource
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFunctionalResource(ReferencesTableSettings settings);

	/**
	 * Update the functionalResource
	 * @param newValue the functionalResource to update
	 * 
	 */
	public void updateFunctionalResource();

	/**
	 * Adds the given filter to the functionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFunctionalResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the functionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResource(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the functionalResource table
	 * 
	 */
	public boolean isContainedInFunctionalResourceTable(EObject element);




	/**
	 * Init the functionalResouceStratum
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFunctionalResouceStratum(ReferencesTableSettings settings);

	/**
	 * Update the functionalResouceStratum
	 * @param newValue the functionalResouceStratum to update
	 * 
	 */
	public void updateFunctionalResouceStratum();

	/**
	 * Adds the given filter to the functionalResouceStratum edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFunctionalResouceStratum(ViewerFilter filter);

	/**
	 * Adds the given filter to the functionalResouceStratum edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResouceStratum(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the functionalResouceStratum table
	 * 
	 */
	public boolean isContainedInFunctionalResouceStratumTable(EObject element);





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
