package assignment16;

import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter First number:");
       int a = input.nextInt();
      
       
       	if(a % 2 == 0) {
       		System.out.println("The number is even.");
       	}
       	else {
       		System.out.println("The number is odd.");
       	}
       	input.close();
	}

}
