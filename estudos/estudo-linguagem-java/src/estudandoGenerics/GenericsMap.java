package estudandoGenerics;

import java.util.HashMap;
import java.util.Map;

public class GenericsMap {
    public static void main(String[] args) {
        
        // Exemplo de mapa  sem generics
        Map mapSemGenerics = new HashMap();
        mapSemGenerics.put("Erick", 57);
        mapSemGenerics.put("Alfredo", 30);
        mapSemGenerics.put("João", 11);
        
        for (Object obj : mapSemGenerics.entrySet()) {
            Map.Entry mapEntry = (Map.Entry) obj;
            String chave = (String) mapEntry.getKey();
            Integer valor = (Integer) mapEntry.getValue();
            System.out.println("Chave: " + chave + " Valor: "+ valor);
        }
        System.out.println();

        //Exemplo de Mapa com generics

        Map <String, Integer>mapGenerics = new HashMap<>();
        mapGenerics.put("Breno", 1);
        mapGenerics.put("Carlos", 2);
        mapGenerics.put("Douglas", 3);

        for (Map.Entry<String, Integer> entry: mapGenerics.entrySet()) {
            String chave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Chave: "+ chave + " Valor: " + valor);
        }


    }
}
