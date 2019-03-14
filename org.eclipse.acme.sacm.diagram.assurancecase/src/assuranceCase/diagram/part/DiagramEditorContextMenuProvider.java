package assuranceCase.diagram.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.ContributionItemService;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @generated
 */
public class DiagramEditorContextMenuProvider extends DiagramContextMenuProvider {

	/**
	* @generated
	*/
	private IWorkbenchPart part;

	/**
	* @generated
	*/
	private assuranceCase.diagram.part.DeleteElementAction deleteAction;

	/**
	* @generated
	*/
	public DiagramEditorContextMenuProvider(IWorkbenchPart part, EditPartViewer viewer) {
		super(part, viewer);
		this.part = part;
		deleteAction = new assuranceCase.diagram.part.DeleteElementAction(part);
		deleteAction.init();
	}

	/**
	* @generated
	*/
	public void dispose() {
		if (deleteAction != null) {
			deleteAction.dispose();
			deleteAction = null;
		}
		super.dispose();
	}

	/**
	* @generated NOT
	*/
	public void buildContextMenu(final IMenuManager menu) {
		getViewer().flush();
		try {
			TransactionUtil.getEditingDomain((EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService.getInstance()
									.contributeToPopupMenu(DiagramEditorContextMenuProvider.this, part);
							menu.remove(ActionIds.ACTION_DELETE_FROM_MODEL);
							menu.remove(ActionIds.MENU_NAVIGATE);
							menu.remove(ActionIds.MENU_EDIT);
							menu.remove(ActionIds.MENU_DIAGRAM_ADD);
							menu.remove(ActionIds.MENU_FILTERS);
							menu.remove(ActionIds.ACTION_SHOW_PROPERTIES_VIEW);
							menu.remove("properties");
							menu.appendToGroup("editGroup", deleteAction);
						}
					});
		} catch (Exception e) {
			assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
					.logError("Error building context menu", e);
		}
	}
}
