class BalancoTrimestal {
	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		String mediaMensal = "Valor da Média Mensal = " + gastosTrimestre / 3;
		System.out.println(gastosTrimestre);
		System.out.println(mediaMensal);


		
	}
}