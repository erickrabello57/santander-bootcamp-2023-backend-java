import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        DecimalFormat df = new DecimalFormat("#.00");

        double valor = scanner.nextDouble();
        

        if (valor > 0) {
          System.out.println("Deposito realizado com sucesso!\nSaldo atual: R$ " + df.format(valor));    //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");//TODO: Imprimir a mensagem de encerrar o programa.
        }
        scanner.close();
    }
}
