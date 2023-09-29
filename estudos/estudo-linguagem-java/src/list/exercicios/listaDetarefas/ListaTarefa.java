package list.exercicios.listaDetarefas;
import java.util.*;

public class ListaTarefa {
    
    private List<Tarefa> listaTarefas;
    
    public ListaTarefa(){
        this.listaTarefas = new ArrayList<>();
    }
    
    
    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        listaTarefas.add(tarefa);
    }

    public void removerTarefa(String descricao){
        Iterator<Tarefa> it = listaTarefas.iterator();
        
        if (listaTarefas.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
            while(it.hasNext()){
                Tarefa tarefa = it.next();
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    it.remove();
                }
            }
        }
        
    }

    public int obterNumeroTotalTarefas(){

        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        
        Iterator<Tarefa> iterator = listaTarefas.iterator();

        if(this.listaTarefas.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
                while(iterator.hasNext()){
                    String descricao = iterator.next().getDescricao();
                    System.out.println(descricao);
                }
            }
        
        
     
    }

    public void exibirLista(){
        Iterator<Tarefa> it = listaTarefas.iterator();
        
        if(this.listaTarefas.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
            System.out.println("==============LISTA DE TAREFAS==============");
            while(it.hasNext()){
                System.out.println(it.next());
            }
            
            System.out.println("=============================================");

        
        }

        
    }
    
    
}
