package assignment32;

import java.util.Scanner;
public class SumOfFiveArrays {
	public static void main (String [] arr){
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[5];
		 for(int i = 0; i < array.length; i++) {
			 System.out.println("enter the element: ");
			 array[i] = input.nextInt();	
		 }
		 int sum = 0;
		 for(int i = 0; i < array.length; i++) {
		 sum += array[i];
		 }
		 System.out.println("The sum of given elements is: " + sum);
		 input.close();
		}
	
	}