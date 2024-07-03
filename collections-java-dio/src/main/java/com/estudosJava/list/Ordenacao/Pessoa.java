package com.estudosJava.list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private Double altura;

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade,pessoa.getIdade());
    }

    public Pessoa(String pessoa, int idade, Double altura) {
        this.nome = pessoa;
        this.idade = idade;
        this.altura = altura;
    }

    public String getPessoa() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

class CompararAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(),pessoa2.getAltura());
    }
}
