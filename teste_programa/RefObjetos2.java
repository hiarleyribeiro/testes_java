public class RefObjetos2 {
     public static void main(String args[]) {
     
     Conta c1;
     c1 = new Conta();
     c1.deposita = 100;
 
     Conta c2 = c1;  
     
      System.out.println(c1);
      System.out.println(c2);
   }
 }
	

