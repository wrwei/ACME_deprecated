package gsn.diagram.providers;

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
import gsn.Gsn_Package;
import gsn.diagram.edit.parts.AssumptionEditPart;
import gsn.diagram.edit.parts.AwayContextEditPart;
import gsn.diagram.edit.parts.AwayGoalEditPart;
import gsn.diagram.edit.parts.AwaySolutionEditPart;
import gsn.diagram.edit.parts.ChoiceNodeEditPart;
import gsn.diagram.edit.parts.ContextEditPart;
import gsn.diagram.edit.parts.ContractModuleEditPart;
import gsn.diagram.edit.parts.ContractModuleReferenceEditPart;
import gsn.diagram.edit.parts.GoalEditPart;
import gsn.diagram.edit.parts.GsnEditPart;
import gsn.diagram.edit.parts.InContextOfEditPart;
import gsn.diagram.edit.parts.JustificationEditPart;
import gsn.diagram.edit.parts.ModuleEditPart;
import gsn.diagram.edit.parts.ModuleReferenceEditPart;
import gsn.diagram.edit.parts.SolutionEditPart;
import gsn.diagram.edit.parts.StrategyEditPart;
import gsn.diagram.edit.parts.SupportedByEditPart;
import gsn.diagram.part.GsnDiagramEditorPlugin;

/**
 * @generated
 */
public class GsnElementTypes {

	/**
	* @generated
	*/
	private GsnElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			GsnDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ArgumentPackage_1003 = getElementType(
			"org.eclipse.acme.diagram.gsn.ArgumentPackage_1003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Module_2301 = getElementType("org.eclipse.acme.diagram.gsn.Module_2301"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContractModule_2302 = getElementType(
			"org.eclipse.acme.diagram.gsn.ContractModule_2302"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Goal_2303 = getElementType("org.eclipse.acme.diagram.gsn.Goal_2303"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Strategy_2304 = getElementType("org.eclipse.acme.diagram.gsn.Strategy_2304"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Solution_2305 = getElementType("org.eclipse.acme.diagram.gsn.Solution_2305"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Context_2306 = getElementType("org.eclipse.acme.diagram.gsn.Context_2306"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Justification_2307 = getElementType(
			"org.eclipse.acme.diagram.gsn.Justification_2307"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Assumption_2308 = getElementType("org.eclipse.acme.diagram.gsn.Assumption_2308"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ModuleReference_2309 = getElementType(
			"org.eclipse.acme.diagram.gsn.ModuleReference_2309"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ChoiceNode_2310 = getElementType("org.eclipse.acme.diagram.gsn.ChoiceNode_2310"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ContractModuleReference_2311 = getElementType(
			"org.eclipse.acme.diagram.gsn.ContractModuleReference_2311"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AwayGoal_2312 = getElementType("org.eclipse.acme.diagram.gsn.AwayGoal_2312"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AwayContext_2313 = getElementType("org.eclipse.acme.diagram.gsn.AwayContext_2313"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AwaySolution_2314 = getElementType(
			"org.eclipse.acme.diagram.gsn.AwaySolution_2314"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SupportedBy_4401 = getElementType("org.eclipse.acme.diagram.gsn.SupportedBy_4401"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InContextOf_4402 = getElementType("org.eclipse.acme.diagram.gsn.InContextOf_4402"); //$NON-NLS-1$

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

			elements.put(ArgumentPackage_1003, Argumentation_Package.eINSTANCE.getArgumentPackage());

			elements.put(Module_2301, Gsn_Package.eINSTANCE.getModule());

			elements.put(ContractModule_2302, Gsn_Package.eINSTANCE.getContractModule());

			elements.put(Goal_2303, Gsn_Package.eINSTANCE.getGoal());

			elements.put(Strategy_2304, Gsn_Package.eINSTANCE.getStrategy());

			elements.put(Solution_2305, Gsn_Package.eINSTANCE.getSolution());

			elements.put(Context_2306, Gsn_Package.eINSTANCE.getContext());

			elements.put(Justification_2307, Gsn_Package.eINSTANCE.getJustification());

			elements.put(Assumption_2308, Gsn_Package.eINSTANCE.getAssumption());

			elements.put(ModuleReference_2309, Gsn_Package.eINSTANCE.getModuleReference());

			elements.put(ChoiceNode_2310, Gsn_Package.eINSTANCE.getChoiceNode());

			elements.put(ContractModuleReference_2311, Gsn_Package.eINSTANCE.getContractModuleReference());

			elements.put(AwayGoal_2312, Gsn_Package.eINSTANCE.getAwayGoal());

			elements.put(AwayContext_2313, Gsn_Package.eINSTANCE.getAwayContext());

			elements.put(AwaySolution_2314, Gsn_Package.eINSTANCE.getAwaySolution());

			elements.put(SupportedBy_4401, Gsn_Package.eINSTANCE.getSupportedBy());

			elements.put(InContextOf_4402, Gsn_Package.eINSTANCE.getInContextOf());
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
			KNOWN_ELEMENT_TYPES.add(ArgumentPackage_1003);
			KNOWN_ELEMENT_TYPES.add(Module_2301);
			KNOWN_ELEMENT_TYPES.add(ContractModule_2302);
			KNOWN_ELEMENT_TYPES.add(Goal_2303);
			KNOWN_ELEMENT_TYPES.add(Strategy_2304);
			KNOWN_ELEMENT_TYPES.add(Solution_2305);
			KNOWN_ELEMENT_TYPES.add(Context_2306);
			KNOWN_ELEMENT_TYPES.add(Justification_2307);
			KNOWN_ELEMENT_TYPES.add(Assumption_2308);
			KNOWN_ELEMENT_TYPES.add(ModuleReference_2309);
			KNOWN_ELEMENT_TYPES.add(ChoiceNode_2310);
			KNOWN_ELEMENT_TYPES.add(ContractModuleReference_2311);
			KNOWN_ELEMENT_TYPES.add(AwayGoal_2312);
			KNOWN_ELEMENT_TYPES.add(AwayContext_2313);
			KNOWN_ELEMENT_TYPES.add(AwaySolution_2314);
			KNOWN_ELEMENT_TYPES.add(SupportedBy_4401);
			KNOWN_ELEMENT_TYPES.add(InContextOf_4402);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GsnEditPart.VISUAL_ID:
			return ArgumentPackage_1003;
		case ModuleEditPart.VISUAL_ID:
			return Module_2301;
		case ContractModuleEditPart.VISUAL_ID:
			return ContractModule_2302;
		case GoalEditPart.VISUAL_ID:
			return Goal_2303;
		case StrategyEditPart.VISUAL_ID:
			return Strategy_2304;
		case SolutionEditPart.VISUAL_ID:
			return Solution_2305;
		case ContextEditPart.VISUAL_ID:
			return Context_2306;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2307;
		case AssumptionEditPart.VISUAL_ID:
			return Assumption_2308;
		case ModuleReferenceEditPart.VISUAL_ID:
			return ModuleReference_2309;
		case ChoiceNodeEditPart.VISUAL_ID:
			return ChoiceNode_2310;
		case ContractModuleReferenceEditPart.VISUAL_ID:
			return ContractModuleReference_2311;
		case AwayGoalEditPart.VISUAL_ID:
			return AwayGoal_2312;
		case AwayContextEditPart.VISUAL_ID:
			return AwayContext_2313;
		case AwaySolutionEditPart.VISUAL_ID:
			return AwaySolution_2314;
		case SupportedByEditPart.VISUAL_ID:
			return SupportedBy_4401;
		case InContextOfEditPart.VISUAL_ID:
			return InContextOf_4402;
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
			return gsn.diagram.providers.GsnElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return gsn.diagram.providers.GsnElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return gsn.diagram.providers.GsnElementTypes.getElement(elementTypeAdapter);
		}
	};

}
