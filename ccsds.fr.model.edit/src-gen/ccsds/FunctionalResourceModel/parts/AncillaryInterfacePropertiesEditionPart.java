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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface AncillaryInterfacePropertiesEditionPart {

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
	 * @return the providingFunctionalResource
	 * 
	 */
	public EObject getProvidingFunctionalResource();

	/**
	 * Init the providingFunctionalResource
	 * @param settings the combo setting
	 */
	public void initProvidingFunctionalResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new providingFunctionalResource
	 * @param newValue the new providingFunctionalResource to set
	 * 
	 */
	public void setProvidingFunctionalResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setProvidingFunctionalResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the providingFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProvidingFunctionalResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the providingFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProvidingFunctionalResource(ViewerFilter filter);


	/**
	 * @return the requiringFunctionalResource
	 * 
	 */
	public EObject getRequiringFunctionalResource();

	/**
	 * Init the requiringFunctionalResource
	 * @param settings the combo setting
	 */
	public void initRequiringFunctionalResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new requiringFunctionalResource
	 * @param newValue the new requiringFunctionalResource to set
	 * 
	 */
	public void setRequiringFunctionalResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRequiringFunctionalResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the requiringFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRequiringFunctionalResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the requiringFunctionalResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRequiringFunctionalResource(ViewerFilter filter);





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
