package set.exercícios.listaTarefas;


public class Tarefa {
    
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean isConcluida(){
        return this.concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }


    @Override
    public String toString() {
        return "{" +
            " descricao='" + getDescricao() + "'" +
            ", concluida='" + isConcluida() + "'" +
            "}";
    }


    





}
