package com.estudosJava.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private long cdProduto;
    private String nome;
    private double preco;
    private int quantidade;


    public long getCdProduto() {
        return cdProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto(long cdProduto, String nome, double preco, int quantidade) {
        this.cdProduto = cdProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cdProduto == produto.cdProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cdProduto);
    }

    @Override
    public String toString() {
        return    "Produto " + cdProduto + " nome " + nome + " preço "+ preco + " Qtde. " + quantidade ;
    }

}

class ComparePreco implements Comparator<Produto> {

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}