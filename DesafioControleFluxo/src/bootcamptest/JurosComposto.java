package bootcamptest;
import java.text.DecimalFormat;
import java.util.Scanner;
public class JurosComposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for(int i = 0; i < periodo; i++){
          valorFinal = valorFinal * (1 + taxaJuros);
        }
          
        DecimalFormat df =  new DecimalFormat("#,##");
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}
