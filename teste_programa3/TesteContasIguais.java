class TesteContasIguais {
	public static void main(String[] args) {
        Conta numero1 = new Conta();
	numero1.dono = "Marcio Ribeiro";
	numero1.saldo = 229;

	Conta numero2 = new Conta();
	numero2.dono = "Marcio Ribeiro";
	numero2.saldo = 229;
	
	if (numero1 == numero2) {
	System.out.println("Contas Iguais");}
	
	else {
	System.out.println ("Contas Diferentes!");
}     
   

  }
}
