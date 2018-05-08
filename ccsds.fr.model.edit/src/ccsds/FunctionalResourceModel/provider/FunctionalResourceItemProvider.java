/**
 */
package ccsds.FunctionalResourceModel.provider;


import ccsds.FunctionalResourceModel.FunctionalResource;
import ccsds.FunctionalResourceModel.FunctionalResourceModelFactory;
import ccsds.FunctionalResourceModel.FunctionalResourceModelPackage;
import ccsds.FunctionalResourceModel.Oid;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsds.FunctionalResourceModel.FunctionalResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalResourceItemProvider
	extends FrModelElementItemProvider {
	private ChangeListener changeListener;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FunctionalResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		
		// #hd#
		changeListener = new ChangeListener();
		if(adapterFactory instanceof IChangeNotifier) {
			IChangeNotifier cn = (IChangeNotifier) adapterFactory;
			changeListener = new ChangeListener();
			cn.addListener(changeListener);
		}
	}
	
	/** (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#dispose()
	 * @generated NOT
	 */
	public void dispose() {
		super.dispose();
		if(changeListener != null) {
			((IChangeNotifier)getAdapterFactory()).removeListener(changeListener);
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

			addUsesPropertyDescriptor(object);
			addServiceAccesspointPropertyDescriptor(object);
			addProvidedAncillaryInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalResource_uses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalResource_uses_feature", "_UI_FunctionalResource_type"),
				 FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__USES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Accesspoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceAccesspointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalResource_serviceAccesspoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalResource_serviceAccesspoint_feature", "_UI_FunctionalResource_type"),
				 FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Provided Ancillary Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedAncillaryInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalResource_providedAncillaryInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalResource_providedAncillaryInterface_feature", "_UI_FunctionalResource_type"),
				 FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__EVENT);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__DIRECTIVES);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__PARAMETER);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT);
			childrenFeatures.add(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE);
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
	 * This returns FunctionalResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionalResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = "";
		if(object != null && object instanceof FunctionalResource) {
			FunctionalResource fr = (FunctionalResource)object;
			label = "type: " + fr.getOidBit() + " " + label;
			String oid = OidItemProvider.getOidStr(fr.getOid());
			if(oid != null && oid.length() > 0) {
				label = label + " OID: " + oid;
			}
			
			label = fr.getClassifier() + " " + label;
		}
		
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionalResource_type") :
			getString("_UI_FunctionalResource_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FunctionalResource.class)) {
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__EVENT:
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__DIRECTIVES:
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__PARAMETER:			
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			case FunctionalResourceModelPackage.FUNCTIONAL_RESOURCE__OID: // #hd#
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
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
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__EVENT,
				 FunctionalResourceModelFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__DIRECTIVES,
				 FunctionalResourceModelFactory.eINSTANCE.createDirective()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__PARAMETER,
				 FunctionalResourceModelFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__SERVICE_ACCESSPOINT,
				 FunctionalResourceModelFactory.eINSTANCE.createServiceAccessPoint()));

		newChildDescriptors.add
			(createChildParameter
				(FunctionalResourceModelPackage.Literals.FUNCTIONAL_RESOURCE__PROVIDED_ANCILLARY_INTERFACE,
				 FunctionalResourceModelFactory.eINSTANCE.createAncillaryInterface()));
	}
	
	class ChangeListener implements INotifyChangedListener {
		public void notifyChanged(Notification notification) {	
			FunctionalResource target = null;
			if(FunctionalResourceItemProvider.this.targets != null) {
				for(Notifier n : FunctionalResourceItemProvider.this.targets) {
					if(n != null && n instanceof FunctionalResource) {
						FunctionalResource fr = (FunctionalResource)n;
						if(fr.getOid() != null && fr.getOid() == notification.getNotifier()) {
							target = fr;
							break;
						}
					}
					
				}
			}
			//if(notification.getNotifier() != null &&  getTarget() != null && notification.getNotifier() == ((FunctionalResource) getTarget()).getOid()) {			
			if(notification.getNotifier() != null &&  target != null && target.getOid() != null && notification.getNotifier() == target.getOid()) {
				if(target instanceof FunctionalResource) {
					System.out.println("Current OID of FR is " + OidItemProvider.getOidStr(target.getOid()));
				}

				if(notification.getNotifier() instanceof Oid) {
					System.out.println("Update OID of FR to " + OidItemProvider.getOidStr((Oid)notification.getNotifier()));
				}
				
				
				((IChangeNotifier) getAdapterFactory()).removeListener(ChangeListener.this);
				fireNotifyChanged(new ViewerNotification(notification, target, false, true));
				((IChangeNotifier) getAdapterFactory()).addListener(ChangeListener.this);
			}
		}
	}


}
