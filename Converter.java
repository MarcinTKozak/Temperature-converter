/* PP 2.4 Create a version of the TempConverter application to convert
from Fahrenheit to Celsius. Read the Fahrenheit temperature
from the user.*/

// decided to make temConverter from celcius to fahrenheit instead......

import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double celcius, fahrenheit;
		
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		final int BASE = 32;
		
		// formula F = C * 1.8 + 32
		//			or
		// formula F = C * (9.0 / 5.0) + 32
		
		System.out.println("Enter temperature in Celsius to convert:");
		celcius = scan.nextDouble();
		
		fahrenheit = celcius * CONVERSION_FACTOR + BASE;
		
		System.out.println(celcius + " Celsius " + " = " + fahrenheit + " Fahrenheit");
	}	

}
