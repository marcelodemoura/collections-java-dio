package com.estudosJava.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }


    public void removeContato(String nome) {
        if(!agendaContatoMap.isEmpty());
        agendaContatoMap.remove(nome);
    }
    public void exibirContato(String dfghjk451){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisaNome(String nome){
        Integer numeroNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroNome = agendaContatoMap.get(nome);
        }
        return numeroNome;

    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.addContato("dfghjk451",6562);
        agendaContato.addContato("dfghjk",4516562);
        agendaContato.addContato("ddfghjk",6562);
        agendaContato.addContato("asdfg",656254);
        agendaContato.addContato("asdfg",656254);

        agendaContato.removeContato("asdfg");

        System.out.println(agendaContato.pesquisaNome("dfghjk451"));

        agendaContato.exibirContato("dfghjk451");
    }


}
