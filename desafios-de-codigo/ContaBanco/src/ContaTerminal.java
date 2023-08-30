import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite sua agẽncia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        String saida = MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo R${3} já está disponível para saque ", nomeCliente, agencia, numeroConta,saldo );

        
        System.out.println(saida);
    }
}
