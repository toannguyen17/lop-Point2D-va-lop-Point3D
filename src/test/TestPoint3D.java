package test;

import app.matrix.Point3D;

public class TestPoint3D {
	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		System.out.println(point3d.toString());

		point3d = new Point3D(1.7f, 0.2f, 98.0f);
		System.out.println(point3d.toString());

		System.out.println(point3d.getXYZ()[0]);
	}
}
