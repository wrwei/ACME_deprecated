/**
 */
package cae;

import argumentation.Argumentation_Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cae.Cae_Factory
 * @model kind="package"
 * @generated
 */
public interface Cae_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cae";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme/1.0/cae";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cae_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cae_Package eINSTANCE = cae.impl.Cae_PackageImpl.init();

	/**
	 * The meta object id for the '{@link cae.impl.CAEModuleImpl <em>CAE Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.CAEModuleImpl
	 * @see cae.impl.Cae_PackageImpl#getCAEModule()
	 * @generated
	 */
	int CAE_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__GID = Argumentation_Package.ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__IS_CITATION = Argumentation_Package.ARGUMENT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__NAME = Argumentation_Package.ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__DESCRIPTION = Argumentation_Package.ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__NOTE = Argumentation_Package.ARGUMENT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__UNINSTANTIATED = Argumentation_Package.ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE__ARGUMENTATION_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT;

	/**
	 * The number of structural features of the '<em>CAE Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CAE Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_OPERATION_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.CAEModuleInterfaceImpl <em>CAE Module Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.CAEModuleInterfaceImpl
	 * @see cae.impl.Cae_PackageImpl#getCAEModuleInterface()
	 * @generated
	 */
	int CAE_MODULE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__GID = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__IS_CITATION = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__NAME = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__DESCRIPTION = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__NOTE = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__UNINSTANTIATED = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__ARGUMENTATION_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__ARGUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE__IMPLEMENTS = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE__IMPLEMENTS;

	/**
	 * The number of structural features of the '<em>CAE Module Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CAE Module Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_INTERFACE_OPERATION_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.CAEModuleBindingImpl <em>CAE Module Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.CAEModuleBindingImpl
	 * @see cae.impl.Cae_PackageImpl#getCAEModuleBinding()
	 * @generated
	 */
	int CAE_MODULE_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__GID = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__IS_CITATION = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__IS_ABSTRACT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__CITED_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__NAME = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__DESCRIPTION = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__NOTE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__TAGGED_VALUE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__UNINSTANTIATED = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__ARGUMENTATION_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__ARGUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING__PARTICIPANT_PACKAGE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE;

	/**
	 * The number of structural features of the '<em>CAE Module Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING_FEATURE_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CAE Module Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_MODULE_BINDING_OPERATION_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.CAEClaimImpl <em>CAE Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.CAEClaimImpl
	 * @see cae.impl.Cae_PackageImpl#getCAEClaim()
	 * @generated
	 */
	int CAE_CLAIM = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__UNINSTANTIATED = Argumentation_Package.CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__CONTENT = Argumentation_Package.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The number of structural features of the '<em>CAE Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CAE Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAE_CLAIM_OPERATION_COUNT = Argumentation_Package.CLAIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.ArgumentImpl
	 * @see cae.impl.Cae_PackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__GID = Argumentation_Package.ARGUMENT_REASONING__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IS_CITATION = Argumentation_Package.ARGUMENT_REASONING__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IS_ABSTRACT = Argumentation_Package.ARGUMENT_REASONING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CITED_ELEMENT = Argumentation_Package.ARGUMENT_REASONING__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_REASONING__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = Argumentation_Package.ARGUMENT_REASONING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = Argumentation_Package.ARGUMENT_REASONING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_REASONING__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NOTE = Argumentation_Package.ARGUMENT_REASONING__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TAGGED_VALUE = Argumentation_Package.ARGUMENT_REASONING__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__UNINSTANTIATED = Argumentation_Package.ARGUMENT_REASONING__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTENT = Argumentation_Package.ARGUMENT_REASONING__CONTENT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__STRUCTURE = Argumentation_Package.ARGUMENT_REASONING__STRUCTURE;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = Argumentation_Package.ARGUMENT_REASONING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = Argumentation_Package.ARGUMENT_REASONING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.EvidenceImpl
	 * @see cae.impl.Cae_PackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__UNINSTANTIATED = Argumentation_Package.ARTIFACT_REFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__CONTENT = Argumentation_Package.ARTIFACT_REFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OPERATION_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.IsSubClaimOfImpl <em>Is Sub Claim Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.IsSubClaimOfImpl
	 * @see cae.impl.Cae_PackageImpl#getIsSubClaimOf()
	 * @generated
	 */
	int IS_SUB_CLAIM_OF = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__GID = Argumentation_Package.ASSERTED_INFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__IS_CITATION = Argumentation_Package.ASSERTED_INFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__IS_ABSTRACT = Argumentation_Package.ASSERTED_INFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__CITED_ELEMENT = Argumentation_Package.ASSERTED_INFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__ABSTRACT_FORM = Argumentation_Package.ASSERTED_INFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__NAME = Argumentation_Package.ASSERTED_INFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__DESCRIPTION = Argumentation_Package.ASSERTED_INFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ASSERTED_INFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__NOTE = Argumentation_Package.ASSERTED_INFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__TAGGED_VALUE = Argumentation_Package.ASSERTED_INFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__UNINSTANTIATED = Argumentation_Package.ASSERTED_INFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__CONTENT = Argumentation_Package.ASSERTED_INFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__ASSERTION_DECLARATION = Argumentation_Package.ASSERTED_INFERENCE__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__META_CLAIM = Argumentation_Package.ASSERTED_INFERENCE__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__IS_COUNTER = Argumentation_Package.ASSERTED_INFERENCE__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__SOURCE = Argumentation_Package.ASSERTED_INFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__TARGET = Argumentation_Package.ASSERTED_INFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__REASONING = Argumentation_Package.ASSERTED_INFERENCE__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF__REQUIES = Argumentation_Package.ASSERTED_INFERENCE__REQUIES;

	/**
	 * The number of structural features of the '<em>Is Sub Claim Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF_FEATURE_COUNT = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Sub Claim Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLAIM_OF_OPERATION_COUNT = Argumentation_Package.ASSERTED_INFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.SupportsImpl <em>Supports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.SupportsImpl
	 * @see cae.impl.Cae_PackageImpl#getSupports()
	 * @generated
	 */
	int SUPPORTS = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__GID = Argumentation_Package.ASSERTED_INFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__IS_CITATION = Argumentation_Package.ASSERTED_INFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__IS_ABSTRACT = Argumentation_Package.ASSERTED_INFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__CITED_ELEMENT = Argumentation_Package.ASSERTED_INFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ABSTRACT_FORM = Argumentation_Package.ASSERTED_INFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__NAME = Argumentation_Package.ASSERTED_INFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__DESCRIPTION = Argumentation_Package.ASSERTED_INFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ASSERTED_INFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__NOTE = Argumentation_Package.ASSERTED_INFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__TAGGED_VALUE = Argumentation_Package.ASSERTED_INFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__UNINSTANTIATED = Argumentation_Package.ASSERTED_INFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__CONTENT = Argumentation_Package.ASSERTED_INFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ASSERTION_DECLARATION = Argumentation_Package.ASSERTED_INFERENCE__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__META_CLAIM = Argumentation_Package.ASSERTED_INFERENCE__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__IS_COUNTER = Argumentation_Package.ASSERTED_INFERENCE__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__SOURCE = Argumentation_Package.ASSERTED_INFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__TARGET = Argumentation_Package.ASSERTED_INFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__REASONING = Argumentation_Package.ASSERTED_INFERENCE__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__REQUIES = Argumentation_Package.ASSERTED_INFERENCE__REQUIES;

	/**
	 * The number of structural features of the '<em>Supports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_FEATURE_COUNT = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Supports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_OPERATION_COUNT = Argumentation_Package.ASSERTED_INFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cae.impl.IsEvidenceForImpl <em>Is Evidence For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cae.impl.IsEvidenceForImpl
	 * @see cae.impl.Cae_PackageImpl#getIsEvidenceFor()
	 * @generated
	 */
	int IS_EVIDENCE_FOR = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__GID = Argumentation_Package.ASSERTED_EVIDENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__IS_CITATION = Argumentation_Package.ASSERTED_EVIDENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__IS_ABSTRACT = Argumentation_Package.ASSERTED_EVIDENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__CITED_ELEMENT = Argumentation_Package.ASSERTED_EVIDENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__ABSTRACT_FORM = Argumentation_Package.ASSERTED_EVIDENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__NAME = Argumentation_Package.ASSERTED_EVIDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__DESCRIPTION = Argumentation_Package.ASSERTED_EVIDENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ASSERTED_EVIDENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__NOTE = Argumentation_Package.ASSERTED_EVIDENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__TAGGED_VALUE = Argumentation_Package.ASSERTED_EVIDENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__UNINSTANTIATED = Argumentation_Package.ASSERTED_EVIDENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__CONTENT = Argumentation_Package.ASSERTED_EVIDENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__ASSERTION_DECLARATION = Argumentation_Package.ASSERTED_EVIDENCE__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__META_CLAIM = Argumentation_Package.ASSERTED_EVIDENCE__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__IS_COUNTER = Argumentation_Package.ASSERTED_EVIDENCE__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__SOURCE = Argumentation_Package.ASSERTED_EVIDENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__TARGET = Argumentation_Package.ASSERTED_EVIDENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__REASONING = Argumentation_Package.ASSERTED_EVIDENCE__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR__REQUIES = Argumentation_Package.ASSERTED_EVIDENCE__REQUIES;

	/**
	 * The number of structural features of the '<em>Is Evidence For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR_FEATURE_COUNT = Argumentation_Package.ASSERTED_EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Evidence For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EVIDENCE_FOR_OPERATION_COUNT = Argumentation_Package.ASSERTED_EVIDENCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cae.CAEModule <em>CAE Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAE Module</em>'.
	 * @see cae.CAEModule
	 * @generated
	 */
	EClass getCAEModule();

	/**
	 * Returns the meta object for class '{@link cae.CAEModuleInterface <em>CAE Module Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAE Module Interface</em>'.
	 * @see cae.CAEModuleInterface
	 * @generated
	 */
	EClass getCAEModuleInterface();

	/**
	 * Returns the meta object for class '{@link cae.CAEModuleBinding <em>CAE Module Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAE Module Binding</em>'.
	 * @see cae.CAEModuleBinding
	 * @generated
	 */
	EClass getCAEModuleBinding();

	/**
	 * Returns the meta object for class '{@link cae.CAEClaim <em>CAE Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAE Claim</em>'.
	 * @see cae.CAEClaim
	 * @generated
	 */
	EClass getCAEClaim();

	/**
	 * Returns the meta object for class '{@link cae.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see cae.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link cae.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see cae.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for class '{@link cae.IsSubClaimOf <em>Is Sub Claim Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Sub Claim Of</em>'.
	 * @see cae.IsSubClaimOf
	 * @generated
	 */
	EClass getIsSubClaimOf();

	/**
	 * Returns the meta object for class '{@link cae.Supports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supports</em>'.
	 * @see cae.Supports
	 * @generated
	 */
	EClass getSupports();

	/**
	 * Returns the meta object for class '{@link cae.IsEvidenceFor <em>Is Evidence For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Evidence For</em>'.
	 * @see cae.IsEvidenceFor
	 * @generated
	 */
	EClass getIsEvidenceFor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cae_Factory getCae_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cae.impl.CAEModuleImpl <em>CAE Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.CAEModuleImpl
		 * @see cae.impl.Cae_PackageImpl#getCAEModule()
		 * @generated
		 */
		EClass CAE_MODULE = eINSTANCE.getCAEModule();

		/**
		 * The meta object literal for the '{@link cae.impl.CAEModuleInterfaceImpl <em>CAE Module Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.CAEModuleInterfaceImpl
		 * @see cae.impl.Cae_PackageImpl#getCAEModuleInterface()
		 * @generated
		 */
		EClass CAE_MODULE_INTERFACE = eINSTANCE.getCAEModuleInterface();

		/**
		 * The meta object literal for the '{@link cae.impl.CAEModuleBindingImpl <em>CAE Module Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.CAEModuleBindingImpl
		 * @see cae.impl.Cae_PackageImpl#getCAEModuleBinding()
		 * @generated
		 */
		EClass CAE_MODULE_BINDING = eINSTANCE.getCAEModuleBinding();

		/**
		 * The meta object literal for the '{@link cae.impl.CAEClaimImpl <em>CAE Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.CAEClaimImpl
		 * @see cae.impl.Cae_PackageImpl#getCAEClaim()
		 * @generated
		 */
		EClass CAE_CLAIM = eINSTANCE.getCAEClaim();

		/**
		 * The meta object literal for the '{@link cae.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.ArgumentImpl
		 * @see cae.impl.Cae_PackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link cae.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.EvidenceImpl
		 * @see cae.impl.Cae_PackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '{@link cae.impl.IsSubClaimOfImpl <em>Is Sub Claim Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.IsSubClaimOfImpl
		 * @see cae.impl.Cae_PackageImpl#getIsSubClaimOf()
		 * @generated
		 */
		EClass IS_SUB_CLAIM_OF = eINSTANCE.getIsSubClaimOf();

		/**
		 * The meta object literal for the '{@link cae.impl.SupportsImpl <em>Supports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.SupportsImpl
		 * @see cae.impl.Cae_PackageImpl#getSupports()
		 * @generated
		 */
		EClass SUPPORTS = eINSTANCE.getSupports();

		/**
		 * The meta object literal for the '{@link cae.impl.IsEvidenceForImpl <em>Is Evidence For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cae.impl.IsEvidenceForImpl
		 * @see cae.impl.Cae_PackageImpl#getIsEvidenceFor()
		 * @generated
		 */
		EClass IS_EVIDENCE_FOR = eINSTANCE.getIsEvidenceFor();

	}

} //Cae_Package
