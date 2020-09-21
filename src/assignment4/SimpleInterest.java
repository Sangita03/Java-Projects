//Write a program to calculate Simple Interest input by User. Simple Interest= P*T*R/100

package assignment4;

import javax.swing.JOptionPane;

public class SimpleInterest {
	public static void main(String[] args) {
		int p = Integer.parseInt(JOptionPane.showInputDialog("Please enter the principle: "));
		int t = Integer.parseInt(JOptionPane.showInputDialog("Please enter the time: "));
		int r = Integer.parseInt(JOptionPane.showInputDialog("Please enter the rate: "));
		
		int simpleInt = (p*t*r)/ 100; 
		
		JOptionPane.showMessageDialog(null, simpleInt);
	}

}
