package list.exercicios.listaDetarefas;

public class Tarefa {
    
    private String descricao;
    
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public String toString(){
        return "Tarefa: Descrição{" +this.getDescricao()+"}\n";
    }
}
