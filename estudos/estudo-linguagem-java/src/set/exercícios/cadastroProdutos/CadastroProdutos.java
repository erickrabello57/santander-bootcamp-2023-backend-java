package set.exercícios.cadastroProdutos;

import java.util.*;

public class CadastroProdutos {

    Set<Produto> conjuntoProdutos;
    

    public CadastroProdutos() {
        conjuntoProdutos = new TreeSet<Produto>();
    }

    

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        Produto p = new Produto(cod, nome, preco, quantidade);
        conjuntoProdutos.add(p);
    }

    // usa a comparação contida na classe Produto (compareTo())
    public void exibirProdutosPorNome() {
        
        if(conjuntoProdutos.isEmpty()){
            System.out.println("Não há itens no conjunto");
        } else {
            for (Produto produto : conjuntoProdutos) {
                System.out.println(produto);
            }
        }
        
    }

    // usa comparação por classe externa na classe CompararPreco(compare())
    public void exibirProdutosPorPreco() {
        CompararPreco compararPreco = new CompararPreco();
        Set<Produto> conjuntoOrdenadoPreco = new TreeSet<>(compararPreco);
        Iterator<Produto> iterator = conjuntoProdutos.iterator();

        if (conjuntoProdutos.isEmpty()) {
            System.out.println("Não há itens no conjunto");
        } else {
            while (iterator.hasNext()) {
                Produto produto = iterator.next();
                conjuntoOrdenadoPreco.add(produto);
            }

            for (Produto produto : conjuntoOrdenadoPreco) {
                System.out.println(produto);
            }
        }    
    }

    public void exibirProdutosPorCodigo(){

        CompararCodigo compararCodigo = new CompararCodigo();
        Set<Produto> conjuntoOrdenadoCodigo = new TreeSet<>(compararCodigo);
        Iterator<Produto> iterator = conjuntoProdutos.iterator();

        if(conjuntoProdutos.isEmpty()){
            System.out.println("Não há itens no conjunto");
        
        } else {
            while(iterator.hasNext()){
                Produto p = iterator.next();
                conjuntoOrdenadoCodigo.add(p);
            }     
        }

        for (Produto produto : conjuntoOrdenadoCodigo) {
            System.out.println(produto);
        }

    }
}
