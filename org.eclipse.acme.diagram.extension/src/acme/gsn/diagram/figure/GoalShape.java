/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import gsn.Goal;

public class GoalShape extends Shape{

	private Goal goal;
	protected PointList shape = new PointList(4);
	protected PointList diamond = new PointList();
	protected PointList triangle = new PointList(3);
	protected PointList decoratingContractModuleShape = new PointList();
	
	protected PointList publicIndicator = new PointList();
	public static final int PUBLIC_INDICATOR_OFFSET = 5;
	public static final int PUBLIC_INDICATOR_WIDTH = 28;
	public static final int PUBLIC_INDICATOR_HEIGHT = 20;


	public static final int CONTRACT_MODULE_ICON_WIDTH = 28;
	public static final int CONTRACT_MODULE_ICON_HEIGHT = 25;
	public static final int DIAMOND_DECORATION_HEIGHT = 20;
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		diamond.translate(dx, dy);
		publicIndicator.translate(dx, dy);
		triangle.translate(dx, dy);
		decoratingContractModuleShape.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		if (goal != null) {
			if (goal.isUninstantiated() && !goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				graphics.fillPolygon(triangle);		
			}
			else if (!goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				graphics.fillPolygon(diamond);
			}
			else if (goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				graphics.fillPolygon(diamond);
			}
			else if (!goal.isUninstantiated() && !goal.isUndeveloped() && goal.isToBeSupportedByContract()) {
				graphics.fillPolygon(decoratingContractModuleShape);
			}
			else if (goal.isUninstantiated() && !goal.isUndeveloped() && goal.isToBeSupportedByContract()) {
				graphics.fillPolygon(decoratingContractModuleShape);
				graphics.fillPolygon(triangle);		
			}
			
			if (goal.isIsPublic()) {
				graphics.fillPolygon(publicIndicator);
			}
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
		if (goal != null) {
			if (goal.isUninstantiated() && !goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				graphics.drawPolygon(triangle);		
			}
			else if (!goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				graphics.drawPolygon(diamond);
			}
			else if (goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				graphics.drawPolygon(diamond);
			}
			else if (!goal.isUninstantiated() && !goal.isUndeveloped() && goal.isToBeSupportedByContract()) {
				graphics.drawPolygon(decoratingContractModuleShape);
			}
			else if (goal.isUninstantiated() && !goal.isUndeveloped() && goal.isToBeSupportedByContract()) {
				graphics.drawPolygon(decoratingContractModuleShape);
				graphics.drawPolygon(triangle);		
			}
			
			if (goal.isIsPublic()) {
				graphics.drawPolygon(publicIndicator);
			}
		}
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		int offset = 0;
		if (goal != null) {
			//uninstantiated
			if (goal.isUninstantiated() && !goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				Point triangleTop = new Point(r.x + r.width/2, r.y + r.height-TRIANGLE_DECORATION_HEIGHT);
				Point triangleLeft = new Point(triangleTop.x - TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point triangleRight = new Point(triangleTop.x + TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				
				triangle.removeAllPoints();
				triangle.addPoint(triangleTop);
				triangle.addPoint(triangleLeft);
				triangle.addPoint(triangleRight);
				offset = TRIANGLE_DECORATION_HEIGHT;
			}
			//undeveloped
			else if (!goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				Point diamondTop = new Point(r.x + r.width/2, r.y + r.height-DIAMOND_DECORATION_HEIGHT);
				Point diamondLeft = new Point(diamondTop.x - DIAMOND_DECORATION_HEIGHT/2, diamondTop.y + DIAMOND_DECORATION_HEIGHT/2);
				Point diamondRight = new Point(diamondTop.x + DIAMOND_DECORATION_HEIGHT/2, diamondTop.y + DIAMOND_DECORATION_HEIGHT/2);
				Point diamondBot = new Point(r.x + r.width/2, r.y + r.height);
				
				diamond.removeAllPoints();
				diamond.addPoint(diamondTop);
				diamond.addPoint(diamondLeft);
				diamond.addPoint(diamondBot);
				diamond.addPoint(diamondRight);
				offset = DIAMOND_DECORATION_HEIGHT;
			}
			//uninstantiated && undeveloped
			else if (goal.isUninstantiated() && goal.isUndeveloped() && !goal.isToBeSupportedByContract()) {
				Point diamondTop = new Point(r.x + r.width/2, r.y + r.height-DIAMOND_DECORATION_HEIGHT);
				Point diamondLeft = new Point(diamondTop.x - DIAMOND_DECORATION_HEIGHT/2, diamondTop.y + DIAMOND_DECORATION_HEIGHT/2);
				Point diamondRight = new Point(diamondTop.x + DIAMOND_DECORATION_HEIGHT/2, diamondTop.y + DIAMOND_DECORATION_HEIGHT/2);
				Point diamondBot = new Point(r.x + r.width/2, r.y + r.height);
				
				diamond.removeAllPoints();
				diamond.addPoint(diamondTop);
				diamond.addPoint(diamondLeft);
				diamond.addPoint(diamondBot);
				diamond.addPoint(diamondRight);
				diamond.addPoint(diamondTop);
				diamond.addPoint(diamondLeft);
				diamond.addPoint(diamondRight);
				offset = DIAMOND_DECORATION_HEIGHT;
			}
			//to be supported
			else if (!goal.isUninstantiated() && !goal.isUndeveloped() && goal.isToBeSupportedByContract()) {
				/*
				 * p1     p2
				 * p4     p3           p7
				 *                   
				 * p5         p10      p6
				 *            p9       p8
				 */
				Point p1 = null, p2 = null, p3 = null, p4 = null, p5 = null, p6 = null, p7 = null, p8 = null, p9 = null, p10 = null;
				p1 = new Point(r.x + r.width/2 - CONTRACT_MODULE_ICON_WIDTH/2, r.y + r.height - CONTRACT_MODULE_ICON_HEIGHT);
				p2 = new Point(p1.x + CONTRACT_MODULE_ICON_WIDTH/3, p1.y);
				p3 = new Point(p2.x, p2.y + CONTRACT_MODULE_ICON_HEIGHT/5);
				p4 = new Point(p1.x, p3.y);
				p5 = new Point(p1.x, p1.y + CONTRACT_MODULE_ICON_HEIGHT/5*4);
				p6 = new Point(p5.x + CONTRACT_MODULE_ICON_WIDTH, p5.y);
				p7 = new Point(p6.x, p3.y);
				p8 = new Point(p6.x, p6.y + CONTRACT_MODULE_ICON_HEIGHT/5);
				p9 = new Point(p6.x - CONTRACT_MODULE_ICON_WIDTH/3, p8.y);
				p10 = new Point(p9.x, p9.y-CONTRACT_MODULE_ICON_HEIGHT/5);
				decoratingContractModuleShape.removeAllPoints();
				decoratingContractModuleShape.addPoint(p1);
				decoratingContractModuleShape.addPoint(p2);
				decoratingContractModuleShape.addPoint(p3);
				decoratingContractModuleShape.addPoint(p4);
				decoratingContractModuleShape.addPoint(p5);
				decoratingContractModuleShape.addPoint(p10);
				decoratingContractModuleShape.addPoint(p9);
				decoratingContractModuleShape.addPoint(p8);
				decoratingContractModuleShape.addPoint(p6);
				decoratingContractModuleShape.addPoint(p10);
				decoratingContractModuleShape.addPoint(p6);
				decoratingContractModuleShape.addPoint(p7);
				decoratingContractModuleShape.addPoint(p4);
				offset = CONTRACT_MODULE_ICON_HEIGHT;
			}
			else if (goal.isUninstantiated() && !goal.isUndeveloped() && goal.isToBeSupportedByContract()) {
				Point p1 = null, p2 = null, p3 = null, p4 = null, p5 = null, p6 = null, p7 = null, p8 = null, p9 = null, p10 = null;
				p1 = new Point(r.x + r.width/2 - CONTRACT_MODULE_ICON_WIDTH/2, r.y + r.height - CONTRACT_MODULE_ICON_HEIGHT - TRIANGLE_DECORATION_HEIGHT);
				p2 = new Point(p1.x + CONTRACT_MODULE_ICON_WIDTH/3, p1.y);
				p3 = new Point(p2.x, p2.y + CONTRACT_MODULE_ICON_HEIGHT/5);
				p4 = new Point(p1.x, p3.y);
				p5 = new Point(p1.x, p1.y + CONTRACT_MODULE_ICON_HEIGHT/5*4);
				p6 = new Point(p5.x + CONTRACT_MODULE_ICON_WIDTH, p5.y);
				p7 = new Point(p6.x, p3.y);
				p8 = new Point(p6.x, p6.y + CONTRACT_MODULE_ICON_HEIGHT/5);
				p9 = new Point(p6.x - CONTRACT_MODULE_ICON_WIDTH/3, p8.y);
				p10 = new Point(p9.x, p9.y-CONTRACT_MODULE_ICON_HEIGHT/5);
				decoratingContractModuleShape.removeAllPoints();
				decoratingContractModuleShape.addPoint(p1);
				decoratingContractModuleShape.addPoint(p2);
				decoratingContractModuleShape.addPoint(p3);
				decoratingContractModuleShape.addPoint(p4);
				decoratingContractModuleShape.addPoint(p5);
				decoratingContractModuleShape.addPoint(p10);
				decoratingContractModuleShape.addPoint(p9);
				decoratingContractModuleShape.addPoint(p8);
				decoratingContractModuleShape.addPoint(p6);
				decoratingContractModuleShape.addPoint(p10);
				decoratingContractModuleShape.addPoint(p6);
				decoratingContractModuleShape.addPoint(p7);
				decoratingContractModuleShape.addPoint(p4);
				offset = CONTRACT_MODULE_ICON_HEIGHT;
				
				Point triangleTop = new Point(r.x + r.width/2, r.y + r.height-TRIANGLE_DECORATION_HEIGHT);
				Point triangleLeft = new Point(triangleTop.x - TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point triangleRight = new Point(triangleTop.x + TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				
				triangle.removeAllPoints();
				triangle.addPoint(triangleTop);
				triangle.addPoint(triangleLeft);
				triangle.addPoint(triangleRight);
				offset += TRIANGLE_DECORATION_HEIGHT;
			}
			
			if (goal.isIsPublic()) {
				// Module decorating icon
				Point p1 = null, p2 = null, p3 = null, p4 = null, p5 = null, p6 = null, p7 = null;
				p1 = new Point(r.x + r.width - PUBLIC_INDICATOR_OFFSET - PUBLIC_INDICATOR_WIDTH, r.y + PUBLIC_INDICATOR_OFFSET);
				p2 = new Point(p1.x + PUBLIC_INDICATOR_WIDTH/3, p1.y);
				p3 = new Point(p2.x, p2.y + PUBLIC_INDICATOR_HEIGHT/4);
				p4 = new Point(p1.x, p3.y);
				p5 = new Point(p1.x, p1.y + PUBLIC_INDICATOR_HEIGHT);
				p6 = new Point(p5.x + PUBLIC_INDICATOR_WIDTH, p5.y);
				p7 = new Point(p6.x, p3.y);
				publicIndicator.removeAllPoints();
				publicIndicator.addPoint(p1);
				publicIndicator.addPoint(p2);
				publicIndicator.addPoint(p3);
				publicIndicator.addPoint(p4);
				publicIndicator.addPoint(p5);
				publicIndicator.addPoint(p6);
				publicIndicator.addPoint(p7);
				publicIndicator.addPoint(p4);
			}
		}
		Point rect1 = new Point(r.x, r.y);
		Point rect2 = new Point(r.x + r.width, r.y);
		Point rect3 = new Point(r.x, r.y+r.height-offset);
		Point rect4 = new Point(r.x+r.width, r.y+r.height-offset);
		
		shape.removeAllPoints();
		shape.addPoint(rect1);
		shape.addPoint(rect2);
		shape.addPoint(rect4);
		shape.addPoint(rect3);
	}
	
	public void setGoal(Goal goal) {
		this.goal = goal;
	}
	
	public Goal getGoal() {
		return goal;
	}
}
