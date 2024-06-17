package List.OperaçoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itemList;

    public void addItem(String nome, double preco, int quant){
        Item item = new Item(nome, preco, quant);
        this.itemList.add(item);
    }
    public void removerItem(String nome){
        List<Item> itemsRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemsRemover.add(i);
                }
            }
            itemList.removeAll(itemsRemover);
        }   else {
            System.out.println("A lista esta vazia!");
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()){
            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuant();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }
    public void exibirItens(){
        System.out.println(itemList);
    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "itemList=" + itemList +
                '}';
    }
}
