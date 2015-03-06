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

}

class Programa {
  public static void main(String[] args) {
    Conta minhaConta;
    minhaConta = new Conta();
    minhaConta.dono = "Igor Hiarley";
    minhaConta.saldo = 1000.00;
    System.out.println("Dono da conta: " + minhaConta.dono);
    System.out.println("Saldo atual 1: " + minhaConta.saldo);
    minhaConta.deposita(230.06);
    System.out.println("Saldo novo(com valor depositado)1: " + minhaConta.saldo + "\n");	
    
    Conta minhaConta2;
    minhaConta2 = new Conta();
    minhaConta2.dono = "Marcio Ribeiro";
    minhaConta2.saldo = 4500.00;
    System.out.println("Dono da conta: " + minhaConta.dono);
    System.out.println("Saldo atual2: " + minhaConta2.saldo);
    minhaConta2.deposita(260.05);
    System.out.println("Saldo novo(com valor depositado)2: " + minhaConta2.saldo + "\n");

        Conta minhaConta3;
    minhaConta = new Conta();
    minhaConta.dono = "Marcelo Ribeiro";
    minhaConta.saldo = 1234.00;
    System.out.println("Dono da conta: " + minhaConta.dono);
    System.out.println("Saldo atual 1: " + minhaConta.saldo);
    minhaConta.deposita(122.55);
    System.out.println("Saldo novo(com valor depositado)1: " + minhaConta.saldo + "\n");	
 
    Conta minhaConta4;
    minhaConta2 = new Conta();
    minhaConta2.dono = "Ruth Ribeiro";
    minhaConta2.saldo = 10500.00;
    System.out.println("Dono da conta: " + minhaConta.dono);
    System.out.println("Saldo atual2: " + minhaConta2.saldo);
    minhaConta2.deposita(500.25);
    System.out.println("Saldo novo(com valor depositado)2: " + minhaConta2.saldo + "\n");
    
 }
}

