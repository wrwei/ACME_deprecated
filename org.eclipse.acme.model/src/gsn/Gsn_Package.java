/**
 */
package gsn;

import argumentation.Argumentation_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see gsn.Gsn_Factory
 * @model kind="package"
 * @generated
 */
public interface Gsn_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme/1.0/gsn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsn_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gsn_Package eINSTANCE = gsn.impl.Gsn_PackageImpl.init();

	/**
	 * The meta object id for the '{@link gsn.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ModuleImpl
	 * @see gsn.impl.Gsn_PackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GID = Argumentation_Package.ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_CITATION = Argumentation_Package.ARGUMENT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = Argumentation_Package.ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = Argumentation_Package.ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NOTE = Argumentation_Package.ARGUMENT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__UNINSTANTIATED = Argumentation_Package.ARGUMENT_PACKAGE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ARGUMENTATION_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ContractModuleImpl <em>Contract Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ContractModuleImpl
	 * @see gsn.impl.Gsn_PackageImpl#getContractModule()
	 * @generated
	 */
	int CONTRACT_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__GID = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IS_CITATION = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__NAME = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__DESCRIPTION = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__NOTE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__UNINSTANTIATED = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__ARGUMENTATION_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__ARGUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__PARTICIPANT_PACKAGE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE;

	/**
	 * The number of structural features of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_OPERATION_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ChoiceNodeImpl <em>Choice Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ChoiceNodeImpl
	 * @see gsn.impl.Gsn_PackageImpl#getChoiceNode()
	 * @generated
	 */
	int CHOICE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__GID = Argumentation_Package.ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__IS_CITATION = Argumentation_Package.ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__NAME = Argumentation_Package.ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__DESCRIPTION = Argumentation_Package.ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__NOTE = Argumentation_Package.ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__UNINSTANTIATED = Argumentation_Package.ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__CONTENT = Argumentation_Package.ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE__CHOICE = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_NODE_OPERATION_COUNT = Argumentation_Package.ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ContextImpl
	 * @see gsn.impl.Gsn_PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GID = Argumentation_Package.ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_CITATION = Argumentation_Package.ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_ABSTRACT = Argumentation_Package.ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CITED_ELEMENT = Argumentation_Package.ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = Argumentation_Package.ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = Argumentation_Package.ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NOTE = Argumentation_Package.ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TAGGED_VALUE = Argumentation_Package.ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UNINSTANTIATED = Argumentation_Package.ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTENT = Argumentation_Package.ARGUMENT_ASSET__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_PUBLIC = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To External Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__REFERS_TO_EXTERNAL_MATERIAL = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = Argumentation_Package.ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.StrategyImpl
	 * @see gsn.impl.Gsn_PackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__GID = Argumentation_Package.ARGUMENT_REASONING__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_CITATION = Argumentation_Package.ARGUMENT_REASONING__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_ABSTRACT = Argumentation_Package.ARGUMENT_REASONING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CITED_ELEMENT = Argumentation_Package.ARGUMENT_REASONING__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_REASONING__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = Argumentation_Package.ARGUMENT_REASONING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = Argumentation_Package.ARGUMENT_REASONING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_REASONING__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NOTE = Argumentation_Package.ARGUMENT_REASONING__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__TAGGED_VALUE = Argumentation_Package.ARGUMENT_REASONING__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__UNINSTANTIATED = Argumentation_Package.ARGUMENT_REASONING__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTENT = Argumentation_Package.ARGUMENT_REASONING__CONTENT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRUCTURE = Argumentation_Package.ARGUMENT_REASONING__STRUCTURE;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__UNDEVELOPED = Argumentation_Package.ARGUMENT_REASONING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = Argumentation_Package.ARGUMENT_REASONING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = Argumentation_Package.ARGUMENT_REASONING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.GoalImpl
	 * @see gsn.impl.Gsn_PackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UNINSTANTIATED = Argumentation_Package.CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTENT = Argumentation_Package.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_PUBLIC = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UNDEVELOPED = Argumentation_Package.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Be Supported By Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TO_BE_SUPPORTED_BY_CONTRACT = Argumentation_Package.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = Argumentation_Package.CLAIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.JustificationImpl
	 * @see gsn.impl.Gsn_PackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__UNINSTANTIATED = Argumentation_Package.CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONTENT = Argumentation_Package.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_OPERATION_COUNT = Argumentation_Package.CLAIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AssumptionImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__UNINSTANTIATED = Argumentation_Package.CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTENT = Argumentation_Package.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_OPERATION_COUNT = Argumentation_Package.CLAIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.AwayGoalImpl <em>Away Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwayGoalImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwayGoal()
	 * @generated
	 */
	int AWAY_GOAL = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__UNINSTANTIATED = Argumentation_Package.CLAIM__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CONTENT = Argumentation_Package.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The number of structural features of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_OPERATION_COUNT = Argumentation_Package.CLAIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwaySolutionImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwaySolution()
	 * @generated
	 */
	int AWAY_SOLUTION = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__UNINSTANTIATED = Argumentation_Package.ARTIFACT_REFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CONTENT = Argumentation_Package.ARTIFACT_REFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_OPERATION_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.AwayContextImpl <em>Away Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwayContextImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwayContext()
	 * @generated
	 */
	int AWAY_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__GID = Argumentation_Package.ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IS_CITATION = Argumentation_Package.ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IS_ABSTRACT = Argumentation_Package.ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CITED_ELEMENT = Argumentation_Package.ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__NAME = Argumentation_Package.ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__DESCRIPTION = Argumentation_Package.ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__NOTE = Argumentation_Package.ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__TAGGED_VALUE = Argumentation_Package.ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__UNINSTANTIATED = Argumentation_Package.ARGUMENT_ASSET__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CONTENT = Argumentation_Package.ARGUMENT_ASSET__CONTENT;

	/**
	 * The number of structural features of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_FEATURE_COUNT = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_OPERATION_COUNT = Argumentation_Package.ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ModuleReferenceImpl
	 * @see gsn.impl.Gsn_PackageImpl#getModuleReference()
	 * @generated
	 */
	int MODULE_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__UNINSTANTIATED = Argumentation_Package.ARTIFACT_REFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__CONTENT = Argumentation_Package.ARTIFACT_REFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__MODULE = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE_OPERATION_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ContractModuleReferenceImpl <em>Contract Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ContractModuleReferenceImpl
	 * @see gsn.impl.Gsn_PackageImpl#getContractModuleReference()
	 * @generated
	 */
	int CONTRACT_MODULE_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__UNINSTANTIATED = Argumentation_Package.ARTIFACT_REFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__CONTENT = Argumentation_Package.ARTIFACT_REFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__MODULE = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contract Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contract Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE_OPERATION_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.SolutionImpl
	 * @see gsn.impl.Gsn_PackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 13;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__UNINSTANTIATED = Argumentation_Package.ARTIFACT_REFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTENT = Argumentation_Package.ARTIFACT_REFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_PUBLIC = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.SupportedByImpl
	 * @see gsn.impl.Gsn_PackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 14;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__GID = Argumentation_Package.ASSERTED_INFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_CITATION = Argumentation_Package.ASSERTED_INFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_ABSTRACT = Argumentation_Package.ASSERTED_INFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__CITED_ELEMENT = Argumentation_Package.ASSERTED_INFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ABSTRACT_FORM = Argumentation_Package.ASSERTED_INFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__NAME = Argumentation_Package.ASSERTED_INFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__DESCRIPTION = Argumentation_Package.ASSERTED_INFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ASSERTED_INFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__NOTE = Argumentation_Package.ASSERTED_INFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TAGGED_VALUE = Argumentation_Package.ASSERTED_INFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__UNINSTANTIATED = Argumentation_Package.ASSERTED_INFERENCE__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__CONTENT = Argumentation_Package.ASSERTED_INFERENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ASSERTION_DECLARATION = Argumentation_Package.ASSERTED_INFERENCE__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__META_CLAIM = Argumentation_Package.ASSERTED_INFERENCE__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_COUNTER = Argumentation_Package.ASSERTED_INFERENCE__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__SOURCE = Argumentation_Package.ASSERTED_INFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TARGET = Argumentation_Package.ASSERTED_INFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__REASONING = Argumentation_Package.ASSERTED_INFERENCE__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__REQUIES = Argumentation_Package.ASSERTED_INFERENCE__REQUIES;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_MANY = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_OPTIONAL = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_CHOICE = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_OPERATION_COUNT = Argumentation_Package.ASSERTED_INFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.InContextOfImpl
	 * @see gsn.impl.Gsn_PackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 15;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__GID = Argumentation_Package.ASSERTED_CONTEXT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_CITATION = Argumentation_Package.ASSERTED_CONTEXT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_ABSTRACT = Argumentation_Package.ASSERTED_CONTEXT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CITED_ELEMENT = Argumentation_Package.ASSERTED_CONTEXT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__ABSTRACT_FORM = Argumentation_Package.ASSERTED_CONTEXT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__NAME = Argumentation_Package.ASSERTED_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__DESCRIPTION = Argumentation_Package.ASSERTED_CONTEXT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ASSERTED_CONTEXT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__NOTE = Argumentation_Package.ASSERTED_CONTEXT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__TAGGED_VALUE = Argumentation_Package.ASSERTED_CONTEXT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__UNINSTANTIATED = Argumentation_Package.ASSERTED_CONTEXT__UNINSTANTIATED;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CONTENT = Argumentation_Package.ASSERTED_CONTEXT__CONTENT;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__ASSERTION_DECLARATION = Argumentation_Package.ASSERTED_CONTEXT__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__META_CLAIM = Argumentation_Package.ASSERTED_CONTEXT__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_COUNTER = Argumentation_Package.ASSERTED_CONTEXT__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__SOURCE = Argumentation_Package.ASSERTED_CONTEXT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__TARGET = Argumentation_Package.ASSERTED_CONTEXT__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__REASONING = Argumentation_Package.ASSERTED_CONTEXT__REASONING;

	/**
	 * The feature id for the '<em><b>Requies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__REQUIES = Argumentation_Package.ASSERTED_CONTEXT__REQUIES;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_MANY = Argumentation_Package.ASSERTED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_OPTIONAL = Argumentation_Package.ASSERTED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_CHOICE = Argumentation_Package.ASSERTED_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = Argumentation_Package.ASSERTED_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_OPERATION_COUNT = Argumentation_Package.ASSERTED_CONTEXT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gsn.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see gsn.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for class '{@link gsn.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module</em>'.
	 * @see gsn.ContractModule
	 * @generated
	 */
	EClass getContractModule();

	/**
	 * Returns the meta object for class '{@link gsn.ChoiceNode <em>Choice Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Node</em>'.
	 * @see gsn.ChoiceNode
	 * @generated
	 */
	EClass getChoiceNode();

	/**
	 * Returns the meta object for the attribute '{@link gsn.ChoiceNode#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choice</em>'.
	 * @see gsn.ChoiceNode#getChoice()
	 * @see #getChoiceNode()
	 * @generated
	 */
	EAttribute getChoiceNode_Choice();

	/**
	 * Returns the meta object for class '{@link gsn.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see gsn.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Context#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Context#isIsPublic()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Context#isRefersToExternalMaterial <em>Refers To External Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refers To External Material</em>'.
	 * @see gsn.Context#isRefersToExternalMaterial()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_RefersToExternalMaterial();

	/**
	 * Returns the meta object for class '{@link gsn.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see gsn.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Strategy#isUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see gsn.Strategy#isUndeveloped()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Undeveloped();

	/**
	 * Returns the meta object for class '{@link gsn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see gsn.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Goal#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Goal#isIsPublic()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Goal#isUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see gsn.Goal#isUndeveloped()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Undeveloped();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Goal#isToBeSupportedByContract <em>To Be Supported By Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Supported By Contract</em>'.
	 * @see gsn.Goal#isToBeSupportedByContract()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_ToBeSupportedByContract();

	/**
	 * Returns the meta object for class '{@link gsn.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see gsn.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link gsn.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see gsn.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link gsn.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Goal</em>'.
	 * @see gsn.AwayGoal
	 * @generated
	 */
	EClass getAwayGoal();

	/**
	 * Returns the meta object for class '{@link gsn.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Solution</em>'.
	 * @see gsn.AwaySolution
	 * @generated
	 */
	EClass getAwaySolution();

	/**
	 * Returns the meta object for class '{@link gsn.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Context</em>'.
	 * @see gsn.AwayContext
	 * @generated
	 */
	EClass getAwayContext();

	/**
	 * Returns the meta object for class '{@link gsn.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Reference</em>'.
	 * @see gsn.ModuleReference
	 * @generated
	 */
	EClass getModuleReference();

	/**
	 * Returns the meta object for the reference '{@link gsn.ModuleReference#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see gsn.ModuleReference#getModule()
	 * @see #getModuleReference()
	 * @generated
	 */
	EReference getModuleReference_Module();

	/**
	 * Returns the meta object for class '{@link gsn.ContractModuleReference <em>Contract Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module Reference</em>'.
	 * @see gsn.ContractModuleReference
	 * @generated
	 */
	EClass getContractModuleReference();

	/**
	 * Returns the meta object for the reference '{@link gsn.ContractModuleReference#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see gsn.ContractModuleReference#getModule()
	 * @see #getContractModuleReference()
	 * @generated
	 */
	EReference getContractModuleReference_Module();

	/**
	 * Returns the meta object for class '{@link gsn.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see gsn.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Solution#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Solution#isIsPublic()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_IsPublic();

	/**
	 * Returns the meta object for class '{@link gsn.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see gsn.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for the attribute '{@link gsn.SupportedBy#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see gsn.SupportedBy#isIsMany()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EAttribute getSupportedBy_IsMany();

	/**
	 * Returns the meta object for the attribute '{@link gsn.SupportedBy#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see gsn.SupportedBy#isIsOptional()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EAttribute getSupportedBy_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link gsn.SupportedBy#isIsChoice <em>Is Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Choice</em>'.
	 * @see gsn.SupportedBy#isIsChoice()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EAttribute getSupportedBy_IsChoice();

	/**
	 * Returns the meta object for class '{@link gsn.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see gsn.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for the attribute '{@link gsn.InContextOf#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see gsn.InContextOf#isIsMany()
	 * @see #getInContextOf()
	 * @generated
	 */
	EAttribute getInContextOf_IsMany();

	/**
	 * Returns the meta object for the attribute '{@link gsn.InContextOf#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see gsn.InContextOf#isIsOptional()
	 * @see #getInContextOf()
	 * @generated
	 */
	EAttribute getInContextOf_IsOptional();

	/**
	 * Returns the meta object for the attribute '{@link gsn.InContextOf#isIsChoice <em>Is Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Choice</em>'.
	 * @see gsn.InContextOf#isIsChoice()
	 * @see #getInContextOf()
	 * @generated
	 */
	EAttribute getInContextOf_IsChoice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gsn_Factory getGsn_Factory();

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
		 * The meta object literal for the '{@link gsn.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ModuleImpl
		 * @see gsn.impl.Gsn_PackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '{@link gsn.impl.ContractModuleImpl <em>Contract Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ContractModuleImpl
		 * @see gsn.impl.Gsn_PackageImpl#getContractModule()
		 * @generated
		 */
		EClass CONTRACT_MODULE = eINSTANCE.getContractModule();

		/**
		 * The meta object literal for the '{@link gsn.impl.ChoiceNodeImpl <em>Choice Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ChoiceNodeImpl
		 * @see gsn.impl.Gsn_PackageImpl#getChoiceNode()
		 * @generated
		 */
		EClass CHOICE_NODE = eINSTANCE.getChoiceNode();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_NODE__CHOICE = eINSTANCE.getChoiceNode_Choice();

		/**
		 * The meta object literal for the '{@link gsn.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ContextImpl
		 * @see gsn.impl.Gsn_PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__IS_PUBLIC = eINSTANCE.getContext_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Refers To External Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__REFERS_TO_EXTERNAL_MATERIAL = eINSTANCE.getContext_RefersToExternalMaterial();

		/**
		 * The meta object literal for the '{@link gsn.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.StrategyImpl
		 * @see gsn.impl.Gsn_PackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__UNDEVELOPED = eINSTANCE.getStrategy_Undeveloped();

		/**
		 * The meta object literal for the '{@link gsn.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.GoalImpl
		 * @see gsn.impl.Gsn_PackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__IS_PUBLIC = eINSTANCE.getGoal_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__UNDEVELOPED = eINSTANCE.getGoal_Undeveloped();

		/**
		 * The meta object literal for the '<em><b>To Be Supported By Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TO_BE_SUPPORTED_BY_CONTRACT = eINSTANCE.getGoal_ToBeSupportedByContract();

		/**
		 * The meta object literal for the '{@link gsn.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.JustificationImpl
		 * @see gsn.impl.Gsn_PackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AssumptionImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwayGoalImpl <em>Away Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwayGoalImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwayGoal()
		 * @generated
		 */
		EClass AWAY_GOAL = eINSTANCE.getAwayGoal();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwaySolutionImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwaySolution()
		 * @generated
		 */
		EClass AWAY_SOLUTION = eINSTANCE.getAwaySolution();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwayContextImpl <em>Away Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwayContextImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwayContext()
		 * @generated
		 */
		EClass AWAY_CONTEXT = eINSTANCE.getAwayContext();

		/**
		 * The meta object literal for the '{@link gsn.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ModuleReferenceImpl
		 * @see gsn.impl.Gsn_PackageImpl#getModuleReference()
		 * @generated
		 */
		EClass MODULE_REFERENCE = eINSTANCE.getModuleReference();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REFERENCE__MODULE = eINSTANCE.getModuleReference_Module();

		/**
		 * The meta object literal for the '{@link gsn.impl.ContractModuleReferenceImpl <em>Contract Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ContractModuleReferenceImpl
		 * @see gsn.impl.Gsn_PackageImpl#getContractModuleReference()
		 * @generated
		 */
		EClass CONTRACT_MODULE_REFERENCE = eINSTANCE.getContractModuleReference();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_MODULE_REFERENCE__MODULE = eINSTANCE.getContractModuleReference_Module();

		/**
		 * The meta object literal for the '{@link gsn.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.SolutionImpl
		 * @see gsn.impl.Gsn_PackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__IS_PUBLIC = eINSTANCE.getSolution_IsPublic();

		/**
		 * The meta object literal for the '{@link gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.SupportedByImpl
		 * @see gsn.impl.Gsn_PackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_BY__IS_MANY = eINSTANCE.getSupportedBy_IsMany();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_BY__IS_OPTIONAL = eINSTANCE.getSupportedBy_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Is Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_BY__IS_CHOICE = eINSTANCE.getSupportedBy_IsChoice();

		/**
		 * The meta object literal for the '{@link gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.InContextOfImpl
		 * @see gsn.impl.Gsn_PackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_CONTEXT_OF__IS_MANY = eINSTANCE.getInContextOf_IsMany();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_CONTEXT_OF__IS_OPTIONAL = eINSTANCE.getInContextOf_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Is Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_CONTEXT_OF__IS_CHOICE = eINSTANCE.getInContextOf_IsChoice();

	}

} //Gsn_Package
