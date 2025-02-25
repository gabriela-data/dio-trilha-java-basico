import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque." );
    }
}