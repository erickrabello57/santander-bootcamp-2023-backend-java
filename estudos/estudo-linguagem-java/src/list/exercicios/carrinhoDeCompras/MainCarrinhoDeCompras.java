package list.exercicios.carrinhoDeCompras;

public class MainCarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();
        carrinho.adicionarItem("Feijão", 6.0, 2);
        carrinho.adicionarItem("Arroz", 4.0, 4);
        carrinho.adicionarItem("Açúcar", 3.0, 2);
        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());
        carrinho.removerItem("arroz");
        carrinho.exibirItens();
        System.out.println(carrinho.calculaValorTotal());
    }
}
