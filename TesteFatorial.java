class TesteFatorial { 
		public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {  
		   int fatorial = 1;  
		   if (i != 0 && i != 1) {  
		   for (int j = i; j >= 1; j--) {  
		   fatorial *= j;  
		      }  
		   }  
   		   System.out.println("Fatorial de " + i + ": " + fatorial );  
       } 
    }
}