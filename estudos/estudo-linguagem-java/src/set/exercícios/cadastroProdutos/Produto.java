package set.exercícios.cadastroProdutos;

public class Produto implements Comparable <Produto> {
    
    private long cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade){
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCod(){
        return this.cod;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }


    @Override
    public String toString() {
        return "{" +
            " cod='" + getCod() + "'" +
            ", nome='" + getNome() + "'" +
            ", preco='" + getPreco() + "'" +
            ", quantidade='" + getQuantidade() + "'" +
            "}";
    }

    public int compareTo(Produto p){
        return this.getNome().compareTo(p.getNome());
    }

}
