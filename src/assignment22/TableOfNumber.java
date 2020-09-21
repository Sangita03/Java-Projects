package assignment22;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number that you would like to print the table of: ");
		final int num = input.nextInt();

		for (int i = 1; i <= 20; i++) {
			int n1 = num * i;

			System.out.println(n1);

		}

	}

}
