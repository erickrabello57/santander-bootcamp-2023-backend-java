package set.exercícios.cadastroProdutos;
import java.util.*;

public class CompararPreco implements Comparator<Produto> {
    
    public int compare(Produto p1, Produto p2){
        if(p1.getPreco() < p2.getPreco()){
            return -1;
        }

        if(p1.getPreco() > p2.getPreco()){
            return 1;
        }

        return 0;
    }
    
}
