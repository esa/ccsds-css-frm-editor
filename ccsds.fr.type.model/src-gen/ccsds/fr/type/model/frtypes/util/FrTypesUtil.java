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
}
