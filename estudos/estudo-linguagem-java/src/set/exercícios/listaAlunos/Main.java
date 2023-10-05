package set.exercícios.listaAlunos;

public class Main {
    
    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Mario", 333L, 5.7);
        gerenciadorAlunos.adicionarAluno("Roberto", 111L, 7.1);
        gerenciadorAlunos.adicionarAluno("Aline", 222L, 9.1);
        gerenciadorAlunos.adicionarAluno("Cristiano", 777L, 7.0);
        gerenciadorAlunos.adicionarAluno("Lionel", 100L, 10);
        gerenciadorAlunos.exibirAlunosPorNota();
        System.out.println("=========================================================");
        gerenciadorAlunos.exibirAlunosPorNome();
        
    }

}
