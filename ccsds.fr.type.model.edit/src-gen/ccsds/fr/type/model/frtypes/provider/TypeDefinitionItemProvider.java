/**
 */
package ccsds.fr.type.model.frtypes.provider;

import ccsds.fr.type.model.frtypes.FrtypesFactory;
import ccsds.fr.type.model.frtypes.FrtypesPackage;
import ccsds.fr.type.model.frtypes.TypeDefinition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsds.fr.type.model.frtypes.TypeDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeDefinitionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinitionItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_TypeDefinition_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TypeDefinition_name_feature",
								"_UI_TypeDefinition_type"),
						FrtypesPackage.Literals.TYPE_DEFINITION__NAME, true, false, false,
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
			childrenFeatures.add(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE);
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
	 * This returns TypeDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeDefinition"));
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
		String label = ((TypeDefinition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TypeDefinition_type")
				: getString("_UI_TypeDefinition_type") + " " + label;
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

		switch (notification.getFeatureID(TypeDefinition.class)) {
		case FrtypesPackage.TYPE_DEFINITION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FrtypesPackage.TYPE_DEFINITION__TYPE:
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

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createIntegerType()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createBitString()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createOctetString()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createReal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createEnumerated()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createCharacterString()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createSequenceOf()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createSet()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createSetOf()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createTypeReferenceLocal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createObjectIdentifier()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createTypeReferenceExternal()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createSubElement()));

		newChildDescriptors.add(createChildParameter(FrtypesPackage.Literals.TYPE_DEFINITION__TYPE,
				FrtypesFactory.eINSTANCE.createNull()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FrtypesEditPlugin.INSTANCE;
	}

}
