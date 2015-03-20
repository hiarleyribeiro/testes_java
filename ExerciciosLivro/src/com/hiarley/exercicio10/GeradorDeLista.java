package com.hiarley.exercicio10;

import javax.swing.JOptionPane;

public class GeradorDeLista {
	public static void main (String args[])
	{
		String primeiraPessoa,
		segundaPessoa, terceiraPessoa;
		String pessoa1;
		String pessoa2;
		String pessoa3;
		String listaCompleta;
		
		primeiraPessoa =
				JOptionPane.showInputDialog("Digite o nome da primeira pessoa:");
		
		segundaPessoa =
				JOptionPane.showInputDialog("Digite o nome da segunda pessoa:");
		
		terceiraPessoa =
				JOptionPane.showInputDialog("Digite o nome da terceira pessoa:");
		
		
		pessoa1 = String.valueOf( primeiraPessoa );
		pessoa2 = String.valueOf( segundaPessoa );
		pessoa3 = String.valueOf( terceiraPessoa );
		
		listaCompleta = "\n" + "1 - " + pessoa1 + "\n" + "2 - " + pessoa2 + "\n" + "3 - " + pessoa3;
		
		JOptionPane.showMessageDialog(
				null, "Lista completa de nomes: " + listaCompleta, "Resultado",
				JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}
}
