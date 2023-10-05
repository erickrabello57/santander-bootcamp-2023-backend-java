package set.exercícios.conjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Alberto", 1);
        conjuntoConvidados.adicionarConvidado("Breno", 2);
        conjuntoConvidados.adicionarConvidado("Carlos", 3);
        conjuntoConvidados.adicionarConvidado("Diego", 4);
        conjuntoConvidados.adicionarConvidado("Evair", 5);
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(6);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        conjuntoConvidados.exibirConvidados();
    }
}
