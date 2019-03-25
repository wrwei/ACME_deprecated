package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Transform;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.LineAttributes;

import acme.gsn.diagram.figure.CircleDecoration;
import argumentation.AssertedRelationship;
import argumentation.AssertionDeclaration;

public class AssertedRelationshipTargetShape extends PolylineConnectionEx {

	private AssertedRelationship assertedRelationship;
	protected Transform transform = new Transform();
	AssumedDecoration assumedDeco = new AssumedDecoration();
	AsCitedDecoration asCitedDeco = new AsCitedDecoration();
	DefeatedDecoration defeatedDeco = new DefeatedDecoration();
	AxiomaticDecoration axiomaticDeco = new AxiomaticDecoration();
	NeedsSupportDecoration needsSupportDecoration = new NeedsSupportDecoration();


	public void setAssertedRelationship(AssertedRelationship assertedRelationship) {
		this.assertedRelationship = assertedRelationship;
	}
	
	@Override
	protected void outlineShape(Graphics g) {
		g.setAntialias(SWT.ON);
		g.setForegroundColor(ColorConstants.black);
		g.drawLine(getStart(), getEnd());
		
		if (assertedRelationship != null) {
			
			if (assertedRelationship.isIsAbstract()) {
				g.setLineStyle(SWT.LINE_DASH);
			}
			
			if (assertedRelationship.isIsCounter()) {
				

			}
			Point midPoint = getPoints().getMidpoint();
			if (assertedRelationship.isIsAbstract()) {
				
			}
			else if (assertedRelationship.isIsCitation()) {
				
			}
			else if (assertedRelationship.getAssertionDeclaration() == AssertionDeclaration.ASSERTED) {
				
			}
			else if (assertedRelationship.getAssertionDeclaration() == AssertionDeclaration.ASSUMED) {
//				CircleDecoration circleDecoration = new CircleDecoration();
//				circleDecoration.setLocation(midPoint);
//				circleDecoration.setFill(true);
//				g.setBackgroundColor(ColorConstants.white);
//				g.setForegroundColor(ColorConstants.white);
//				g.fillOval(circleDecoration.getBounds());
//				g.drawOval(circleDecoration.getBounds());
//				g.setForegroundColor(ColorConstants.black);
				PointList shape = assumedDeco.getShape();
				g.drawLine(shape.getPoint(0), shape.getPoint(1));
				g.drawLine(shape.getPoint(2), shape.getPoint(3));
//				g.setBackgroundColor(ColorConstants.white);
				g.setForegroundColor(ColorConstants.white);
				g.fillPolygon(assumedDeco.getFill());
			}
			else if (assertedRelationship.getAssertionDeclaration() == AssertionDeclaration.AXIOMATIC) {
				PointList shape = axiomaticDeco.getShape();
				LineAttributes lineAttributes = new LineAttributes(2);
				g.setLineAttributes(lineAttributes);
				g.drawLine(shape.getPoint(0), shape.getPoint(1));

			}
			else if (assertedRelationship.getAssertionDeclaration() == AssertionDeclaration.NEEDS_SUPPORT) {
				PointList shape = needsSupportDecoration.getShape();
				g.drawOval(shape.getPoint(0).x, shape.getPoint(0).y, 8, 8);
				g.drawOval(shape.getPoint(1).x, shape.getPoint(1).y, 8, 8);
				g.drawOval(shape.getPoint(2).x, shape.getPoint(2).y, 8, 8);
				
				g.setBackgroundColor(ColorConstants.black);

				g.fillOval(shape.getPoint(0).x, shape.getPoint(0).y, 8, 8);
				g.fillOval(shape.getPoint(1).x, shape.getPoint(1).y, 8, 8);
				g.fillOval(shape.getPoint(2).x, shape.getPoint(2).y, 8, 8);
				
//				g.setForegroundColor(ColorConstants.white);
//				g.drawLine(shape.getPoint(0), shape.getPoint(1));
//				g.drawLine(shape.getPoint(1), shape.getPoint(2));
//				g.drawLine(shape.getPoint(2), shape.getPoint(2));
//				g.setForegroundColor(ColorConstants.black);

			}
			else if (assertedRelationship.getAssertionDeclaration() == AssertionDeclaration.DEFEATED) {
				PointList shape = defeatedDeco.getShape();
				g.drawLine(shape.getPoint(0), shape.getPoint(2));
				g.drawLine(shape.getPoint(1), shape.getPoint(3));


			}
			else if (assertedRelationship.getAssertionDeclaration() == AssertionDeclaration.AS_CITED) {
				PointList shape = asCitedDeco.getShape();
				
				g.drawLine(shape.getPoint(0), shape.getPoint(1));
				g.drawLine(shape.getPoint(1), shape.getPoint(2));
				g.drawLine(shape.getPoint(2), shape.getPoint(3));
				g.drawLine(shape.getPoint(4), shape.getPoint(5));
				g.drawLine(shape.getPoint(5), shape.getPoint(6));
				g.drawLine(shape.getPoint(6), shape.getPoint(7));
			}
		}
	}
	
	@Override
	public void validate() {
		Point midPoint = getPoints().getMidpoint();
		asCitedDeco.setLocation(midPoint);
		asCitedDeco.setReferencePoint(getEnd());
		asCitedDeco.validate();
		
		assumedDeco.setLocation(midPoint);
		assumedDeco.setReferencePoint(getEnd());
		assumedDeco.validate();

		defeatedDeco.setLocation(midPoint);
		defeatedDeco.setReferencePoint(getEnd());
		defeatedDeco.validate();
		
		axiomaticDeco.setLocation(midPoint);
		axiomaticDeco.setReferencePoint(getEnd());
		axiomaticDeco.validate();
		
		needsSupportDecoration.setLocation(midPoint);
		needsSupportDecoration.setReferencePoint(getEnd());
		needsSupportDecoration.validate();

		
		// TODO Auto-generated method stub
		super.validate();
	}
}
