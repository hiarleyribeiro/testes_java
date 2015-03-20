package com.hiarley.exercicio9;

import javax.swing.JOptionPane;

public class GeradorDeFrases {
	public static void main (String args[])
	{
		String primeiraFrase,
		segundaFrase, terceiraFrase;
		String frase1;
		String frase2;
		String frase3;
		String fraseCompleta;
		
		primeiraFrase =
				JOptionPane.showInputDialog("Digite a primeira frase:");
		
		segundaFrase =
				JOptionPane.showInputDialog("Digite a segunda frase:");
		
		terceiraFrase =
				JOptionPane.showInputDialog("Digite a terceira frase:");
		
		
		frase1 = String.valueOf( primeiraFrase );
		frase2 = String.valueOf( segundaFrase );
		frase3 = String.valueOf( terceiraFrase );
		
		fraseCompleta = frase1 + " " + frase2 + " " + frase3;
		
		JOptionPane.showMessageDialog(
				null, "A frase completa é: " + fraseCompleta, "Resultado",
				JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}
