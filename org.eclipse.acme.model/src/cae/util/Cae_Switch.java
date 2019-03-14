/**
 */
package cae.util;

import argumentation.ArgumentAsset;
import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageBinding;
import argumentation.ArgumentPackageInterface;
import argumentation.ArgumentReasoning;
import argumentation.ArgumentationElement;
import argumentation.ArtifactReference;
import argumentation.AssertedEvidence;
import argumentation.AssertedInference;
import argumentation.AssertedRelationship;
import argumentation.Assertion;
import argumentation.Claim;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;
import base.SACMElement;

import cae.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cae.Cae_Package
 * @generated
 */
public class Cae_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cae_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cae_Switch() {
		if (modelPackage == null) {
			modelPackage = Cae_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Cae_Package.CAE_MODULE: {
				CAEModule caeModule = (CAEModule)theEObject;
				T result = caseCAEModule(caeModule);
				if (result == null) result = caseArgumentPackage(caeModule);
				if (result == null) result = caseArgumentationElement(caeModule);
				if (result == null) result = caseArtifactElement(caeModule);
				if (result == null) result = caseModelElement(caeModule);
				if (result == null) result = caseSACMElement(caeModule);
				if (result == null) result = caseElement(caeModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.CAE_MODULE_INTERFACE: {
				CAEModuleInterface caeModuleInterface = (CAEModuleInterface)theEObject;
				T result = caseCAEModuleInterface(caeModuleInterface);
				if (result == null) result = caseArgumentPackageInterface(caeModuleInterface);
				if (result == null) result = caseArgumentPackage(caeModuleInterface);
				if (result == null) result = caseArgumentationElement(caeModuleInterface);
				if (result == null) result = caseArtifactElement(caeModuleInterface);
				if (result == null) result = caseModelElement(caeModuleInterface);
				if (result == null) result = caseSACMElement(caeModuleInterface);
				if (result == null) result = caseElement(caeModuleInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.CAE_MODULE_BINDING: {
				CAEModuleBinding caeModuleBinding = (CAEModuleBinding)theEObject;
				T result = caseCAEModuleBinding(caeModuleBinding);
				if (result == null) result = caseArgumentPackageBinding(caeModuleBinding);
				if (result == null) result = caseArgumentPackage(caeModuleBinding);
				if (result == null) result = caseArgumentationElement(caeModuleBinding);
				if (result == null) result = caseArtifactElement(caeModuleBinding);
				if (result == null) result = caseModelElement(caeModuleBinding);
				if (result == null) result = caseSACMElement(caeModuleBinding);
				if (result == null) result = caseElement(caeModuleBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.CAE_CLAIM: {
				CAEClaim caeClaim = (CAEClaim)theEObject;
				T result = caseCAEClaim(caeClaim);
				if (result == null) result = caseClaim(caeClaim);
				if (result == null) result = caseAssertion(caeClaim);
				if (result == null) result = caseArgumentAsset(caeClaim);
				if (result == null) result = caseArgumentationElement(caeClaim);
				if (result == null) result = caseArtifactElement(caeClaim);
				if (result == null) result = caseModelElement(caeClaim);
				if (result == null) result = caseSACMElement(caeClaim);
				if (result == null) result = caseElement(caeClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseArgumentReasoning(argument);
				if (result == null) result = caseArgumentAsset(argument);
				if (result == null) result = caseArgumentationElement(argument);
				if (result == null) result = caseArtifactElement(argument);
				if (result == null) result = caseModelElement(argument);
				if (result == null) result = caseSACMElement(argument);
				if (result == null) result = caseElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.EVIDENCE: {
				Evidence evidence = (Evidence)theEObject;
				T result = caseEvidence(evidence);
				if (result == null) result = caseArtifactReference(evidence);
				if (result == null) result = caseArgumentAsset(evidence);
				if (result == null) result = caseArgumentationElement(evidence);
				if (result == null) result = caseArtifactElement(evidence);
				if (result == null) result = caseModelElement(evidence);
				if (result == null) result = caseSACMElement(evidence);
				if (result == null) result = caseElement(evidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.IS_SUB_CLAIM_OF: {
				IsSubClaimOf isSubClaimOf = (IsSubClaimOf)theEObject;
				T result = caseIsSubClaimOf(isSubClaimOf);
				if (result == null) result = caseAssertedInference(isSubClaimOf);
				if (result == null) result = caseAssertedRelationship(isSubClaimOf);
				if (result == null) result = caseAssertion(isSubClaimOf);
				if (result == null) result = caseArgumentAsset(isSubClaimOf);
				if (result == null) result = caseArgumentationElement(isSubClaimOf);
				if (result == null) result = caseArtifactElement(isSubClaimOf);
				if (result == null) result = caseModelElement(isSubClaimOf);
				if (result == null) result = caseSACMElement(isSubClaimOf);
				if (result == null) result = caseElement(isSubClaimOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.SUPPORTS: {
				Supports supports = (Supports)theEObject;
				T result = caseSupports(supports);
				if (result == null) result = caseAssertedInference(supports);
				if (result == null) result = caseAssertedRelationship(supports);
				if (result == null) result = caseAssertion(supports);
				if (result == null) result = caseArgumentAsset(supports);
				if (result == null) result = caseArgumentationElement(supports);
				if (result == null) result = caseArtifactElement(supports);
				if (result == null) result = caseModelElement(supports);
				if (result == null) result = caseSACMElement(supports);
				if (result == null) result = caseElement(supports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cae_Package.IS_EVIDENCE_FOR: {
				IsEvidenceFor isEvidenceFor = (IsEvidenceFor)theEObject;
				T result = caseIsEvidenceFor(isEvidenceFor);
				if (result == null) result = caseAssertedEvidence(isEvidenceFor);
				if (result == null) result = caseAssertedRelationship(isEvidenceFor);
				if (result == null) result = caseAssertion(isEvidenceFor);
				if (result == null) result = caseArgumentAsset(isEvidenceFor);
				if (result == null) result = caseArgumentationElement(isEvidenceFor);
				if (result == null) result = caseArtifactElement(isEvidenceFor);
				if (result == null) result = caseModelElement(isEvidenceFor);
				if (result == null) result = caseSACMElement(isEvidenceFor);
				if (result == null) result = caseElement(isEvidenceFor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAE Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAE Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEModule(CAEModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAE Module Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAE Module Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEModuleInterface(CAEModuleInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAE Module Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAE Module Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEModuleBinding(CAEModuleBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAE Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAE Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEClaim(CAEClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidence(Evidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Sub Claim Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Sub Claim Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsSubClaimOf(IsSubClaimOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupports(Supports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Evidence For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Evidence For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsEvidenceFor(IsEvidenceFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentationElement(ArgumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackage(ArgumentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageInterface(ArgumentPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageBinding(ArgumentPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentAsset(ArgumentAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentReasoning(ArgumentReasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactReference(ArtifactReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedRelationship(AssertedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedInference(AssertedInference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedEvidence(AssertedEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Cae_Switch
