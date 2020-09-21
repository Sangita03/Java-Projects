package assignment19;

import java.util.Scanner;

public class SidesOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the First side of a triangle: ");
		int a = input.nextInt();
		System.out.println("enter the Second side of a triangle: ");
		int b = input.nextInt();
		System.out.println("enter the Third side of a triangle: ");
		int c = input.nextInt();
		if (a == b && c == a) {
			System.out.println("The triangle is Equilateral.");
		} else if (a == b || b == c || a == c) {
			System.out.println("The triangle is Isosceles");
		} else {
			System.out.println("The triangle is Scalene");
		}

		input.close();
	}

}
