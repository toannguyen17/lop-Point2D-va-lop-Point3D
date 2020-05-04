package test;

import app.matrix.Point2D;

public class TestPoint2D {
	public static void main(String[] args) {
		Point2D point2d = new Point2D();
		System.out.println(point2d.toString());

		point2d = new Point2D(3.0f, 6.0f);
		System.out.println(point2d.toString());

		System.out.println(point2d.getXY()[0]);
	}
}