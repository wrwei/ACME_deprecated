package artifact.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import artifact.diagram.edit.parts.ActivityEditPart;
import artifact.diagram.edit.parts.ArtifactAssetArtifactPropertyEditPart;
import artifact.diagram.edit.parts.ArtifactAssetRelationshipEditPart;
import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactGroupEditPart;
import artifact.diagram.edit.parts.ArtifactPackageBindingEditPart;
import artifact.diagram.edit.parts.ArtifactPackageCanvasEditPart;
import artifact.diagram.edit.parts.ArtifactPackageEditPart;
import artifact.diagram.edit.parts.ArtifactPackageInterfaceEditPart;
import artifact.diagram.edit.parts.EventEditPart;
import artifact.diagram.edit.parts.ParticipantEditPart;
import artifact.diagram.edit.parts.PropertyEditPart;
import artifact.diagram.edit.parts.ResourceEditPart;
import artifact.diagram.edit.parts.TechniqueEditPart;
import artifact.diagram.part.ArtifactVisualIDRegistry;
import artifact.diagram.part.Messages;

/**
 * @generated
 */
public class ArtifactNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ArtifactNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ArtifactNavigatorItem> result = new ArrayList<ArtifactNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, ArtifactPackageCanvasEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof ArtifactNavigatorGroup) {
			ArtifactNavigatorGroup group = (ArtifactNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem navigatorItem = (ArtifactNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {

		case ArtifactPackageCanvasEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			ArtifactNavigatorGroup links = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_ArtifactPackage_1002_links, "icons/linksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactPackageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactPackageInterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactPackageBindingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(TechniqueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ParticipantEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TechniqueEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Technique_2104_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Technique_2104_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ActivityEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2105_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Activity_2105_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ParticipantEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Participant_2106_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Participant_2106_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ArtifactEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Artifact_2107_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Artifact_2107_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ResourceEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Resource_2108_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Resource_2108_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PropertyEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Property_2109_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Property_2109_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Event_2110_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_Event_2110_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetRelationshipEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactAssetArtifactPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ArtifactAssetRelationshipEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArtifactNavigatorGroup target = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_ArtifactAssetRelationship_4101_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArtifactNavigatorGroup incominglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_ArtifactAssetRelationship_4101_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArtifactNavigatorGroup source = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_ArtifactAssetRelationship_4101_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArtifactNavigatorGroup outgoinglinks = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_ArtifactAssetRelationship_4101_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(TechniqueEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ParticipantEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(TechniqueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ParticipantEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ArtifactAssetArtifactPropertyEditPart.VISUAL_ID: {
			LinkedList<ArtifactAbstractNavigatorItem> result = new LinkedList<ArtifactAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArtifactNavigatorGroup target = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_ArtifactAssetArtifactProperty_4102_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArtifactNavigatorGroup source = new ArtifactNavigatorGroup(
					Messages.NavigatorGroupName_ArtifactAssetArtifactProperty_4102_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(TechniqueEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ParticipantEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArtifactVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ArtifactPackageCanvasEditPart.MODEL_ID.equals(ArtifactVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ArtifactNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<ArtifactNavigatorItem> result = new ArrayList<ArtifactNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new ArtifactNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ArtifactAbstractNavigatorItem) {
			ArtifactAbstractNavigatorItem abstractNavigatorItem = (ArtifactAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
