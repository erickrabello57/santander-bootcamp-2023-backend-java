package set.exercícios.listaAlunos;
import java.util.*;

public class CompararAlunoNota implements Comparator<Aluno> {
    
    public int compare(Aluno a1, Aluno a2){
        if(a1.getMedia() < a2.getMedia()){
            return -1;
        }

        if(a1.getMedia() > a2.getMedia()){
            return 1;
        }

        return 0;
    }
}
