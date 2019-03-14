package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import argumentation.ArtifactReference;

public class ArtifactReferenceShape extends Shape{

	private ArtifactReference artifactReference;
	protected PointList shape = new PointList();
	
	public static final int CORNER_OFFSET = 30;


	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		shape.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setForegroundColor(ColorConstants.black);
		graphics.fillPolygon(shape);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		if (artifactReference != null) {
			if (artifactReference.isIsAbstract()) {
				graphics.setLineStyle(SWT.LINE_DASH);
				graphics.setForegroundColor(ColorConstants.gray);
			}
		}
		graphics.drawPolygon(shape);
		graphics.drawLine(shape.getPoint(1), shape.getPoint(3));
		
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());	
		r.resize(-1, -1);

		/*
		 * 1   2
		 *     3  4
		 * 6      5    
		 */
		
		Point rect1 = new Point(r.x, r.y);
		Point rect2 = new Point(r.x + r.width-CORNER_OFFSET, r.y);
		Point rect3 = new Point(r.x + r.width-CORNER_OFFSET, r.y+CORNER_OFFSET);
		Point rect4 = new Point(r.x + r.width, r.y+CORNER_OFFSET);
		Point rect5 = new Point(r.x+r.width, r.y+r.height);
		Point rect6 = new Point(r.x, r.y+r.height);
		
		shape.removeAllPoints();
		shape.addPoint(rect1);
		shape.addPoint(rect2);
		shape.addPoint(rect3);
		shape.addPoint(rect4);
		shape.addPoint(rect5);
		shape.addPoint(rect6);
	}
	
	public ArtifactReference getArtifactReference() {
		return artifactReference;
	}
	
	public void setArtifactReference(ArtifactReference artifactReference) {
		this.artifactReference = artifactReference;
	}
}
