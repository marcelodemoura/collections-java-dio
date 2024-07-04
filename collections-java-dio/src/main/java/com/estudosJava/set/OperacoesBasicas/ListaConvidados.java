package com.estudosJava.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidados {

    public Set<Convidado> convidadoSet;

    public ListaConvidados(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }

    public ListaConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int nrConvite) {
        convidadoSet.add(new Convidado(nome, nrConvite));
    }

    public void removeNrConvite(int nrConvite) {
        Convidado removeConvidado = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getNrConvite() == nrConvite) {
                removeConvidado = convidado;
                break;
            }
        }
        convidadoSet.remove(removeConvidado);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ListaConvidados listaConvidados = new ListaConvidados();

        listaConvidados.addConvidado("jose", 123);
        listaConvidados.addConvidado("hjklp", 123);
        listaConvidados.addConvidado("se", 125);
        listaConvidados.addConvidado("je", 126);
        listaConvidados.addConvidado("jjja", 127);
        listaConvidados.addConvidado("jojo",128);
        listaConvidados.exibirConvidado();

        System.out.println("existem " + listaConvidados.contarConvidados() + " dentro da lista de convidaos");


        listaConvidados.removeNrConvite(123);
        System.out.println("Existem " + listaConvidados.contarConvidados() + "convidados dentro da lista de convidaos");

        listaConvidados.exibirConvidado();

    }
}