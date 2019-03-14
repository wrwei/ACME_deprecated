/**
 */
package cae.provider;


import argumentation.Argumentation_Package;

import argumentation.provider.ArgumentPackageInterfaceItemProvider;

import cae.CAEModuleInterface;
import cae.Cae_Factory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link cae.CAEModuleInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CAEModuleInterfaceItemProvider extends ArgumentPackageInterfaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEModuleInterfaceItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns CAEModuleInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CAEModuleInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CAEModuleInterface)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_CAEModuleInterface_type") :
			getString("_UI_CAEModuleInterface_type") + " " + label;
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
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createCAEModule()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createCAEModuleInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createCAEModuleBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createCAEClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createIsSubClaimOf()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createSupports()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Cae_Factory.eINSTANCE.createIsEvidenceFor()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CaeEditPlugin.INSTANCE;
	}

}
