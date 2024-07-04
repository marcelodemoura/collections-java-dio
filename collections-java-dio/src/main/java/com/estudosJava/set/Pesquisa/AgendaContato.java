package com.estudosJava.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> exibirNome(String nome) {
        Set<Contato> contatosNome = new HashSet<>();
        for (Contato contatos : contatoSet) {
            if (contatos.getNome().startsWith(nome)) {
                contatosNome.add(contatos);
            }
        }
        return contatosNome;
    }

    public Contato updateContato(String nome, int novoNumero) {
        Contato contatoAtual = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNrContato(novoNumero);
                contatoAtual = contato;
                break;
            }
        }
        return contatoAtual;
    }

    public static void main(String[] args) {

        AgendaContato agendaContato = new AgendaContato();


        agendaContato.addContato("Jose", 12345678);
        agendaContato.addContato("Jose", 0);
        agendaContato.addContato("Jose joao", 12345678);
        agendaContato.addContato("Joao Jose", 12345678);
        agendaContato.addContato("Maria", 87654321);

        agendaContato.exibirContato();

        System.out.println(agendaContato.exibirNome("Maria"));

        System.out.println("Contato atualizado! " + agendaContato.updateContato("Maria  ",999507791));
        agendaContato.exibirContato();
    }
}
