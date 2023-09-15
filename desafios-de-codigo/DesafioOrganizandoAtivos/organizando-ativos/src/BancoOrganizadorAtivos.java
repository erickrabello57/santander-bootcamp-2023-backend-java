import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    ArrayList < String > ativos = new ArrayList <String> ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.next();
      ativos.add(codigoAtivo);
    }
    System.out.println();
    Collections.sort(ativos);

    for (String ativo: ativos){
        System.out.println(ativo);
    }

    scanner.close();
    
  }
}
