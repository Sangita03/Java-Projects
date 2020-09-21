package assignment8;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// Converting Fahrenheit to celsius
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit temperature ");
		double  n = input.nextDouble();
		double C  = (n - 32) * 5/9  ;
		System.out.println("The celsius of given temperature is: " + C);
		System.out.println("**************************");
		
		
		// converting Celsius to Fahrenheit
		
		System.out.println("Enter the Celsius tempreature");
		double n1 = input.nextDouble();
		double F = (n1 + 32) * 9/5;
		System.out.println("The Fahrenheit of given temperature is: " + F);
		
		input.close();
	}

}
