public class Conta {
    private int number;
    private String name;
    private double balance;

    public Conta(){

    }
    public Conta(int number, String name){
        this.number = number;
        this.name = name;
    }
    public Conta(int number, String name, double inicialDeposit) {
        this.number = number;
        this.name = name;
        deposit(inicialDeposit);
    }
    public int getNumber() {
        return number;
    }
  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double value){
        balance += value;
    }
    public void withDraw(double value){
        balance -= (value + 5.0);
    }
    @Override
    public String toString() {
        return "conta: "+ number + ", nome: " + name + ", Saldo: R$" + String.format("%.2f", balance);
    } 

    
    
}
