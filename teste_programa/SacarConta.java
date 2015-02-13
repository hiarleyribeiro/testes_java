class SacarConta {
    double salario;
    void saca(double quantidade) { // void diz que, quando você pedir para a conta sacar uma quantia, nenhuma informação será enviada de volta a quem pediu.
     							// quando alguem pedir pra sacar, precisasse dizer o quanto vai sacar por isso vai dentro do parentese a quantidade. Eh chama de
     							// variavel comum ou temporária, ou local, pois no final da execução desse método ela deixa de existir.
     double novoSaldo = this.saldo - quantidade; 
     this.saldo = novoSaldo;  //aqui declaramos uma variavel this, que assim como o argumento ela vai morrer no final da execução
   }
 }