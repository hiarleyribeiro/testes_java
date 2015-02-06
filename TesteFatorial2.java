class TesteFatorial2 { 
		  public static void main(String[] args) {
			for (long i = 1; i <= 20; i++) {  
		   long fatorial = 1;  
		   if (i != 0 && i != 1) {  
		   for (long j = i; j >= 1; j--) {  
		   fatorial *= j;  
		      }  
		   }  
   		   System.out.println("Fatorial de " + i + ": " + fatorial );  
       } 
    }
}