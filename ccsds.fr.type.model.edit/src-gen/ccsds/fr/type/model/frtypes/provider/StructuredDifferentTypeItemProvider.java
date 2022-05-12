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

import ccsds.fr.type.model.frtypes.FrtypesFactory;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.StructuredDifferentType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsds.fr.type.model.frtypes.StructuredDifferentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredDifferentTypeItemProvider extends StructuredTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDifferentTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS);
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
	 * This returns StructuredDifferentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructuredDifferentType"));
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
		return getString("_UI_StructuredDifferentType_type");
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

		switch (notification.getFeatureID(StructuredDifferentType.class)) {
		case FrtypesPackage.STRUCTURED_DIFFERENT_TYPE__ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createIntegerType()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createBitString()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createOctetString()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createReal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createEnumerated()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createCharacterString()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createSequenceOf()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createSet()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createSetOf()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createTypeReferenceLocal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createObjectIdentifier()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createTypeReferenceExternal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.STRUCTURED_DIFFERENT_TYPE__ELEMENTS,
				FrtypesFactory.eINSTANCE.createNull()));
	}

}
