package assignment35;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		//user input using Scanner
		Scanner input = new Scanner(System.in);
		int size = 5;

		//creating array object and taking array elements from user. 
		int[] array = new int[size];
		System.out.println("please enter the elements:");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				
				//sorting elements in ascending order.
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			input.close();
		}
		System.out.println("The second highest number is:" + array[size-2]);
	}
}
