class Conta {
  boolean transfere(Conta destino, double valor) { //o metodo transferer nos da a possilibidade de transferir valores entre duas contas por exemplo
    boolean retirou = this.saca(valor);
    if (retirou == false) {
      // não deu pra sacar!
      return false;
    }
    else {
      destino.deposita(valor);
      return true;
    }
  }
}
