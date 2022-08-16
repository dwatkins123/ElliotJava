//********************************************************************
// PointDistance.java Author: D. Watkins
//
// Calculate the distance between two points on a plane
//********************************************************************

import java.util.Scanner;

public class PointDistance
{
	//-----------------------------------------------------------------
	// Calculate the distance between two points on a plane
	//-----------------------------------------------------------------

	public static void main (String[] args)
	{
		int x1, x2, y1, y2;
		double distance;
		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the x coordinate of the first point: ");
		x1 = scan.nextInt();

		System.out.print ("Enter the y coordinate of the first point: ");
		y1 = scan.nextInt();

		System.out.print ("Enter the x coordinate of the second point: ");
		x2 = scan.nextInt();

		System.out.print ("Enter the y coordinate of the second point: ");
		y2 = scan.nextInt();

		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("The distance between the two points is " +  distance);
	}
}
