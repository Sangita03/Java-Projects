package assignment36;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 5;

		int[] array = new int[size];
		System.out.println("please enter the elements:");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					System.out.println("the duplicate number is:" + array[i]);
				}
			}
		}
		input.close();

	}

}
