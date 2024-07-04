package com.estudosJava.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int nrConvite;

    public Convidado(String nome, int nrConvite) {
        this.nome = nome;
        this.nrConvite = nrConvite;
    }

    public String getNome() {
        return nome;
    }
    public int getNrConvite() {
        return nrConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getNrConvite() == convidado.getNrConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nrConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", nrConvite=" + nrConvite +
                '}';
    }
}
