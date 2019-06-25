/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package acme.gsn.diagram.dialog;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import acme.diagram.util.EditingDomainUtil;
import acme.diagram.util.ModelElementFeatureUtil;
import acme.diagram.util.ModelElementUtil;
import acme.diagram.util.NavigationManager;
import assuranceCase.AssuranceCasePackage;
import base.Base_Package;
import base.Description;
import base.ExpressionLangString;
import base.ModelElement;
import gsn.Goal;
import terminology.Expression;
import terminology.ExpressionElement;
import terminology.TerminologyAsset;
import terminology.TerminologyElement;
import terminology.TerminologyPackage;
import terminology.Terminology_Package;

public class GoalPropertyDialog extends ModelElementPropertyDialog{

	private static final class ExpressionListLabelProvider implements ILabelProvider {
		private Image imgFile, imgURI;

		public ExpressionListLabelProvider() {
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
			TerminologyPackage terminologyPackage = (TerminologyPackage) terminologyAsset.eContainer();

			return terminologyAsset.getName().getContent() + " - from TerminologyPackage: " + terminologyPackage.getName().getContent();
		}
	}

	protected boolean isPublic = false;
	protected boolean undeveloped = false;
	protected boolean toBeSupportedByContract = false;

	protected Button isPublicButton;
	protected Button undevelopedCheckBox;
	protected Button toBeSupportedByContractCheckBox;

	protected TableViewer expressionViewer;
	protected TableViewer referencedExprTable;

	protected List<TerminologyAsset> expressions = new ArrayList<TerminologyAsset>();
	protected List<TerminologyAsset> referencedExpressions = new ArrayList<TerminologyAsset>();

	public GoalPropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for Goal: " + getName();
	}

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
		createTerminologyGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		Goal goal = (Goal) modelElement;
		isPublic = goal.isIsPublic();
		undeveloped = goal.isUndeveloped();
		uninstantiated = goal.isUninstantiated();
		toBeSupportedByContract = goal.isToBeSupportedByContract();

		createIsPublicCheckButton(groupContent);
		createUndevelopedCheckButton(groupContent);
		createUninstantiatedCheckButton(groupContent);
		createToBeSupportedCheckButton(groupContent);
		groupContent.layout();
		groupContent.pack();
	}

	private void createIsPublicCheckButton(Composite container) {
		final Button isPublicButton = new Button(container, SWT.CHECK);
		isPublicButton.setSelection(isPublic);
		isPublicButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					isPublic = true;
				}
				else {
					isPublic = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(isPublic);
			}
		});
		createLabel(container, "Public");
	}

	private void createUndevelopedCheckButton(Composite container) {
		undevelopedCheckBox = new Button(container, SWT.CHECK);
		undevelopedCheckBox.setSelection(undeveloped);
		undevelopedCheckBox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					undeveloped = true;
					toBeSupportedByContractCheckBox.setSelection(false);
					toBeSupportedByContract = false;
				}
				else {
					undeveloped = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(undeveloped);
			}
		});
		createLabel(container, "Undeveloped");
	}

	private void createToBeSupportedCheckButton(Composite container) {
		toBeSupportedByContractCheckBox = new Button(container, SWT.CHECK);
		toBeSupportedByContractCheckBox.setSelection(toBeSupportedByContract);
		toBeSupportedByContractCheckBox.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				if (btn.getSelection()) {
					toBeSupportedByContract = true;
					undevelopedCheckBox.setSelection(false);
					undeveloped = false;
				}
				else {
					toBeSupportedByContract = false;
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Button btn = (Button) e.getSource();
				btn.setSelection(toBeSupportedByContract);
			}
		});
		createLabel(container, "To be supported by contract");
	}

	public boolean getIsPublic() {
		return isPublic;
	}

	public boolean getUndeveloped() {
		return undeveloped;
	}

	public boolean getToBeSupported() {
		return toBeSupportedByContract;
	}

	protected void createTerminologyGroup(Composite container) {
		//group content
		final Composite groupContent = createGroupContainer(container, "Terminology", 3);

		//reference label
		final Label referenceLabel = new Label(groupContent, SWT.LEFT|SWT.TOP);
		final GridData referenceLabelLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		referenceLabelLayout.verticalIndent = 4;
		referenceLabel.setLayoutData(referenceLabelLayout);
		referenceLabel.setText("Referenced Expressions");

		//viewer for referenced expression in the ExpressionLangString of Description
		referencedExprTable = new TableViewer(groupContent);
		referencedExprTable.setContentProvider(ArrayContentProvider.getInstance());
		referencedExprTable.setInput(referencedExpressions);
		referencedExprTable.setLabelProvider(new ExpressionListLabelProvider());
		GridData refExprListLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		referencedExprTable.getControl().setLayoutData(refExprListLayout);
		//populateReferencedExpressions(modelElement);

		//buttons used for the referenced expressions
		final Composite refExpr_actionbuttons = new Composite(groupContent, SWT.NONE);
		final GridData ref_actionButtonLayout = new GridData();
		ref_actionButtonLayout.horizontalAlignment = SWT.FILL;
		refExpr_actionbuttons.setLayoutData(ref_actionButtonLayout);
		refExpr_actionbuttons.setLayout(new FillLayout(SWT.VERTICAL));
		final Button ref_removeButton = new Button(refExpr_actionbuttons, SWT.NONE);
		ref_removeButton.setText("Remove");
		ref_removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (referencedExprTable.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)referencedExprTable.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						//get expression of goal
						Expression expression = getDescriptionExpression(modelElement);
						//remove asset reference from expression
						removeExpressionInDescription(expression, asset);
						//get asset name
						String assetName = asset.getName().getContent();
						//get description text
						String descriptionString = descriptionText.getText();
						//form new description
						String newDescriptionString = removeTerm(descriptionString, assetName);
						//set text
						descriptionText.setText(newDescriptionString);
					}
					populateReferencedExpressions(modelElement);
					referencedExprTable.refresh();
				}
			}
		});

		final Button ref_gotoButton = new Button(refExpr_actionbuttons, SWT.NONE);
		ref_gotoButton.setText("Go To");
		ref_gotoButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (referencedExprTable.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)referencedExprTable.getSelection();
					boolean success = false;
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get selected asset
						TerminologyAsset asset = (TerminologyAsset) it.next();
						success = NavigationManager.navigateToEditor(asset);
						break;
					}
					if (success) {
						getShell().close();
					}
				}
			}
		});

		final Label searchLabel = new Label(groupContent, SWT.NONE);
		searchLabel.setText("Search Expression: ");

		GridData searchTextLayout = new GridData(GridData.FILL_HORIZONTAL);
//		searchTextLayout.horizontalSpan = 2;
		final Text searchText = new Text(groupContent, SWT.BORDER);
		searchText.setLayoutData(searchTextLayout);
		searchText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				ModelElement modelElement = getModelElement();
				AssuranceCasePackage assuranceCasePackage = ModelElementUtil.getContainingAssuranceCasePackage(modelElement);
				populateExpressions(assuranceCasePackage, searchText.getText());
			}
		});

		final Button newButton = new Button(groupContent, SWT.NONE);
		newButton.setText("New");
		newButton.setLayoutData(new GridData(SWT.FILL));
		newButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

			}
		});


		final Label expressionLabel = new Label(groupContent, SWT.LEFT | SWT.TOP);
		final GridData expressionLabelLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		expressionLabelLayout.verticalIndent = 4;
		expressionLabel.setLayoutData(expressionLabelLayout);
		expressionLabel.setText("Search Results:");

		expressionViewer = new TableViewer(groupContent);
		expressionViewer.setContentProvider(ArrayContentProvider.getInstance());
		expressionViewer.setInput(expressions);
		expressionViewer.setLabelProvider(new ExpressionListLabelProvider());
		GridData expressionListLayout = new GridData(SWT.FILL, SWT.FILL, true, true);
		expressionViewer.getControl().setLayoutData(expressionListLayout);

		final Composite actionbuttons = new Composite(groupContent, SWT.NONE);
		final GridData actionButtonLayout = new GridData();
		actionButtonLayout.horizontalAlignment = SWT.FILL;
		actionbuttons.setLayoutData(actionButtonLayout);
		actionbuttons.setLayout(new FillLayout(SWT.VERTICAL));
		final Button insertButton = new Button(actionbuttons, SWT.NONE);
		insertButton.setText("Insert Expr");
		insertButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (expressionViewer.getSelection() instanceof IStructuredSelection) {
					final IStructuredSelection sel = (IStructuredSelection)expressionViewer.getSelection();
					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
						//get current description
						String currentDesc = descriptionText.getText();
						//get model element
						ModelElement modelElement = (ModelElement) it.next();
						//change current description
						currentDesc += "{" + modelElement.getName().getContent() + "}";
						//set text
						descriptionText.setText(currentDesc);
						//make expression
						ExpressionLangString expressionLangString = makeExpression(getModelElement(), currentDesc);
						Expression expression = (Expression) expressionLangString.getExpression();

						ModelElementFeatureUtil.addFeatureTransactional(EditingDomainUtil.getEditingDomain(),
								expression,
								Terminology_Package.eINSTANCE.getExpression_Element(),
								modelElement);

						//expression.getElement().add((ExpressionElement) modelElement);
					}
					expressionViewer.refresh();
					populateReferencedExpressions(modelElement);
				}
			}
		});

//		final Button gotoButton = new Button(actionbuttons, SWT.NONE);
//		gotoButton.setText("Remove");
//		gotoButton.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				if (expressionViewer.getSelection() instanceof IStructuredSelection) {
//					final IStructuredSelection sel = (IStructuredSelection)expressionViewer.getSelection();
//					for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
//						TerminologyAsset asset = (TerminologyAsset) it.next();
//						TerminologyPackage package1 = (TerminologyPackage) asset.eContainer();
//						expressions.remove(asset);
//						package1.getTerminologyElement().remove(asset);
//					}
//					expressionViewer.refresh();
//				}
//			}
//		});

		final Button removeButton = new Button(actionbuttons, SWT.NONE);
		removeButton.setText("Go To");
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				final IStructuredSelection sel = (IStructuredSelection)expressionViewer.getSelection();
				boolean success = false;
				for (Iterator<?> it = sel.iterator(); it.hasNext(); ) {
					//get selected asset
					TerminologyAsset asset = (TerminologyAsset) it.next();
					success = NavigationManager.navigateToEditor(asset);
					break;
				}
				if (success) {
					getShell().close();
				}
			}
		});

		groupContent.layout();
		groupContent.pack();
	}

	protected void populateExpressions(AssuranceCasePackage assuranceCasePackage, String name) {
		expressions.clear();
		expressions.addAll(getTerminologyAssets(assuranceCasePackage, name));
		expressionViewer.refresh();
	}

	protected void populateReferencedExpressions(ModelElement modelElement) {
		referencedExpressions.clear();
		ExpressionLangString expressionLangString = (ExpressionLangString) modelElement.getDescription().getContent().getValue().get(0);
		if (expressionLangString.getExpression() != null) {
			referencedExpressions.addAll(((Expression)expressionLangString.getExpression()).getElement());
		}
		referencedExprTable.refresh();
	}

	public ArrayList<TerminologyAsset> getTerminologyAssets(AssuranceCasePackage assuranceCasePackage, String name) {
		ArrayList<TerminologyAsset> ret = new ArrayList<TerminologyAsset>();
		for(TerminologyPackage tp: assuranceCasePackage.getTerminologyPackage()) {
			for(TerminologyElement asset: tp.getTerminologyElement()) {
				if (asset instanceof ExpressionElement) {
					if (asset.getName().getContent().toLowerCase().contains(name.toLowerCase())) {
						ret.add((TerminologyAsset) asset);
					}
				}
			}
		}
		return ret;
	}

	public ExpressionLangString makeExpression(ModelElement modelElement, String content) {
		Description description = modelElement.getDescription();
		if (description != null) {
			ExpressionLangString expressionLangString = (ExpressionLangString) modelElement.getDescription().getContent().getValue().get(0);
			ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(),
					expressionLangString,
					Base_Package.eINSTANCE.getLangString_Content(),
					content);
//			expressionLangString.setContent(content);
			Expression expression = (Expression) expressionLangString.getExpression();
			ModelElementFeatureUtil.setFeatureTransactional(EditingDomainUtil.getEditingDomain(),
					expression,
					Terminology_Package.eINSTANCE.getExpression().getEStructuralFeature("value"),
					content);
			//expression.setValue(content);
			return expressionLangString;
		}
		return null;
	}

	public void addExpressionToDescription(ExpressionElement expressionElement, ModelElement modelElement) {
		ExpressionLangString expressionLangString = (ExpressionLangString) modelElement.getDescription().getContent().getValue().get(0);
		Expression expr = (Expression) expressionLangString.getExpression();
		expr.getElement().add(expressionElement);
	}

	public void removeExpressionInDescription(ExpressionElement expressionElement, ModelElement modelElement) {
		Expression expr = (Expression) expressionElement;
		ModelElementFeatureUtil.removeFeatureTransactional(EditingDomainUtil.getEditingDomain(),
				expr,
				Terminology_Package.eINSTANCE.getExpression_Element(),
				modelElement);
		//expr.getElement().remove(modelElement);
	}

	public boolean hasExpression(ModelElement modelElement) {
		if (modelElement.getDescription() != null) {
			if (modelElement.getDescription().getContent().getValue().get(0) instanceof ExpressionLangString) {
				return true;
			}
		}
		return false;
	}

	public Expression getDescriptionExpression(ModelElement modelElement) {
		ExpressionLangString expressionLangString = (ExpressionLangString) modelElement.getDescription().getContent().getValue().get(0);
		return (Expression) expressionLangString.getExpression();
	}

	public String removeTerm(String description, String term) {
		String result = "";
		String regex = "\\{"+term+"\\}";
		description = description.replaceAll(regex, " ");
		String[] arr = description.split(" ");
		for(String str: arr) {
			result += str.trim() + " ";
		}
		return result.trim();
	}
}
