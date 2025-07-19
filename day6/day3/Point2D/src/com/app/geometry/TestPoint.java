package com.app.geometry;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1=new Point2D(2,4);
		Point2D  p2 = new Point2D(3,4);
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		if(isEqual(p1,p2)) {
			System.out.println("both Points are having same x & y co-ords");
		}else {
			System.out.println("both Points are having diffrent x & y co-ord");
		}
		double D = calculateDistance(p1,p2);
		System.out.println("Distance :"+D);
		
	}

	private static double calculateDistance(Point2D  p1, Point2D  p2) {
		double distance;
		distance=(Math.pow((p2.X-p1.X),2)+Math.pow((p2.Y-p1.Y),2));
		distance= Math.sqrt(distance);
		return distance;
		
	}
	private static boolean isEqual(Point2D p1,Point2D p2) {
		if(p1.X==p2.X) {
			if(p1.Y==p2.Y) {
			return true;
			}
		}
		return false;
	}

}