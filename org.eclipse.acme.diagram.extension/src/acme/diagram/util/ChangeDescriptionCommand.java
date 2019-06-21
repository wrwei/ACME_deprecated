/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.diagram.util;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

import base.ModelElement;

public class ChangeDescriptionCommand extends AbstractTransactionalCommand {

	private ModelElement modelElement;
	private String description;
	
	public ChangeDescriptionCommand(ModelElement modelElement, String description) {
		super(TransactionUtil.getEditingDomain(modelElement), description, null);
		this.modelElement = modelElement;
		this.description = description;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		modelElement.getDescription().getContent().getValue().get(0).setContent(description);
		return CommandResult.newOKCommandResult();
	}
}