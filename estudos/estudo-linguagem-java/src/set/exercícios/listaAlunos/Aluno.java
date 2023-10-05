package set.exercícios.listaAlunos;

public class Aluno implements Comparable<Aluno>{
    
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", media='" + getMedia() + "'" +
            "}";
    }

    
    public int compareTo(Aluno aluno){
        return this.getNome().compareTo(aluno.getNome());
    }


}
