package assuranceCase.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import argumentation.Argumentation_Package;
import artifact.Artifact_Package;
import cae.Cae_Package;
import gsn.Gsn_Package;
import terminology.Terminology_Package;

/**
 * @generated
 */
public class AssurancecaseElementTypes {

	/**
	* @generated
	*/
	private AssurancecaseElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType AssuranceCasePackage_1000 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.AssuranceCasePackage_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssuranceCasePackage_2001 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.AssuranceCasePackage_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssuranceCasePackageBinding_2018 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.AssuranceCasePackageBinding_2018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AssuranceCasePackageInterface_2019 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.AssuranceCasePackageInterface_2019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentPackage_2004 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.ArgumentPackage_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentPackageBinding_2002 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.ArgumentPackageBinding_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArgumentPackageInterface_2003 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.ArgumentPackageInterface_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactPackage_2007 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.ArtifactPackage_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactPackageBinding_2008 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.ArtifactPackageBinding_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ArtifactPackageInterface_2009 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.ArtifactPackageInterface_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TerminologyPackage_2010 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.TerminologyPackage_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TerminologyPackageInterface_2011 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.TerminologyPackageInterface_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TerminologyPackageBinding_2012 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.TerminologyPackageBinding_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Module_2013 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.Module_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContractModule_2014 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.ContractModule_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CAEModule_2015 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.CAEModule_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CAEModuleInterface_2016 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.CAEModuleInterface_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CAEModuleBinding_2017 = getElementType(
			"org.eclipse.acme.sacm.diagram.assurancecase.CAEModuleBinding_2017"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(AssuranceCasePackage_1000,
					assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackage());

			elements.put(AssuranceCasePackage_2001,
					assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackage());

			elements.put(AssuranceCasePackageBinding_2018,
					assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackageBinding());

			elements.put(AssuranceCasePackageInterface_2019,
					assuranceCase.AssuranceCase_Package.eINSTANCE.getAssuranceCasePackageInterface());

			elements.put(ArgumentPackage_2004, Argumentation_Package.eINSTANCE.getArgumentPackage());

			elements.put(ArgumentPackageBinding_2002, Argumentation_Package.eINSTANCE.getArgumentPackageBinding());

			elements.put(ArgumentPackageInterface_2003, Argumentation_Package.eINSTANCE.getArgumentPackageInterface());

			elements.put(ArtifactPackage_2007, Artifact_Package.eINSTANCE.getArtifactPackage());

			elements.put(ArtifactPackageBinding_2008, Artifact_Package.eINSTANCE.getArtifactPackageBinding());

			elements.put(ArtifactPackageInterface_2009, Artifact_Package.eINSTANCE.getArtifactPackageInterface());

			elements.put(TerminologyPackage_2010, Terminology_Package.eINSTANCE.getTerminologyPackage());

			elements.put(TerminologyPackageInterface_2011,
					Terminology_Package.eINSTANCE.getTerminologyPackageInterface());

			elements.put(TerminologyPackageBinding_2012, Terminology_Package.eINSTANCE.getTerminologyPackageBinding());

			elements.put(Module_2013, Gsn_Package.eINSTANCE.getModule());

			elements.put(ContractModule_2014, Gsn_Package.eINSTANCE.getContractModule());

			elements.put(CAEModule_2015, Cae_Package.eINSTANCE.getCAEModule());

			elements.put(CAEModuleInterface_2016, Cae_Package.eINSTANCE.getCAEModuleInterface());

			elements.put(CAEModuleBinding_2017, Cae_Package.eINSTANCE.getCAEModuleBinding());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(AssuranceCasePackage_1000);
			KNOWN_ELEMENT_TYPES.add(AssuranceCasePackage_2001);
			KNOWN_ELEMENT_TYPES.add(AssuranceCasePackageBinding_2018);
			KNOWN_ELEMENT_TYPES.add(AssuranceCasePackageInterface_2019);
			KNOWN_ELEMENT_TYPES.add(ArgumentPackage_2004);
			KNOWN_ELEMENT_TYPES.add(ArgumentPackageBinding_2002);
			KNOWN_ELEMENT_TYPES.add(ArgumentPackageInterface_2003);
			KNOWN_ELEMENT_TYPES.add(ArtifactPackage_2007);
			KNOWN_ELEMENT_TYPES.add(ArtifactPackageBinding_2008);
			KNOWN_ELEMENT_TYPES.add(ArtifactPackageInterface_2009);
			KNOWN_ELEMENT_TYPES.add(TerminologyPackage_2010);
			KNOWN_ELEMENT_TYPES.add(TerminologyPackageInterface_2011);
			KNOWN_ELEMENT_TYPES.add(TerminologyPackageBinding_2012);
			KNOWN_ELEMENT_TYPES.add(Module_2013);
			KNOWN_ELEMENT_TYPES.add(ContractModule_2014);
			KNOWN_ELEMENT_TYPES.add(CAEModule_2015);
			KNOWN_ELEMENT_TYPES.add(CAEModuleInterface_2016);
			KNOWN_ELEMENT_TYPES.add(CAEModuleBinding_2017);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageCanvasEditPart.VISUAL_ID:
			return AssuranceCasePackage_1000;
		case assuranceCase.diagram.edit.parts.AssuranceCasePackage2EditPart.VISUAL_ID:
			return AssuranceCasePackage_2001;
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageBindingEditPart.VISUAL_ID:
			return AssuranceCasePackageBinding_2018;
		case assuranceCase.diagram.edit.parts.AssuranceCasePackageInterfaceEditPart.VISUAL_ID:
			return AssuranceCasePackageInterface_2019;
		case assuranceCase.diagram.edit.parts.ArgumentPackageEditPart.VISUAL_ID:
			return ArgumentPackage_2004;
		case assuranceCase.diagram.edit.parts.ArgumentPackageBindingEditPart.VISUAL_ID:
			return ArgumentPackageBinding_2002;
		case assuranceCase.diagram.edit.parts.ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return ArgumentPackageInterface_2003;
		case assuranceCase.diagram.edit.parts.ArtifactPackageEditPart.VISUAL_ID:
			return ArtifactPackage_2007;
		case assuranceCase.diagram.edit.parts.ArtifactPackageBindingEditPart.VISUAL_ID:
			return ArtifactPackageBinding_2008;
		case assuranceCase.diagram.edit.parts.ArtifactPackageInterfaceEditPart.VISUAL_ID:
			return ArtifactPackageInterface_2009;
		case assuranceCase.diagram.edit.parts.TerminologyPackageEditPart.VISUAL_ID:
			return TerminologyPackage_2010;
		case assuranceCase.diagram.edit.parts.TerminologyPackageInterfaceEditPart.VISUAL_ID:
			return TerminologyPackageInterface_2011;
		case assuranceCase.diagram.edit.parts.TerminologyPackageBindingEditPart.VISUAL_ID:
			return TerminologyPackageBinding_2012;
		case assuranceCase.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return Module_2013;
		case assuranceCase.diagram.edit.parts.ContractModuleEditPart.VISUAL_ID:
			return ContractModule_2014;
		case assuranceCase.diagram.edit.parts.CAEModuleEditPart.VISUAL_ID:
			return CAEModule_2015;
		case assuranceCase.diagram.edit.parts.CAEModuleInterfaceEditPart.VISUAL_ID:
			return CAEModuleInterface_2016;
		case assuranceCase.diagram.edit.parts.CAEModuleBindingEditPart.VISUAL_ID:
			return CAEModuleBinding_2017;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return assuranceCase.diagram.providers.AssurancecaseElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return assuranceCase.diagram.providers.AssurancecaseElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return assuranceCase.diagram.providers.AssurancecaseElementTypes.getElement(elementTypeAdapter);
		}
	};

}
