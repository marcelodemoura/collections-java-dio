package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void addCarrinho(String dsItem) {
        itemList.add(new Item(dsItem));
    }

    public void excluiItem(String dsItem) {
        List<Item> excluiItemList = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getDsItem().equalsIgnoreCase(dsItem)) {
                excluiItemList.add(item);
            }
        }
        itemList.removeAll(excluiItemList);
    }

    public int totalItem() {
        return itemList.size();
    }

    public void descricaoItem() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.addCarrinho("Arroz");
        carrinhoDeCompras.addCarrinho("Tv");
        carrinhoDeCompras.addCarrinho("Macarrao");
        carrinhoDeCompras.addCarrinho("feijao");
        System.out.println("total de produtos"
                +  carrinhoDeCompras.totalItem());

        carrinhoDeCompras.excluiItem("arroz");
        System.out.println("total de produtos"
                +  carrinhoDeCompras.totalItem());

        carrinhoDeCompras.descricaoItem();
    }
}
