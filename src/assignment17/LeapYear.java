package assignment17;

import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		
		if (year % 4 == 0) {
			System.out.println(year + " is a Leap Year.");
		}
		else {
			System.out.println(year + " isn't a Leap Year");
		}
		input.close();
	}

}
