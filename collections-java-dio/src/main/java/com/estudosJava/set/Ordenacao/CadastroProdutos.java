package com.estudosJava.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void addProduto(long cdProduto, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cdProduto, nome, preco, quantidade));
    }

    public Set<Produto> ExibirNome() {
        Set<Produto> nmProdutos = new TreeSet<>(produtoSet);
        return nmProdutos;
    }

    public Set<Produto> exibirPreco() {
        Set<Produto> produtoPreco = new TreeSet<>(new ComparePreco());
        produtoPreco.addAll(produtoSet);
        return produtoPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.addProduto(5L, "P 5", 15d, 5);
        cadastroProdutos.addProduto(2L, "P 0", 20d, 10);
        cadastroProdutos.addProduto(1L, "P 3", 10d, 2);
        cadastroProdutos.addProduto(9L, "P 9", 2d, 2);


        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.ExibirNome());
        System.out.println(cadastroProdutos.exibirPreco());
    }

}
