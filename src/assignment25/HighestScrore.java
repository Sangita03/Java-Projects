package assignment25;

import java.util.Scanner;
public class HighestScrore {
	public static void main(String [] arg) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the student no of student: ");
		int num = input.nextInt();
		
		for(int i, i <= num, i++) {
		System.out.println("Enter the student name no: ");
		String name = input.next();
		
		System.out.println("Enter the student Score: ");
		int score = input.nextInt();
		
		System.out.println("Enter the student name no: ");
		String name2 = input.next();
		
		System.out.println("Enter the student Score: ");
		int score2 = input.nextInt();
		
	if (score > score2) {
		System.out.println("the highest score is " + score);
	}
	else {
		System.out.println("the highest score is " + score2);
	}
		}
	}
		
}



