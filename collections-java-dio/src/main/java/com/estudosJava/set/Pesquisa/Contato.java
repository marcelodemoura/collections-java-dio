package com.estudosJava.set.Pesquisa;

import java.util.Objects;

public class Contato {

    private String nome;
    private int nrContato;

    public Contato(String nome, int nrContato) {
        this.nome = nome;
        this.nrContato = nrContato;
    }

    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }


    public int getNrContato() {
        return nrContato;
    }

    public void setNrContato(int nrContato) {
        this.nrContato = nrContato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return  "{" + nome + "," + nrContato + "}";
    }
}
