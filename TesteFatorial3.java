import  javax.swing.*;

class TesteFatorial3 {
 	    public static void main(String[] args){
        

	for (long n = 1, fatorial = 1; n <= 10; n++)  
{  
    for (long w = n; w >= n; w--)  
    {  
        fatorial = fatorial * (n);  
    }  
    JOptionPane.showMessageDialog (null, n+"! = "+fatorial);  
}
}
}