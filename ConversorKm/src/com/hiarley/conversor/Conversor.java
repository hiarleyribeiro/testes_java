package com.hiarley.conversor;

public class Conversor {  
    
    double valorKm = 1.609;  
    double resultado = 0.0;  
      
    public double ConverteParaKM(double milha){  
        resultado = valorKm * milha;          
        return resultado;  
    }  
      
    public double ConverteParaMilha(double km){  
        resultado = km / valorKm;  
        return resultado;  
    }  
} 
