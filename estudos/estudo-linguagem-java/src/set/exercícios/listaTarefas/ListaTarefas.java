package set.exercícios.listaTarefas;
import java.util.*;

public class ListaTarefas {
    
    Set<Tarefa> listaTarefas;

    public ListaTarefas(){
        listaTarefas = new LinkedHashSet<>();   
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        listaTarefas.add(tarefa);
    }

    public void removerTarefa(String descricao){
        Iterator<Tarefa> iterator = listaTarefas.iterator();
        boolean achou = false;

        if(!listaTarefas.isEmpty()){
            
            while(iterator.hasNext()){
                Tarefa tarefa = iterator.next();
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    achou = true;
                    iterator.remove();
                    System.out.println("Tarefa removida da lista com sucesso!");
                }   
            }
            
            if(!achou){
                System.out.println("Essa tarefa não está na lista!");
            }
            
        } else {
            System.out.println("Ainda não há tarefas na lista!");;
        }
    }

    public void exibirTarefas(){
        Iterator<Tarefa> iterator = listaTarefas.iterator();
        if(!listaTarefas.isEmpty()){
            while(iterator.hasNext()){
                Tarefa t = iterator.next();
                System.out.println(t);
            }
        } else {
            System.out.println("Ainda não há tarefas na lista");
        }
    }

    public void contarTarefas(){
        
        if(listaTarefas.isEmpty()){
            System.out.println("Não há tarefas na lista!");
        } else {
            int quantidadeTarefas = listaTarefas.size();
            System.out.println("A lista possui "+ quantidadeTarefas +" tarefas!");
        }
    }

    public ListaTarefas obterTarefasConcluidas(){
        Iterator<Tarefa> iterator = listaTarefas.iterator();
        ListaTarefas tarefasConcluidas = new ListaTarefas();

        while(iterator.hasNext()){
            Tarefa t = iterator.next();
            if(t.isConcluida() == true){
                tarefasConcluidas.adicionarTarefa(t.getDescricao());
                tarefasConcluidas.marcarTarefaConcluida(t.getDescricao());
            }
        }

        return tarefasConcluidas;
    }

    public ListaTarefas obterTarefasPendentes(){
        Iterator<Tarefa> iterator = listaTarefas.iterator();
        ListaTarefas tarefasPendentes = new ListaTarefas();

        while(iterator.hasNext()){
            Tarefa t = iterator.next();
            if(t.isConcluida() != true){
                tarefasPendentes.adicionarTarefa(t.getDescricao());
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Iterator<Tarefa> iterator = listaTarefas.iterator();
        boolean achou = false;

        if(listaTarefas.isEmpty()){
            System.out.println("Impossível marcar tarefa, a lista está vazia");
        } else {
            while(iterator.hasNext()){
                Tarefa t = iterator.next();
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                    achou = true;
                }
            }

            if(!achou){
                System.out.println("A tarefa a ser marcada não está na lista!");
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Iterator<Tarefa> iterator = listaTarefas.iterator();
        boolean achou = false;

        if(listaTarefas.isEmpty()){
            System.out.println("Impossível marcar tarefa, a lista está vazia");
        } else {
            while(iterator.hasNext()){
                Tarefa t = iterator.next();
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                    achou = true;
                    
                }
            }

            if(!achou){
                System.out.println("A tarefa a ser marcada não está na lista!");
            }
        }
    }

    public void limparListaTarefas(){
        listaTarefas.removeAll(listaTarefas);
    }

}

