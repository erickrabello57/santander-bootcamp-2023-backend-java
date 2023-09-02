package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        //analisarCandidatura(3000.0);
        String [] candidatos = {"Alice", "Bruno","Cintia","Diego","Emanuelle","Felipe","Gabriela","Heitor","Irís","João"};
        String[] selecionados = selecionarCandidatos(candidatos);
        
        for (String string : selecionados) {
            System.out.println(string);
        }
    }


    public static String[] selecionarCandidatos(String[] candidatos){
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        String strAuxiliar = "";
        String[] listaCandidatosSelecionados;
        
        
    
        for (String candidato : candidatos) {
                double salarioPretendido = valorPretendido();
                
                if(salarioPretendido <= salarioBase){
                    candidatosSelecionados++;
                    
                    System.out.println("O(a) candidato(a) " + candidato + " foi selecionado com o valor pretendido de R$"+ salarioPretendido );
                    strAuxiliar+= candidato+" ";
                }
        }    
        
       listaCandidatosSelecionados = strAuxiliar.split(" ");
       return listaCandidatosSelecionados;
        
        
    }

    public static double valorPretendido(){
        return Math.round(ThreadLocalRandom.current().nextDouble(1800, 2200));
    }
    
    public static void analisarCandidatura(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioPretendido < salarioBase){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if(salarioPretendido == salarioBase){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
