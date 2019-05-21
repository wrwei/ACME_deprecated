/*******************************************************************************
 * Copyright (c) 2011-2017 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Athanosias Zolotas - initial API and implementation
 ******************************************************************************/
package acme.gsn.diagram.figure;

import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Point;

public class InContextOfFixedPolygonDecoration extends PolygonDecoration {
	
	private Point location = new Point();
	
	public InContextOfFixedPolygonDecoration() {
		super();
	}

}
