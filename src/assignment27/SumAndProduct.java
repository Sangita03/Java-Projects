package assignment27;

import java.util.Scanner;

public class SumAndProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		int product = 1;
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			product *= remainder;
			sum += remainder;
			num /= 10;

		}
		System.out.println("the product of given number is " + product);
		System.out.println("the sum of given number is:" + sum);
		input.close();
	}
}
