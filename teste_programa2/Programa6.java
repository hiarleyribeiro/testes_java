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

class Programa6 {
  public static void main(String[] args) {
    Conta minhaConta;
    minhaConta = new Conta();
    minhaConta.dono = "Duke";
    minhaConta.saldo = 1000.0;
    System.out.println("Saldo atual 1: " + minhaConta.saldo);
    minhaConta.deposita(230.0);
    System.out.println("Saldo novo(com valor depositado)1: " + minhaConta.saldo);	
 
    Conta minhaConta2;
    minhaConta2 = new Conta();
    minhaConta2.dono = "Duke";
    minhaConta2.saldo = 4500.0;
    System.out.println("Saldo atual2: " + minhaConta2.saldo);
    minhaConta2.deposita(260.0);
    System.out.println("Saldo novo(com valor depositado)2: " + minhaConta2.saldo);
    
 }
}

