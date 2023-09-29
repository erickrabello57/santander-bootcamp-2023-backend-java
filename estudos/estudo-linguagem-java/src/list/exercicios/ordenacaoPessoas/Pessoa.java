package list.exercicios.ordenacaoPessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    
    private String nome;
    private int idade;
    private double altura;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }

    //Comparação padrão da classe é feita pela idade
    public int compareTo(Pessoa p){
        
        if(this.getIdade() < p.getIdade()){
            return -1;
        }

        if(this.getIdade() > p.getIdade()){
            return 1;
        }

        return 0;
    }
}
    

class compararNome implements Comparator<Pessoa>{

        @Override
        public int compare(Pessoa p1, Pessoa p2){
            
           return p1.getNome().compareTo(p2.getNome());
        }
}

class compararAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2){
                
        if(p1.getAltura() < p2.getAltura()){
                    return -1;
        }

        if(p1.getAltura() > p2.getAltura()){
                    return 1;
        }
        
        return 0;
    }
}






