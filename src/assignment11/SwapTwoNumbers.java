package assignment11;

import java.util.Scanner;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = input.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = input.nextInt();
		System.out.println("value before swap :" + a + "," + b);
		
		
		 int temp = a;
		  a = b;
		  b = temp;
		  
	  System.out.println("value after swap :"+ a + "," + b);
		input.close();
		

	}

}
