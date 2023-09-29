package list.exercicios.catalogoLivros;

public class MainLivro {
    
    public static void main(String[] args) {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Português 1", "B. Castro", 1987);
        catalogoLivros.adicionarLivro("Português 2", "B. Castro", 1990);
        catalogoLivros.adicionarLivro("Português 2", "A. Tavares", 1999);
        catalogoLivros.pesquisarPorTitulo("Português 2");
    }
}
