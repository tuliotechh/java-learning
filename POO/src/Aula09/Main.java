package Aula09;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0]= new Pessoa("Pedro", 22, "M");
        p[1]= new Pessoa("Maria", 25, "F");

        l[0]= new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1]= new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2]= new Livro("Java Avancaçado", "Maria Candido", 800, p[0]);

    }
}
