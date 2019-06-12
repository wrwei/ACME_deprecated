/*******************************************************************************
 * Copyright (c) 2011-2019 Ran Wei. 
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

public class ArtifactPackageShape extends Shape {

	//main shape
	protected PointList shape = new PointList();
	//top left rectangle
	protected PointList topRectangle = new PointList();
	
	protected PointList annotationBox = new PointList();
	
	public static final int TOP_RECT_WIDTH_OFFSET = 5;
	public static final int TOP_RECT_HEIGHT = 18;
	
	public static final int BOX_WIDTH = 30;
	public static final int BOX_HEIGHT = 18;
	
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		topRectangle.translate(dx, dy);
		annotationBox.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillPolygon(topRectangle);
		graphics.fillPolygon(annotationBox);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
//		graphics.drawPolygon(shape);
		graphics.drawLine(shape.getPoint(0), shape.getPoint(1));
		graphics.drawLine(shape.getPoint(1), shape.getPoint(2));
		graphics.drawLine(shape.getPoint(2), shape.getPoint(3));
		graphics.drawLine(shape.getPoint(3), shape.getPoint(0));
		
		graphics.drawLine(shape.getPoint(4), shape.getPoint(5));
		graphics.drawLine(shape.getPoint(5), shape.getPoint(6));
		graphics.drawLine(shape.getPoint(5), shape.getPoint(7));
		graphics.drawPolygon(topRectangle);
		graphics.drawPolygon(annotationBox);
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		graphics.drawText("Artifact", new Point(r.x + 5, r.y));
//		int width = DimensionUtil.getTextSize("Argumentation", null).width;
//		graphics.drawText("Argumentation", new Point(r.x + 5 + TOP_RECT_WIDTH_OFFSET, r.y));
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		int offset = (r.width - TOP_RECT_WIDTH_OFFSET*2)/4;
		
		Point rectTL, rectTR, rectBR, rectBL;
		rectTL = new Point(r.x, r.y);
		rectTR = new Point(r.x + r.width, r.y);
		rectBR = new Point(r.x + r.width, r.y + TOP_RECT_HEIGHT);
		rectBL = new Point(r.x, r.y + TOP_RECT_HEIGHT);
		
		topRectangle.removeAllPoints();
		topRectangle.addPoint(rectTL);
		topRectangle.addPoint(rectTR);
		topRectangle.addPoint(rectBR);
		topRectangle.addPoint(rectBL);
		
		/*
		 * tl tr
		 * bl br
		 * p1
		 * p2 p3
		 * p4
		 */
		
		Point tl, tr, br, bl;
		tl = new Point(r.x+TOP_RECT_WIDTH_OFFSET, r.y + TOP_RECT_HEIGHT);
		tr = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET, r.y + TOP_RECT_HEIGHT);
		br = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET, r.y + r.height);
		bl = new Point(r.x + TOP_RECT_WIDTH_OFFSET, r.y + r.height);
		
		Point p1, p2, p3, p4;
		p1 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET - offset, r.y + TOP_RECT_HEIGHT);
		p2 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET - offset, r.y + TOP_RECT_HEIGHT + (r.height - TOP_RECT_HEIGHT)/2);
		p3 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET, r.y + TOP_RECT_HEIGHT + (r.height - TOP_RECT_HEIGHT)/2);
		p4 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET - offset, r.y + r.height);
		
		shape.removeAllPoints();
		shape.addPoint(tl);
		shape.addPoint(tr);
		shape.addPoint(br);
		shape.addPoint(bl);
		shape.addPoint(p1);
		shape.addPoint(p2);
		shape.addPoint(p3);
		shape.addPoint(p4);
		
		Point b1, b2, b3, b4;
		b1 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET - offset + (offset - BOX_WIDTH) / 2, r.y + TOP_RECT_HEIGHT + ((r.height - TOP_RECT_HEIGHT)/2-BOX_HEIGHT)/2);
		b2 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET - offset + (offset - BOX_WIDTH) / 2 + BOX_WIDTH, r.y + TOP_RECT_HEIGHT + ((r.height - TOP_RECT_HEIGHT)/2-BOX_HEIGHT)/2);
		b3 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET - offset + (offset - BOX_WIDTH) / 2 + BOX_WIDTH, r.y + TOP_RECT_HEIGHT + ((r.height - TOP_RECT_HEIGHT)/2-BOX_HEIGHT)/2 + BOX_HEIGHT);
		b4 = new Point(r.x + r.width - TOP_RECT_WIDTH_OFFSET - offset + (offset - BOX_WIDTH) / 2, r.y + TOP_RECT_HEIGHT + ((r.height - TOP_RECT_HEIGHT)/2-BOX_HEIGHT)/2 + BOX_HEIGHT);
		
		annotationBox.removeAllPoints();
		annotationBox.addPoint(b1);
		annotationBox.addPoint(b2);
		annotationBox.addPoint(b3);
		annotationBox.addPoint(b4);
	}

}
