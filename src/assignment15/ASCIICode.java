package assignment15;

import java.util.Scanner;

public class ASCIICode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int n = input.nextInt();

		if (n >= 0 && n <= 128) {
			System.out.println("The ASCII Code of given number is: " + (char) n); // type casting of interger to
																					// character
		}
		input.close();
	}

}
