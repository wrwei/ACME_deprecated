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

import acme.diagram.util.Arc;
import gsn.AwaySolution;


public class AwaySolutionShape extends Shape {

	private AwaySolution awaySolution;
	protected PointList decoratingShape = new PointList(4);
	protected PointList decoratingModuleShape = new PointList(7);
	public static final int DECORATING_HEIGHT = 30;
	public static final int MODULE_ICON_OFFSET = 5;
	public static final int MODULE_ICON_WIDTH = 28;
	public static final int MODULE_ICON_HEIGHT = 20;
	
	protected PointList triangle = new PointList(3);
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		decoratingShape.translate(dx, dy);
		decoratingModuleShape.translate(dx, dy);
		triangle.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(decoratingShape);
        graphics.setBackgroundColor(ColorConstants.gray);
		graphics.fillPolygon(decoratingModuleShape);
		int offset = 0;

		if (awaySolution.isUninstantiated()) { 
	        graphics.setBackgroundColor(ColorConstants.white);
			graphics.fillPolygon(triangle);
			offset = TRIANGLE_DECORATION_HEIGHT;
		}
		graphics.setBackgroundColor(ColorConstants.white);
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		Point circleStartingPoint = new Point(r.x, r.y);
		Arc circle = new Arc(circleStartingPoint.x, circleStartingPoint.y, r.width, (r.height - DECORATING_HEIGHT - offset)*2, 0, 180);
		graphics.fillArc((int)circle.getX(), (int)circle.getY(), (int)circle.getW(), (int)circle.getH(), (int)circle.getOffSet(), (int)circle.getLength());
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		int offset = 0;
		graphics.drawPolygon(decoratingShape);
		graphics.drawPolygon(decoratingModuleShape);
		if (awaySolution.isUninstantiated()) { 
			graphics.drawPolygon(triangle);
			offset = TRIANGLE_DECORATION_HEIGHT;
		}
		Point circleStartingPoint = new Point(r.x, r.y);
		Arc circle = new Arc(circleStartingPoint.x, circleStartingPoint.y, r.width, (r.height - DECORATING_HEIGHT - offset)*2, 0, 180);
		graphics.drawArc((int)circle.getX(), (int)circle.getY(), (int)circle.getW(), (int)circle.getH(), (int)circle.getOffSet(), (int)circle.getLength());
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		int offset = 0;
		if (awaySolution != null) {
			if (awaySolution.isUninstantiated()) {
				Point triangleTop = new Point(r.x + r.width/2, r.y + r.height-TRIANGLE_DECORATION_HEIGHT);
				Point triangleLeft = new Point(triangleTop.x - TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point triangleRight = new Point(triangleTop.x + TRIANGLE_DECORATION_HEIGHT, triangleTop.y + TRIANGLE_DECORATION_HEIGHT);
				
				triangle.removeAllPoints();
				triangle.addPoint(triangleTop);
				triangle.addPoint(triangleLeft);
				triangle.addPoint(triangleRight);
				offset = TRIANGLE_DECORATION_HEIGHT;
			}
		}
		
		// Bottom compartment
		Point decoratingShapeTopLeft = new Point(r.x, r.y+r.height-DECORATING_HEIGHT - offset);
		Point decoratingShapeTopRight = new Point(r.x+r.width, r.y+r.height-DECORATING_HEIGHT - offset);
		Point decoratingBottomLeft = new Point(decoratingShapeTopLeft.x, decoratingShapeTopLeft.y + DECORATING_HEIGHT);
		Point decoratingShapeBottomRight = new Point(decoratingShapeTopRight.x, decoratingShapeTopRight.y + DECORATING_HEIGHT);
		
		decoratingShape.removeAllPoints();
		decoratingShape.addPoint(decoratingShapeTopLeft);
		decoratingShape.addPoint(decoratingShapeTopRight);
		decoratingShape.addPoint(decoratingShapeBottomRight);
		decoratingShape.addPoint(decoratingBottomLeft);
		
		// Module decorating icon
		Point p1 = null, p2 = null, p3 = null, p4 = null, p5 = null, p6 = null, p7 = null;
		p1 = new Point(decoratingShapeTopLeft.x + MODULE_ICON_OFFSET, decoratingShapeTopLeft.y + MODULE_ICON_OFFSET);
		p2 = new Point(p1.x + MODULE_ICON_WIDTH/3, p1.y);
		p3 = new Point(p2.x, p2.y + MODULE_ICON_HEIGHT/4);
		p4 = new Point(p1.x, p3.y);
		p5 = new Point(p1.x, p1.y + MODULE_ICON_HEIGHT);
		p6 = new Point(p5.x + MODULE_ICON_WIDTH, p5.y);
		p7 = new Point(p6.x, p3.y);
		decoratingModuleShape.removeAllPoints();
		decoratingModuleShape.addPoint(p1);
		decoratingModuleShape.addPoint(p2);
		decoratingModuleShape.addPoint(p3);
		decoratingModuleShape.addPoint(p4);
		decoratingModuleShape.addPoint(p5);
		decoratingModuleShape.addPoint(p6);
		decoratingModuleShape.addPoint(p7);
		decoratingModuleShape.addPoint(p4);
	}

	public void setAwaySolution(AwaySolution awaySolution) {
		this.awaySolution = awaySolution;
	}
}
