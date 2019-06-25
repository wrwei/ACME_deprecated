/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/

package argumentation.diagram.edit.parts;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;

import base.ModelElement;


public class CustomAnchor extends AbstractConnectionAnchor {

	protected ConnectionEditPart connectionType;
	protected ModelElement modelElement;
	protected String type;

	public CustomAnchor(IFigure owner, ConnectionEditPart connection) {
		super(owner);
		this.connectionType = connection;
		if (connection instanceof AssertedRelationshipTargetEditPart) {
			type = "target";
		} else {
			type = "source";
		}
	}

	public CustomAnchor(IFigure owner, ModelElement modelElement) {
		super(owner);
		this.modelElement = modelElement;
		if (modelElement instanceof AssertedRelationshipTargetEditPart) {
			type = "target";
		} else {
			type = "source";
		}
	}

	public void setConnectionType(ConnectionEditPart connectionType) {
		this.connectionType = connectionType;
	}

	public void setModelElement(ModelElement modelElement) {
		this.modelElement = modelElement;
	}

	public String getType() {
		return type;
	}

	public ModelElement getModelElement() {
		return modelElement;
	}

	public ConnectionEditPart getConnectionType() {
		return connectionType;
	}

	@Override
	public Point getLocation(Point reference) {
		Point point = null;

		// translate to absolute first to handle scrolling
		Rectangle r = getOwner().getBounds().getCopy();
		getOwner().translateToAbsolute(r);

		Point pE = reference;
		Point pA = r.getTopLeft();
		Point pB = r.getTopRight();
		Point pC = r.getBottomLeft();
		Point pD = r.getBottomRight();

		// handles target
		if (type.equals("target") || connectionType instanceof AssertedRelationshipTargetEditPart) {

			// Rectangle Anchor
			if (pE.y <= r.getCenter().y) {
				// Edge: AB
				point = new Point((pA.x + pB.x) / 2, pA.y);
			} else {
				// Edge: CD
				point = new Point((pC.x + pD.x) / 2, pC.y);
			}
		}
		// handles source
		else {
			// Rectangle Anchor
			if (pE.y <= r.getCenter().y) {
				// Edge: AB
				point = new Point((pA.x + pB.x) / 2, pA.y);
			} else {
				// Edge: CD
				point = new Point((pC.x + pD.x) / 2, pC.y);
			}
		}
		return point;
	}

}
