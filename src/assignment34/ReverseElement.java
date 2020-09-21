package assignment34;

import java.util.Scanner;

public class ReverseElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 5;

		int[] array = new int[size];
		System.out.println("Please enter the element: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("the reverse order of an array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[size-1]);
			size--;
		}
		input.close();
	}

}
