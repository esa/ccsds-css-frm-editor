/**
 */
package ccsds.FunctionalResourceModel.provider;

/*-
 * #%L
 * CCSDS Functional Resource Model Edit
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


import ccsds.FunctionalResourceModel.FunctionalResourceModel;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import ccsds.fr.type.model.frtypes.FrtypesFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsds.FunctionalResourceModel.FunctionalResourceModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalResourceModelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalResourceModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__ASN_TYPE_MODULE);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE_STRATUM);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE_SET);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE);
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
	 * This returns FunctionalResourceModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionalResourceModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FunctionalResourceModel_type");
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

		switch (notification.getFeatureID(FunctionalResourceModel.class)) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID:
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__ASN_TYPE_MODULE:
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE_STRATUM:
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE_SET:
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE:
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

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__ROOT_OID,
				 FunctionalResourceModelFactory.eINSTANCE.createOid()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__ASN_TYPE_MODULE,
				 FrtypesFactory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE_STRATUM,
				 FunctionalResourceModelFactory.eINSTANCE.createFunctionalResourceStratum()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE_SET,
				 FunctionalResourceModelFactory.eINSTANCE.createFunctionalResourceSet()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE_MODEL__FUNCTIONAL_RESOURCE,
				 FunctionalResourceModelFactory.eINSTANCE.createFunctionalResource()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Functional_resourceEditPlugin.INSTANCE;
	}

}
