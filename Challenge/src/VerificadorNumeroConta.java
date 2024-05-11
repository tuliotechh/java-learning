import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            String numeroConta = scanner.next();

            verificarConta(numeroConta);

        } catch (IllegalArgumentException e){
            System.out.println("Erro: "+ e.getMessage());

        } finally {
            scanner.close();
        }
    }
    private static void verificarConta (String numeroConta) throws  IllegalArgumentException{
        if (numeroConta.length() == 8){
            System.out.println("Numero de conta valido.");
        }
        else{
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
