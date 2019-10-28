package ccsds.fr.type.model.frtypes.util;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * Collection of utility functions for the FR Type Model
 * 
 * @generated NOT
 */
public class FrTypesUtil {

	private static final Bundle BUNDLE = FrameworkUtil.getBundle(FrTypesUtil.class);
	private static final ILog LOGGER = Platform.getLog(BUNDLE);
	private static String[] invalidChars  = {"\\", "_", "/"};
	
	/**
	 * log to the eclipse platform
	 * @param msg
	 */
	public static void log(String msg) {
		LOGGER.log(new Status(Status.INFO, BUNDLE.getSymbolicName(), msg));
	}
	
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
			int chIdx = -1;
			do {
				chIdx = validName.indexOf(invalidChars[idx]);
				if(chIdx != -1) {
					validName.deleteCharAt(chIdx);
				}
			} while(chIdx != -1);
		}
		
		// convert first character to lower case
		if(Character.isUpperCase(validName.charAt(0))) {
			validName.setCharAt(0, Character.toLowerCase(validName.charAt(0)));
		}
		
		if(validName.toString().equals(typeName) == false) {
			FrTypesUtil.log("ASN.1 generation: Changed " + typeName + " to " + validName);
		}
		
		return validName.toString();
	}
}
