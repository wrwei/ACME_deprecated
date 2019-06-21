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

import gsn.Strategy;

public class StrategyShape extends Shape {

	protected PointList shape = new PointList(4);

	private Strategy strategy;
	protected PointList triangle = new PointList(3);
	protected PointList diamond = new PointList();

	public static final int TRIANGLE_DECORATION_HEIGHT = 10;
	public static final int DIAMOND_DECORATION_HEIGHT = 20;

	public PointList getParallelgram() {
		return shape; 
	}

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		if (strategy != null) {
			if (strategy.isUninstantiated() && !strategy.isUndeveloped()) {
				graphics.fillPolygon(triangle);
			}
			else if (!strategy.isUninstantiated() && strategy.isUndeveloped()) {
				graphics.fillPolygon(diamond);
			}
			else if (strategy.isUninstantiated() && strategy.isUndeveloped()) {
				graphics.fillPolygon(diamond);
			}
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
		if (strategy != null) {
			if (strategy.isUninstantiated() && !strategy.isUndeveloped()) {
				graphics.drawPolygon(triangle);
			}
			else if (!strategy.isUninstantiated() && strategy.isUndeveloped()) {
				graphics.drawPolygon(diamond);
			}
			else if (strategy.isUninstantiated() && strategy.isUndeveloped()) {
				graphics.drawPolygon(diamond);
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
		
		if (strategy != null) {
			if (strategy.isUninstantiated() && !strategy.isUndeveloped()) {
				Point diamondTop = new Point(r.x + (r.width -r.width/5)/2, r.y+ r.height-TRIANGLE_DECORATION_HEIGHT);
				Point diamondLeft = new Point(diamondTop.x - TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point diamondRight = new Point(diamondTop.x + TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				
				triangle.removeAllPoints();
				triangle.addPoint(diamondTop);
				triangle.addPoint(diamondLeft);
				triangle.addPoint(diamondRight);
				offset = -TRIANGLE_DECORATION_HEIGHT;
			}
			else if (!strategy.isUninstantiated() && strategy.isUndeveloped()) {
				Point diamondTop = new Point(r.x + (r.width -r.width/5)/2, r.y+ r.height-DIAMOND_DECORATION_HEIGHT);
				Point diamondLeft = new Point(r.x + (r.width -r.width/5)/2-DIAMOND_DECORATION_HEIGHT/2, r.y + r.height-DIAMOND_DECORATION_HEIGHT/2);
				Point diamondRight = new Point(r.x + (r.width -r.width/5)/2+DIAMOND_DECORATION_HEIGHT/2, r.y + r.height-DIAMOND_DECORATION_HEIGHT/2);
				Point diamondBot = new Point(r.x + (r.width -r.width/5)/2, r.y + r.height);
				
				diamond.removeAllPoints();
				diamond.addPoint(diamondTop);
				diamond.addPoint(diamondLeft);
				diamond.addPoint(diamondBot);
				diamond.addPoint(diamondRight);
				offset = -DIAMOND_DECORATION_HEIGHT;
			}
			else if (strategy.isUninstantiated() && strategy.isUndeveloped()) {
				Point diamondTop = new Point(r.x + (r.width -r.width/5)/2, r.y+ r.height-DIAMOND_DECORATION_HEIGHT);
				Point diamondLeft = new Point(r.x + (r.width -r.width/5)/2-DIAMOND_DECORATION_HEIGHT/2, r.y + r.height-DIAMOND_DECORATION_HEIGHT/2);
				Point diamondRight = new Point(r.x + (r.width -r.width/5)/2+DIAMOND_DECORATION_HEIGHT/2, r.y + r.height-DIAMOND_DECORATION_HEIGHT/2);
				Point diamondBot = new Point(r.x + (r.width -r.width/5)/2, r.y + r.height);
				
				diamond.removeAllPoints();
				diamond.addPoint(diamondTop);
				diamond.addPoint(diamondLeft);
				diamond.addPoint(diamondBot);
				diamond.addPoint(diamondRight);
				diamond.addPoint(diamondTop);
				diamond.addPoint(diamondLeft);
				diamond.addPoint(diamondRight);
				offset = -DIAMOND_DECORATION_HEIGHT;
			}
			
		}
		
		Point p1 = null, p2 = null, p3 = null, p4 = null;
		p1 = new Point(r.x + r.width/5, r.y);
		p2 = new Point(r.x + r.width, r.y);
		p3 = new Point(r.x,  r.y + r.height + offset);
		p4 = new Point(r.x + r.width - r.width/5, r.y + r.height + offset);
		shape.removeAllPoints();
		shape.addPoint(p1);
		shape.addPoint(p3);
		shape.addPoint(p4);
		shape.addPoint(p2);
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Strategy getStrategy() {
		return strategy;
	}
}
