import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal { 
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para os nossos usuários
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagens conta criada
        Scanner texto = new Scanner (System.in).useLocale(Locale.US);
        //Scanner numeroScanner = new Scanner (System.in).useLocale(Locale.US);
        
        System.out.println("Entre com seu nome, por gentileza");
        String nomeCliente = texto.nextLine();

        System.out.println("Insira o número da agência");
        String agencia = texto.nextLine();
        
        
        System.out.println("Digite o número da conta");
        int numero = texto.nextInt();
      
       
        System.out.println("Quantia de saldo que está na conta?");
        double saldo = texto.nextDouble();
        
        System.out.println("Olá " + nomeCliente.concat(", ") + "obrigado por criar uma conta em nosso banco, sua agencia é" + agencia.concat(", ") + "conta " + numero + " e seu saldo " + saldo + " " + "já está disponível para saque");
       
        
    }
   
}
