package ccsds.fr.type.model.frtypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

/**
 * Collection of utility functions for the FR Type Model
 * 
 * @generated NOT
 */
public class FrTypesUtil {

	private static String[] invalidChars  = {"\\", "_", "/"};
	
	/**
	 * Get the editing domain for the given EObject
	 * @param object
	 * @return
	 * 
	 * @generated NOT
	 */
	static public EditingDomain getEditingDomainFor(EObject object) {
		Resource resource = object.eResource();
		if (resource != null) {
			IEditingDomainProvider editingDomainProvider =

					(IEditingDomainProvider) EcoreUtil.getExistingAdapter(resource, IEditingDomainProvider.class);
			if (editingDomainProvider != null) {
				return editingDomainProvider.getEditingDomain();
			} else {
				ResourceSet resourceSet = resource.getResourceSet();
				if (resourceSet instanceof IEditingDomainProvider) {
					EditingDomain editingDomain = ((IEditingDomainProvider) resourceSet).getEditingDomain();
					return editingDomain;
				} else if (resourceSet != null) {
					editingDomainProvider = (IEditingDomainProvider) EcoreUtil.getExistingAdapter(resourceSet,
							IEditingDomainProvider.class);
					if (editingDomainProvider != null) {
						return editingDomainProvider.getEditingDomain();
					}
				}
			}
		}

		return null;
	}
	
	/**
	 * Constructs a valid type name of the given type name by:
	 * 1) making first character lower case
	 * 2) remove invalid characters from the given typeName
	 * 
	 * @param typeName	The type name to be made valid
	 * 
	 * @return The validated type name
	 */
	static public String getValidElementName(String typeName) {
		if(typeName == null) {
			return null;
		}
		
		StringBuilder validName = new StringBuilder(typeName);		
		
		// delete any invalid character
		for(int idx=0; idx<invalidChars.length; idx++) {
			int chIdx = validName.indexOf(invalidChars[idx]);
			if(chIdx != -1) {
				validName.deleteCharAt(chIdx);
			}
		}
		
		// convert first character to lower case
		if(Character.isUpperCase(validName.charAt(0))) {
			validName.setCharAt(0, Character.toLowerCase(validName.charAt(0)));
		}
		
		
		return validName.toString();
	}
}
