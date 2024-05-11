import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saque;
        boolean condicao = true;
        double limiteDiario = scanner.nextDouble();

        while (condicao){
            saque = scanner.nextDouble();
            if (saque == 0){
                System.out.println("Transacoes encerradas.");
                condicao = false;
            }else if (saque <= limiteDiario){
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                condicao = false;
            }
        }

        scanner.close();
    }
}