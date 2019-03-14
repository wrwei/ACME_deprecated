package assuranceCase.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class AssurancecaseCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected assuranceCase.diagram.part.AssurancecaseCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected assuranceCase.diagram.part.AssurancecaseCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(assuranceCase.diagram.part.Messages.AssurancecaseCreationWizardTitle);
		setDefaultPageImageDescriptor(assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewAssuranceCase_Wizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new assuranceCase.diagram.part.AssurancecaseCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "assurancecase_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(assuranceCase.diagram.part.Messages.AssurancecaseCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				assuranceCase.diagram.part.Messages.AssurancecaseCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new assuranceCase.diagram.part.AssurancecaseCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "assurancecase") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".assurancecase_diagram".length()); //$NON-NLS-1$
					setFileName(assuranceCase.diagram.part.AssurancecaseDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "assurancecase")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(assuranceCase.diagram.part.Messages.AssurancecaseCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				assuranceCase.diagram.part.Messages.AssurancecaseCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = assuranceCase.diagram.part.AssurancecaseDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						assuranceCase.diagram.part.AssurancecaseDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								assuranceCase.diagram.part.Messages.AssurancecaseCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						assuranceCase.diagram.part.Messages.AssurancecaseCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				assuranceCase.diagram.part.AssurancecaseDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
