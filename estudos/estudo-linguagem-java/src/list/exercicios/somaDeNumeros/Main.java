package list.exercicios.somaDeNumeros;

public class Main {
    public static void main(String[] args) {
        
        SomaNumeros sn = new SomaNumeros();
        sn.adicionarNumero(-1);
        sn.adicionarNumero(0);
        sn.adicionarNumero(11);
        System.out.println(sn.calcularSoma());
        sn.adicionarNumero(-50);
        sn.adicionarNumero(100);
        sn.exibirNumeros();
        System.out.println(sn.encontarMaiorNumero());
        System.out.println(sn.encontrarMenorNumero());

    }
}
