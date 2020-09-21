package assignment12;

import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the roll number:");
		int roll = input.nextInt();
	
		System.out.println("Enter your name:");
		String name = input.next();
		
		System.out.println("Enter your nationality: ");
		String nationality = input.next();
		
		System.out.print(roll + "  " + name + "  " + nationality);
		input.close();
	}

}
