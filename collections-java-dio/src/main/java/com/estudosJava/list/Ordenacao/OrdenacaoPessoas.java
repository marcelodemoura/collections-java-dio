package com.estudosJava.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }
    public void addpessoa(String nome, int idade, Double altura){
        pessoaList.add(new Pessoa(nome,idade,altura));
    }
    public List<Pessoa> ordenarIdade(){
        List<Pessoa>pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }
    public List<Pessoa>ordenarAltura(){
        List<Pessoa>pessoaAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaAltura, new CompararAltura());
        return pessoaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas= new OrdenacaoPessoas();

        ordenacaoPessoas.addpessoa("joao " ,18 , 1.98);
        ordenacaoPessoas.addpessoa("jose " ,80 , 1.81);
        ordenacaoPessoas.addpessoa("joas " ,25 , 1.78);
        ordenacaoPessoas.addpessoa("joab " ,88 , 1.85);

        System.out.println(ordenacaoPessoas.ordenarIdade());
        System.out.println(ordenacaoPessoas.ordenarAltura());

    }



}
