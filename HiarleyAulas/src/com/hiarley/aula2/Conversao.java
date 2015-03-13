package com.hiarley.aula2;

public class Conversao {
	public static void main (String[] args){
		double km = 120d;
		double totalMilhas = km * 0.621371192d;
		
		System.out.println(km + "km representam " + totalMilhas + " em milhas");
		
		double milhas = 74d;
		double totalKm = milhas / 0.621371192d;
		
		System.out.println(milhas + "milhas representam " + totalKm + " em km");
		
	} 
}
