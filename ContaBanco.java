import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Insira seu nome para se cadastrar");
        String nomeCliente = scanner.next();

        System.out.println("Agora seu sobrenome (somente o ultimo)");
        String sobreNome = scanner.next();

        System.out.println("Agora, digite o numero");
        int numero = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia");
        String agencia = scanner.next();

        System.out.println("E por fim, digite seu saldo atual");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + " " + sobreNome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");



    }
}
