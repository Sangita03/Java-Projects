package assignment23;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the nth number: ");
		int num = input.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.println("the sum of nth number is: " + sum);
		}
		input.close();
	}

}
