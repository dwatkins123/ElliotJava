//********************************************************************
// FtoC.java Author: D. Watkins
//
// Convert Fahrenheit temperature to Celsius
//********************************************************************

import java.util.Scanner;

public class FtoC
{
	//-----------------------------------------------------------------
	// Computes the Celsius equivalent of an entered Fahrenheit value
	// value using the formula C = (F - 32) * 5/9.
	//-----------------------------------------------------------------

	public static void main (String[] args)
	{
		final int BASE = 32;
		final double CONVERSION_FACTOR = 5.0 / 9.0;

		double fahrenheitTemp, celsiusTemp;

		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the  Fahrenheit temperature: ");
		fahrenheitTemp = scan.nextDouble();
		celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;

		System.out.println ("Fahrenheit Temperature: " + fahrenheitTemp);
		System.out.println ("Celsius Equivalent: " + celsiusTemp);
	}
}
