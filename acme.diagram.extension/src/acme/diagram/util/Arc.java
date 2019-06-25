/*******************************************************************************
 * Copyright (c) Ran Wei - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 *
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package acme.diagram.util;

public class Arc {

	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected int offSet;
	protected int length;

	public Arc(int x, int y, int w, int h, int offset, int length) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.offSet = offset;
		this.length = length;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}

	public void setOffSet(int offSet) {
		this.offSet = offSet;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}

	public int getOffSet() {
		return offSet;
	}

	public int getLength() {
		return length;
	}
}
