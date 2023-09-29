package list.exercicios.ordenacaoPessoas;
import java.util.*;

public class OrdenacaoPessoas {
    
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade(){
        Collections.sort(listaPessoas);
    }

    public void ordenarPorNome(){
        Collections.sort(listaPessoas, new compararNome());
    }

    public void ordenarAltura(){
        Collections.sort(listaPessoas, new compararAltura());
    }

    public void exibirPessoas(){
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }
}
