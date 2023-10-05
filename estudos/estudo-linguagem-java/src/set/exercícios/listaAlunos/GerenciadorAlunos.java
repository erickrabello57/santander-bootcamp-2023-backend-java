package set.exercícios.listaAlunos;
import java.util.*;

public class GerenciadorAlunos {
    
    Set<Aluno> conjuntoAlunos;
    //CompararAlunoPorNome compararAlunoPorNome = new CompararAlunoPorNome();
    //CompararAlunoNotaDecrescente cpmpCompararAlunoNotaDecrescente = new CompararAlunoNotaDecrescente();
    
    public GerenciadorAlunos(){
        conjuntoAlunos = new TreeSet<>();
    }

    //Feito por curiosidade, adicionar o comparador ao construtor da classe faz com que
    //o TreeSEt já seja construido ordenanado pelo critério do comparador passado
    
    /* public GerenciadorAlunos(CompararAlunoPorNome compararAlunosPorNome){
        conjuntoAlunos = new TreeSet<>(compararAlunosPorNome);
    }

    public GerenciadorAlunos(CompararAlunoNotaDecrescente compararAlunoNotaDecrescente){
        conjuntoAlunos = new TreeSet<>(compararAlunoNotaDecrescente);
    } */

    public void adicionarAluno(String nome, Long matricula, double media){
        Aluno aluno = new Aluno(nome, matricula, media);
        conjuntoAlunos.add(aluno);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno>conjuntoAlunosNota = new TreeSet<>(new CompararAlunoNota());
        
        for (Aluno aluno : conjuntoAlunos) {
            conjuntoAlunosNota.add(aluno);
        }

        for (Aluno aluno : conjuntoAlunosNota) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunosPorNome(){
        for (Aluno aluno : conjuntoAlunos) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunos(){
        for (Aluno aluno : conjuntoAlunos) {
            System.out.println(aluno);
        }
    }
}
