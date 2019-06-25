/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package acme.gsn.diagram.dialog;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import acme.common.diagram.dialog.ModelElementPropertyDialog;
import base.ImplementationConstraint;
import base.ModelElement;
import gsn.ChoiceNode;

public class ChoiceNodePropertyDialog extends ModelElementPropertyDialog {

	private String nodeExpr = "";
	protected Text nodeExpressionText;


	public ChoiceNodePropertyDialog(Shell parentShell, ModelElement modelElement) {
		super(parentShell, modelElement);
	}

	@Override
	protected String getTitleString() {
		return "Edit the properties for ChoiceNode: " + getName();
	}

	@Override
	protected void createGroups(Composite control) {
		super.createGroups(control);
		createFeaturesGroup(control);
	}

	protected void createFeaturesGroup(Composite container) {
		final Composite groupContent = createGroupContainer(container, "Features", 2);

		nameText.setEditable(false);
		nameText.setBackground(ColorConstants.white);


		ChoiceNode choiceNode = (ChoiceNode) modelElement;

		if (!choiceNode.getImplementationConstraint().isEmpty()) {
			ImplementationConstraint constraint = choiceNode.getImplementationConstraint().get(0);
			nodeExpr = constraint.getContent().getValue().get(0).getContent();
		}

		createExpr(groupContent);
	}

	private void createExpr(Composite container) {
		Label nameLabel = new Label(container, SWT.NONE);
		nameLabel.setText("Many Expr:      ");
		GridData nameData = new GridData();
		nameData.grabExcessHorizontalSpace = true;
		nameData.horizontalAlignment = GridData.FILL;

		nodeExpressionText = new Text(container, SWT.BORDER);
		nodeExpressionText.setLayoutData(nameData);
		nodeExpressionText.setText(nodeExpr);
	}

	@Override
	protected void saveInput() {
		nodeExpr = nodeExpressionText.getText();
		super.saveInput();
	}

	public String getNodeExpr() {
		return nodeExpr;
	}
}
