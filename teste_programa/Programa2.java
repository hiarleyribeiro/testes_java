class Programa2 {
   public static void main(String[] args) {
     // criando a conta
     Conta minhaConta;
     minhaConta = new Conta();
 
     // alterando os valores de minhaConta
     minhaConta.dono = "Duke";
     minhaConta.saldo = 1000;
   
     // saca 200 reais
     minhaConta.saca(200);
 
     // deposita 500 reais
     minhaConta.deposita(500);
     System.out.println(minhaConta.saldo);
   }
 }