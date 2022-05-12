package ccsds.FunctionalResourceModel.presentation;

/*-
 * #%L
 * CCSDS Functional Resource Model Editor
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

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.dialogs.PatternFilter;

import ccsds.FunctionalResourceModel.FrModelElement;

/**
 * Overrides the PatternFiter to match fields of the
 * Functional resource elements like Semantic Description 
 */
public class FrPatternFilter extends PatternFilter {

	@Override
    public boolean isElementVisible(Viewer viewer, Object element){
    	boolean match = super.isElementVisible(viewer, element);
    	
    	if(match == false) {
    		match = matchFrElements(element);
    	}
    	
    	return match;
    }	
	
	/**
	 * Matches Functional Resource elements against the this.patternString. Current criteria:
	 * 1) semantic definition
	 * @param element The element to match
	 * @return true if the element was matched, false otherwise
	 */
    private boolean matchFrElements(Object element) {
		if (element instanceof FrModelElement) {
			FrModelElement frElement = (FrModelElement) element;

			// try to match the semantic definition
			//if (matchSearchString(frElement.getSemanticDefinition(), patternString) == true) {
			if (this.wordMatches(frElement.getSemanticDefinition()) == true) {
				return true;
			}
		}
    	
		return false;
	}

}
