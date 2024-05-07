import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Infrome seu nome: ");
        String nome = scanner.next();

        System.out.println("Infrome a agencia: ");
        String agencia = scanner.next();

        System.out.println("Infrome seu numero: ");
        int numero = scanner.nextInt();

        System.out.println("Infrome seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
