package com.hiarley.exercicio7;

import javax.swing.JOptionPane;

public class Comparison {
	
	public static void main(String args[])
	{
		String firstNumber;
		String secondNumber;
		String result;
		int number1;
		int number2;
		
		firstNumber =
				JOptionPane.showInputDialog( "Digite o primeiro numero:");
		
		secondNumber =
				JOptionPane.showInputDialog("Digite o segundo numero:");
		
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		
		result = "";
		
		if (number1 == number2)
			result = result + number1 + " == " + number2;
		
		if (number1 != number2)
			result = result + number1 + " != " + number2;
		
		if (number1 < number2)
			result = result + "\n" + number1 + " < " + number2;
		
		if (number1 > number2)
			result = result + "\n" + number1 + " > " + number2;
		
		if (number1 <= number2)
			result = result + "\n" + number1 + " <= " + number2;
		
		if (number1 >= number2)
			result = result + "\n" + number1 + " >= " + number2;
		
		
		JOptionPane.showMessageDialog(null,  result, "Comparison Results",
				JOptionPane.INFORMATION_MESSAGE);
			
		System.exit(0);
		
	}
	
}
