/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ServiceAccessPointPropertiesEditionPart {

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
	 * @return the minAccessor
	 * 
	 */
	public String getMinAccessor();

	/**
	 * Defines a new minAccessor
	 * @param newValue the new minAccessor to set
	 * 
	 */
	public void setMinAccessor(String newValue);


	/**
	 * @return the maxAccessor
	 * 
	 */
	public String getMaxAccessor();

	/**
	 * Defines a new maxAccessor
	 * @param newValue the new maxAccessor to set
	 * 
	 */
	public void setMaxAccessor(String newValue);


	/**
	 * @return the minAccessed
	 * 
	 */
	public String getMinAccessed();

	/**
	 * Defines a new minAccessed
	 * @param newValue the new minAccessed to set
	 * 
	 */
	public void setMinAccessed(String newValue);


	/**
	 * @return the maxAccessed
	 * 
	 */
	public String getMaxAccessed();

	/**
	 * Defines a new maxAccessed
	 * @param newValue the new maxAccessed to set
	 * 
	 */
	public void setMaxAccessed(String newValue);


	/**
	 * @return the accessedFunctionalResource
	 * 
	 */
	public EObject getAccessedFunctionalResource();

	/**
	 * Init the accessedFunctionalResource
	 * @param settings the combo setting
	 */
	public void initAccessedFunctionalResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new accessedFunctionalResource
	 * @param newValue the new accessedFunctionalResource to set
	 * 
	 */
	public void setAccessedFunctionalResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAccessedFunctionalResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the accessedFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAccessedFunctionalResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the accessedFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAccessedFunctionalResource(ViewerFilter filter);


	/**
	 * @return the accessingFunctionalResource
	 * 
	 */
	public EObject getAccessingFunctionalResource();

	/**
	 * Init the accessingFunctionalResource
	 * @param settings the combo setting
	 */
	public void initAccessingFunctionalResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new accessingFunctionalResource
	 * @param newValue the new accessingFunctionalResource to set
	 * 
	 */
	public void setAccessingFunctionalResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setAccessingFunctionalResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the accessingFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAccessingFunctionalResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the accessingFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAccessingFunctionalResource(ViewerFilter filter);





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
