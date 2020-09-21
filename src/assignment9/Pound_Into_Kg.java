//Write a program that converts pound into kg. The program prompts the user to enter anumber of pounds,convert it to kg and displays the result [ 1 pound is 0.454kg].

package assignment9;

import java.util.Scanner;

public class Pound_Into_Kg {
	public static void main (String [] arg) {
		
	    double p = 0.454;
	    System.out.println("Enter the number of Pound you want to convert into KG ");
	    Scanner input = new Scanner(System.in);
	    int obj = input.nextInt();
	    
	    double Kilogram = obj * p;
	    
	    System.out.println("The pound of " + obj +"  is equals to " + Kilogram + " kg.");
	    
	    input.close();
	 
 }
}
