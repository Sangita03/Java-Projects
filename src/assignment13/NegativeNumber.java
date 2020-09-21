package assignment13;

import java.util.Scanner;
public class NegativeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n = input.nextInt();
		
			if (n < 0) {
				System.out.println("The value of n is " + n);
			}
		
			else {
				System.out.println("Only negative value is valid, Please try again!");
			}
       input.close();
	}

}
