package comparableComparator;

public class Livro implements Comparable<Livro> {
    
    private String titulo;
    private String autor;
    private int ano;

    public Livro (String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int compareTo(Livro livro){
        return this.titulo.compareTo(livro.titulo);
    }

     @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", ano='" + getAno() + "'" +
            "}";
    }


}
