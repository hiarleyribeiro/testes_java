package com.hiarley.aula3;

public class Idade {
	public static void main (String[] args){
		int anoNascimento = 1999;
		int anoAtual = 2015;
		
		int idade = anoAtual - anoNascimento;
		
		if (idade < 18 && idade >= 16){
			System.out.println("Idade permitida acompanhado pelos pais");
		}else if (idade < 16){ 
			System.out.println("Idade não permitida");
		}else{
			System.out.println("Idade permitida!");
		}
		
	System.out.println("Sua idade é " + idade);
		
		
	}
}
