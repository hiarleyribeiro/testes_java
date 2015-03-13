package com.hiarley.conversor;

import javax.swing.JOptionPane;  


public class Principal {  
  
    public static void main (String args[]){  
          
        Conversor conversor = new Conversor();  
        int menu = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"+  
                                                    "1 - Converter Km para Milhas \n"+  
                                                    "2 - Converter Milhas para Km"));  
        if(menu ==1){  
            double valorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor (km) a ser convertido para milhas"));  
                      
            double resposta = conversor.ConverteParaMilha(valorKm);  
              
            JOptionPane.showMessageDialog(null, "O valor convertido é: "+resposta+ "milhas");  
        }else if(menu == 2){  
            double valorMilha = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor (milha) a ser convertido para km"));  
              
            double resposta = conversor.ConverteParaKM(valorMilha);  
              
            JOptionPane.showMessageDialog(null, "O valor convertido é: "+resposta+ "km");  
        }  
          
          
          
    }  
}
