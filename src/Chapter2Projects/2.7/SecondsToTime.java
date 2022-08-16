//********************************************************************
// SecondsToTime.java Author: D. Watkins
//
// Convert number of seconds to hours, minutes, seconds
//********************************************************************

import java.util.Scanner;

public class SecondsToTime
{
	//-----------------------------------------------------------------
	// Convert number of seconds to hours, minutes, seconds
	//-----------------------------------------------------------------

	public static void main (String[] args)
	{
		int inSeconds, remainder, outHours, outMinutes, outSeconds;
		Scanner scan = new Scanner(System.in);

		System.out.print ("Enter the number of seconds: ");
		inSeconds = scan.nextInt();

		outHours = inSeconds / 3600;
		remainder = inSeconds % 3600;
		outMinutes = remainder / 60;
		outSeconds = remainder % 60;


		System.out.println("The equivalent is " + outHours + " hours, "
			               + outMinutes + " minutes, and " + outSeconds
			               + " seconds.");
	}
}
