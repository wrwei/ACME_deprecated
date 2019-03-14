/**
 */
package gsn.provider;


import argumentation.Argumentation_Package;

import argumentation.provider.ArgumentPackageBindingItemProvider;

import gsn.ContractModule;
import gsn.Gsn_Factory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link gsn.ContractModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContractModuleItemProvider extends ArgumentPackageBindingItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractModuleItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ContractModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContractModule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContractModule)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_ContractModule_type") :
			getString("_UI_ContractModule_type") + " " + label;
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
				 Gsn_Factory.eINSTANCE.createModule()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createContractModule()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createChoiceNode()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createAwayGoal()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createAwaySolution()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createAwayContext()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createModuleReference()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createContractModuleReference()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createSupportedBy()));

		newChildDescriptors.add
			(createChildParameter
				(Argumentation_Package.Literals.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT,
				 Gsn_Factory.eINSTANCE.createInContextOf()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GsnEditPlugin.INSTANCE;
	}

}
