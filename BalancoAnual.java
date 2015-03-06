class BalancoAnual {
	public static void main(String[] args) {

		int gastosJaneiro = 5000;
		int gastosFevereiro = 3000;
		int gastosMarco = 7000;
		int gastosAbril = 2000;
		int gastosMaio = 9000;
		int gastosJunho = 5000;
		int gastosJulho = 1000;
		int gastosAgosto = 6000;
		int gastosSetembro = 5300;
		int gastosOutubro = 3000;
		int gastosNovembro = 5000;
		int gastosDezembro = 10000;
		int gastosAnuais = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril +  gastosMaio + gastosJunho + gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro + gastosNovembro + gastosDezembro;
		
		String mediaMensal = "Valor da Média Mensal: " + gastosAnuais / 12;
		System.out.println(gastosAnuais);
		System.out.println(mediaMensal);


		
	}
}
