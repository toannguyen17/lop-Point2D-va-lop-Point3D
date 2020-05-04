package app.matrix;

public class Point2D {
	protected float x = 0.0f;
	protected float y = 0.0f;

	public Point2D(){
	}

	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * @param x
	 * @param y
	 */
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return array {x, y}
	 */
	public float[] getXY() {
		float[] arr = {x, y};
		return arr;
	}

	@Override
	public String toString() {
		return "{" + x + ", " + y + "}";
	}
}
