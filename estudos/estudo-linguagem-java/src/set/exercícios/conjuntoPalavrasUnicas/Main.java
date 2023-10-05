package set.exercícios.conjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();
        cpu.exibirPalavras();
        cpu.removerPalavra("null");
        cpu.verificarPalavra("null");
        cpu.adicionarPalavra("Julia");
        cpu.verificarPalavra("JULIA");
        cpu.adicionarPalavra("ERICK");
        cpu.verificarPalavra("Erick");
        cpu.exibirPalavras();
        cpu.removerPalavra("null");
    }
}
