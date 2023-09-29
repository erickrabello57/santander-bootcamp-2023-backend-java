package list.exercicios.catalogoLivros;

import java.util.*;

public class CatalogoLivros {
    
    private List<Livro> listaLivros;

    public CatalogoLivros(){
        listaLivros = new ArrayList<>();
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
            Iterator<Livro> iterator = listaLivros.iterator();
            boolean achou = false;       
        if(!listaLivros.isEmpty()){
            if(anoInicial >= anoFinal){
                System.out.println("Ano inicial deve ser menor que ano Final!");
            }else{
                while(iterator.hasNext()){
                    Livro livro = iterator.next();
                    if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal ){
                        System.out.println(livro);
                        achou = true;
                    }        
                }
                if(!achou){
                        System.out.println("O Livro procurado não está na lista");
                }
            }
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public void pesquisarPorAutor(String nomeAutor){
        boolean achou = false;
        if(!listaLivros.isEmpty()){
            for (Livro livro : listaLivros) {
                if(livro.getAutor().equalsIgnoreCase(nomeAutor)){
                System.out.println(livro);
                achou = true;
                } 
            }
            if(!achou){
                System.out.println("O livro do autor procurado não está na lista");
            }
        }else{
            System.out.println("A lista está vazia");
        }
        
    }

    public void pesquisarPorTitulo(String titulo){
        Iterator<Livro> iterator = listaLivros.iterator();
        boolean achou = false;
        
        if(!listaLivros.isEmpty()){
            while(iterator.hasNext()){
                Livro livro = iterator.next();
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    achou = true;
                    System.out.println(livro);
                    break;
                }
                    
            }
            if(!achou){
                System.out.println("Não há livros com o título procurado");
            }
        }else{
            System.out.println("A lista está vazia");
        
        }
        
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add((new Livro(titulo, autor, anoPublicacao)));
    }




}
