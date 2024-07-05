package com.estudosJava.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void addProduto(long cdProduto, String nome,int quantidade,double preco) {
        estoqueProdutoMap.put(cdProduto, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public Double valorTtEstoque() {
        double vEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                vEstoque += produto.getQuantidade() * produto.getPreco();

            }
        }
        return vEstoque;
    }

    public Produto produtoMaisCaro() {
        Produto pProdutoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    pProdutoMaisCaro = produto;

                }
            }
        }
        return pProdutoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.addProduto(1L,"P A",10,5.0);
        estoqueProduto.addProduto(2L,"P B",5,10.0);
        estoqueProduto.addProduto(3L,"P C",2,15.0);
        estoqueProduto.addProduto(4L,"P D",2,20.0);

        estoqueProduto.exibirProdutos();

        System.out.println(estoqueProduto.valorTtEstoque());
        System.out.println(estoqueProduto.produtoMaisCaro());
    }
}