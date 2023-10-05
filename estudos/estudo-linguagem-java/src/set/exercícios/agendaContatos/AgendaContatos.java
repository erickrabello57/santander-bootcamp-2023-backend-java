package set.exercícios.agendaContatos;
import java.util.*;

public class AgendaContatos {
    
    private Set<Contato> listaContatos;

    public AgendaContatos(){
        listaContatos = new LinkedHashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        Contato contato = new Contato(nome, numero);
        listaContatos.add(contato);
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        Iterator<Contato> iterator = listaContatos.iterator();
        
        if(!listaContatos.isEmpty()){
            Contato contato = new Contato(nome, novoNumero);
            if (!listaContatos.contains(contato)){
                System.out.println("O contato não está na lista");
            }
            while(iterator.hasNext()){
                Contato c = iterator.next();
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                }
            }
        } else {
            System.out.println("O contato desejado não está na lista");
        }
    }

    public void exibirContatos(){
        Iterator<Contato> iterator = listaContatos.iterator();

        if(!listaContatos.isEmpty()){
            while(iterator.hasNext()){
                Contato c = iterator.next();
                System.out.println(c);
            }
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public void pesquisarPorNome(String nome){
        
        Iterator<Contato> iterator = listaContatos.iterator();
        
        if(!listaContatos.isEmpty()){  
            while(iterator.hasNext()){
                Contato c = iterator.next();
                if(c.getNome().equalsIgnoreCase(nome)){
                    System.out.println(nome + " já está na lista de contatos.");
                } else {
                    System.out.println(nome + " não está na lista de contatos");
                }
            }

        } else {
            System.out.println("A lista esá vazia");
        }
    }
}
