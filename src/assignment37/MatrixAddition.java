package assignment37;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {

		final int ROW = 3;
		final int COLUMN = 3;

		// declaring first array list
		int[][] array = new int[ROW][COLUMN];
		Scanner input = new Scanner(System.in); // taking user input using Scanner library
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("enter the element of first array list");
				array[i][j] = input.nextInt();

			}
		}
		
		// diplaying user given elements in 3*3 matrix format
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " "); // " " this help to maintain space between the elements
			}
			System.out.println(); // to print elements in a new line, without this we will get output in a single
									// line.

		}

		// declaring Second array list
		int[][] array1 = new int[ROW][COLUMN];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.println("enter the element of second array list");
				array1[i][j] = input.nextInt();
			}
		}
		// diplaying user given elements in 3*3 matrix format
		for (int i = 0; i < array1.length; i++) { // nested for loop
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println(); // to print elements in a new line
		}

		// declaring final array list to assign the final addition result
		int[][] result = new int[ROW][COLUMN];
		System.out.println("Addition of 2 matrixs is:  ");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(array[i][j] + array1[i][j] + " "); // performing addition of 2 list of arrays and
																	// displaying its result
			}
			System.out.println(); // to print elements in a new line

		}
		input.close();
	}
}