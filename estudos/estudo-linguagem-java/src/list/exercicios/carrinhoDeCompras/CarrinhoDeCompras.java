package list.exercicios.carrinhoDeCompras;

import java.util.*;


public class CarrinhoDeCompras {
    
    List<Item> listaItems;

    public CarrinhoDeCompras(){
        listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItems.add(new Item(nome, preco, quantidade));
    }

    public void adicionarItem(Item item){
        listaItems.add(item);
    }

    public void removerItem(String nome){
        Iterator<Item> iterator = listaItems.iterator();
        if(!listaItems.isEmpty()){
            while(iterator.hasNext()){
                Item item = iterator.next();
                if(item.getNome().equalsIgnoreCase(nome)){
                    iterator.remove();
                }
                
            }
        }else{
            System.out.println("O CARRINHO ESTÁ VAZIO");
        }
    }

    public double calculaValorTotal(){
        Iterator<Item> iterator =  listaItems.iterator();
        double total = 0;

        while(iterator.hasNext()){
            total += iterator.next().valorItem();
        }

        return total;
    }

    public void exibirItens(){
        
        if(!listaItems.isEmpty()){
            for (Item item : listaItems) {
                System.out.println(item);          
            }
        }else{
            System.out.println("O CARRINHO ESTÁ VAZIO");
        }
        
    }


}
