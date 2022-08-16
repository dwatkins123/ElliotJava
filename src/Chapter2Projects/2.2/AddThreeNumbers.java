//********************************************************************
// AddThreeNumbers.java Author: D. Watkins
//
// Adds three numbers inputted by user
//********************************************************************

import java.util.Scanner;

public class AddThreeNumbers
{
	//-----------------------------------------------------------------
	// Adds three integers
	//-----------------------------------------------------------------

	public static void main (String[] args)
	{
		int a, b, c;
		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the first integer: ");
		a = scan.nextInt();

		System.out.print ("Enter the second integer: ");
		b = scan.nextInt();

		System.out.print ("Enter the third integer: ");
		c = scan.nextInt();

		System.out.println("The three numbers summed is " + (a + b + c));
	}
}
