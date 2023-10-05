package set.exercícios.conjuntoConvidados;

import java.util.LinkedHashSet;
import java.util.*;

public class ConjuntoConvidados  {
    
    public Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados(){
        conjuntoConvidados = new LinkedHashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
            conjuntoConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigo){
        Iterator<Convidado> iterator = conjuntoConvidados.iterator();
        boolean achou = false;

        if(conjuntoConvidados.isEmpty()){
            System.out.println("Não há convidados no conjunto");
        }else{
            while(iterator.hasNext()){
                Convidado convidado = iterator.next();
                if(convidado.getCodigoConvite() == codigo){
                    iterator.remove();
                    achou = true;
                }
            }

            if(!achou){
                System.out.println("Não há nenhum convidado com o código procurado");
            }
        }       
    }

    public void contarConvidados(){
        //Iterator<Convidado> iterator = conjuntoConvidados.iterator();
        System.out.println(conjuntoConvidados.size());
    }

    public void exibirConvidados(){
        for (Convidado convidado : conjuntoConvidados) {
                System.out.println(convidado);
        }
    }


}
