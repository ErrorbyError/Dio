
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Por favor, digite o seu nome");

           String nomeDoCliente = scanner.nextLine();
     
        System.out.println("Por favor, digite o numero da conta !");     
            int numero = scanner.nextInt();
            
       System.out.println("Por favor, digite o numero da agência !");
            String agencia = scanner.next();


        System.out.println("Por favor, digite o saldo atual !");
            double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá "+nomeDoCliente+", "+"obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", "+"conta "+numero+" "+"e seu saldo "+saldo+" "+"já está disponível para saque.");

        
       
    }
}
