package com.hiarley.aula4;

public class Repeticao {
	public static void main(String[] args) {

//		System.out.println("Tabuada de 2:");
//		System.out.println("2 x 0 = " + (2 * 0));
//		System.out.println("2 x 1 = " + (2 * 1));
//		System.out.println("2 x 2 = " + (2 * 2));
//		System.out.println("2 x 3 = " + (2 * 3));
//		System.out.println("2 x 4 = " + (2 * 4));
//		System.out.println("2 x 5 = " + (2 * 5));
		
		for (int x = 0; x <= 9; x++) {
			System.out.println("Tabuada de " + x);
		for (int i = 0; i <= 9; i++) {
			System.out.println(x + " x " + i + " = " + (x * i));
		 }
		}
		
		int u = 0;
		while(1<10){
			System.out.println("Contagem" + u);
			u++;
		}
		
	}
}