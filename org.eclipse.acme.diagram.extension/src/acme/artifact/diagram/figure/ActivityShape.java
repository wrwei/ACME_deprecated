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
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import artifact.Activity;

public class ActivityShape extends Shape {

	protected PointList shape = new PointList();
	protected Activity activity = null;
	
	
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
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (activity != null) {
			if (activity.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
		}
		graphics.drawPolygon(shape);
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);
		
		/*
		 * p1      p2
		 *                p3
		 * 
		 * p5      p4
		 */
		
		int offset = r.width/5;
		
		Point p1, p2, p3, p4, p5;
		p1 = new Point(r.x, r.y);
		p2 = new Point(r.x + r.width - offset, r.y);
		p3 = new Point(r.x + r.width, r.y + r.height/2+1);
		p4 = new Point(r.x + r.width - offset, r.y + r.height);
		p5 = new Point(r.x, r.y + r.height);
		
		shape.removeAllPoints();
		shape.addPoint(p1);
		shape.addPoint(p2);
		shape.addPoint(p3);
		shape.addPoint(p4);
		shape.addPoint(p5);
		
	}
	
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	public Activity getActivity() {
		return activity;
	}

}
