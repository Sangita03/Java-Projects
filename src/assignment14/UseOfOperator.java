package assignment14;

import java.util.Scanner;
public class UseOfOperator {

	public static void main(String[] args) {
		//relating two integer using == or > or < sign.
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int a = input.nextInt();
		System.out.println("enter the second number: ");
		int b = input.nextInt();
		
		if(a == b) {
			System.out.println("The value of a and b is same.");
		}
		
		if (a > b) {
			System.out.println("The value of a is greater than b.");
		}
		
		if (a < b) {
			System.out.println("The value of a is less than b.");
		}
	input.close();
	}

}
