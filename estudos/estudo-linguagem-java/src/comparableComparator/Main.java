package comparableComparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================");
        ArrayList<Livro> listaLivros = new ArrayList<>();
        listaLivros.add(new Livro("Português I", "M. Batista", 1990));
        listaLivros.add(new Livro("Português III", "M. Batista", 1996));
        listaLivros.add(new Livro("Português II", "M. Batista", 1994));
        listaLivros.add(new Livro("Matemática", "A. Toledo", 2020));
        listaLivros.add(new Livro("Matemática II", "A. Toledo", 2024));

        System.out.println();
        System.out.println("Livros na ordem de entrada da lista");
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        System.out.println("============================");
        System.out.println();

        System.out.println("Livros organizados na ordem natural - Título");
        Collections.sort(listaLivros);

        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        System.out.println("============================");
        System.out.println();

        System.out.println("Livros após compração por ano");
        Collections.sort(listaLivros, new CompararAno());
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        System.out.println("============================");
        System.out.println();

        Collections.sort(listaLivros, new CompararAutor());
        System.out.println("Livros após comparação por autor");
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        System.out.println("============================");
        System.out.println();
        Collections.sort(listaLivros, new CompararAnoAutorTitulo());
        System.out.println("Livros após ordenação por ano, autor e título");

        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }
        
        


    }
}
