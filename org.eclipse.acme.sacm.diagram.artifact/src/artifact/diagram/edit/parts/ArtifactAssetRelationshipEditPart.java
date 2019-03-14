package artifact.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import artifact.diagram.edit.policies.ArtifactAssetRelationshipItemSemanticEditPolicy;

/**
 * @generated
 */
public class ArtifactAssetRelationshipEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4101;

	/**
	* @generated
	*/
	public ArtifactAssetRelationshipEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ArtifactAssetRelationshipItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel23EditPart) {
			((WrappingLabel23EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureArtifactAssetRelationshipLabel());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel23EditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ArtifactAssetRelationshipFigure();
	}

	/**
	* @generated
	*/
	public ArtifactAssetRelationshipFigure getPrimaryShape() {
		return (ArtifactAssetRelationshipFigure) getFigure();
	}

	/**
	 * @generated NOT
	 */
	public class ArtifactAssetRelationshipFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureArtifactAssetRelationshipLabel;

		/**
		 * @generated NOT
		 */
		public ArtifactAssetRelationshipFigure() {

			createContents();
			PolygonDecoration df = new PolygonDecoration();
			df.setBackgroundColor(ColorConstants.white);
			df.setTemplate(PolygonDecoration.TRIANGLE_TIP);
			df.setScale(15, 6);
			df.setReferencePoint(getEnd());
			setTargetDecoration(df);
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureArtifactAssetRelationshipLabel = new WrappingLabel();

			fFigureArtifactAssetRelationshipLabel.setText("");

			this.add(fFigureArtifactAssetRelationshipLabel);

		}

		/**
		 * @generated NOT
		 */
		public WrappingLabel getFigureArtifactAssetRelationshipLabel() {
			return fFigureArtifactAssetRelationshipLabel;
		}
		
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
