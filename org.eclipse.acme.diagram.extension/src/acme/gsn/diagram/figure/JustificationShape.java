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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import gsn.Justification;

public class JustificationShape extends Shape {

	private Justification justification;
	protected Rectangle rect = new Rectangle();
	
	protected PointList triangle = new PointList(3);
	public static final int TRIANGLE_DECORATION_HEIGHT = 10;

	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		rect.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.fillOval(rect);
		if (justification != null) {
			if (justification.isUninstantiated()) {
				graphics.fillPolygon(triangle);
			}
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawOval(rect);
		graphics.fillText("J", rect.x + rect.width-10, rect.y + rect.height-15);
		if (justification != null) {
			if (justification.isUninstantiated()) {
				graphics.drawPolygon(triangle);
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
		if (justification != null) {
			if (justification.isUninstantiated()) {
				Point diamondTop = new Point(r.x + r.width/2, r.y+ r.height-TRIANGLE_DECORATION_HEIGHT);
				Point diamondLeft = new Point(diamondTop.x - TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				Point diamondRight = new Point(diamondTop.x + TRIANGLE_DECORATION_HEIGHT, diamondTop.y + TRIANGLE_DECORATION_HEIGHT);
				
				triangle.removeAllPoints();
				triangle.addPoint(diamondTop);
				triangle.addPoint(diamondLeft);
				triangle.addPoint(diamondRight);
				offset = TRIANGLE_DECORATION_HEIGHT;
			}
		}
		rect.setBounds(r.x, r.y, r.width, r.height-offset);
	}
	
	public void setJustification(Justification justification) {
		this.justification = justification;
	}
}
