package list.exercicios.somaDeNumeros;

import java.util.*;

public class SomaNumeros{
    
    private List<Integer> listaNumeros;

    public SomaNumeros(){
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        Iterator<Integer> iterator = listaNumeros.iterator();
        int resultado = 0;
        
        while(iterator.hasNext()){
            resultado += iterator.next();
        }

        return resultado;
    }

    public int encontrarMenorNumero(){
        Collections.sort(listaNumeros);
        return listaNumeros.get(0);
    }

    public int encontarMaiorNumero(){
        Collections.sort(listaNumeros, Collections.reverseOrder());
        return listaNumeros.get(0);
    }

    public void exibirNumeros(){
        for (Integer integer : listaNumeros) {
            System.out.println(integer);
        }
    }

    


}
