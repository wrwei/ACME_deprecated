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

public class AssuranceCasePackageInterfaceShape extends Shape {

	//main shape
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
		//graphics.fillPolygon(interfaceShape);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawPolygon(topLeftRectangle);
		/*
		 * 1     2   3
		 *
		 * 6     5   4
		 */
		graphics.drawPolygon(shape);
		graphics.drawLine(shape.getPoint(1), shape.getPoint(4));

		/*
		 *   6
		 * 7 9 8
		 *
		 * 4   3
		 *   5
		 * 1   2
		 */
		graphics.drawLine(deco.getPoint(0), deco.getPoint(1));
		graphics.drawLine(deco.getPoint(1), deco.getPoint(2));
		graphics.drawLine(deco.getPoint(2), deco.getPoint(3));
		graphics.drawLine(deco.getPoint(3), deco.getPoint(0));

		graphics.drawLine(deco.getPoint(4), deco.getPoint(8));
		graphics.drawLine(deco.getPoint(5), deco.getPoint(6));
		graphics.drawLine(deco.getPoint(6), deco.getPoint(7));
		graphics.drawLine(deco.getPoint(7), deco.getPoint(5));

		PointList arrowHead = new PointList();
		arrowHead.addPoint(deco.getPoint(5));
		arrowHead.addPoint(deco.getPoint(6));
		arrowHead.addPoint(deco.getPoint(8));
		arrowHead.addPoint(deco.getPoint(7));

		graphics.setBackgroundColor(ColorConstants.gray);
		graphics.fillPolygon(arrowHead);
		graphics.setBackgroundColor(ColorConstants.white);

		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
//		int width = DimensionUtil.getTextSize("Assurance", null).width;
		graphics.drawText("Assurance", new Point(r.x + 5 + TOP_RECT_WIDTH, r.y));
	}

	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		/*
		 * 1     2   3
		 *
		 * 6     5   4
		 */

		Point p1 = new Point(r.x, r.y + + TOP_RECT_HEIGHT);
		Point p2 = new Point(r.x+r.width-MARGIN_WIDTH, r.y + + TOP_RECT_HEIGHT);
		Point p3 = new Point(r.x+r.width, r.y + + TOP_RECT_HEIGHT);
		Point p4 = new Point(r.x+r.width, r.y+r.height);
		Point p5 = new Point(r.x+r.width-MARGIN_WIDTH, r.y+r.height);
		Point p6 = new Point(r.x, r.y+r.height);

		shape.removeAllPoints();
		shape.addPoint(p1);
		shape.addPoint(p2);
		shape.addPoint(p3);
		shape.addPoint(p4);
		shape.addPoint(p5);
		shape.addPoint(p6);



		/*
		 *   6
		 * 7 9 8
		 *
		 * 4   3
		 *   5
		 * 1   2
		 */

		Point p11 = new Point(r.x+r.width-MARGIN_WIDTH +(MARGIN_WIDTH - BOX_WIDTH)/2, r.y+r.height-BOX_OFFSET);
		Point p12 = new Point(r.x+r.width-(MARGIN_WIDTH - BOX_WIDTH)/2, r.y+r.height-BOX_OFFSET);
		Point p13 = new Point(r.x+r.width-(MARGIN_WIDTH - BOX_WIDTH)/2, r.y+r.height-BOX_OFFSET-BOX_WIDTH);
		Point p14 = new Point(r.x+r.width-MARGIN_WIDTH +(MARGIN_WIDTH - BOX_WIDTH)/2, r.y+r.height-BOX_OFFSET-BOX_WIDTH);
		Point p15 = new Point(r.x+r.width-MARGIN_WIDTH/2, r.y+r.height-BOX_OFFSET-BOX_WIDTH/2);

		Point p16 = new Point(r.x+r.width-MARGIN_WIDTH/2, r.y+r.height-BOX_OFFSET-BOX_WIDTH-BOX_WIDTH);
		Point p17 = new Point(r.x+r.width-MARGIN_WIDTH/2-7, r.y+r.height-BOX_OFFSET-BOX_WIDTH-BOX_WIDTH/2+1);
		Point p18 = new Point(r.x+r.width-MARGIN_WIDTH/2+7, r.y+r.height-BOX_OFFSET-BOX_WIDTH-BOX_WIDTH/2+1);
		Point p19 = new Point(r.x+r.width-MARGIN_WIDTH/2, r.y+r.height-BOX_OFFSET-BOX_WIDTH-BOX_WIDTH/2+1);

		deco.removeAllPoints();
		deco.addPoint(p11);
		deco.addPoint(p12);
		deco.addPoint(p13);
		deco.addPoint(p14);
		deco.addPoint(p15);
		deco.addPoint(p16);
		deco.addPoint(p17);
		deco.addPoint(p18);
		deco.addPoint(p19);


		Point rectTL, rectTR, rectBR, rectBL;
		rectTL = new Point(r.x, r.y);
		rectTR = new Point(r.x + TOP_RECT_WIDTH, r.y);
		rectBR = new Point(r.x + TOP_RECT_WIDTH, r.y + TOP_RECT_HEIGHT);
		rectBL = new Point(r.x, r.y + TOP_RECT_HEIGHT);

		topLeftRectangle.removeAllPoints();
		topLeftRectangle.addPoint(rectTL);
		topLeftRectangle.addPoint(rectTR);
		topLeftRectangle.addPoint(rectBR);
		topLeftRectangle.addPoint(rectBL);
	}

}
