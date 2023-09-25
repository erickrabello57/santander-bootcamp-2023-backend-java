package estudandoGenerics;

import java.util.HashSet;
import java.util.Set;

public class GenericsSet {
    public static void main(String[] args) {
        
        Set setSemGenerics = new HashSet();
        setSemGenerics.add("Olá");
        setSemGenerics.add(57);
        setSemGenerics.add(true);

        //iterando sobre um set heterogeneo sem generics
        for(Object obj: setSemGenerics){
            System.out.println(obj);
           
        }
        System.out.println();

        Set <String> setComGenerics = new HashSet<>();
        setComGenerics.add("5");
        setComGenerics.add("7");
        setComGenerics.add("0");

        //iterando sobre uma lista homogenea com generics

        for(String str: setComGenerics){
            System.out.println(str);
            System.out.println(str.charAt(0)); //exemplo de uso de um método de String
        }
        System.out.println();
    }
}
