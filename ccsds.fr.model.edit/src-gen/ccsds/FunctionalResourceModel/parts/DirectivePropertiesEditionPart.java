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
public interface DirectivePropertiesEditionPart {

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
	 * @return the classifier
	 * 
	 */
	public String getClassifier();

	/**
	 * Defines a new classifier
	 * @param newValue the new classifier to set
	 * 
	 */
	public void setClassifier(String newValue);


	/**
	 * @return the stringIdentifier
	 * 
	 */
	public String getStringIdentifier();

	/**
	 * Defines a new stringIdentifier
	 * @param newValue the new stringIdentifier to set
	 * 
	 */
	public void setStringIdentifier(String newValue);


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
	 * Init the qualifier
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initQualifier(ReferencesTableSettings settings);

	/**
	 * Update the qualifier
	 * @param newValue the qualifier to update
	 * 
	 */
	public void updateQualifier();

	/**
	 * Adds the given filter to the qualifier edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToQualifier(ViewerFilter filter);

	/**
	 * Adds the given filter to the qualifier edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToQualifier(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the qualifier table
	 * 
	 */
	public boolean isContainedInQualifierTable(EObject element);


	/**
	 * @return the guardCondition
	 * 
	 */
	public String getGuardCondition();

	/**
	 * Defines a new guardCondition
	 * @param newValue the new guardCondition to set
	 * 
	 */
	public void setGuardCondition(String newValue);





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
