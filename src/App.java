import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
  HashMap<Integer,String> pessoaHash = new HashMap<>();
        ArrayList<Integer> pessoaArray = new ArrayList<>();
        LinkedList<Integer> pessoaLinked = new LinkedList<>();
        int qtdElementos=100000;
        // Hash
        long tempoInicial = System.currentTimeMillis();
        for(int i=0;i<qtdElementos;i++)
            pessoaHash.put(i, "Pessoa "+i);
        for(int i=0;i<qtdElementos;i++)
            pessoaHash.containsKey(i);
        long tempoFinal = System.currentTimeMillis();
        double tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;
        System.out.printf("Hash Time (s): %.3f\n", tempoTotalSeg);
        
          // Array
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<qtdElementos;i++)
            pessoaArray.add(i);
        for(int i=0;i<qtdElementos;i++)
            pessoaArray.contains(i);
         tempoFinal = System.currentTimeMillis();
         tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;
        System.out.printf("Array Time (s): %.3f\n", tempoTotalSeg);
        
         // LinkedList
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<qtdElementos;i++)
            pessoaLinked.add(i);
        for(int i=0;i<qtdElementos;i++)
            pessoaLinked.contains(i);
         tempoFinal = System.currentTimeMillis();
         tempoTotalSeg = (tempoFinal-tempoInicial)/1000.00;
        System.out.printf("LinkedList Time (s): %.3f\n", tempoTotalSeg);
        
    }
}
