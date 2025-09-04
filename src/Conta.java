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
        if(valor > 0){
            saldo += valor;
        } else {
            System.out.println("Valor de depósito Inválido.");
        }
    }
    public void saque(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= (valor + 5.0);
        } else {
            System.out.println("Saldo insuficiente ou valor Inválido.");
        }
    }
    @Override
    public String toString() {
        return String.format("Conta: %d, Nome: %s, Saldo: R$%.2f", numero, nome, saldo);
    } 

    
    
}
