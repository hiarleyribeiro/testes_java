import  javax.swing.*;

class TesteFatorial4 {
 	    public static void main(String[] args){
        

	for (long n = 1, fatorial = 1; n <= 20; n++)  
{  
    for (long w = n; w >= n; w--)  
    {  
        fatorial = fatorial * (n);  
    }  
    JOptionPane.showMessageDialog (null, n+"! = "+fatorial);  
}
}
}