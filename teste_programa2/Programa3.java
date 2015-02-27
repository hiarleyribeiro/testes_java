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

class Programa4 {
  public static void main(String[] args) {
    Conta minhaConta;
    minhaConta = new Conta();

    minhaConta.dono = "Duke";
    minhaConta.saldo = 1000.0;
    System.out.println("Saldo atual: " + minhaConta.saldo);
    minhaConta.saca(200.0); 
    System.out.println("Saldo novo(com valor sacado): " + minhaConta.saldo);
    minhaConta.deposita(230.0); 
    System.out.println("Saldo novo(com valor depositado): " + minhaConta.saldo);	
  }
}

