package acme.argumentation.diagram.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import argumentation.AssertedInference;

public class AssertedInferenceShape extends Shape{

	private AssertedInference assertedInference;
	protected Rectangle rectangle = new Rectangle();
	
	@Override
	protected void primTranslate(int dx, int dy) {
		super.primTranslate(dx, dy);
		rectangle.translate(dx, dy);
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.fillOval(rectangle);
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		graphics.setAntialias(SWT.ON);
		graphics.setForegroundColor(ColorConstants.black);
		graphics.drawOval(rectangle);
	}
	
	@Override
	public void validate() {
		super.validate();
		Rectangle r = getBounds().getCopy();
		r.shrink(getInsets());
		r.resize(-1, -1);

		rectangle.setBounds(r.x, r.y, r.width, r.height);
	}

	public void setAssertedInference(AssertedInference assertedInference) {
		this.assertedInference = assertedInference;
	}
	
	public AssertedInference getAssertedInference() {
		return assertedInference;
	}
}
