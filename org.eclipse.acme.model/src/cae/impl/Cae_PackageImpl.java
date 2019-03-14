/**
 */
package cae.impl;

import argumentation.Argumentation_Package;

import cae.Argument;
import cae.CAEClaim;
import cae.CAEModule;
import cae.CAEModuleBinding;
import cae.CAEModuleInterface;
import cae.Cae_Factory;
import cae.Cae_Package;
import cae.Evidence;
import cae.IsEvidenceFor;
import cae.IsSubClaimOf;
import cae.Supports;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cae_PackageImpl extends EPackageImpl implements Cae_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caeModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caeModuleInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caeModuleBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caeClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSubClaimOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isEvidenceForEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cae.Cae_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cae_PackageImpl() {
		super(eNS_URI, Cae_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Cae_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cae_Package init() {
		if (isInited) return (Cae_Package)EPackage.Registry.INSTANCE.getEPackage(Cae_Package.eNS_URI);

		// Obtain or create and register package
		Cae_PackageImpl theCae_Package = (Cae_PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cae_PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cae_PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Argumentation_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theCae_Package.createPackageContents();

		// Initialize created meta-data
		theCae_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCae_Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cae_Package.eNS_URI, theCae_Package);
		return theCae_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEModule() {
		return caeModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEModuleInterface() {
		return caeModuleInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEModuleBinding() {
		return caeModuleBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEClaim() {
		return caeClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsSubClaimOf() {
		return isSubClaimOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupports() {
		return supportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsEvidenceFor() {
		return isEvidenceForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cae_Factory getCae_Factory() {
		return (Cae_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		caeModuleEClass = createEClass(CAE_MODULE);

		caeModuleInterfaceEClass = createEClass(CAE_MODULE_INTERFACE);

		caeModuleBindingEClass = createEClass(CAE_MODULE_BINDING);

		caeClaimEClass = createEClass(CAE_CLAIM);

		argumentEClass = createEClass(ARGUMENT);

		evidenceEClass = createEClass(EVIDENCE);

		isSubClaimOfEClass = createEClass(IS_SUB_CLAIM_OF);

		supportsEClass = createEClass(SUPPORTS);

		isEvidenceForEClass = createEClass(IS_EVIDENCE_FOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Argumentation_Package theArgumentation_Package = (Argumentation_Package)EPackage.Registry.INSTANCE.getEPackage(Argumentation_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		caeModuleEClass.getESuperTypes().add(theArgumentation_Package.getArgumentPackage());
		caeModuleInterfaceEClass.getESuperTypes().add(theArgumentation_Package.getArgumentPackageInterface());
		caeModuleBindingEClass.getESuperTypes().add(theArgumentation_Package.getArgumentPackageBinding());
		caeClaimEClass.getESuperTypes().add(theArgumentation_Package.getClaim());
		argumentEClass.getESuperTypes().add(theArgumentation_Package.getArgumentReasoning());
		evidenceEClass.getESuperTypes().add(theArgumentation_Package.getArtifactReference());
		isSubClaimOfEClass.getESuperTypes().add(theArgumentation_Package.getAssertedInference());
		supportsEClass.getESuperTypes().add(theArgumentation_Package.getAssertedInference());
		isEvidenceForEClass.getESuperTypes().add(theArgumentation_Package.getAssertedEvidence());

		// Initialize classes, features, and operations; add parameters
		initEClass(caeModuleEClass, CAEModule.class, "CAEModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caeModuleInterfaceEClass, CAEModuleInterface.class, "CAEModuleInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caeModuleBindingEClass, CAEModuleBinding.class, "CAEModuleBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caeClaimEClass, CAEClaim.class, "CAEClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isSubClaimOfEClass, IsSubClaimOf.class, "IsSubClaimOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportsEClass, Supports.class, "Supports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isEvidenceForEClass, IsEvidenceFor.class, "IsEvidenceFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Cae_PackageImpl
