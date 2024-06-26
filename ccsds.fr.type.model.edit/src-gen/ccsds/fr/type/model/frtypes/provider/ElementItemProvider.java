/**
 */
package ccsds.fr.type.model.frtypes.provider;

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

import ccsds.fr.type.model.frtypes.Element;
import ccsds.fr.type.model.frtypes.FrtypesFactory;
import ccsds.fr.type.model.frtypes.FrtypesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsds.fr.type.model.frtypes.Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider extends TypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addTagPropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_name_feature", "_UI_Element_type"),
						FrtypesPackage.Literals.ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_tag_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_tag_feature", "_UI_Element_type"),
						FrtypesPackage.Literals.ELEMENT__TAG, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_optional_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_optional_feature",
								"_UI_Element_type"),
						FrtypesPackage.Literals.ELEMENT__OPTIONAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Element_comment_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Element_comment_feature",
								"_UI_Element_type"),
						FrtypesPackage.Literals.ELEMENT__COMMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FrtypesPackage.Literals.ELEMENT__TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Element.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Element"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Element) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Element_type")
				: getString("_UI_Element_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Element.class)) {
		case FrtypesPackage.ELEMENT__NAME:
		case FrtypesPackage.ELEMENT__TAG:
		case FrtypesPackage.ELEMENT__OPTIONAL:
		case FrtypesPackage.ELEMENT__COMMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FrtypesPackage.ELEMENT__TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createIntegerType()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createBitString()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createOctetString()));

		newChildDescriptors.add(
				createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createReal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createEnumerated()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createCharacterString()));

		newChildDescriptors.add(
				createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createSequenceOf()));

		newChildDescriptors
				.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createSet()));

		newChildDescriptors.add(
				createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createSetOf()));

		newChildDescriptors.add(
				createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createTypeReferenceLocal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createObjectIdentifier()));

		newChildDescriptors.add(
				createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE,
				FrtypesFactory.eINSTANCE.createTypeReferenceExternal()));

		newChildDescriptors.add(
				createChildParameter(FrtypesPackage.Literals.ELEMENT__TYPE, FrtypesFactory.eINSTANCE.createNull()));
	}

}
