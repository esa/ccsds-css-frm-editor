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
public interface FunctionalResourcePropertiesEditionPart {

	/**
	 * @return the SemanticDefinition
	 * 
	 */
	public String getSemanticDefinition();

	/**
	 * Defines a new SemanticDefinition
	 * @param newValue the new SemanticDefinition to set
	 * 
	 */
	public void setSemanticDefinition(String newValue);


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
	 * @return the shortName
	 * 
	 */
	public String getShortName();

	/**
	 * Defines a new shortName
	 * @param newValue the new shortName to set
	 * 
	 */
	public void setShortName(String newValue);


	/**
	 * @return the version
	 * 
	 */
	public String getVersion();

	/**
	 * Defines a new version
	 * @param newValue the new version to set
	 * 
	 */
	public void setVersion(String newValue);


	/**
	 * @return the creationDate
	 * 
	 */
	public String getCreationDate();

	/**
	 * Defines a new creationDate
	 * @param newValue the new creationDate to set
	 * 
	 */
	public void setCreationDate(String newValue);


	/**
	 * @return the authorizingEntity
	 * 
	 */
	public String getAuthorizingEntity();

	/**
	 * Defines a new authorizingEntity
	 * @param newValue the new authorizingEntity to set
	 * 
	 */
	public void setAuthorizingEntity(String newValue);


	/**
	 * @return the oidBit
	 * 
	 */
	public String getOidBit();

	/**
	 * Defines a new oidBit
	 * @param newValue the new oidBit to set
	 * 
	 */
	public void setOidBit(String newValue);


	/**
	 * @return the deprecated
	 * 
	 */
	public Boolean getDeprecated();

	/**
	 * Defines a new deprecated
	 * @param newValue the new deprecated to set
	 * 
	 */
	public void setDeprecated(Boolean newValue);




	/**
	 * Init the event
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvent(ReferencesTableSettings settings);

	/**
	 * Update the event
	 * @param newValue the event to update
	 * 
	 */
	public void updateEvent();

	/**
	 * Adds the given filter to the event edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEvent(ViewerFilter filter);

	/**
	 * Adds the given filter to the event edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEvent(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the event table
	 * 
	 */
	public boolean isContainedInEventTable(EObject element);




	/**
	 * Init the directives
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDirectives(ReferencesTableSettings settings);

	/**
	 * Update the directives
	 * @param newValue the directives to update
	 * 
	 */
	public void updateDirectives();

	/**
	 * Adds the given filter to the directives edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDirectives(ViewerFilter filter);

	/**
	 * Adds the given filter to the directives edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDirectives(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the directives table
	 * 
	 */
	public boolean isContainedInDirectivesTable(EObject element);




	/**
	 * Init the uses
	 * @param settings settings for the uses ReferencesTable 
	 */
	public void initUses(ReferencesTableSettings settings);

	/**
	 * Update the uses
	 * @param newValue the uses to update
	 * 
	 */
	public void updateUses();

	/**
	 * Adds the given filter to the uses edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUses(ViewerFilter filter);

	/**
	 * Adds the given filter to the uses edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the uses table
	 * 
	 */
	public boolean isContainedInUsesTable(EObject element);




	/**
	 * Init the parameter
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initParameter(ReferencesTableSettings settings);

	/**
	 * Update the parameter
	 * @param newValue the parameter to update
	 * 
	 */
	public void updateParameter();

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the parameter table
	 * 
	 */
	public boolean isContainedInParameterTable(EObject element);





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
