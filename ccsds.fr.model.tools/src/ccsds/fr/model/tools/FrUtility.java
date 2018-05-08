package ccsds.fr.model.tools;

import java.util.LinkedList;
import java.util.List;

import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceSet;

/**
 * Helper class for FR related functions 
 */
public class FrUtility {

	/**
	 * Returns an ordered array of FRs as they appear in teh model,
	 * no matter if they are directly under the model or within a
	 * FunctionalResourceSet
	 * @param frm
	 * @return The array of Functional resources
	 */
	public static FunctionalResource[] getFunctionalResources(FunctionalResourceModel frm) {
		List<FunctionalResource> frList = new LinkedList<FunctionalResource>();
		
		if(frm != null) {
			
			// add first the FRs in FR Sets
			for(FunctionalResourceSet frs : frm.getFunctionalResourceSet()) {
				for(FunctionalResource fr : frs.getFunctionalResource()) {
					frList.add(fr);
				}
			}
		}
		
		// Add second the FRs directly contained in the FRM
		for(FunctionalResource fr : frm.getFunctionalResource()) {
			frList.add(fr);
		}
		
		return frList.toArray(new FunctionalResource[0]);
	}	
}
