package set.exercícios.listaTarefas;


public class Main {
    public static void main(String[] args) {
        
        ListaTarefas listaTarefas = new ListaTarefas();
        
        listaTarefas.adicionarTarefa("FAZER CAFÉ");
        listaTarefas.adicionarTarefa("TOMAR BANHO");
        listaTarefas.adicionarTarefa("ESCOVAR OS DENTES");
        listaTarefas.adicionarTarefa("ARRUMAR A CAMA");
        listaTarefas.adicionarTarefa("ESTUDAR");
        listaTarefas.limparListaTarefas();
        listaTarefas.marcarTarefaConcluida("arrumar a cama");
        listaTarefas.marcarTarefaConcluida("ToMaR banho");
        listaTarefas.exibirTarefas();
        listaTarefas.exibirTarefas();
        ListaTarefas taferasConcluidas = listaTarefas.obterTarefasConcluidas();
        ListaTarefas tarefasPendentes = listaTarefas.obterTarefasPendentes();
        taferasConcluidas.exibirTarefas();
        tarefasPendentes.exibirTarefas();
        tarefasPendentes.limparListaTarefas();
        tarefasPendentes.exibirTarefas();
        

    }
}
