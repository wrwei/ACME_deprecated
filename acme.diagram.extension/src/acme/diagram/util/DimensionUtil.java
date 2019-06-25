/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.diagram.util;

import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Font;

import acme.argumentation.diagram.figure.ClaimShape;
import acme.assurancecase.diagram.figure.ArtifactPackageBindingShape;
import acme.assurancecase.diagram.figure.ArtifactPackageShape;
import acme.assurancecase.diagram.figure.AssuranceCasePackageBindingShape;
import acme.assurancecase.diagram.figure.AssuranceCasePackageInterfaceShape;
import acme.assurancecase.diagram.figure.AssuranceCasePackageShape;
import acme.assurancecase.diagram.figure.ContractModuleShape;
import acme.assurancecase.diagram.figure.ModuleShape;
import acme.assurancecase.diagram.figure.TerminologyPackageBindingShape;
import acme.assurancecase.diagram.figure.TerminologyPackageShape;
import acme.gsn.diagram.figure.AwayContextShape;
import acme.gsn.diagram.figure.AwayGoalShape;
import acme.gsn.diagram.figure.AwaySolutionShape;
import acme.gsn.diagram.figure.ContextShape;
import acme.gsn.diagram.figure.GoalShape;
import acme.gsn.diagram.figure.SolutionShape;
import acme.gsn.diagram.figure.StrategyShape;
import argumentation.AssertionDeclaration;
import argumentation.Claim;
import artifact.ArtifactPackage;
import artifact.ArtifactPackageBinding;
import base.ModelElement;
import gsn.Assumption;
import gsn.AwayContext;
import gsn.AwayGoal;
import gsn.AwaySolution;
import gsn.ChoiceNode;
import gsn.Context;
import gsn.ContractModule;
import gsn.ContractModuleReference;
import gsn.Goal;
import gsn.Justification;
import gsn.Module;
import gsn.ModuleReference;
import gsn.Solution;
import gsn.Strategy;

public class DimensionUtil {

	public static final Dimension DEFAULT_DIMENSION = new Dimension(200, 124);
	public static final Dimension MODULE_DIMENSION = new Dimension(200, 124 + ModuleShape.TOP_RECT_HEIGHT);
	public static final Dimension CONTRACT_MODULE_DIMENSION = new Dimension(200, 124 + ContractModuleShape.TOP_RECT_HEIGHT + ContractModuleShape.BOT_RECT_HEIGHT);

	public static final Dimension GOAL_DIMENSION = new Dimension(200, 124);
	public static final Dimension STRATEGY_DIMENSION = new Dimension(200, 124);
	public static final Dimension CONTEXT_DIMENSION = new Dimension(200, 124);
	public static final Dimension JUSTIFICATION_DIMENSION = new Dimension(200, 124);
	public static final Dimension ASSUMPTION_DIMENSION = new Dimension(200, 124);
	public static final Dimension SOLUTION_DIMENSION = new Dimension(150, 150);


	public static final Dimension AWAY_CONTEXT_DIMENSION = new Dimension(200, 144);
	public static final Dimension AWAY_GOAL_DIMENSION = new Dimension(200, 144);
	public static final Dimension AWAY_SOLUTION_DIMENSION = new Dimension(200, 134);


	public static final Dimension CHOICE_DIMENSION = new Dimension(100, 61);

	public static final Dimension CLAIM_DIMENSION = new Dimension(200, 124);
	public static final Dimension NEEDS_SUPPORT_CLAIM_DIMENSION = new Dimension(200, 126);
	public static final Dimension AXIOMATIC_CLAIM_DIMENSION = new Dimension(200, 134);

	public static final Dimension ARGUMENTREASONING_DIMENSION = new Dimension(200, 124);
	public static final Dimension CITATION_CLAIM_DIMENSION = new Dimension(200+ClaimShape.CITED_BOARDER_WIDTH*2 + ClaimShape.CITED_OFFSET*2, 124);

	public static final Dimension ARTIFACT_REFERENCE_DIMENSION = new Dimension(124, 150);
	public static final Dimension ASSERTED_EVIDENCE_DIMENSION = new Dimension(2, 2);
	public static final Dimension ASSERTED_INFERENCE_DIMENSION = new Dimension(4, 4);

	public static final Dimension ARTIFACT_DIMENSION = new Dimension(140,170);
	public static final Dimension ACTIVITY_DIMENSION = new Dimension(200,124);
	public static final Dimension PROPERTY_DIMENSION = new Dimension(200,124);
	public static final Dimension TECHNIQUE_DIMENSION = new Dimension(140, 140);
	public static final Dimension PARTICIPANT_DIMENSION = new Dimension(200,124);
	public static final Dimension EVENT_DIMENSION = new Dimension(124,124);
	public static final Dimension RESOURCE_DIMENSION = new Dimension(124,124);

	public static final Dimension ASSURANCE_PACKAGE_DIMENSION = new Dimension(200, 124 + AssuranceCasePackageShape.TOP_RECT_HEIGHT);
	public static final Dimension ASSURANCE_PACKAGE_INTERFACE_DIMENSION = new Dimension(200, 124 + AssuranceCasePackageInterfaceShape.TOP_RECT_HEIGHT);
	public static final Dimension ASSURANCE_PACKAGE_BINDING_DIMENSION = new Dimension(200, 124 + AssuranceCasePackageBindingShape.TOP_RECT_HEIGHT);

	public static final Dimension ARGUMENT_PACKAGE_DIMENSION = new Dimension(200, 124 + ArtifactPackageShape.TOP_RECT_HEIGHT);
	public static final Dimension ARGUMENT_PACKAGE_INTERFACE_DIMENSION = new Dimension(200, 124 + ArtifactPackageShape.TOP_RECT_HEIGHT);
	public static final Dimension ARGUMENT_PACKAGE_BINDING_DIMENSION = new Dimension(200, 124 + ArtifactPackageBindingShape.TOP_RECT_HEIGHT);

	public static final Dimension ARTEFACT_PACKAGE_DIMENSION = new Dimension(200, 124 + ArtifactPackageShape.TOP_RECT_HEIGHT);
	public static final Dimension ARTEFACT_PACKAGE_INTERFACE_DIMENSION = new Dimension(200, 124 + ArtifactPackageShape.TOP_RECT_HEIGHT);
	public static final Dimension ARTEFACT_PACKAGE_BINDING_DIMENSION = new Dimension(200, 124 + ArtifactPackageBindingShape.TOP_RECT_HEIGHT);

	public static final Dimension TERMINOLOGY_PACKAGE_DIMENSION = new Dimension(200, 124 + TerminologyPackageShape.TOP_RECT_HEIGHT);
	public static final Dimension TERMINOLOGY_PACKAGE_INTERFACE_DIMENSION = new Dimension(200, 124 + TerminologyPackageShape.TOP_RECT_HEIGHT);
	public static final Dimension TERMINOLOGY_PACKAGE_BINDING_DIMENSION = new Dimension(200, 124 + TerminologyPackageBindingShape.TOP_RECT_HEIGHT);


	public static final Dimension EXPRESSION_DIMENSION = new Dimension(200,124);
	public static final Dimension TERM_DIMENSION = new Dimension(200,124);
	public static final Dimension CATEGORY_DIMENSION = new Dimension(200,124);



	public static double getContextArcWidth(Rectangle r)
	{
		double arcWidth = r.width/1.618/2;
		return arcWidth;
	}

	public static double getBiggestSwquareSideLength(Rectangle r)
	{
		double radius = r.preciseWidth();
		double radiusSquare = radius*radius;
		double result = Math.sqrt(radiusSquare/2);
		return result;
	}

	public static Dimension getTextSize(String string, Font font) {
		Dimension lineDimensions = TextUtilities.INSTANCE.getStringExtents(string, font);
		lineDimensions.expand(1, 1);
		return lineDimensions;
	}

	public static Dimension getTextSize(String string, Font font, int width) {
		Dimension lineDimensions = TextUtilities.INSTANCE.getStringExtents(string, font);
		double area = lineDimensions.preciseHeight() * lineDimensions.preciseWidth();
		int height = (int)Math.round(area / width);
		if (height%lineDimensions.height > 0) {
			height += lineDimensions.height*2;
		}
		lineDimensions.expand(1, 1);
		return new Dimension(width, height);
	}

	public static Rectangle getConstraints(ModelElement modelElement, Rectangle rectangle) {
		Rectangle ret = rectangle.getCopy();

		int width = rectangle.width;
		int height = rectangle.height;
		double aspRatio = DEFAULT_DIMENSION.preciseWidth()/DEFAULT_DIMENSION.preciseHeight();

		if (modelElement instanceof Module) {
			aspRatio = MODULE_DIMENSION.preciseWidth()/MODULE_DIMENSION.preciseHeight();
		}
		else if (modelElement instanceof ContractModule) {
			aspRatio = CONTRACT_MODULE_DIMENSION.preciseWidth()/CONTRACT_MODULE_DIMENSION.preciseHeight();
		}
		else if (modelElement instanceof Goal) {
			Goal goal = (Goal) modelElement;
			//normal goal
			if (!goal.isUndeveloped() && !goal.isUninstantiated() && !goal.isToBeSupportedByContract()) {
				aspRatio = GOAL_DIMENSION.preciseWidth()/GOAL_DIMENSION.preciseHeight();
			}
			//undeveloped goal
			else if (goal.isUndeveloped() && !goal.isUninstantiated() && !goal.isToBeSupportedByContract()) {
				aspRatio = GOAL_DIMENSION.preciseWidth()/(GOAL_DIMENSION.preciseHeight() + GoalShape.DIAMOND_DECORATION_HEIGHT);
			}
			//uninst goal
			else if (!goal.isUndeveloped() && goal.isUninstantiated() && !goal.isToBeSupportedByContract()) {
				aspRatio = GOAL_DIMENSION.preciseWidth()/(GOAL_DIMENSION.preciseHeight() + GoalShape.TRIANGLE_DECORATION_HEIGHT);
			}
			//uninst && undev goal
			else if (goal.isUndeveloped() && goal.isUninstantiated() && !goal.isToBeSupportedByContract()) {
				aspRatio = GOAL_DIMENSION.preciseWidth()/(GOAL_DIMENSION.preciseHeight() + GoalShape.DIAMOND_DECORATION_HEIGHT);
			}
			//tobeSupported goal
			else if (!goal.isUndeveloped() && !goal.isUninstantiated() && goal.isToBeSupportedByContract()) {
				aspRatio = GOAL_DIMENSION.preciseWidth()/(GOAL_DIMENSION.preciseHeight() + GoalShape.CONTRACT_MODULE_ICON_HEIGHT);
			}
			//uninst && tobesupported goal
			else if (!goal.isUndeveloped() && goal.isUninstantiated() && goal.isToBeSupportedByContract()) {
				aspRatio = GOAL_DIMENSION.preciseWidth()/(GOAL_DIMENSION.preciseHeight() + GoalShape.CONTRACT_MODULE_ICON_HEIGHT + GoalShape.TRIANGLE_DECORATION_HEIGHT);
			}
		}
		else if (modelElement instanceof Strategy) {
			Strategy strategy = (Strategy) modelElement;
			//normal strategy
			if (!strategy.isUndeveloped() && !strategy.isUninstantiated()) {
				aspRatio = STRATEGY_DIMENSION.preciseWidth()/STRATEGY_DIMENSION.preciseHeight();
			}
			//undev strategy
			else if (strategy.isUndeveloped() && !strategy.isUninstantiated()) {
				aspRatio = STRATEGY_DIMENSION.preciseWidth()/(STRATEGY_DIMENSION.preciseHeight()+StrategyShape.DIAMOND_DECORATION_HEIGHT);
			}
			//uninst strategy
			else if (!strategy.isUndeveloped() && strategy.isUninstantiated()) {
				aspRatio = STRATEGY_DIMENSION.preciseWidth()/(STRATEGY_DIMENSION.preciseHeight()+StrategyShape.TRIANGLE_DECORATION_HEIGHT);
			}
			//undev uninst strategy
			else if (strategy.isUndeveloped() && strategy.isUninstantiated()) {
				aspRatio = STRATEGY_DIMENSION.preciseWidth()/(STRATEGY_DIMENSION.preciseHeight()+StrategyShape.DIAMOND_DECORATION_HEIGHT);
			}
		}
		else if (modelElement instanceof Solution) {
			Solution solution = (Solution) modelElement;
			//normal context
			if (!solution.isUninstantiated()) {
				aspRatio = SOLUTION_DIMENSION.preciseWidth()/SOLUTION_DIMENSION.preciseHeight();
			}
			else if (solution.isUninstantiated()) {
				aspRatio = SOLUTION_DIMENSION.preciseWidth()/(SOLUTION_DIMENSION.preciseHeight() + SolutionShape.TRIANGLE_DECORATION_HEIGHT);
			}
		}
		else if (modelElement instanceof Context) {
			Context context = (Context) modelElement;
			//normal context
			if (!context.isUninstantiated()) {
				aspRatio = CONTEXT_DIMENSION.preciseWidth()/CONTEXT_DIMENSION.preciseHeight();
			}
			else if (context.isUninstantiated()) {
				aspRatio = CONTEXT_DIMENSION.preciseWidth()/(CONTEXT_DIMENSION.preciseHeight() + ContextShape.TRIANGLE_DECORATION_HEIGHT);
			}
		}
		else if (modelElement instanceof Assumption) {
			Assumption assumption = (Assumption) modelElement;
			if (!assumption.isUninstantiated()) {
				aspRatio = ASSUMPTION_DIMENSION.preciseWidth()/ASSUMPTION_DIMENSION.preciseHeight();
			}
			else if (assumption.isUninstantiated()) {
				aspRatio = ASSUMPTION_DIMENSION.preciseWidth()/(ASSUMPTION_DIMENSION.preciseHeight() + 10);

			}
		}
		else if (modelElement instanceof Justification) {
			Justification justification = (Justification) modelElement;
			if (!justification.isUninstantiated()) {
				aspRatio = JUSTIFICATION_DIMENSION.preciseWidth()/JUSTIFICATION_DIMENSION.preciseHeight();
			}
			else if (justification.isUninstantiated()) {
				aspRatio = JUSTIFICATION_DIMENSION.preciseWidth()/(JUSTIFICATION_DIMENSION.preciseHeight() + 10);

			}
		}
		else if (modelElement instanceof AwayGoal) {
			AwayGoal awayGoal = (AwayGoal) modelElement;
			if (!awayGoal.isUninstantiated()) {
				aspRatio = AWAY_GOAL_DIMENSION.preciseWidth()/AWAY_GOAL_DIMENSION.preciseHeight();
			}
			else if (awayGoal.isUninstantiated()) {
				aspRatio = AWAY_GOAL_DIMENSION.preciseWidth()/(AWAY_GOAL_DIMENSION.preciseHeight() + AwayGoalShape.TRIANGLE_DECORATION_HEIGHT);
			}
		}
		else if (modelElement instanceof AwayContext) {
			AwayContext awayContext = (AwayContext) modelElement;
			if (!awayContext.isUninstantiated()) {
				aspRatio = AWAY_CONTEXT_DIMENSION.preciseWidth()/AWAY_CONTEXT_DIMENSION.preciseHeight();
			}
			else {
				aspRatio = AWAY_CONTEXT_DIMENSION.preciseWidth()/(AWAY_CONTEXT_DIMENSION.preciseHeight() + AwayContextShape.TRIANGLE_DECORATION_HEIGHT);
			}
		}
		else if (modelElement instanceof AwaySolution) {
			AwaySolution awaySolution = (AwaySolution) modelElement;
			if (!awaySolution.isUninstantiated()) {
				aspRatio = AWAY_SOLUTION_DIMENSION.preciseWidth()/AWAY_SOLUTION_DIMENSION.preciseHeight();
			}
			else {
				aspRatio = AWAY_SOLUTION_DIMENSION.preciseWidth()/(AWAY_SOLUTION_DIMENSION.preciseHeight() + AwaySolutionShape.TRIANGLE_DECORATION_HEIGHT);
			}
		}
		else if (modelElement instanceof ModuleReference) {
			ModuleReference moduleReference = (ModuleReference) modelElement;
			if (!moduleReference.isUninstantiated()) {
				aspRatio = MODULE_DIMENSION.preciseWidth()/MODULE_DIMENSION.preciseHeight();
			}
		}
		else if (modelElement instanceof ContractModuleReference) {
			ContractModuleReference moduleReference = (ContractModuleReference) modelElement;
			if (!moduleReference.isUninstantiated()) {
				aspRatio = CONTRACT_MODULE_DIMENSION.preciseWidth()/CONTRACT_MODULE_DIMENSION.preciseHeight();
			}
		}
		else if (modelElement instanceof ChoiceNode) {
			aspRatio = CHOICE_DIMENSION.preciseWidth()/CHOICE_DIMENSION.preciseHeight();
		}
		else if (modelElement instanceof ArtifactPackageBinding) {
			aspRatio = ARTEFACT_PACKAGE_BINDING_DIMENSION.preciseWidth()/ARTEFACT_PACKAGE_BINDING_DIMENSION.preciseHeight();
		}
		else if (modelElement instanceof ArtifactPackage) {
			aspRatio = ARTEFACT_PACKAGE_DIMENSION.preciseWidth()/ARTEFACT_PACKAGE_DIMENSION.preciseHeight();
		}
		else if (modelElement instanceof Claim) {
			Claim claim = (Claim) modelElement;
			//normal goal
			if (claim.getAssertionDeclaration() == AssertionDeclaration.ASSERTED) {
				aspRatio = CLAIM_DIMENSION.preciseWidth()/CLAIM_DIMENSION.preciseHeight();
			}
			else if (claim.getAssertionDeclaration() == AssertionDeclaration.NEEDS_SUPPORT) {
				aspRatio = NEEDS_SUPPORT_CLAIM_DIMENSION.preciseWidth()/NEEDS_SUPPORT_CLAIM_DIMENSION.preciseHeight();
			}
			else if (claim.getAssertionDeclaration() == AssertionDeclaration.AXIOMATIC) {
				aspRatio = AXIOMATIC_CLAIM_DIMENSION.preciseWidth()/AXIOMATIC_CLAIM_DIMENSION.preciseHeight();
			}
			else if (claim.getAssertionDeclaration() == AssertionDeclaration.AS_CITED) {
				aspRatio = CITATION_CLAIM_DIMENSION.preciseWidth()/CITATION_CLAIM_DIMENSION.preciseHeight();
			}
		}

		height = (int) (width/aspRatio);
		if(height < ret.height) {
			ret.width = (int) (ret.height*aspRatio);
			return ret;
		}
		ret.width = width;
		ret.height = height;
		return ret;
	}

	public static Dimension getMinimumDimension(ModelElement modelElement, Dimension baseDimension) {
		Rectangle rect = new Rectangle();
		rect.width = baseDimension.width;
		rect.height = baseDimension.height;

		Rectangle result = getConstraints(modelElement, rect);
		return result.getSize();
	}
}
