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

public class ContractModuleReferenceShape extends Shape {

	protected PointList shape = new PointList();
	protected PointList topLeftRectangle = new PointList();
	protected PointList botRightRectangle = new PointList();
	public static final int TOP_RECT_WIDTH = 38;
	public static final int TOP_RECT_HEIGHT = 13;

	public static final int BOT_RECT_WIDTH = 38;
	public static final int BOT_RECT_HEIGHT = 13;

	public PointList getParallelgram() {
		return shape;
	}

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
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(shape);
		graphics.drawPolygon(topLeftRectangle);
		graphics.drawPolygon(botRightRectangle);
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		graphics.drawText("Reference", new Point(r.x + 5 + TOP_RECT_WIDTH, r.y));
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

//		double smallRectangleHeight = r.height/5;
//		double smallRectangleWidth = r.width/3;
//		Point p1 = null, p2 = null, p3 = null, p4 = null, p5 = null, p6 = null, p7 = null, p8 = null, p9 = null, p10 = null;
//		p1 = new Point(r.x, r.y);
//		p2 = new PrecisionPoint(r.x + smallRectangleWidth, p1.y);
//		p3 = new PrecisionPoint(p2.x, r.y + smallRectangleHeight);
//		p4 = new Point(p1.x, p3.y);
//		p5 = new Point(r.x + r.width, p3.y);
//		p6 = new PrecisionPoint(p5.x, r.y + r.height - smallRectangleHeight);
//		p7 = new Point(r.x, p6.y);
//		p8 = new Point(p5.x, r.y + r.height);
//		p9 = new PrecisionPoint(p8.x - smallRectangleWidth, p8.y);
//		p10 = new Point(p9.x, p6.y);
//		shape.removeAllPoints();
//		shape.addPoint(p4);
//		shape.addPoint(p1);
//		shape.addPoint(p2);
//		shape.addPoint(p3);
//		shape.addPoint(p5);
//		shape.addPoint(p6);
//		shape.addPoint(p8);
//		shape.addPoint(p9);
//		shape.addPoint(p10);
//		shape.addPoint(p6);
//		shape.addPoint(p7);
//		shape.addPoint(p4);
//		shape.addPoint(p3);
	}

}
