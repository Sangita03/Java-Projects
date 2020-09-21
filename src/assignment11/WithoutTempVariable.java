package assignment11;

import java.util.Scanner; 
public class WithoutTempVariable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number:");
		int a = input.nextInt();
		System.out.print("Please enter the second number:");
		int b = input.nextInt();
		System.out.println( "value of a and b before swap:" + a +", " + b);
		
		 a = a + b; // a = 5 + 10 : 15
		 b = a - b; // b = 15 - 10 :    5
		 a = a - b; // a = 15 - 5  :   10
		   
		System.out.println();
		System.out.println( "value of a and b after swap:" + a +", " + b);
		input.close();

	}

}
