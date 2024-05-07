public class Condicionais {
    public static void main(String[] args) {

        // Simples:

        double saldo = 25.00;
        double valorSolicitado = 17.00;

        if (valorSolicitado < saldo) // se for...
            saldo = saldo - valorSolicitado;
        System.out.println(saldo);

        // Composta e Encadeada:

        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado!");

        else if (nota >= 5 && nota < 7) // faz parte da encadeada
            System.out.println("Recuperação!");

        else // se não for...
            System.out.println("Reprovado!");

        // Ternanria:

        int nota2 = 7;

        String resultado = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Recuperação" : "Reprovado"; // ? = if / : else if/else
        System.out.println(resultado);




    }
}
