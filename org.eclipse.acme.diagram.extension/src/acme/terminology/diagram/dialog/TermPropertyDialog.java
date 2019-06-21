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
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.diagram.util.BrowseModelElementListener;
import base.ModelElement;
import terminology.Category;
import terminology.Term;
import terminology.TerminologyAsset;
import terminology.TerminologyElement;
import terminology.TerminologyPackage;

public class TermPropertyDialog extends ACMEAbstractTerminologyDialog {

	protected Label valueLabel;
	protected Text valueText;
	protected String valueString;
	
	protected Label referenceLabel;
	protected Text uri;
	protected Button browseButton;
	protected String uriString;
	
	protected TableViewer categoryTableViewer;
	protected List<Category> categories = new ArrayList<Category>();

	public TermPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected void createCustomGroups(Composite control) {
		createValueGroup(control);
		createReferenceGroup(control);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Term: " + getName();
	}

	protected void createValueGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Value", 2);
	
		valueLabel = new Label(groupContent, SWT.NONE);
		valueLabel.setText("Value:               ");
	
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
		
		Term term = (Term) modelElement;
		if (term.getValue() != null) {
			valueText.setText(term.getValue());	
		}
	}
	
	protected void createReferenceGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "References", 3);
	
		referenceLabel = new Label(groupContent, SWT.NONE);
		referenceLabel.setText("External Reference: ");
	
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		uri = new Text(groupContent, SWT.BORDER);
		uri.setLayoutData(filePathData);
		uri.setBackground(ColorConstants.white);
		uri.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				uriString = uri.getText();
			}
		});
		
		Term term = (Term) modelElement;
		if (term.getExternalReference() != null) {
			uri.setText(term.getExternalReference());	
		}
		
		browseButton = new Button(groupContent, SWT.NONE);
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
				term.setExternalReference(uri.getText());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
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
		populateCategories(term);

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
				TerminologyPackage terminologyPackage = (TerminologyPackage) term.eContainer();
				for(TerminologyElement terminologyElement: terminologyPackage.getTerminologyElement()) {
					if (terminologyElement instanceof Category) {
						if (terminologyElement.getName().getContent().equals(categoryName)) {
							if (!term.getCategory().contains(terminologyElement)) {
								term.getCategory().add((Category) terminologyElement);
								populateCategories(term);
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
				TerminologyPackage terminologyPackage = (TerminologyPackage) term.eContainer();
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
						term.getCategory().remove(asset);
					}
					populateCategories(term);
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

		groupContent.getLayout();
		groupContent.pack();
	}
	
	public String getValueString() {
		return valueString;
	}

	public String getExternalRefString() {
		return uriString;
	}
	

	
	protected void populateCategories(Term term) {
		categories.clear();
		categories.addAll(term.getCategory());
		categoryTableViewer.refresh();
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
