package comparableComparator;
import java.util.*;

public class CompararAno implements Comparator<Livro> {
    
    @Override
    public int compare(Livro l1, Livro l2){
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}
