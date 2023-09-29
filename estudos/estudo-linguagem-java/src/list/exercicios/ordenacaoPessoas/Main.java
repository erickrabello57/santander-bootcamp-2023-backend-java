package list.exercicios.ordenacaoPessoas;


public class Main {
    public static void main(String[] args) {
        
        OrdenacaoPessoas op = new OrdenacaoPessoas();
        op.adicionarPessoa("João", 20, 1.80);
        op.adicionarPessoa("Aline", 18, 1.75);
        op.adicionarPessoa("Cícero", 16, 1.90);
        op.ordenarAltura();
        op.exibirPessoas();
        op.ordenarPorIdade();
        op.exibirPessoas();
        op.ordenarPorNome();
        op.exibirPessoas();

    }
}
