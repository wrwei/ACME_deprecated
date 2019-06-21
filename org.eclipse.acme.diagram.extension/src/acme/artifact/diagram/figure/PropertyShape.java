/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.artifact.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import artifact.Property;

public class PropertyShape extends Shape {

	protected PointList shape = new PointList();
	protected Rectangle leftCurve = new Rectangle();
	protected Rectangle rightCurve = new Rectangle();
	
	protected static final int CURVE_WIDTH = 30;
	
	protected Property property = null;
	
	
	public PointList getParallelgram() {
		return shape; 
	}

	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
		leftCurve.translate(dx, dy);
		rightCurve.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillPolygon(shape);
		graphics.fillArc(leftCurve, 100, 160);
		graphics.fillArc(rightCurve, 280, 160);

	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (property != null) {
			if (property.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);

			}
		}
		graphics.drawArc(leftCurve, 100, 160);
		graphics.drawArc(rightCurve, 280, 160);
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		
		leftCurve.setBounds(r.x, r.y, CURVE_WIDTH, r.height);
		rightCurve.setBounds(r.x+r.width-CURVE_WIDTH, r.y, CURVE_WIDTH, r.height);
		
		Point shapeTL, shapeTR, shapeBR, shapeBL;
		//shape top line
		shapeTL = new PrecisionPoint(r.x + CURVE_WIDTH, r.y);
		shapeTR = new PrecisionPoint(r.x + r.width - CURVE_WIDTH, r.y);
		
		//shape bot line
		shapeBR = new PrecisionPoint(r.x + r.width - CURVE_WIDTH, r.y + r.height);
		shapeBL = new PrecisionPoint(r.x + CURVE_WIDTH, r.y + r.height);
		
		shape.removeAllPoints();
		shape.addPoint(shapeTL);
		shape.addPoint(shapeTR);
		shape.addPoint(shapeBR);
		shape.addPoint(shapeBL);
		
	}
	
	public Property getProperty() {
		return property;
	}
	
	public void setProperty(Property property) {
		this.property = property;
	}

}
