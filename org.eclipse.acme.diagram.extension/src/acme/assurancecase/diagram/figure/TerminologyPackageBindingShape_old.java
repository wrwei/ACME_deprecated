/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.assurancecase.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

public class TerminologyPackageBindingShape_old extends Shape {

	//the main shape
	protected PointList shape = new PointList();
	//top left rectangle
	protected PointList topLeftRectangle = new PointList();
	
	
	public static final int TOP_RECT_WIDTH = 38;
	public static final int TOP_RECT_HEIGHT = 13;
	
	public static final int MARGIN_WIDTH = 30;
	public static final int BOX_WIDTH = 15;
	public static final int BOX_OFFSET = 10;

	protected PointList deco = new PointList();
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topLeftRectangle.translate(dx, dy);
		deco.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillPolygon(topLeftRectangle);
		graphics.fillPolygon(deco);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		
		graphics.drawPolygon(topLeftRectangle);
		graphics.drawPolygon(shape);
		graphics.drawLine(shape.getPoint(1), shape.getPoint(4));
		graphics.drawOval(new Rectangle(deco.getPoint(0).x-BOX_WIDTH/2, deco.getPoint(0).y-BOX_WIDTH, BOX_WIDTH, BOX_WIDTH));
		graphics.drawOval(new Rectangle(deco.getPoint(1).x-BOX_WIDTH/2, deco.getPoint(1).y - BOX_WIDTH, BOX_WIDTH, BOX_WIDTH));
		
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
//		int width = DimensionUtil.getTextSize("Terminology", null).width;
		graphics.drawText("Terminology", new Point(r.x + 5 + TOP_RECT_WIDTH, r.y));
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		Point tRectTL, tRectTR, tRectBR, tRectBL;
		tRectTL = new Point(r.x, r.y);
		tRectTR = new Point(r.x + TOP_RECT_WIDTH, r.y);
		tRectBR = new Point(r.x + TOP_RECT_WIDTH, r.y + TOP_RECT_HEIGHT);
		tRectBL = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		
		topLeftRectangle.removeAllPoints();
		topLeftRectangle.addPoint(tRectTL);
		topLeftRectangle.addPoint(tRectTR);
		topLeftRectangle.addPoint(tRectBR);
		topLeftRectangle.addPoint(tRectBL);
		
		
		Point tl, tr, br, bl;
		tl = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		tr = new Point(r.x + r.width, r.y + TOP_RECT_HEIGHT);
		br = new Point(r.x + r.width, r.y + r.height);
		bl = new Point(r.x, r.y + r.height);
		Point p1 = new Point(r.x + r.width - MARGIN_WIDTH, r.y+TOP_RECT_HEIGHT);
		Point p2 = new Point(r.x + r.width - MARGIN_WIDTH, r.y+r.height);
		
		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(p1);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(p2);
		shape.addPoint(bl);
		
		/*
		 * 
		 */
		
		Point dp1 = new Point(r.x + r.width - MARGIN_WIDTH + MARGIN_WIDTH/3, r.y + r.height - BOX_OFFSET);
		Point dp2 = new Point(r.x + r.width - MARGIN_WIDTH/3, r.y + r.height - BOX_OFFSET);
		deco.removeAllPoints();
		deco.addPoint(dp1);
		deco.addPoint(dp2);
		
//		Point bRectTL, bRectTR, bRectBR, bRectBL;
//		bRectTL = new Point(r.x + r.width - BOT_RECT_WIDTH, r.y + r.height - BOT_RECT_HEIGHT);
//		bRectTR = new Point(r.x + r.width, r.y + r.height - BOT_RECT_HEIGHT);
//		bRectBR = new Point(r.x + r.width, r.y + r.height);
//		bRectBL = new Point(r.x + r.width - BOT_RECT_WIDTH, r.y + r.height);
//		
//		botRightRectangle.removeAllPoints();
//		botRightRectangle.addPoint(bRectTL);
//		botRightRectangle.addPoint(bRectTR);
//		botRightRectangle.addPoint(bRectBR);
//		botRightRectangle.addPoint(bRectBL);
	}

}
