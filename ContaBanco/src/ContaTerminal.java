import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner banco = new Scanner(System.in);
        
        System.out.println("Por Favor, digite o seu nome: ");
        String nome = banco.nextLine();

        System.out.println("Por Favor, digite o número da sua conta: ");
        int numero = banco.nextInt();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = banco.next();
        
        System.out.println("Digite seu saldo: ");
        double saldo = banco.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque." );
        banco.close();
    }
}
