import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primerio parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            return;
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; contagem <= parametroDois; contagem++) {
            System.out.println("Imprimindo o número " + contagem);
        }
    }
}
