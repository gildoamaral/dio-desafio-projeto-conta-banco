import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente !");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o numero da agencia !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, conta, saldo);

    }
}
