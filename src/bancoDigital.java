import java.util.Scanner;

public class bancoDigital {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();
        System.out.println("Por favor, digite o seu nome completo !");
        String nomeCliente = sc.next();
        System.out.println("Por favor, digite o seu saldo !");
        double saldoConta = sc.nextDouble();

        sc.close();

        bancoDigital.pessoa(numeroConta, agencia, nomeCliente, saldoConta);

    }

    public static void pessoa(int numeroConta, String agencia, String nomeCliente, double saldoConta) {
        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a agência: "
                        + agencia + "a sua conta é: " + numeroConta + " e seu saldo de: " + saldoConta
                        + " já está disponível para saque.");
    }

}
