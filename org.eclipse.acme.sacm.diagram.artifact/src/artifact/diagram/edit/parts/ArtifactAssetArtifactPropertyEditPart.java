package artifact.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import artifact.diagram.edit.policies.ArtifactAssetArtifactPropertyItemSemanticEditPolicy;

/**
 * @generated
 */
public class ArtifactAssetArtifactPropertyEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4102;

	/**
	* @generated
	*/
	public ArtifactAssetArtifactPropertyEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ArtifactAssetArtifactPropertyItemSemanticEditPolicy());
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
		return new ArtifactAssetArtifactPropertyFigure();
	}

	/**
	* @generated
	*/
	public ArtifactAssetArtifactPropertyFigure getPrimaryShape() {
		return (ArtifactAssetArtifactPropertyFigure) getFigure();
	}
	
	public class ArtifactAssetArtifactPropertyFigure extends PolylineConnectionEx {

		/**
		 * @generated NOT
		 */
		public ArtifactAssetArtifactPropertyFigure() {

			PolygonDecoration df = new PolygonDecoration();
			df.setBackgroundColor(ColorConstants.black);
			df.setTemplate(PolygonDecoration.TRIANGLE_TIP);
			df.setScale(15, 6);
			df.setReferencePoint(getEnd());
			setTargetDecoration(df);
		}
	}

}
