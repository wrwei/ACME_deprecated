package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.swt.SWT;

public class AssertedRelationshipSourceShape extends PolylineConnectionEx {

	@Override
	protected void outlineShape(Graphics g) {
		g.setAntialias(SWT.ON);
		g.setForegroundColor(ColorConstants.black);
		g.drawLine(getStart(), getEnd());
	}
	
	@Override
	public void validate() {
		super.validate();
	}
}
