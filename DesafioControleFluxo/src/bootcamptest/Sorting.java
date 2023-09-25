package bootcamptest;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine(); 
    

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }


        // why did I not use the common method: Array.sort(ativos);?
        // cus we are dealing  with arrayList. to use this kinda sorting, we need to convert to a normal Array. 

        // to convert: 
         // Convert ArrayList to an array and then sort it
        //  String[] ativosArray = ativos.toArray(new String[0]);
        //  Arrays.sort(ativosArray); 
        
      

    //TODO: Ordenar os ativos em ordem alfabética.
        //  ativos.sort(String.CASE_INSENSITIVE_ORDER);

        //another way to sort ArrayList using bult-in features. 

        Collections.sort(ativos);



    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for( String i : ativos){
        System.out.println(i);


    }

  }
}
