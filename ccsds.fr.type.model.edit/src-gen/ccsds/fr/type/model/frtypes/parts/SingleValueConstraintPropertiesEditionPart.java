/**
 * Generated with Acceleo
 */
package ccsds.fr.type.model.frtypes.parts;

/*-
 * #%L
 * CCSDS Functional Resource Type Model Edit
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
import org.eclipse.emf.common.util.EList;


// End of user code

/**
 * 
 * 
 */
public interface SingleValueConstraintPropertiesEditionPart {

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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
