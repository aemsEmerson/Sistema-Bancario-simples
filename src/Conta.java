public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta(){

    }
    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
    public Conta(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = depositoInicial;
    }
    

    public int getNumero() {
        return numero;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    

    public void deposito(double valor){
        saldo += valor;
    }
    public void saque(double valor){
        saldo -= (valor + 5.0);
    }
    @Override
    public String toString() {
        return String.format("Conta: %d, Nome: %s, Saldo: R$%.2f", numero, nome, saldo);
    } 

    
    
}
