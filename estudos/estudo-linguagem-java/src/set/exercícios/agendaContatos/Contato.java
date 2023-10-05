package set.exercícios.agendaContatos;

public class Contato {
    
    private String nome;
    private int numero;

    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero; 
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }

    public boolean equals(Contato contato){
        if(this.getNumero() == contato.getNumero()){
            return true;
        } 
        return false;
    }


        
}
