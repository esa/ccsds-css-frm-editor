/**
 */
package ccsds.fr.type.model.frtypes.impl;

/*-
 * #%L
 * CCSDS Functional Resource Type Model
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

import ccsds.fr.type.model.XmlAttribute;
import ccsds.fr.type.model.XmlHelper;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.ObjectIdentifier;
import ccsds.fr.type.model.frtypes.TypeDefinition;
import ccsds.fr.type.model.frtypes.TypeReferenceLocal;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference Local</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ccsds.fr.type.model.frtypes.impl.TypeReferenceLocalImpl#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeReferenceLocalImpl extends TypeImpl implements TypeReferenceLocal {
	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition typeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceLocalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrtypesPackage.Literals.TYPE_REFERENCE_LOCAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getTypeDefinition() {
		if (typeDefinition != null && typeDefinition.eIsProxy()) {
			InternalEObject oldTypeDefinition = (InternalEObject) typeDefinition;
			typeDefinition = (TypeDefinition) eResolveProxy(oldTypeDefinition);
			if (typeDefinition != oldTypeDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FrtypesPackage.TYPE_REFERENCE_LOCAL__TYPE_DEFINITION, oldTypeDefinition, typeDefinition));
			}
		}
		return typeDefinition;
	}

	//	/**
	//	 * To support drag and drop of TypeDefinitions between FRM files,
	//	 * we try first to resolve the this.typeDefinition within the module
	//	 * of this FRM file 
	//	 * @generated NOT
	//	 */
	//	@Override
	//	public EObject eResolveProxy(InternalEObject proxy) {
	//
	//		// try to resolve types from foreign modules within the module of this file
	//		// we do not want references to another FRM file
	//		try {
	//			if (proxy != null && proxy.eIsProxy()) {
	//				
	//				TypeDefinition proxiedDefinition = (TypeDefinition) super.eResolveProxy(proxy);		// resolve to get the name etc.
	//				
	//				EObject obj = null;
	//				EObject container = this.eContainer();
	//				while(container != null && container.eClass() != null) {
	//					if(container.eContainer() == null /*FRM*/) { 
	//						//Object obj = container.eGet(container.eClass().getEStructuralFeature(FrtypesPackage.MODULE));
	//						TreeIterator<EObject> contentIter = container.eAllContents();
	//						while(contentIter.hasNext()) {
	//							obj = contentIter.next();
	//							if(obj instanceof Module) {
	//								System.out.println("Found module of this FRM");
	//								Module generalModule = (Module)obj;
	//								int idx = 0;
	//								for(TypeDefinition td : generalModule.getTypeDefinition()) {
	//									//System.out.println("Compare " + td.getName() + " with " + typeDefinition.getName());
	//									if(td != null && td.getName().equals(proxiedDefinition.getName())) {
	//										String proxyUri = "?";
	//										if(proxy.eProxyURI() != null) {
	//											proxyUri = proxy.eProxyURI().toString();
	//										}
	//										
	//										System.out.println("Replace type proxied (" + proxyUri
	//												+ ") definition reference " + td.getName() + " with local one at index " + idx);
	//										return td;
	//									}
	//									idx++;
	//								}
	//							}
	//						}
	//					}
	//					container = container.eContainer();					
	//				}
	//			}
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		return super.eResolveProxy(proxy);
	//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinition(TypeDefinition newTypeDefinition) {
		TypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrtypesPackage.TYPE_REFERENCE_LOCAL__TYPE_DEFINITION,
					oldTypeDefinition, typeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrtypesPackage.TYPE_REFERENCE_LOCAL__TYPE_DEFINITION:
			if (resolve)
				return getTypeDefinition();
			return basicGetTypeDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FrtypesPackage.TYPE_REFERENCE_LOCAL__TYPE_DEFINITION:
			setTypeDefinition((TypeDefinition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FrtypesPackage.TYPE_REFERENCE_LOCAL__TYPE_DEFINITION:
			setTypeDefinition((TypeDefinition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FrtypesPackage.TYPE_REFERENCE_LOCAL__TYPE_DEFINITION:
			return typeDefinition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Write the type reference
	 * @generated NOT
	 */
	@Override
	public void writeAsn1(int indentLevel, StringBuffer output) {

		if (getTypeDefinition() != null && getTypeDefinition().getName() != null) {
			output.append(getTypeDefinition().getName());
			if (this.getSingleValueConstraint() != null && this.getSingleValueConstraint().getValues().size() > 0) {
				this.getSingleValueConstraint().writeAsn1(indentLevel, output);
			}
		} else {
			output.append("local type reference: name not set");
		}
	}

	/**
	 * Write the  local type reference to XSD
	 * @generated NOT
	 */
	@Override
	public void writeXsd(int indentLevel, StringBuffer output, ObjectIdentifier oid, Map<String, String> properties) {
		int typeIndent = indentLevel;
		StringBuffer typeOutput = new StringBuffer();

		// write a type without value and oid attributes, which can again be referenced 		
		if (XmlHelper.isSimpleType(getTypeDefinition().getType())) {
			XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE, XmlHelper.getTypeNameAttr(this));
			XmlHelper.writeElement(typeOutput, typeIndent + 1, XmlHelper.RESTRICTION,
					new XmlAttribute(XmlHelper.BASE, getTypeDefinition().getName()));
			XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.SIMPLE_TYPE);
		} else {
			XmlHelper.writeStartElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE,
					XmlHelper.getTypeNameAttr(this));
			XmlHelper.writeStartElement(typeOutput, typeIndent + 1, XmlHelper.COMPLEX_CONTENT);
			XmlHelper.writeStartElement(typeOutput, typeIndent + 2, XmlHelper.EXTENSION,
					new XmlAttribute(XmlHelper.BASE, getTypeDefinition().getName()));
			XmlHelper.writeEndElement(typeOutput, typeIndent + 2, XmlHelper.EXTENSION);
			XmlHelper.writeEndElement(typeOutput, typeIndent + 1, XmlHelper.COMPLEX_CONTENT);
			XmlHelper.writeEndElement(typeOutput, typeIndent, XmlHelper.COMPLEX_TYPE);
		}

		// write a named element
		if (oid != null) {

			if (XmlHelper.isSimpleType(getTypeDefinition().getType())) {
				XmlHelper.writeSimpleNamedType(indentLevel, output, XmlHelper.getNamedTypeNameAttr(this),
						XmlHelper.getTypeNameAttr(this), oid, this, properties);
			} else {
				XmlHelper.writeComplexNamedType(indentLevel, output, XmlHelper.getNamedTypeNameAttr(this),
						XmlHelper.getTypeNameAttr(this), oid, this, properties);
			}

		}

		output.append(typeOutput);
	}
} //TypeReferenceLocalImpl
