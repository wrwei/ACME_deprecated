/**
 */
package cae.impl;

import cae.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cae_FactoryImpl extends EFactoryImpl implements Cae_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cae_Factory init() {
		try {
			Cae_Factory theCae_Factory = (Cae_Factory)EPackage.Registry.INSTANCE.getEFactory(Cae_Package.eNS_URI);
			if (theCae_Factory != null) {
				return theCae_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cae_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cae_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Cae_Package.CAE_MODULE: return createCAEModule();
			case Cae_Package.CAE_MODULE_INTERFACE: return createCAEModuleInterface();
			case Cae_Package.CAE_MODULE_BINDING: return createCAEModuleBinding();
			case Cae_Package.CAE_CLAIM: return createCAEClaim();
			case Cae_Package.ARGUMENT: return createArgument();
			case Cae_Package.EVIDENCE: return createEvidence();
			case Cae_Package.IS_SUB_CLAIM_OF: return createIsSubClaimOf();
			case Cae_Package.SUPPORTS: return createSupports();
			case Cae_Package.IS_EVIDENCE_FOR: return createIsEvidenceFor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CAEModule createCAEModule() {
		CAEModuleImpl caeModule = new CAEModuleImpl();
		return caeModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CAEModuleInterface createCAEModuleInterface() {
		CAEModuleInterfaceImpl caeModuleInterface = new CAEModuleInterfaceImpl();
		return caeModuleInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CAEModuleBinding createCAEModuleBinding() {
		CAEModuleBindingImpl caeModuleBinding = new CAEModuleBindingImpl();
		return caeModuleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CAEClaim createCAEClaim() {
		CAEClaimImpl caeClaim = new CAEClaimImpl();
		return caeClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsSubClaimOf createIsSubClaimOf() {
		IsSubClaimOfImpl isSubClaimOf = new IsSubClaimOfImpl();
		return isSubClaimOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supports createSupports() {
		SupportsImpl supports = new SupportsImpl();
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsEvidenceFor createIsEvidenceFor() {
		IsEvidenceForImpl isEvidenceFor = new IsEvidenceForImpl();
		return isEvidenceFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cae_Package getCae_Package() {
		return (Cae_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cae_Package getPackage() {
		return Cae_Package.eINSTANCE;
	}

} //Cae_FactoryImpl
