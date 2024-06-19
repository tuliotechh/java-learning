package Map.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqProdutos;

    public EstoqueProdutos() {
        this.estoqProdutos = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqProdutos.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqProdutos);
    }
    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if (!estoqProdutos.isEmpty()){
            for (Produto p : estoqProdutos.values()){
                valorTotal += p.getQuant() * p.getPreco();
            }
        }
        return valorTotal;
    }
    public Produto obterProdutoMaisCaro(){
        Produto prodCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqProdutos.isEmpty()) {
            for (Produto p : estoqProdutos.values()){
                if (p.getPreco() > maiorPreco){
                    prodCaro = p;
                }
            }
        }
        return prodCaro;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
