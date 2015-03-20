package com.hiarley.exercicio8;

import javax.swing.JOptionPane;

public class Divisao {
	public static void main (String args[])
	{
		String firstNumber,
		secondNumber;
		int number1;
		int number2;
		int sum;
		
		firstNumber =
				JOptionPane.showInputDialog("Numero a ser dividido:");
		
		secondNumber =
				JOptionPane.showInputDialog("Dividir por:");
		
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		
		sum = number1 / number2;
		
		JOptionPane.showMessageDialog(
				null, "O resultado é " + sum, "Resultado",
				JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}
