package anatomiaDasClasses; //criando um pacote

public class MyClass {
    public static void main (String [] args){ //metodo!
        //System.out.printf("Hello World");

        String primeiroNome = "Marco";
        String segundoNome = "Tulio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //puxando um metodo!
        System.out.printf(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){ //metodo
        return "Resultado do Metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
