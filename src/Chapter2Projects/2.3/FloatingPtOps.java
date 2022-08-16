//********************************************************************
// FloatingPtOps.java Author: D. Watkins
//
// Perform various floating point operations on numbers inputted by
// user
//********************************************************************

import java.util.Scanner;

public class FloatingPtOps
{
	//-----------------------------------------------------------------
	// Perform floating point operations
	//-----------------------------------------------------------------

	public static void main (String[] args)
	{
		float a, b;
		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the first floating point number: ");
		a = scan.nextFloat();

		System.out.print ("Enter the second floating point number: ");
		b = scan.nextFloat();

		System.out.println("The sum of the two numbers is " + (a + b));
		System.out.println("The difference of the two numbers is " + (a - b));
		System.out.println("The product of two numbers is " + (a * b));
	}
}
