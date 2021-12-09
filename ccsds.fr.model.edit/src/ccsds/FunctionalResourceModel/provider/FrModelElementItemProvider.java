/**
 */
package ccsds.FunctionalResourceModel.provider;


import ccsds.FunctionalResourceModel.FrModelElement;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;



/**
 * This is the item provider adapter for a {@link ccsds.FunctionalResourceModel.FrModelElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FrModelElementItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	private ChangeListener changeListener;

	/**
	 * #hd# see https://wiki.eclipse.org/EMF/Recipes#Recipe:_Custom_Labels 
	 */
	class ChangeListener implements INotifyChangedListener {

		@Override
		public void notifyChanged(Notification notification) {
			if(notification.getNotifier() != null && getTarget() != null 
					&& notification.getNotifier()  == ((FrModelElement)getTarget()).getOid() ) {
				((IChangeNotifier) getAdapterFactory()).removeListener(this);
				fireNotifyChanged(new ViewerNotification(notification, getTarget(), false, true));
				((IChangeNotifier) getAdapterFactory()).addListener(this);
			}
			// other targets
			if(targets != null) {
				for (Notifier target : targets){
					if(notification.getNotifier() != null && target != null 
							&& notification.getNotifier()  == ((FrModelElement)target).getOid() ) {
						((IChangeNotifier) getAdapterFactory()).removeListener(this);
						fireNotifyChanged(new ViewerNotification(notification, target, false, true));
						((IChangeNotifier) getAdapterFactory()).addListener(this);
					}
				}
			}
		}
		
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#dispose()
	 */
	public void dispose() {
		super.dispose();
		if(changeListener != null) {
			((IChangeNotifier)getAdapterFactory()).removeListener(changeListener);
		}
	}
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FrModelElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		
		if(adapterFactory instanceof IChangeNotifier) {
			IChangeNotifier cn = (IChangeNotifier) adapterFactory;
			changeListener = new ChangeListener();
			cn.addListener(changeListener);
		}		
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

			addSemanticDefinitionPropertyDescriptor(object);
			addClassifierPropertyDescriptor(object);
			addStringIdentifierPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addAuthorizingEntityPropertyDescriptor(object);
			addOidBitPropertyDescriptor(object);
			addDeprecatedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Semantic Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_SemanticDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_SemanticDefinition_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__SEMANTIC_DEFINITION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the String Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_stringIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_stringIdentifier_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__STRING_IDENTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_classifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_classifier_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__CLASSIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Oid Bit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOidBitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_oidBit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_oidBit_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__OID_BIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deprecated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeprecatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_deprecated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_deprecated_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__DEPRECATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authorizing Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorizingEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_authorizingEntity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_authorizingEntity_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_creationDate_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FrModelElement_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FrModelElement_version_feature", "_UI_FrModelElement_type"),
				 FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__OID);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__ANNOTATION);
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
	 * This returns FrModelElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FrModelElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = crop(((FrModelElement)object).getClassifier());
		
		if(((FrModelElement)object).getOid() != null) {
			label += " " + OidItemProvider.getOidStr(((FrModelElement)object).getOid());
		}
		
		return label == null || label.length() == 0 ?
			getString("_UI_FrModelElement_type") :
			getString("_UI_FrModelElement_type") + " " + label;
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

		switch (notification.getFeatureID(FrModelElement.class)) {
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__SEMANTIC_DEFINITION:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CLASSIFIER:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__STRING_IDENTIFIER:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__VERSION:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__CREATION_DATE:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__AUTHORIZING_ENTITY:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID_BIT:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__DEPRECATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__OID:
			case FunctionalResourceModelPackage.FR_MODEL_ELEMENT__ANNOTATION:
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
				(FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__OID,
				 FunctionalResourceModelFactory.eINSTANCE.createOid()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FR_MODEL_ELEMENT__ANNOTATION,
				 FunctionalResourceModelFactory.eINSTANCE.createAnnotation()));
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
