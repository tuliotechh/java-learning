package testePackage;

public class Operators {
    public static void main (String [] args){
        System.out.println("Hello World");

//      Operadores de Atribuição (= ou ==)
//      Operadores de Aritimeticos (=, -, *, /)

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //classe Operadores.java
        int numero = 5;

//      Imprimindo o numero negativo
        System.out.println(- numero);

//      incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

//      incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

//      ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

//      UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        int a = 6;
        int b = 6;
        String resultad = (a==b) ? "verdadeiro" : "false"; // como se fosse um if-else

        System.out.println("Inverteu " + !verdadeiro);
    }
}
