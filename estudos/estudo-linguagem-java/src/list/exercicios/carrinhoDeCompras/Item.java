package list.exercicios.carrinhoDeCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorItem(){
        return this.preco * this.quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", preco='" + getPreco() + "'" +
            ", quantidade='" + getQuantidade() + "'" +
            "}";
    }

    
}



