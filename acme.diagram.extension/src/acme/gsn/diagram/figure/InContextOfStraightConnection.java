package acme.gsn.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

import gsn.InContextOf;

public class InContextOfStraightConnection extends PolylineConnectionEx {

	private InContextOf inContextOf;

	public void setInContextOf(InContextOf inContextOf) {
		this.inContextOf = inContextOf;
	}
	
	@Override
	protected void outlineShape(Graphics g) {
		super.outlineShape(g);
		if (inContextOf != null) {
			Point midPoint = getPoints().getMidpoint();
			if (inContextOf.isIsMany()) {
				CircleDecoration circleDecoration = new CircleDecoration();
				circleDecoration.setLocation(midPoint);
				circleDecoration.setFill(true);
				g.setBackgroundColor(ColorConstants.gray);
				g.fillOval(circleDecoration.getBounds());
				g.drawOval(circleDecoration.getBounds());		
				
				String constraint = "";
				if (!inContextOf.getImplementationConstraint().isEmpty()) {
					constraint = inContextOf.getImplementationConstraint().get(0).getContent().getValue().get(0).getContent();
				}
			}
			else if (inContextOf.isIsOptional()) {
				CircleDecoration circleDecoration = new CircleDecoration();
				circleDecoration.setLocation(midPoint);
				circleDecoration.setFill(true);
				g.setBackgroundColor(ColorConstants.white);
				g.fillOval(circleDecoration.getBounds());
				g.drawOval(circleDecoration.getBounds());
			}
			g.setBackgroundColor(ColorConstants.black);
		}
	}
}
