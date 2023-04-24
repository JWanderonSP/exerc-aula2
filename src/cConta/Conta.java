package cConta;
public class Conta{
    double valor=0.0;
private double saldo;


/*ações do saldo */
public double getSaldo(int numConta) {
    return saldo;
}
public void setSaldo(double saldo, int numConta) {
    this.saldo = saldo;
}
/*ações de titular */
private String titular;
public String getTitular(int numConta){
    return titular;
}
public void setTitular(String titular) {
    this.titular = titular;
}

/*ações de numero de conta */
private int numConta;


public int getNumConta() {
    return numConta;
}
public void setNumConta(int numConta) {
    this.numConta = numConta;
}

public void depositar (Double valor, int numConta){
    saldo=saldo+valor;

}

public void sacar(double valor, int numConta){
    if(getSaldo(numConta)>valor){
        saldo=saldo-valor;
    }
    else{
        System.out.println("Saldo insuficiente");
    }
}
        
    


public void transferir(double valor,int numConta,int numConta2){
    double novosaldo=getSaldo(numConta)-valor;
    setSaldo(novosaldo, numConta);
    depositar(valor, numConta2);
}
}





