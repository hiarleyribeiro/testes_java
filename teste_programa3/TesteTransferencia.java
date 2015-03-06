class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	

   boolean saca(double valor) {

     if (this.saldo < valor) {

       return false;

     }

     else {

       this.saldo = this.saldo - valor;

       return true;

     }

   }

	void deposita(double quantidade) {
		this.saldo += quantidade;	
  }





		boolean transfere(Conta destino, double valor) {
			boolean retirou = this.saca(valor);
			if (retirou == false) {
			return false;
		}

		else {
			destino.deposita(valor);
			return true;
		}

		}





}

class TesteTransferencia {
  public static void main(String[] args) {
    Conta minhaConta;
    minhaConta = new Conta();
    minhaConta.dono = "Igor Hiarley";
    minhaConta.saldo = 1000.00;
    System.out.println("Dono da conta: " + minhaConta.dono);
    System.out.println("Saldo atual 1: " + minhaConta.saldo);
    System.out.println("Saldo: " + minhaConta.saldo + "\n");
    
	
    
    Conta minhaConta2;
    minhaConta2 = new Conta();
    minhaConta2.dono = "Marcio Ribeiro";
    minhaConta2.saldo = 4500.00;
    System.out.println("Dono da conta: " + minhaConta.dono);
    System.out.println("Saldo: " + minhaConta2.saldo + "\n");
    minhaConta.transfere(minhaConta2, 200);
    System.out.println("Saldo: " + minhaConta2.saldo + "\n");
	

 }
}

