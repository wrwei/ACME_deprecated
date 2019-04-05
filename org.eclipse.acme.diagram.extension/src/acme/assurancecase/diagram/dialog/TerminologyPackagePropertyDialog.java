package acme.assurancecase.diagram.dialog;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import acme.common.diagram.dialog.DialogHelper;
import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.terminology.diagram.dialog.TerminologyAssetCreationDialog;
import base.ModelElement;
import terminology.Category;
import terminology.Expression;
import terminology.ExpressionElement;
import terminology.Term;
import terminology.TerminologyAsset;
import terminology.TerminologyElement;
import terminology.TerminologyPackage;
import terminology.Terminology_Package;

public class TerminologyPackagePropertyDialog extends ModelElementPropertyDialog {

	private TerminologyAdapter adapter;
	private TreeViewer treeViewer;
	
	ArrayList<TerminologyAsset> content = new ArrayList<TerminologyAsset>();
	
	public TerminologyPackagePropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
		adapter = new TerminologyAdapter();
		modelElement.eAdapters().add(adapter);
	}
	
	@Override
	public boolean close() {
		modelElement.eAdapters().remove(adapter);
		return super.close();
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for TerminologyPackage: " + getName();
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createViewerGroup(control);
	}
	
	protected void createViewerGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Terminology", 2);
	
		treeViewer = new TreeViewer(groupContent);
		treeViewer.setContentProvider(new TerminologyTreeContentProvider());
		treeViewer.getTree().setHeaderVisible(true);
		treeViewer.getTree().setLinesVisible(true);
		GridData treeViewLayout = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3);
		treeViewLayout.minimumHeight = 200;
		treeViewer.getControl().setLayoutData(treeViewLayout);
		
		
		TreeViewerColumn viewerColumn0  = new TreeViewerColumn(treeViewer, SWT.NONE);
		viewerColumn0.getColumn().setWidth(100);
		viewerColumn0.getColumn().setText("Name");
		viewerColumn0.setLabelProvider(new DelegatingStyledCellLabelProvider(new TerminologyNameLabelProvider()));
		
		TreeViewerColumn viewerColumn1  = new TreeViewerColumn(treeViewer, SWT.NONE);
		viewerColumn1.getColumn().setWidth(200);
		viewerColumn1.getColumn().setText("Description");
		viewerColumn1.setLabelProvider(new DelegatingStyledCellLabelProvider(new TerminologyDescriptionLabelProvider()));
		
		TreeViewerColumn viewerColumn2  = new TreeViewerColumn(treeViewer, SWT.NONE);
		viewerColumn2.getColumn().setWidth(300);
		viewerColumn2.getColumn().setText("Value");
		viewerColumn2.setLabelProvider(new DelegatingStyledCellLabelProvider(new TerminologyValueLabelProvider()));
		
		fillContent();
		treeViewer.setInput(content);
		
		GridLayoutFactory.fillDefaults().generateLayout(container);
		
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
				Object selectedNode = thisSelection.getFirstElement();
				if (selectedNode instanceof Term) {
					DialogHelper.handleTerm((Term) selectedNode, TerminologyPackagePropertyDialog.this);
				}
				else if (selectedNode instanceof Expression) {
					DialogHelper.handleExpression((Expression) selectedNode, TerminologyPackagePropertyDialog.this);
				}
				else if (selectedNode instanceof Category) {
					DialogHelper.handleCategory((Category) selectedNode, TerminologyPackagePropertyDialog.this);
				}
				else if (selectedNode instanceof NodeWrapper) {
					NodeWrapper nodeWrapper = (NodeWrapper) selectedNode;
					TerminologyAsset asset = nodeWrapper.getObject();
					focusElement(asset);
				}
			}
		});
		
		//buttons used for the referenced expressions
		final Composite buttons = new Composite(groupContent, SWT.NONE);
		final GridData buttonsLayout = new GridData();
		buttonsLayout.horizontalAlignment = SWT.FILL;
		buttons.setLayoutData(buttonsLayout);
		buttons.setLayout(new FillLayout(SWT.VERTICAL));
		
//		final Button import_button = new Button(buttons, SWT.NONE);
//		import_button.setText("Import...");
//		import_button.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				Shell activeShell = Display.getDefault().getActiveShell();
//				TerminologyImportMMDialog dialog = new TerminologyImportMMDialog(activeShell, null);
//				dialog.setTerminologyPackage((TerminologyPackage) modelElement);
//				dialog.create();
//				if (dialog.open() == Window.OK) {
//					dialog.createTerminologies();
//				}
//			}
//		});
		

		final Button add_button = new Button(buttons, SWT.NONE);
		add_button.setText("Create");
		add_button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Shell activeShell = Display.getDefault().getActiveShell();
				TerminologyAssetCreationDialog dialog = new TerminologyAssetCreationDialog(activeShell, null);
				dialog.setTerminologyPackage((TerminologyPackage) modelElement);
				dialog.create();
				if (dialog.open() == Window.OK) {
					TerminologyPackage terminologyPackage = (TerminologyPackage) modelElement;
//					terminologyPackage.getTerminologyElement().add(dialog.getCreatedTerminoloyAsset());
					ModelElementFeatureUtil.addFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
							terminologyPackage, 
							Terminology_Package.eINSTANCE.getTerminologyPackage_TerminologyElement(), 
							dialog.getCreatedTerminoloyAsset());
				}
			}
		});

		final Button remove_button = new Button(buttons, SWT.NONE);
		remove_button.setText("Remove");
		remove_button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (treeViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						
						TerminologyPackage terminologyPackage = (TerminologyPackage) modelElement;
//						terminologyPackage.getTerminologyElement().remove(asset);
						ModelElementFeatureUtil.removeFeatureTransactional(EditingDomainUtil.getEditingDomain(), 
								terminologyPackage, 
								Terminology_Package.eINSTANCE.getTerminologyPackage_TerminologyElement(), 
								asset);
					}
				}
			}
		});

		groupContent.layout();
		groupContent.pack();
	}
	
	public void focusElement(ModelElement modelElement) {
		treeViewer.setSelection(new StructuredSelection(modelElement), true);
	}
	
	private void fillContent() {
		content.clear();
		TerminologyPackage terminologyPackage = (TerminologyPackage) modelElement;
		for(TerminologyElement te: terminologyPackage.getTerminologyElement()) {
			if (te instanceof TerminologyAsset) {
				content.add((TerminologyAsset) te);
			}
		}
	}
	
	private ArrayList<TerminologyAsset> getAllTerminologyAssets() {
		ArrayList<TerminologyAsset> ret = new ArrayList<TerminologyAsset>();
		TerminologyPackage terminologyPackage = (TerminologyPackage) modelElement;
		for(TerminologyElement te: terminologyPackage.getTerminologyElement()) {
			if (te instanceof TerminologyAsset) {
				ret.add((TerminologyAsset) te);
			}
		}
		return ret;
	}

	private class TerminologyNameLabelProvider extends LabelProvider implements IStyledLabelProvider {

		@Override
		public StyledString getStyledText(Object element) {
			StyledString styledString = null;
			if (element instanceof TerminologyAsset) {
				TerminologyAsset terminologyAsset = (TerminologyAsset) element;
				styledString = new StyledString(terminologyAsset.getName().getContent());
			}
			else {
				NodeWrapper wrapper = (NodeWrapper) element;
				TerminologyAsset terminologyAsset = wrapper.getObject();
				Styler styler = new Styler() {
					
					@Override
					public void applyStyles(TextStyle textStyle) {
						textStyle.foreground = ColorConstants.gray;
					}
				};
				styledString = new StyledString(terminologyAsset.getName().getContent(), styler);
			}
			return styledString;
		}
		
	}
	
	private class TerminologyDescriptionLabelProvider extends LabelProvider implements IStyledLabelProvider {

		@Override
		public StyledString getStyledText(Object element) {
			StyledString styledString = null;
			if (element instanceof TerminologyAsset) {
				TerminologyAsset terminologyAsset = (TerminologyAsset) element;
				styledString = new StyledString(terminologyAsset.getDescription().getContent().getValue().get(0).getContent());	
			}
			else {
				NodeWrapper wrapper = (NodeWrapper) element;
				TerminologyAsset terminologyAsset = wrapper.getObject();
				Styler styler = new Styler() {
					
					@Override
					public void applyStyles(TextStyle textStyle) {
						textStyle.foreground = ColorConstants.gray;
					}
				};
				styledString = new StyledString(terminologyAsset.getDescription().getContent().getValue().get(0).getContent(), styler);
			}
			
			return styledString;
		}
		
	}
	
	private class TerminologyValueLabelProvider extends LabelProvider implements IStyledLabelProvider {

		@Override
		public StyledString getStyledText(Object element) {
			if (element instanceof ExpressionElement) {
				ExpressionElement expressionElement = (ExpressionElement) element;
				String value = expressionElement.getValue();
				if (value != null) {
					StyledString styledString = new StyledString(value);
					return styledString;
				}
			}
			else if (element instanceof NodeWrapper) {
				NodeWrapper wrapper = (NodeWrapper) element;
				TerminologyAsset terminologyAsset = wrapper.getObject();
				if (terminologyAsset instanceof ExpressionElement) {
					ExpressionElement expressionElement = (ExpressionElement) terminologyAsset;
					String value = expressionElement.getValue();
					if (value != null) {
						Styler styler = new Styler() {
							
							@Override
							public void applyStyles(TextStyle textStyle) {
								textStyle.foreground = ColorConstants.gray;
							}
						};
						StyledString styledString = new StyledString(value, styler);
						return styledString;
					}
				}
			}
			return new StyledString("");
		}
	}
	
	private class TerminologyTreeContentProvider implements ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			fillContent();
		}
		
		@Override
		public Object[] getElements(Object inputElement) {
			@SuppressWarnings("unchecked")
			ArrayList<TerminologyAsset> input = (ArrayList<TerminologyAsset>) inputElement;
			return input.toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			ArrayList<Object> ret = new ArrayList<Object>();
			if (parentElement instanceof Category) {
				for(TerminologyAsset ta: getAllTerminologyAssets()) {
					if (ta instanceof ExpressionElement) {
						ExpressionElement expressionElement = (ExpressionElement) ta;
						if (expressionElement.getCategory().contains(parentElement)) {
							//ret.add(expressionElement);
							ret.add(new NodeWrapper(expressionElement));
						}
					}
					else if (ta instanceof Category) {
						Category category = (Category) ta;
						if (category.getCategory() != null) {
							if (category.getCategory().equals(parentElement)) {
								ret.add(new NodeWrapper(category));
							}
						}
					}
				}
			}
			else if (parentElement instanceof Expression) {
				Expression expression = (Expression) parentElement;
				for(ExpressionElement expr: expression.getElement()) {
					ret.add(new NodeWrapper(expr));
				}
			}
			return ret.toArray();
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof Category) {
				Category category = (Category) element;
				for(TerminologyAsset ta: getAllTerminologyAssets()) {
					if (ta instanceof ExpressionElement) {
						ExpressionElement expressionElement = (ExpressionElement) ta;
						if (expressionElement.getCategory().contains(category)) {
							return true;
						}
					}
					if (ta instanceof Category) {
						Category category2 = (Category) ta;
						if (category2.getCategory() != null) {
							if (category2.getCategory().equals(category)) {
								return true;
							}
						}
					}
				}
			}
			else if (element instanceof Expression) {
				Expression expression = (Expression) element;
				for(TerminologyAsset ta: getAllTerminologyAssets()) {
					if (ta instanceof ExpressionElement) {
						ExpressionElement expressionElement = (ExpressionElement) ta;
						if (expression.getElement().contains(expressionElement)) {
							return true;
						}
					}
				}
			}
			return false;
		}
	}
	
	private class TerminologyAdapter extends EContentAdapter {

		@Override
		public void notifyChanged(Notification notification) {
			fillContent();
			treeViewer.refresh(true);
		}

		@Override
		public Notifier getTarget() {
			return (TerminologyPackage) modelElement;
		}
	}
	
	private class NodeWrapper {
		private TerminologyAsset object;
		public NodeWrapper(TerminologyAsset object) {
			this.object = object;
		}
		
		public TerminologyAsset getObject() {
			return object;
		}
	}

}
