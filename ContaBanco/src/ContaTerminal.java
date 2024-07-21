import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Importando class Scannner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Requisitando dados do cliente
        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        //Exibição da mensagem de conta criada
        System.out.println("Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ") + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
