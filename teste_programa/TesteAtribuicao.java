class TesteAtribuicao {
  public static void main(String[] args) {
    Conta minhaConta = new Conta();
    
    minhaConta.titular.nome = "Manoel";
    minhaConta.cpf = "123456";
    minhaConta.titular.nome = "Manoel";
  
    Sytem.out.println(minhaConta);
  }
}
