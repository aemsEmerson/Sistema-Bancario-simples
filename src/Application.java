import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Digite o Numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite o nome do Cliente: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Deseja fazer um deposito inicial? (s/n): ");
        char resposta = sc.next().charAt(0);
        if(resposta == 's'){
            System.out.print("Digite o valor do deposito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nome, depositoInicial);
        } else {
            conta = new Conta(numeroConta, nome);
        }
        
        System.out.println(conta);

        sc.close();
    }
}
