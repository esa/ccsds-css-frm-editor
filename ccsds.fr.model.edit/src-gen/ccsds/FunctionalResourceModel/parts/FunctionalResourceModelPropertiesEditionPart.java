/**
 * Generated with Acceleo
 */
package ccsds.FunctionalResourceModel.parts;

/*-
 * #%L
 * CCSDS Functional Resource Model Edit
 * %%
 * Copyright (C) 2022 European Space Agency
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

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
	 * Init the functionalResourceStratum
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFunctionalResourceStratum(ReferencesTableSettings settings);

	/**
	 * Update the functionalResourceStratum
	 * @param newValue the functionalResourceStratum to update
	 * 
	 */
	public void updateFunctionalResourceStratum();

	/**
	 * Adds the given filter to the functionalResourceStratum edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFunctionalResourceStratum(ViewerFilter filter);

	/**
	 * Adds the given filter to the functionalResourceStratum edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFunctionalResourceStratum(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the functionalResourceStratum table
	 * 
	 */
	public boolean isContainedInFunctionalResourceStratumTable(EObject element);




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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
