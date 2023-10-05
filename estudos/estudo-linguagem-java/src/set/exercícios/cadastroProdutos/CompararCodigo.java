package set.exercícios.cadastroProdutos;
import java.util.*;

public class CompararCodigo implements Comparator<Produto> {
    
    public int compare(Produto p1, Produto p2){
        if(p1.getCod() < p2.getCod()){
            return -1;
        }

        if(p1.getCod() > p2.getCod()){
            return 1;
        }

        return 0;
    }
}
