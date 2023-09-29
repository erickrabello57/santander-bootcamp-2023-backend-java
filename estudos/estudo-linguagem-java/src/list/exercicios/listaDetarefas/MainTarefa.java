package list.exercicios.listaDetarefas;

public class MainTarefa {
    public static void main(String[] args) {
        
        ListaTarefa listaTarefas = new ListaTarefa();
        listaTarefas.exibirLista();
        listaTarefas.adicionarTarefa("Acordar");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Dormir");
        listaTarefas.exibirLista();
        listaTarefas.removerTarefa("dormir");
        listaTarefas.exibirLista();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();

        
    }
}
