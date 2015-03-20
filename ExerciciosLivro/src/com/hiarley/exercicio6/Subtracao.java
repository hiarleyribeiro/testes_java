package com.hiarley.exercicio6;

import javax.swing.JOptionPane;

public class Subtracao {
	public static void main (String args[])
	{
		String firstNumber,
		secondNumber;
		int number1;
		int number2;
		int sum;
		
		firstNumber =
				JOptionPane.showInputDialog("Numero a ser subtraido:");
		
		secondNumber =
				JOptionPane.showInputDialog("Menos:");
		
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		
		sum = number1 - number2;
		
		JOptionPane.showMessageDialog(
				null, "O resultado é " + sum, "Resultado",
				JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}
