/*******************************************************************************
 * Copyright (c) 2011-2017 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.figure;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import acme.diagram.util.Arc;
import gsn.Context;

public class ContextShape extends Shape {

	private Context context;
	protected PointList line1 = new PointList(2);
	protected PointList line2 = new PointList(2);
	protected PointList rect = new PointList(2);
	
	protected List<Arc> arcs = new ArrayList<Arc>();
	
	protected PointList triangle = new PointList(3);
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;
	
	protected PointList publicIndicator = new PointList();
	public static final int PUBLIC_INDICATOR_OFFSET = 5;
	public static final int PUBLIC_INDICATOR_WIDTH = 28;
	public static final int PUBLIC_INDICATOR_HEIGHT = 20;
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		line1.translate(dx, dy);
		line2.translate(dx, dy);
		rect.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(rect);
		generateArcs();
		for(Arc arc: arcs)
		{
			graphics.fillArc((int)arc.getX(), (int)arc.getY(), (int)arc.getW(), (int)arc.getH(), (int)arc.getOffSet(), (int)arc.getLength());
		}
		if (context != null) {
			if (context.isUninstantiated()) {
				graphics.fillPolygon(triangle);
			}
			if (context.isIsPublic()) {
				graphics.fillPolygon(publicIndicator);
			}
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(line1);
		graphics.drawPolygon(line2);
		
		
		Arc arc1 = arcs.get(0);
		Arc arc2 = arcs.get(1);

		generateArcs();
		
		graphics.drawArc((int)arc1.getX(), (int)arc1.getY(), (int)arc1.getW(), (int)arc1.getH(), (int)arc1.getOffSet(), (int)arc1.getLength());
		graphics.drawArc((int)arc2.getX(), (int)arc2.getY(), (int)arc2.getW(), (int)arc2.getH(), (int)arc2.getOffSet(), (int)arc2.getLength());
		
		if (context != null) {
			if (context.isUninstantiated()) {
				graphics.drawPolygon(triangle);
			}
			if (context.isIsPublic()) {
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
		
		double arcWidth = getArcWidth();

		int offset = getOffset();
		
		Point rectTL, rectTR, rectBR, rectBL;
		//rect top line
		rectTL = new PrecisionPoint(r.x + arcWidth/2, r.y);
		rectTR = new PrecisionPoint(r.x + r.width - arcWidth/2, r.y);
		line1.removeAllPoints();
		line1.addPoint(rectTL);
		line1.addPoint(rectTR);
		
		//rect bot line
		rectBR = new PrecisionPoint(r.x + r.width - arcWidth/2, r.y + r.height - offset);
		rectBL = new PrecisionPoint(r.x + arcWidth/2, r.y + r.height - offset);
		line2.removeAllPoints();
		line2.addPoint(rectBR);
		line2.addPoint(rectBL);
		
		rect.removeAllPoints();
		rect.addPoint(rectTL);
		rect.addPoint(rectTR);
		rect.addPoint(rectBR);
		rect.addPoint(rectBL);
		
		generateArcs();
	}
	
	private void generateArcs()
	{
		Rectangle r = getBoundsCopy();
		
		double arcWidth = getArcWidth();
		
		int offset = getOffset();

		Arc leftArc = new Arc(r.x, r.y, (int)Math.round(arcWidth), r.height - offset, 90, 180);
		Arc rightArc = new Arc(r.x+r.width-(int)Math.round(arcWidth), r.y, (int)Math.round(arcWidth), r.height - offset, 270, 180);
		arcs.clear();
		arcs.add(leftArc);
		arcs.add(rightArc);
	}
	
	private int getOffset()
	{
		Rectangle r = getBoundsCopy();
		
		double arcWidth = getArcWidth();
		
		int offset = 0;
		if (context != null) {
			if (context.isUninstantiated()) {
				Point diamondTop = new Point(r.x + r.width/2, r.y+ r.height-TRIANGLE_DECORATION_HEIGHT);
				Point diamondLeft = new Point(diamondTop.x - TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point diamondRight = new Point(diamondTop.x + TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				
				triangle.removeAllPoints();
				triangle.addPoint(diamondTop);
				triangle.addPoint(diamondLeft);
				triangle.addPoint(diamondRight);
				offset = TRIANGLE_DECORATION_HEIGHT;
			}
			
			if (context.isIsPublic()) {
				// Module decorating icon
				Point p1 = null, p2 = null, p3 = null, p4 = null, p5 = null, p6 = null, p7 = null;
				p1 = new PrecisionPoint(r.x + r.width - arcWidth - PUBLIC_INDICATOR_OFFSET, r.y + PUBLIC_INDICATOR_OFFSET);
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
		return offset;
	}
	
	public double getArcWidth() {
		Rectangle r = getBoundsCopy();
		
		double arcWidth = r.width/2/1.618;
		return arcWidth;
	}
	
	private Rectangle getBoundsCopy() {
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		return r;
	}

	public void setContext(Context context) {
		this.context = context;
	}
}
