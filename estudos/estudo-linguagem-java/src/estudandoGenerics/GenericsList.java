package estudandoGenerics;
import java.util.*;

public class GenericsList{
    public static void main(String[] args) {
        
        //List sem Generics 
        List lista = new ArrayList();
        lista.add("João");
        lista.add(1);
        lista.add(false);

        //Para iterar sobre uma lista heterogênea precisamos fazer uso da herança, todas as classes no Java são herderiras de Object
        
        for (Object obj : lista) {
            System.out.println(obj);
        }
        System.out.println();

        
        //lista homogenea sem generics

        List listaHomogenea = new ArrayList();
        listaHomogenea.add(55.5);
        listaHomogenea.add(44.4);
        listaHomogenea.add(33.3);

        for(Object obj: listaHomogenea){
            Double db = (Double) obj; //casting
            System.out.println(db);
        }
        System.out.println();
        //Lista com generics

        List<Integer> listaComgenerics = new ArrayList<>();
        listaComgenerics.add(1);
        listaComgenerics.add(57);
        listaComgenerics.add(571);

        for(Integer i: listaComgenerics){
            System.out.println(i);
        }
        System.out.println();
    }
}