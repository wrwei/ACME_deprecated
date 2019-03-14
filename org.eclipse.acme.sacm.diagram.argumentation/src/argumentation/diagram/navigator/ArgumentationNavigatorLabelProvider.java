package argumentation.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import argumentation.ArgumentPackage;
import argumentation.AssertedArtifactContext;
import argumentation.AssertedArtifactSupport;
import argumentation.AssertedContext;
import argumentation.AssertedEvidence;
import argumentation.AssertedInference;
import argumentation.diagram.edit.parts.ArgumentGroupEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageBindingEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageCanvasEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageEditPart;
import argumentation.diagram.edit.parts.ArgumentPackageInterfaceEditPart;
import argumentation.diagram.edit.parts.ArgumentReasoningEditPart;
import argumentation.diagram.edit.parts.ArtifactReferenceEditPart;
import argumentation.diagram.edit.parts.AssertedArtifactContextEditPart;
import argumentation.diagram.edit.parts.AssertedArtifactSupportEditPart;
import argumentation.diagram.edit.parts.AssertedContextEditPart;
import argumentation.diagram.edit.parts.AssertedEvidenceEditPart;
import argumentation.diagram.edit.parts.AssertedInferenceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipReasoningEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipSourceEditPart;
import argumentation.diagram.edit.parts.AssertedRelationshipTargetEditPart;
import argumentation.diagram.edit.parts.AssertionMetaClaimEditPart;
import argumentation.diagram.edit.parts.ClaimEditPart;
import argumentation.diagram.edit.parts.WrappingLabel11EditPart;
import argumentation.diagram.edit.parts.WrappingLabel13EditPart;
import argumentation.diagram.edit.parts.WrappingLabel3EditPart;
import argumentation.diagram.edit.parts.WrappingLabel5EditPart;
import argumentation.diagram.edit.parts.WrappingLabel7EditPart;
import argumentation.diagram.edit.parts.WrappingLabel9EditPart;
import argumentation.diagram.edit.parts.WrappingLabelEditPart;
import argumentation.diagram.part.ArgumentationDiagramEditorPlugin;
import argumentation.diagram.part.ArgumentationVisualIDRegistry;
import argumentation.diagram.providers.ArgumentationElementTypes;
import argumentation.diagram.providers.ArgumentationParserProvider;

/**
 * @generated
 */
public class ArgumentationNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ArgumentationDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ArgumentationDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ArgumentationNavigatorItem
				&& !isOwnView(((ArgumentationNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ArgumentationNavigatorGroup) {
			ArgumentationNavigatorGroup group = (ArgumentationNavigatorGroup) element;
			return ArgumentationDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ArgumentationNavigatorItem) {
			ArgumentationNavigatorItem navigatorItem = (ArgumentationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ArgumentationVisualIDRegistry.getVisualID(view)) {
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://omg.sacm/2.0/argumentation?ArgumentPackage", //$NON-NLS-1$
					ArgumentationElementTypes.ArgumentPackage_1001);
		case ArgumentPackageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentPackage", //$NON-NLS-1$
					ArgumentationElementTypes.ArgumentPackage_2201);
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentPackageInterface", //$NON-NLS-1$
					ArgumentationElementTypes.ArgumentPackageInterface_2202);
		case ArgumentPackageBindingEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentPackageBinding", //$NON-NLS-1$
					ArgumentationElementTypes.ArgumentPackageBinding_2203);
		case ArgumentGroupEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentGroup", //$NON-NLS-1$
					ArgumentationElementTypes.ArgumentGroup_2204);
		case ClaimEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?Claim", //$NON-NLS-1$
					ArgumentationElementTypes.Claim_2205);
		case ArtifactReferenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArtifactReference", //$NON-NLS-1$
					ArgumentationElementTypes.ArtifactReference_2206);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?ArgumentReasoning", //$NON-NLS-1$
					ArgumentationElementTypes.ArgumentReasoning_2207);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?AssertedInference", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedInference_2208);
		case AssertedContextEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?AssertedContext", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedContext_2209);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?AssertedEvidence", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedEvidence_2210);
		case AssertedArtifactContextEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?AssertedArtifactContext", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedArtifactContext_2211);
		case AssertedArtifactSupportEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://omg.sacm/2.0/argumentation?AssertedArtifactSupport", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedArtifactSupport_2212);
		case AssertionMetaClaimEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://omg.sacm/2.0/argumentation?Assertion?metaClaim", //$NON-NLS-1$
					ArgumentationElementTypes.AssertionMetaClaim_4201);
		case AssertedRelationshipSourceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://omg.sacm/2.0/argumentation?AssertedRelationship?source", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedRelationshipSource_4202);
		case AssertedRelationshipTargetEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://omg.sacm/2.0/argumentation?AssertedRelationship?target", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedRelationshipTarget_4203);
		case AssertedRelationshipReasoningEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://omg.sacm/2.0/argumentation?AssertedRelationship?reasoning", //$NON-NLS-1$
					ArgumentationElementTypes.AssertedRelationshipReasoning_4204);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ArgumentationDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ArgumentationElementTypes.isKnownElementType(elementType)) {
			image = ArgumentationElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ArgumentationNavigatorGroup) {
			ArgumentationNavigatorGroup group = (ArgumentationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ArgumentationNavigatorItem) {
			ArgumentationNavigatorItem navigatorItem = (ArgumentationNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ArgumentationVisualIDRegistry.getVisualID(view)) {
		case ArgumentPackageCanvasEditPart.VISUAL_ID:
			return getArgumentPackage_1001Text(view);
		case ArgumentPackageEditPart.VISUAL_ID:
			return getArgumentPackage_2201Text(view);
		case ArgumentPackageInterfaceEditPart.VISUAL_ID:
			return getArgumentPackageInterface_2202Text(view);
		case ArgumentPackageBindingEditPart.VISUAL_ID:
			return getArgumentPackageBinding_2203Text(view);
		case ArgumentGroupEditPart.VISUAL_ID:
			return getArgumentGroup_2204Text(view);
		case ClaimEditPart.VISUAL_ID:
			return getClaim_2205Text(view);
		case ArtifactReferenceEditPart.VISUAL_ID:
			return getArtifactReference_2206Text(view);
		case ArgumentReasoningEditPart.VISUAL_ID:
			return getArgumentReasoning_2207Text(view);
		case AssertedInferenceEditPart.VISUAL_ID:
			return getAssertedInference_2208Text(view);
		case AssertedContextEditPart.VISUAL_ID:
			return getAssertedContext_2209Text(view);
		case AssertedEvidenceEditPart.VISUAL_ID:
			return getAssertedEvidence_2210Text(view);
		case AssertedArtifactContextEditPart.VISUAL_ID:
			return getAssertedArtifactContext_2211Text(view);
		case AssertedArtifactSupportEditPart.VISUAL_ID:
			return getAssertedArtifactSupport_2212Text(view);
		case AssertionMetaClaimEditPart.VISUAL_ID:
			return getAssertionMetaClaim_4201Text(view);
		case AssertedRelationshipSourceEditPart.VISUAL_ID:
			return getAssertedRelationshipSource_4202Text(view);
		case AssertedRelationshipTargetEditPart.VISUAL_ID:
			return getAssertedRelationshipTarget_4203Text(view);
		case AssertedRelationshipReasoningEditPart.VISUAL_ID:
			return getAssertedRelationshipReasoning_4204Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getArgumentPackage_1001Text(View view) {
		ArgumentPackage domainModelElement = (ArgumentPackage) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			ArgumentationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentPackage_2201Text(View view) {
		IParser parser = ArgumentationParserProvider.getParser(ArgumentationElementTypes.ArgumentPackage_2201,
				view.getElement() != null ? view.getElement() : view,
				ArgumentationVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentationDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentPackageInterface_2202Text(View view) {
		IParser parser = ArgumentationParserProvider.getParser(ArgumentationElementTypes.ArgumentPackageInterface_2202,
				view.getElement() != null ? view.getElement() : view,
				ArgumentationVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentationDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentPackageBinding_2203Text(View view) {
		IParser parser = ArgumentationParserProvider.getParser(ArgumentationElementTypes.ArgumentPackageBinding_2203,
				view.getElement() != null ? view.getElement() : view,
				ArgumentationVisualIDRegistry.getType(WrappingLabel5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentationDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentGroup_2204Text(View view) {
		IParser parser = ArgumentationParserProvider.getParser(ArgumentationElementTypes.ArgumentGroup_2204,
				view.getElement() != null ? view.getElement() : view,
				ArgumentationVisualIDRegistry.getType(WrappingLabel7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentationDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClaim_2205Text(View view) {
		IParser parser = ArgumentationParserProvider.getParser(ArgumentationElementTypes.Claim_2205,
				view.getElement() != null ? view.getElement() : view,
				ArgumentationVisualIDRegistry.getType(WrappingLabel9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentationDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArtifactReference_2206Text(View view) {
		IParser parser = ArgumentationParserProvider.getParser(ArgumentationElementTypes.ArtifactReference_2206,
				view.getElement() != null ? view.getElement() : view,
				ArgumentationVisualIDRegistry.getType(WrappingLabel11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentationDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArgumentReasoning_2207Text(View view) {
		IParser parser = ArgumentationParserProvider.getParser(ArgumentationElementTypes.ArgumentReasoning_2207,
				view.getElement() != null ? view.getElement() : view,
				ArgumentationVisualIDRegistry.getType(WrappingLabel13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentationDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssertedInference_2208Text(View view) {
		AssertedInference domainModelElement = (AssertedInference) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			ArgumentationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2208); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssertedContext_2209Text(View view) {
		AssertedContext domainModelElement = (AssertedContext) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			ArgumentationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2209); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssertedEvidence_2210Text(View view) {
		AssertedEvidence domainModelElement = (AssertedEvidence) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			ArgumentationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2210); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssertedArtifactContext_2211Text(View view) {
		AssertedArtifactContext domainModelElement = (AssertedArtifactContext) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			ArgumentationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2211); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssertedArtifactSupport_2212Text(View view) {
		AssertedArtifactSupport domainModelElement = (AssertedArtifactSupport) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGid();
		} else {
			ArgumentationDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2212); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAssertionMetaClaim_4201Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAssertedRelationshipSource_4202Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAssertedRelationshipTarget_4203Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAssertedRelationshipReasoning_4204Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ArgumentPackageCanvasEditPart.MODEL_ID.equals(ArgumentationVisualIDRegistry.getModelID(view));
	}

}
