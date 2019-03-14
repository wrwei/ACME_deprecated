/*******************************************************************************
 * Copyright (c) 2011-2017 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Athanosias Zolotas - initial API and implementation
 ******************************************************************************/
package gsn.diagram.edit.parts;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;

import acme.gsn.diagram.figure.GoalShape;
import acme.gsn.diagram.figure.StrategyShape;
import base.ModelElement;
import gsn.Goal;
import gsn.InContextOf;
import gsn.Strategy;
import gsn.SupportedBy;
import gsn.diagram.edit.parts.GoalEditPart.GoalFigure;
import gsn.diagram.edit.parts.StrategyEditPart.StrategyFigure;

public class CustomAnchor extends AbstractConnectionAnchor {

	protected ConnectionEditPart connectionType;
	protected ModelElement modelElement;
	protected String type;

	public CustomAnchor(IFigure owner, ConnectionEditPart connection) {
		super(owner);
		this.connectionType = connection;
		if (connection instanceof InContextOfEditPart) {
			type = "Context";
		} else {
			type = "Supported";
		}
	}

	public CustomAnchor(IFigure owner, ModelElement modelElement) {
		super(owner);
		this.modelElement = modelElement;
		if (modelElement instanceof InContextOf) {
			type = "Context";
		} else {
			type = "Supported";
		}
	}

	public CustomAnchor(StrategyFigure owner) {
		super(owner);
	}

	public void setConnectionType(ConnectionEditPart connectionType) {
		this.connectionType = connectionType;
	}

	public void setModelElement(ModelElement modelElement) {
		this.modelElement = modelElement;
	}

	public String getType() {
		return type;
	}

	public ModelElement getModelElement() {
		return modelElement;
	}

	public ConnectionEditPart getConnectionType() {
		return connectionType;
	}

	@Override
	public Point getLocation(Point reference) {
		Point point = null;

		// translate to absolute first to handle scrolling
		Rectangle r = getOwner().getBounds().getCopy();
		getOwner().translateToAbsolute(r);

		Point pE = reference;
		Point pA = r.getTopLeft();
		Point pB = r.getTopRight();
		Point pC = r.getBottomLeft();
		Point pD = r.getBottomRight();
		
		// handles SupportedBy
		if (type.equals("Supported") || connectionType instanceof SupportedByEditPart
				|| modelElement instanceof SupportedBy) {

			if (getOwner() instanceof StrategyFigure) {
				PointList parallelogramPoints = getParallelogramPoints(r);
				pE = reference;
				pA = parallelogramPoints.getPoint(0);
				pB = parallelogramPoints.getPoint(1);
				pC = parallelogramPoints.getPoint(2);
				pD = parallelogramPoints.getPoint(3);
				if (pE.y <= r.y) {
					// Edge: AB
					point = new Point((pA.x + pB.x) / 2, pA.y);
				} else {
					// Edge: CD
					point = new Point((pC.x + pD.x) / 2, pC.y);
				}
			} else {
				// Rectangle Anchor
				if (pE.y <= r.getCenter().y) {
					// Edge: AB
					point = new Point((pA.x + pB.x) / 2, pA.y);
				} else {
					// Edge: CD
					point = new Point((pC.x + pD.x) / 2, pC.y);
				}
			}
		}
		// handles inContextOf
		else {
			if (getOwner() instanceof StrategyFigure) {
				PointList parallelogramPoints = getParallelogramPoints(r);
				pE = reference;
				pA = parallelogramPoints.getPoint(0);
				pB = parallelogramPoints.getPoint(1);
				pC = parallelogramPoints.getPoint(2);
				pD = parallelogramPoints.getPoint(3);

				StrategyFigure strategyFigure = (StrategyFigure) getOwner();
				Strategy strategy = (Strategy) strategyFigure.getStrategy();
				// normal strategy
				if (!strategy.isUndeveloped() && !strategy.isUninstantiated()) {
					if (pE.x >= r.x) {
						// Edge: BD
						point = new Point((pD.x + pB.x) / 2, (pD.y + pB.y) / 2);
					} else {
						// Edge: AC
						point = new Point((pA.x + pC.x) / 2, (pA.y + pC.y) / 2);
					}
				}
				// undev strategy
				else if (strategy.isUndeveloped() && !strategy.isUninstantiated()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2,
								(pD.y + pB.y) / 2 - StrategyShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2,
								(pA.y + pC.y) / 2 - StrategyShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
				// uninstanted strategy
				else if (!strategy.isUndeveloped() && strategy.isUninstantiated()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2,
								(pD.y + pB.y) / 2 - StrategyShape.TRIANGLE_DECORATION_HEIGHT / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2,
								(pA.y + pC.y) / 2 - StrategyShape.TRIANGLE_DECORATION_HEIGHT / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
				// uninst undev strategy
				else if (strategy.isUndeveloped() && strategy.isUninstantiated()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2,
								(pD.y + pB.y) / 2 - StrategyShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2,
								(pA.y + pC.y) / 2 - StrategyShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
			} else if (getOwner() instanceof GoalFigure) {
				GoalFigure goalFigure = (GoalFigure) getOwner();
				Goal goal = (Goal) goalFigure.getGoal();
				// normal goal
				if (!goal.isUninstantiated() && !goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2, (pD.y + pB.y) / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2, (pA.y + pC.y) / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
				// uninst goal
				else if (goal.isUninstantiated() && !goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2,
								(pD.y + pB.y) / 2 - GoalShape.TRIANGLE_DECORATION_HEIGHT / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2,
								(pA.y + pC.y) / 2 - GoalShape.TRIANGLE_DECORATION_HEIGHT / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
				// undev goal
				else if (!goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2,
								(pD.y + pB.y) / 2 - GoalShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2,
								(pA.y + pC.y) / 2 - GoalShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
				// to be supported goal
				else if (!goal.isUninstantiated() && !goal.isUndeveloped() && goal.isToBeSupportedByContract()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2,
								(pD.y + pB.y) / 2 - GoalShape.CONTRACT_MODULE_ICON_HEIGHT / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2,
								(pA.y + pC.y) / 2 - GoalShape.CONTRACT_MODULE_ICON_HEIGHT / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
				// uninst undev goal
				else if (goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
					if (pE.x >= r.getCenter().x) {
						// Edge: BD (offset the triangle's height at the end)
						point = new Point((pD.x + pB.x) / 2,
								(pD.y + pB.y) / 2 - GoalShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Offset it by the height of the decorating triangle;
					} else {
						point = new Point((pA.x + pC.x) / 2,
								(pA.y + pC.y) / 2 - GoalShape.DIAMOND_DECORATION_HEIGHT / 2);
						// Edge: AC (offset the triangle's height at the end)
					}
				}
			} else {
				if (pE.x >= r.getCenter().x) {
					// Edge: BD
					point = new Point((pD.x + pB.x) / 2, (pD.y + pB.y) / 2);
				} else {
					// Edge: AC
					point = new Point((pA.x + pC.x) / 2, (pA.y + pC.y) / 2);
				}
			}
		}
		return point;
	}

	protected PointList getParallelogramPoints(Rectangle r) {
		r.shrink(getOwner().getInsets());
		r.resize(-1, -1);
		Point p1 = null, p2 = null, p3 = null, p4 = null;
		p1 = new Point(r.x + r.width / 5, r.y);
		p2 = new Point(r.x + r.width, r.y);
		p3 = new Point(r.x, r.y + r.height);
		p4 = new Point(r.x + r.width - r.width / 5, r.y + r.height);
		PointList points = new PointList();
		points.addPoint(p1);
		points.addPoint(p2);
		points.addPoint(p3);
		points.addPoint(p4);
		return points;
	}
}
