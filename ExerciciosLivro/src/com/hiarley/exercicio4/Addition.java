package com.hiarley.exercicio4;

import javax.swing.JOptionPane;

public class Addition {
	public static void main (String args[])
	{
		String firstNumber,
		secondNumber;
		int number1;
		int number2;
		int sum;
		
		firstNumber =
				JOptionPane.showInputDialog("Enter first integer");
		
		secondNumber =
				JOptionPane.showInputDialog("Enter second integer");
		
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		
		sum = number1 + number2;
		
		JOptionPane.showMessageDialog(
				null, "The sum is " + sum, "Results",
				JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}
