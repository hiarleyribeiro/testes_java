class TesteOperador{
	
	//aqui vamos testar os operadores de atribuiçao, copiar valores...
	public static void main(String[] ags){
		int i = 10; // i recebe uma copia do valor 10
		int j = i; // j recebe uma copia do valor de i
		i = i + 5; // i vira 15, j continua 10

		System.out.println(i);
		System.out.println(j);

	}
}