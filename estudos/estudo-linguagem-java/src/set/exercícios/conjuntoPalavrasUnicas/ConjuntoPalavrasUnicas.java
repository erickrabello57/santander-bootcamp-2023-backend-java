package set.exercícios.conjuntoPalavrasUnicas;
import java.util.*;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        conjuntoPalavrasUnicas = new LinkedHashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(palavra.toLowerCase());
    }

    public void removerPalavra(String palavra){
        Iterator<String> it = conjuntoPalavrasUnicas.iterator();
        palavra = palavra.toLowerCase();


        if(!conjuntoPalavrasUnicas.isEmpty()){
            while(it.hasNext()){
                String str = it.next();
                if(str.equals(palavra)){
                    it.remove();
                }
            }
        }else{
            System.out.println("A lista está vazia");
        }

        if(!conjuntoPalavrasUnicas.contains(palavra)){
            System.out.println("A palavra "+ palavra + " não está na lista");
        }
        
    }

    public void verificarPalavra(String palavra){
        palavra = palavra.toLowerCase();
        if(!conjuntoPalavrasUnicas.isEmpty()){
            if(conjuntoPalavrasUnicas.contains(palavra)){
                System.out.println("A palavra " + palavra + " está na lista");
            }else{
                System.out.println("A palavra " + palavra + " não está na lista");
            }
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public void exibirPalavras(){
        Iterator<String> iterator = conjuntoPalavrasUnicas.iterator();
        if (conjuntoPalavrasUnicas.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
        
    }


}
