package set.exercícios.agendaContatos;

public class MainAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.exibirContatos();
        agenda.adicionarContato("Cleiton", 9974);
        agenda.pesquisarPorNome("cleiton");
        agenda.exibirContatos();
        agenda.atualizarNumeroContato("CLEITON", 9947);
        agenda.exibirContatos();
    }
}
