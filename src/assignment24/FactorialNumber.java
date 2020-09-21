package assignment24;
 
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		 int num = input.nextInt();
		
		 int n = 1;
		for(int i = 1; i <= num; i++) {
			n = n * i;
			
			System.out.println(num +"! is " + n );
		}
		input.close();
	}

}
