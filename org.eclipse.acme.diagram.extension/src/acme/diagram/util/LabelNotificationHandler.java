/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.diagram.util;

import java.util.ArrayList;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;

import acme.assurancecase.diagram.figure.ModuleShape;
import acme.gsn.diagram.figure.AwayContextShape;
import acme.gsn.diagram.figure.AwayGoalShape;
import acme.gsn.diagram.figure.AwaySolutionShape;
import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import artifact.ArtifactPackageInterface;
import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCasePackageBinding;
import assuranceCase.AssuranceCasePackageInterface;
import base.Base_Package;
import base.ModelElement;
import gsn.Assumption;
import gsn.AwayContext;
import gsn.AwayGoal;
import gsn.AwaySolution;
import gsn.Context;
import gsn.ContractModule;
import gsn.Goal;
import gsn.Justification;
import gsn.Module;
import gsn.Solution;
import gsn.Strategy;
import terminology.TerminologyPackage;
import terminology.TerminologyPackageBinding;
import terminology.TerminologyPackageInterface;


public class LabelNotificationHandler {

	//static instance
	private static LabelNotificationHandler instance;
	
	//the one and only editing domain
	TransactionalEditingDomain editingDomain;
	
	//resource set listeners
	ResourceSetListener rsl;
	ResourceSetListener rsl2;
	
	
	ArrayList<CompartmentEditPart> names = new ArrayList<CompartmentEditPart>();
	ArrayList<CompartmentEditPart> descriptions = new ArrayList<CompartmentEditPart>();
	ArrayList<CompartmentEditPart> moduleDescriptors = new ArrayList<CompartmentEditPart>();
	
	public static LabelNotificationHandler getInstance() {
		if (instance == null) {
			instance = new LabelNotificationHandler();
		}
		return instance;
	}
	
	private LabelNotificationHandler() {
		editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain("org.eclipse.acme.EditingDomain");

		rsl = new ResourceSetListener() {
			
			@Override
			public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
				return null;
			}
			
			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {
 				handle(event);
			}
			
			@Override
			public boolean isPrecommitOnly() {
				return false;
			}
			
			@Override
			public boolean isPostcommitOnly() {
				return false;
			}
			
			@Override
			public boolean isAggregatePrecommitListener() {
				return false;
			}
			
			@Override
			public NotificationFilter getFilter() {
				return NotificationFilter.createFeatureFilter(Base_Package.eINSTANCE.getLangString_Content());
			}
		};
		
		rsl2 = new ResourceSetListener() {
			
			@Override
			public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
				return null;
			}
			
			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {
 				handle(event);
			}
			
			@Override
			public boolean isPrecommitOnly() {
				return false;
			}
			
			@Override
			public boolean isPostcommitOnly() {
				return false;
			}
			
			@Override
			public boolean isAggregatePrecommitListener() {
				return false;
			}
			
			@Override
			public NotificationFilter getFilter() {
				return NotificationFilter.createFeatureFilter(Base_Package.eINSTANCE.getSACMElement_CitedElement());
			}
		};
		editingDomain.addResourceSetListener(rsl);
		editingDomain.addResourceSetListener(rsl2);
	}
	
	public void registerName(CompartmentEditPart cep) {
		if (!names.contains(cep)) {
			names.add(cep);
		}
	}
	
	public void registerDescription(CompartmentEditPart cep) {
		if (!descriptions.contains(cep)) {
			descriptions.add(cep);
		}
	}
	
	
	public void registerModuleDescriptors(CompartmentEditPart cep) {
		if (!moduleDescriptors.contains(cep)) {
			moduleDescriptors.add(cep);
		}
	}
	
	public void handle(ResourceSetChangeEvent event) {
		for(Notification n: event.getNotifications()) {
			for(CompartmentEditPart cep: names) {
				ModelElement modelElement = (ModelElement) cep.resolveSemanticElement();
				if (n.getNotifier().equals(modelElement.getName())) {
					cep.refresh();
					IFigure figure = cep.getFigure();
					handleModelElementName(modelElement, figure);
				}
			}
			for(CompartmentEditPart cep: descriptions) {
				ModelElement modelElement = (ModelElement) cep.resolveSemanticElement();
				if (n.getNotifier().equals(modelElement.getDescription().getContent().getValue().get(0))) {
					cep.refresh();
					IFigure figure = cep.getFigure();
					handleModelElementDescription(modelElement, figure);
				}
			}
			for(CompartmentEditPart cep: moduleDescriptors) {
				ModelElement modelElement = (ModelElement) cep.resolveSemanticElement();
				if (n.getNotifier().equals(modelElement)) {
					cep.refresh();
					IFigure figure = cep.getFigure();
					handleModuleDescriptor(modelElement, figure);
				}
			}
		}
	}
	
	private void handleModelElementName(ModelElement modelElement, IFigure figure)
	{
		if (modelElement instanceof Module || 
				modelElement instanceof ContractModule ||
				modelElement instanceof ArtifactPackage ||
				modelElement instanceof ArtifactPackageInterface ||
				modelElement instanceof ArtifactPackageBinding ||
				modelElement instanceof TerminologyPackage ||
				modelElement instanceof TerminologyPackageInterface ||
				modelElement instanceof TerminologyPackageBinding ||
				modelElement instanceof AssuranceCasePackage ||
				modelElement instanceof AssuranceCasePackageInterface ||
				modelElement instanceof AssuranceCasePackageBinding) {
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(5, ModuleShape.TOP_RECT_HEIGHT + 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Goal) {	
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(5, 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Strategy) {
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(figure.getParent().getBounds().width/5, 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Solution) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			int width = (int)Math.round(Math.sqrt(d.width*d.width/2));
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle((d.width-width)/2+5, (d.width-width)/2+5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Context) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			int offset = (int)Math.round(d.width/2/1.618/2);
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(offset, 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Assumption) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(d.width/3+5, 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Justification) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(d.width/3+5, 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwayContext) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(d.width/6, 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwayGoal) {
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(5, 5, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwaySolution) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			int r = d.width/2;
			int offset = (int)Math.round(r - r/Math.sqrt(2.0));
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getName().getContent(), figure.getFont());
			figure.getParent().setConstraint(figure, new Rectangle(offset+5, offset, dimension.width, dimension.height));
		}
	}
	
	private void handleModelElementDescription(ModelElement modelElement, IFigure figure)
	{
		if (modelElement instanceof Module || 
				modelElement instanceof ContractModule ||
				modelElement instanceof ArtifactPackage ||
				modelElement instanceof ArtifactPackageInterface ||
				modelElement instanceof ArtifactPackageBinding ||
				modelElement instanceof TerminologyPackage ||
				modelElement instanceof TerminologyPackageInterface ||
				modelElement instanceof TerminologyPackageBinding) {
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), figure.getParent().getBounds().getCopy().width - 10);
			figure.getParent().setConstraint(figure, new Rectangle(5, ModuleShape.TOP_RECT_HEIGHT + 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Goal) {
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), figure.getParent().getBounds().getCopy().width - 10);
			figure.getParent().setConstraint(figure, new Rectangle(5, 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Strategy) {
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), figure.getParent().getBounds().getCopy().width*3/5);
			figure.getParent().setConstraint(figure, new Rectangle(figure.getParent().getBounds().width/5, 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Solution) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			int width = (int)Math.round(Math.sqrt(d.width*d.width/2));
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), 
					(int)Math.round(Math.sqrt(d.width*d.width/2)));
			figure.getParent().setConstraint(figure, new Rectangle((d.width-width)/2+5, (d.width-width)/2+35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Context) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			int offset = (int)Math.round(d.width/2/1.618/2);
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), 
					(int)Math.round(Math.sqrt(d.width*d.width/2)));
			figure.getParent().setConstraint(figure, new Rectangle(offset, 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Assumption) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), 
					d.width/7*5-10);
			figure.getParent().setConstraint(figure, new Rectangle(d.width/7+5, 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof Justification) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), 
					d.width/7*5-10);
			figure.getParent().setConstraint(figure, new Rectangle(d.width/7+5, 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwayContext) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), 
					d.width/6*4);
			figure.getParent().setConstraint(figure, new Rectangle(d.width/6, 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwayGoal) {
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), figure.getParent().getBounds().getCopy().width - 10);
			figure.getParent().setConstraint(figure, new Rectangle(5, 35, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwaySolution) {
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			int r = d.width/2;
			int offset = (int)Math.round(r - r/Math.sqrt(2.0));
			Dimension dimension = DimensionUtil.getTextSize(modelElement.getDescription().getContent().getValue().get(0).getContent(), figure.getFont(), figure.getParent().getBounds().getCopy().width - 10);
			figure.getParent().setConstraint(figure, new Rectangle(offset+5, offset+35, dimension.width, dimension.height));
		}
	}
	
	private void handleModuleDescriptor(ModelElement modelElement, IFigure figure) {
		if (modelElement instanceof AwayGoal) {
			AwayGoal awayGoal = (AwayGoal) modelElement;
			Goal goal = (Goal) awayGoal.getCitedElement();
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension;
			if (goal != null) {
				dimension = DimensionUtil.getTextSize(ModelElementFeatureUtil.getName(goal.eContainer()), figure.getFont());
			}
			else {
				dimension = DimensionUtil.getTextSize("<...>", figure.getFont());

			}
			figure.getParent().setConstraint(figure, new Rectangle(AwayGoalShape.MODULE_ICON_OFFSET+AwayGoalShape.MODULE_ICON_WIDTH+5, d.height-AwayGoalShape.MODULE_ICON_OFFSET - 20, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwaySolution) {
			AwaySolution awaySolution = (AwaySolution) modelElement;
			Solution solution = (Solution) awaySolution.getCitedElement();
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension;
			if (solution != null) {
				dimension = DimensionUtil.getTextSize(ModelElementFeatureUtil.getName(solution.eContainer()), figure.getFont());
			}
			else {
				dimension = DimensionUtil.getTextSize("<...>", figure.getFont());
			}
			figure.getParent().setConstraint(figure, new Rectangle(AwaySolutionShape.MODULE_ICON_OFFSET+AwaySolutionShape.MODULE_ICON_WIDTH+5, d.height-AwaySolutionShape.MODULE_ICON_OFFSET - 20, dimension.width, dimension.height));
		}
		else if (modelElement instanceof AwayContext) {
			AwayContext awayContext = (AwayContext) modelElement;
			Context context = (Context) awayContext.getCitedElement();
			Dimension d = figure.getParent().getBounds().getCopy().getSize();
			Dimension dimension;
			if (context != null) {
				dimension = DimensionUtil.getTextSize(ModelElementFeatureUtil.getName(context.eContainer()), figure.getFont());
			}
			else {
				dimension = DimensionUtil.getTextSize("<...>", figure.getFont());

			}
			figure.getParent().setConstraint(figure, new Rectangle(AwayContextShape.MODULE_ICON_OFFSET+AwayContextShape.MODULE_ICON_WIDTH+5, d.height-AwayContextShape.MODULE_ICON_OFFSET - 20, dimension.width, dimension.height));

		}
	}

}
