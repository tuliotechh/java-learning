package List.OperaçoesBasicas.Ordenação;

public class Main {
    OrdPessoa ordenacaoPessoas = new OrdPessoa();

    // Adicionando pessoas à lista
    ordenacaoPessoas.addPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.addPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.addPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.addPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoas.pessoaList);

    // Ordenando e exibindo por idade
    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    // Ordenando e exibindo por altura
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
}
