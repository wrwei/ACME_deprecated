/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.diagram.util.BrowseModelElementListener;
import base.ModelElement;
import terminology.Category;
import terminology.Expression;
import terminology.ExpressionElement;
import terminology.TerminologyAsset;
import terminology.TerminologyElement;
import terminology.TerminologyPackage;

public class ExpressionPropertyDialog extends ACMEAbstractTerminologyDialog {

	protected Label valueLabel;
	protected Text valueText;
	protected String valueString;
	
	protected TableViewer categoryTableViewer;
	protected TableViewer expressionTableViewer;
	
	protected List<Category> categories = new ArrayList<Category>();
	protected List<ExpressionElement> expressionElements = new ArrayList<ExpressionElement>();

	
	public ExpressionPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected void createCustomGroups(Composite control) {
		createValueGroup(control);
		createReferenceGroup(control);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Expression: " + getName();
	}

	protected void createValueGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Value", 2);
	
		valueLabel = new Label(groupContent, SWT.NONE);
		valueLabel.setText("Value:              ");
	
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		valueText = new Text(groupContent, SWT.BORDER);
		valueText.setLayoutData(filePathData);
		valueText.setBackground(ColorConstants.white);
		valueText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				valueString = valueText.getText();
			}
		});
		
		Expression expression = (Expression) modelElement;
		if (expression.getValue() != null) {
			valueText.setText(expression.getValue());	
		}
	}
	
	public String getValueString() {
		return valueString;
	}
	
	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 3);
		Expression expression = (Expression) modelElement;
		
		//reference label
		final Label categoryLabel = new Label(groupContent, SWT.LEFT|SWT.TOP);
		final GridData referenceLabelLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		referenceLabelLayout.verticalIndent = 4;
		categoryLabel.setLayoutData(referenceLabelLayout);
		categoryLabel.setText("Categories: ");
		
		//viewer for referenced expression in the ExpressionLangString of Description
		categoryTableViewer = new TableViewer(groupContent);
		categoryTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		categoryTableViewer.setInput(categories);
		categoryTableViewer.setLabelProvider(new TerminologyAssetLabelProvider());
		GridData refExprListLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		categoryTableViewer.getControl().setLayoutData(refExprListLayout);
		populateCategories(expression);

		//buttons used for the referenced expressions
		final Composite refExpr_actionbuttons = new Composite(groupContent, SWT.NONE);
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
				TerminologyPackage terminologyPackage = (TerminologyPackage) expression.eContainer();
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof Category) {
						if (terminologyElement.getName().getContent().equals(categoryName)) {
							if (!expression.getCategory().contains(terminologyElement) && !(expression.getCategory().contains(terminologyElement))) {
								expression.getCategory().add((Category) terminologyElement);
								populateCategories(expression);
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
				TerminologyPackage terminologyPackage = (TerminologyPackage) expression.eContainer();
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
				if (categoryTableViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)categoryTableViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						//get expression of goal
						expression.getCategory().remove(asset);
					}
					populateCategories(expression);
					categoryTableViewer.refresh();
				}
			}
		});
		
		final Button ref_gotoButton = new Button(refExpr_actionbuttons, SWT.NONE);
		ref_gotoButton.setText("Go To");
		ref_gotoButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (categoryTableViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)categoryTableViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						terminologyPackagePropertyDialog.focusElement(asset);
						getShell().close();
						break;
					}
				}
			}
		});
		
		//reference label
		final Label elementsLabel = new Label(groupContent, SWT.LEFT|SWT.TOP);
		final GridData elementsLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		elementsLayout.verticalIndent = 4;
		elementsLabel.setLayoutData(elementsLayout);
		elementsLabel.setText("Expression Elements: ");
		
		//viewer for referenced expression in the ExpressionLangString of Description
		expressionTableViewer = new TableViewer(groupContent);
		expressionTableViewer.setContentProvider(ArrayContentProvider.getInstance());
		expressionTableViewer.setInput(expressionElements);
		expressionTableViewer.setLabelProvider(new TerminologyAssetLabelProvider());
		GridData exprListLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		expressionTableViewer.getControl().setLayoutData(exprListLayout);
		populateExpressions(expression);

		//buttons used for the referenced expressions
		final Composite expr_actionButtons = new Composite(groupContent, SWT.NONE);
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
				TerminologyPackage terminologyPackage = (TerminologyPackage) expression.eContainer();
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof ExpressionElement) {
						if (terminologyElement.getName().getContent().equals(categoryName)) {
							if (!expression.getElement().contains(terminologyElement)) {
								expression.getElement().add((ExpressionElement) terminologyElement);
								populateExpressions(expression);
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
				TerminologyPackage terminologyPackage = (TerminologyPackage) expression.eContainer();
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof ExpressionElement) {
						if (!terminologyElement.equals(expression) && !(expression.getElement().contains(terminologyElement))) {
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
						
						expression.getElement().remove(asset);
					}
					populateExpressions(expression);
					expressionTableViewer.refresh();
				}
			}
		});
		
		final Button exp_gotoButton = new Button(expr_actionButtons, SWT.NONE);
		exp_gotoButton.setText("Go To");
		exp_gotoButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (expressionTableViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)expressionTableViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						terminologyPackagePropertyDialog.focusElement(asset);
						getShell().close();
						break;
					}
				}
			}
		});

		groupContent.getLayout();
		groupContent.pack();
	}
	
	protected void populateCategories(Expression expression) {
		categories.clear();
		categories.addAll(expression.getCategory());
		categoryTableViewer.refresh();
	}
	
	protected void populateExpressions(Expression expression) {
		expressionElements.clear();
		expressionElements.addAll(expression.getElement());
		expressionTableViewer.refresh();
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

}
