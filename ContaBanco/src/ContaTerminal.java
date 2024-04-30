import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a sua agência");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite a conta");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f%n já está disponível para saque", nomeCliente, numeroAgencia, numeroConta,saldo));

        scanner.close();
    }
}
