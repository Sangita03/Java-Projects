package assignment20;

import java.util.Scanner;

public class FourFunctionCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = input.nextInt();

		System.out.println("Enter the second number");
		int b = input.nextInt();
		System.out.println("Please enter the character operation you would like to perform.");
		char choice = input.next().charAt(0);

		switch (choice) {
		case '+':
			int add = a + b;
			System.out.println("The sum of two integers is: " + add);
			break;
		case '-':
			int sub = a - b;
			System.out.println("The subtraction of two integers is: " + sub);
			break;
		case '*':
			int mult = a * b;
			System.out.println("The multiplication of two integers is: " + mult);
			break;
		case '/':
			int div = a / b;
			System.out.println("The division of two integers is: " + div);
			break;
		default:
			break;
		}
	}
}
