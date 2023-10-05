package set.exercícios.cadastroProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();
        //cp.exibirProdutosPorNome();
        //cp.exibirProdutosPorPreco();
        cp.adicionarProduto(1, "Amendoim", 6.5, 2);
        cp.adicionarProduto(2, "Bala de morango", 0.5, 10);
        cp.adicionarProduto(3, "Chocolate branco", 5.5, 2);
        cp.adicionarProduto(4, "Paçoca", 1.5, 2);
        cp.adicionarProduto(5, "Sorvete de baunilha", 26.5, 2);
        //cp.exibirProdutosPorNome();
        //cp.exibirProdutosPorPreco();
        cp.exibirProdutosPorCodigo();
    }

}
