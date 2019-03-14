package acme.assurancecase.diagram.dialog;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.EMFReader;
import base.ModelElement;

public class TerminologyImportConfigureDialog extends ModelElementPropertyDialog {

	private CheckboxTreeViewer checkboxTreeViewer;
	
	private EMFReader emfReader;
	
	private ArrayList<Object> contents = new ArrayList<Object>();
	
	public TerminologyImportConfigureDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, null);
	}

	@Override
	protected String getTitleString() {
		return "Extract terminolgies";
	}
	
	public void setEmfReader(EMFReader emfReader) {
		this.emfReader = emfReader;
	}
	
	@Override
	protected void createGroups(Composite control) {
		createViewerGroup(control);
	}

	protected void createViewerGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Extract Terminologies", 2);
	
		checkboxTreeViewer = new CheckboxTreeViewer(groupContent);
		checkboxTreeViewer.setContentProvider(new ModelElementContentProvider());
		checkboxTreeViewer.getTree().setHeaderVisible(true);
		checkboxTreeViewer.getTree().setLinesVisible(true);
		GridData treeViewLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		checkboxTreeViewer.getControl().setLayoutData(treeViewLayout);
		
		TreeViewerColumn viewerColumn0  = new TreeViewerColumn(checkboxTreeViewer, SWT.NONE);
		viewerColumn0.getColumn().setWidth(500);
		viewerColumn0.getColumn().setText("Name");
		viewerColumn0.setLabelProvider(new DelegatingStyledCellLabelProvider(new TerminologyNameLabelProvider()));

		
		fillContent();
		checkboxTreeViewer.setInput(contents);
		
		GridLayoutFactory.fillDefaults().generateLayout(container);
	}
	
	private void fillContent() {
		contents.clear();
		for(EPackage ePackage: emfReader.getAllPackages()) {
			contents.add(ePackage);
		}
	}
	
	private class ModelElementContentProvider implements ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			fillContent();
		}
		
		@Override
		public Object[] getElements(Object inputElement) {
			@SuppressWarnings("unchecked")
			ArrayList<Object> input = (ArrayList<Object>) inputElement;
			return input.toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof EPackage) {
				EPackage ePackage = (EPackage) parentElement;
				if (ePackage.getESubpackages().isEmpty()) {
					return emfReader.getAllTypes(ePackage).toArray();
				}
				else {
					return ePackage.getESubpackages().toArray();
				}
			}
			else if (parentElement instanceof EClass) {
				return emfReader.getAllFeasibleFeatures((EClass) parentElement).toArray();
			}
			return null;
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof EPackage) {
				EPackage ePackage = (EPackage) element;
				if (ePackage.getESubpackages().isEmpty()) {
					if (!emfReader.getAllTypes(ePackage).isEmpty()) {
						return true;
					}
				}
				else {
					return true;
				}
			}
			else if (element instanceof EClass) {
				if (!emfReader.getAllFeasibleFeatures((EClass) element).isEmpty()) {
					return true;
				}
			}
			return false;
		}
	}
	
	private class TerminologyNameLabelProvider extends LabelProvider implements IStyledLabelProvider {

		@Override
		public StyledString getStyledText(Object element) {
			StyledString styledString = null;
			if (element instanceof EPackage) {
				EPackage ePackage = (EPackage) element;
				styledString = new StyledString(ePackage.getName());
			}
			else if (element instanceof EClass) {
				EClass eClass = (EClass) element;
				styledString = new StyledString(eClass.getName());
			}
			else if (element instanceof EAttribute) {
				EAttribute eAttribute = (EAttribute) element;
				styledString = new StyledString(eAttribute.getName());
			}
			
			return styledString;
		}
		
	}
	
	protected void resizeShell() {
		Shell shell = Display.getDefault().getActiveShell();
		final Point newSize = shell.computeSize(525, 525, true);  

		shell.setSize(newSize);
	}
}
