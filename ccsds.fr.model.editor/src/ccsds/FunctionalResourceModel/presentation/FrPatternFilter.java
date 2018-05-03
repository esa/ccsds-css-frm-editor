package ccsds.FunctionalResourceModel.presentation;

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
