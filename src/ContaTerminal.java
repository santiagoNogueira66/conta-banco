import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        numero = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agência");
        agencia = entrada.next();
        System.out.println("Por favor, digite o nome do Cliente");
        nomeCliente = entrada.next();
        System.out.println("Por favor, digite o saldo do Cliente");
        saldo = entrada.nextDouble();

        System.out.println("olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
