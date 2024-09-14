import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Só mais um passo...\nPor gentileza, digite seu saldo inicial!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
        scanner.close();
    }
}
