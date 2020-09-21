package assignment33;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		int size = 5;

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the number: ");
			array[i] = input.nextInt();

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
			System.out.println("the sorted ascending order of an array is:" + array[i]);
		}
		input.close();
	}
}
