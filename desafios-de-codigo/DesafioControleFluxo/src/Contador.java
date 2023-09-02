import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        
        Scanner terminal = new Scanner(System.in);
		terminal.useLocale(Locale.ENGLISH);
        boolean flag = false;
        int parametroUm = 0 ;
        int parametroDois = 0;

        
        System.out.println("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt();
               
        
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
             
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
        finally{
            terminal.close();
        }
    }

    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            
            throw new ParametrosInvalidosException();
        }
        
        
        int resultado = parametroDois - parametroUm; 
        
        for(int i = 1; i <= resultado; i++ ){
            System.out.println("Imprimindo o número " + i);
        }
        
    }
}
