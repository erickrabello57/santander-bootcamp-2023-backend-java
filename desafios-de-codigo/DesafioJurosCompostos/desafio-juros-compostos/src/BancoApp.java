import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.##");
        
        double valorFinal = valorInicial*Math.pow((1 + taxaJuros), periodo);
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.


        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}
