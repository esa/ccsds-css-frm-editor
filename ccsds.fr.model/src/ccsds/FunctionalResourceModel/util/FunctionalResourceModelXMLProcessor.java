/**
 */
package ccsds.FunctionalResourceModel.util;

import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalResourceModelXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceModelXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		FunctionalResourceModelPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the FunctionalResourceModelResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new FunctionalResourceModelResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new FunctionalResourceModelResourceFactoryImpl());
		}
		return registrations;
	}

} //FunctionalResourceModelXMLProcessor
