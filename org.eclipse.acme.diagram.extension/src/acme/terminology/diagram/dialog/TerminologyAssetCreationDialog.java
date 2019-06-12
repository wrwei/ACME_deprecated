package acme.terminology.diagram.dialog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.BrowseModelElementListener;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.diagram.util.ModelElementUtil;
import base.ModelElement;
import terminology.Category;
import terminology.Expression;
import terminology.ExpressionElement;
import terminology.Term;
import terminology.TerminologyAsset;
import terminology.TerminologyElement;
import terminology.TerminologyPackage;
import terminology.Terminology_Factory;

public class TerminologyAssetCreationDialog extends ModelElementPropertyDialog {

	private TerminologyPackage terminologyPackage;
	
	protected Combo combo;
	
	protected Composite valueGroup;
	protected Composite expressionRefGroup;
	protected Composite termRefGroup;
	
	protected Text valueText;
	protected String valueString;
	protected TableViewer expressionCategoryTableViewer;
	protected TableViewer expressionTableViewer;
	
	protected Text uri;
	protected String uriString;
	protected TableViewer termCategoryTableViewer;

	protected int selectedIndex = -1;
	
	protected List<Category> expressionCategories = new ArrayList<Category>();
	protected List<ExpressionElement> expressionElements = new ArrayList<ExpressionElement>();
	
	protected List<Category> termCategories = new ArrayList<Category>();


	
	public TerminologyAssetCreationDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Create a Terminology Asset";
	}
	
	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createCreateGroup(control);
	}
	
	protected void createCreateGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Create", 2);
	
		final Label typeLabel = new Label(groupContent, SWT.NONE);
		typeLabel.setText("Select the Type to Create: ");
	
		combo = new Combo(groupContent, SWT.READ_ONLY|SWT.DROP_DOWN);
		combo.add("Category");
		combo.add("Term");
		combo.add("Expression");
		combo.select(0);
		selectedIndex = 0;
		
		
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				switch (combo.getSelectionIndex()) {
				case 0:
					reset();
					container.layout();
					resizeShell();
					selectedIndex = 0;
					break;
				case 1:
					reset();
					createValueGroup(container);
					createTermReferenceGroup(container);
					container.layout();
					resizeShell();
					selectedIndex = 1;
					break;
				case 2:
					reset();
					createValueGroup(container);
					createExpressionRefGroup(container);
					container.layout();
					resizeShell();
					selectedIndex = 2;
					break;
				default:
					break;
				}
			}
		});
		
		groupContent.layout();
		groupContent.pack();
	}
	

	protected void createValueGroup(Composite container) {
		valueGroup = createGroupContainer(container, "Value", 2);
	
		final Label valueLabel = new Label(valueGroup, SWT.NONE);
		valueLabel.setText("Value:              ");
	
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		valueText = new Text(valueGroup, SWT.BORDER);
		valueText.setLayoutData(filePathData);
		valueText.setBackground(ColorConstants.white);
		valueText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				valueString = valueText.getText();
			}
		});
		valueGroup.layout();
		valueGroup.pack();
	}
	
	protected void reset() {
		hideValueGroup();
		hideExpressionRefGropup();
		hideTermRefGroup();
	}
	
	protected void hideValueGroup() {
		if (valueGroup != null) {
			if (!valueGroup.isDisposed()) {
				valueGroup.getParent().dispose();
			}
		}
	}

	protected void hideExpressionRefGropup() {
		if (expressionRefGroup != null) {
			if (!expressionRefGroup.isDisposed()) {
				expressionRefGroup.getParent().dispose();
			}
		}
	}
	
	protected void hideTermRefGroup() {
		if (termRefGroup != null) {
			if (!termRefGroup.isDisposed()) {
				termRefGroup.getParent().dispose();
			}
		}
	}
	
	
	protected void resizeShell() {
		Shell shell = Display.getDefault().getActiveShell();
		final Point newSize = shell.computeSize(525, SWT.DEFAULT, true);  

		shell.setSize(newSize);
	}
	
	
	protected void createExpressionRefGroup(Composite container) {
		expressionRefGroup = createGroupContainer(container, "References", 3);
		
		//reference label
		final Label categoryLabel = new Label(expressionRefGroup, SWT.LEFT|SWT.TOP);
		final GridData referenceLabelLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		referenceLabelLayout.verticalIndent = 4;
		categoryLabel.setLayoutData(referenceLabelLayout);
		categoryLabel.setText("Categories: ");
		
		//viewer for referenced expression in the ExpressionLangString of Description
		expressionCategoryTableViewer = new TableViewer(expressionRefGroup);
		expressionCategoryTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		expressionCategoryTableViewer.setInput(expressionCategories);
		expressionCategoryTableViewer.setLabelProvider(new TerminologyAssetLabelProvider());
		GridData refExprListLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		expressionCategoryTableViewer.getControl().setLayoutData(refExprListLayout);

		//buttons used for the referenced expressions
		final Composite refExpr_actionbuttons = new Composite(expressionRefGroup, SWT.NONE);
		final GridData ref_actionButtonLayout = new GridData();
		ref_actionButtonLayout.horizontalAlignment = SWT.FILL;
		refExpr_actionbuttons.setLayoutData(ref_actionButtonLayout);
		refExpr_actionbuttons.setLayout(new FillLayout(SWT.VERTICAL));
		
		final Button ref_addButton = new Button(refExpr_actionbuttons, SWT.NONE);
		ref_addButton.setText("Add");
		ref_addButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String categoryName = selection;
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof Category) {
						if (terminologyElement.getName().getContent().equals(categoryName)) {
							if (!expressionCategories.contains(terminologyElement)) {
								expressionCategories.add((Category) terminologyElement);
								expressionCategoryTableViewer.refresh();
							}
						}
					}
				}
			}
			
			@Override
			public String getTitle() {
				return "Categories in the same Terminology Package";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				ArrayList<String> result = new ArrayList<String>();
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof Category) {
						result.add(terminologyElement.getName().getContent());
					}
				}
				return result;
			}
			
			@Override
			public String getMessage() {
				return "Select a Category";
			}
		});
		
		final Button ref_removeButton = new Button(refExpr_actionbuttons, SWT.NONE);
		ref_removeButton.setText("Remove");
		ref_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (expressionCategoryTableViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)expressionCategoryTableViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						
						expressionCategories.remove(asset);
					}
					expressionCategoryTableViewer.refresh();
				}
			}
		});
		
		//reference label
		final Label elementsLabel = new Label(expressionRefGroup, SWT.LEFT|SWT.TOP);
		final GridData elementsLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		elementsLayout.verticalIndent = 4;
		elementsLabel.setLayoutData(elementsLayout);
		elementsLabel.setText("Expression Elements: ");
		
		//viewer for referenced expression in the ExpressionLangString of Description
		expressionTableViewer = new TableViewer(expressionRefGroup);
		expressionTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		expressionTableViewer.setInput(expressionElements);
		expressionTableViewer.setLabelProvider(new TerminologyAssetLabelProvider());
		GridData exprListLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		expressionTableViewer.getControl().setLayoutData(exprListLayout);

		//buttons used for the referenced expressions
		final Composite expr_actionButtons = new Composite(expressionRefGroup, SWT.NONE);
		final GridData exp_actionButtonLayout = new GridData();
		exp_actionButtonLayout.horizontalAlignment = SWT.FILL;
		expr_actionButtons.setLayoutData(exp_actionButtonLayout);
		expr_actionButtons.setLayout(new FillLayout(SWT.VERTICAL));
		
		final Button exp_addButton = new Button(expr_actionButtons, SWT.NONE);
		exp_addButton.setText("Add");
		exp_addButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String categoryName = selection;
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof ExpressionElement) {
						if (terminologyElement.getName().getContent().equals(categoryName)) {
							if (!expressionElements.contains(terminologyElement)) {
								expressionElements.add((ExpressionElement) terminologyElement);
								expressionTableViewer.refresh();
							}
						}
					}
				}
			}
			
			@Override
			public String getTitle() {
				return "ExpressionElements in the same Terminology Package";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				ArrayList<String> result = new ArrayList<String>();
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof ExpressionElement) {
						if (!expressionElements.contains(terminologyElement)) {
							result.add(terminologyElement.getName().getContent());
						}
					}
				}
				return result;
			}
			
			@Override
			public String getMessage() {
				return "Select a ExpressionElement";
			}
		});
		
		final Button exp_removeButton = new Button(expr_actionButtons, SWT.NONE);
		exp_removeButton.setText("Remove");
		exp_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (expressionTableViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)expressionTableViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						
						expressionElements.remove(asset);
					}
					expressionTableViewer.refresh();
				}
			}
		});
		expressionRefGroup.getLayout();
		expressionRefGroup.pack();
	}
	
	protected void createTermReferenceGroup(Composite container) {
		termRefGroup = createGroupContainer(container, "References", 3);
	
		final Label referenceLabel = new Label(termRefGroup, SWT.NONE);
		referenceLabel.setText("External Reference: ");
	
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		uri = new Text(termRefGroup, SWT.BORDER);
		uri.setLayoutData(filePathData);
		uri.setBackground(ColorConstants.white);
		uri.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				uriString = uri.getText();
			}
		});
		
		final Button browseButton = new Button(termRefGroup, SWT.NONE);
		browseButton.setText("Browse...");
		browseButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(browseButton.getShell());
				fileDialog.setText("Locate file");
				String path = fileDialog.open();
				if (path == null) {
					return;
				}
				uri.setText(path);
				uriString = path;
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		//reference label
		final Label categoryLabel = new Label(termRefGroup, SWT.LEFT|SWT.TOP);
		final GridData referenceLabelLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		referenceLabelLayout.verticalIndent = 4;
		categoryLabel.setLayoutData(referenceLabelLayout);
		categoryLabel.setText("Categories: ");
		
		//viewer for referenced expression in the ExpressionLangString of Description
		termCategoryTableViewer = new TableViewer(termRefGroup);
		termCategoryTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		termCategoryTableViewer.setInput(termCategories);
		termCategoryTableViewer.setLabelProvider(new TerminologyAssetLabelProvider());
		GridData refExprListLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		termCategoryTableViewer.getControl().setLayoutData(refExprListLayout);

		//buttons used for the referenced expressions
		final Composite refExpr_actionbuttons = new Composite(termRefGroup, SWT.NONE);
		final GridData ref_actionButtonLayout = new GridData();
		ref_actionButtonLayout.horizontalAlignment = SWT.FILL;
		refExpr_actionbuttons.setLayoutData(ref_actionButtonLayout);
		refExpr_actionbuttons.setLayout(new FillLayout(SWT.VERTICAL));
		
		final Button ref_addButton = new Button(refExpr_actionbuttons, SWT.NONE);
		ref_addButton.setText("Add");
		ref_addButton.addListener(SWT.Selection, new BrowseModelElementListener() {
			
			@Override
			public void selectionChanged(String selection) {
				String categoryName = selection;
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof Category) {
						if (terminologyElement.getName().getContent().equals(categoryName)) {
							if (!termCategories.contains(terminologyElement)) {
								termCategories.add((Category) terminologyElement);
								termCategoryTableViewer.refresh();
							}
						}
					}
				}
			}
			
			@Override
			public String getTitle() {
				return "Categories in the same Terminology Package";
			}
			
			@Override
			public ArrayList<String> getModelElements() {
				ArrayList<String> result = new ArrayList<String>();
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof Category) {
						result.add(terminologyElement.getName().getContent());
						termCategoryTableViewer.refresh();
					}
				}
				return result;
			}
			
			@Override
			public String getMessage() {
				return "Select a Category";
			}
		});
		
		
		
		final Button ref_removeButton = new Button(refExpr_actionbuttons, SWT.NONE);
		ref_removeButton.setText("Remove");
		ref_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (termCategoryTableViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)termCategoryTableViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						termCategories.remove(asset);
					}
					termCategoryTableViewer.refresh();
				}
			}
		});
		
		termRefGroup.getLayout();
		termRefGroup.pack();
	}
	
	private static final class TerminologyAssetLabelProvider implements ILabelProvider {
		private Image imgFile, imgURI;

		public TerminologyAssetLabelProvider() {
		}

		@Override
		public void addListener(ILabelProviderListener listener) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
		}

		@Override
		public Image getImage(Object element) {
			if (element instanceof String) {
				return imgFile;
			}
			else if (element instanceof URI) {
				return imgURI;
			}
			return null;
		}

		@Override
		public String getText(Object element) {
			TerminologyAsset terminologyAsset = (TerminologyAsset) element;
			return terminologyAsset.getName().getContent();
		}
	}
	
	public void setTerminologyPackage(TerminologyPackage terminologyPackage) {
		this.terminologyPackage = terminologyPackage;
	}
	
	public TerminologyAsset getCreatedTerminoloyAsset() {
		TerminologyAsset result;
		Terminology_Factory term_factory = Terminology_Factory.eINSTANCE;
		if (selectedIndex == 0) {
			result = term_factory.createCategory();
		}
		else if (selectedIndex == 1) {
			result = term_factory.createTerm();
			
			Term t = (Term) result;
			t.setValue(valueString);
			t.getCategory().addAll(termCategories);
			t.setExternalReference(uriString);
		}
		else {
			result = term_factory.createExpression();
			
			Expression e = (Expression) result;
			e.setValue(valueString);
			e.getCategory().addAll(expressionCategories);
			e.getElement().addAll(expressionElements);
		}
		
		ModelElementUtil.createName(result, name);
		ModelElementUtil.createDescription(result, description);
		ModelElementFeatureUtil.createImplementationConstraint(result, implementationConstraint);
		return result;
	}
	
}
