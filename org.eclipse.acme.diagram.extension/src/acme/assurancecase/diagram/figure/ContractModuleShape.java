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

public class ContractModuleShape extends Shape {

	//main shape
	protected PointList shape = new PointList();
	//top left rectangle
	protected PointList topLeftRectangle = new PointList();
	//bottom right rectangle
	protected PointList botRightRectangle = new PointList();
	
	public static final int TOP_RECT_WIDTH = 38;
	public static final int TOP_RECT_HEIGHT = 13;
	
	public static final int BOT_RECT_WIDTH = 38;
	public static final int BOT_RECT_HEIGHT = 13;
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topLeftRectangle.translate(dx, dy);
		botRightRectangle.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillPolygon(topLeftRectangle);
		graphics.fillPolygon(botRightRectangle);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
		graphics.drawPolygon(topLeftRectangle);
		graphics.drawPolygon(botRightRectangle);
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
		br = new Point(r.x + r.width, r.y + r.height - BOT_RECT_HEIGHT);
		bl = new Point(r.x, r.y + r.height - BOT_RECT_HEIGHT);
		
		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);
		
		Point bRectTL, bRectTR, bRectBR, bRectBL;
		bRectTL = new Point(r.x + r.width - BOT_RECT_WIDTH, r.y + r.height - BOT_RECT_HEIGHT);
		bRectTR = new Point(r.x + r.width, r.y + r.height - BOT_RECT_HEIGHT);
		bRectBR = new Point(r.x + r.width, r.y + r.height);
		bRectBL = new Point(r.x + r.width - BOT_RECT_WIDTH, r.y + r.height);
		
		botRightRectangle.removeAllPoints();
		botRightRectangle.addPoint(bRectTL);
		botRightRectangle.addPoint(bRectTR);
		botRightRectangle.addPoint(bRectBR);
		botRightRectangle.addPoint(bRectBL);
	}

}
