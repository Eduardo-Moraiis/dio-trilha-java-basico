import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");

        int numeroAgencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o nome da Agência !");
        String nomeAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo !");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, nomeAgencia, numeroAgencia, saldo);
    }
}