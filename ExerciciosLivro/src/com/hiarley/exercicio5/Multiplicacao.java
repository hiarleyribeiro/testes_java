package com.hiarley.exercicio5;

import javax.swing.JOptionPane;

public class Multiplicacao {
	public static void main (String args[])
	{
		String firstNumber,
		secondNumber;
		int number1;
		int number2;
		int sum;
		
		firstNumber =
				JOptionPane.showInputDialog("Numero a ser multiplicado:");
		
		secondNumber =
				JOptionPane.showInputDialog("Vezes:");
		
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		
		sum = number1 * number2;
		
		JOptionPane.showMessageDialog(
				null, "A soma é " + sum, "Resultado",
				JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}
