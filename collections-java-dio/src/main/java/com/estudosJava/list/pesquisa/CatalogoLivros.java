package com.estudosJava.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = livrosList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int publicacao) {
        livrosList.add(new Livro(titulo, autor, publicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {

        List<Livro> livroAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroAutor.add(livro);
                }
            }
        }
        return livroAutor;
    }

    public List<Livro> pesquisarAno(int inicial, int afinal) {
        List<Livro> livrosAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getPublicacao() >= inicial && livro.getPublicacao() <= afinal) {
                    livrosAno.add(livro);
                }
            }
        }
        return livrosAno;
    }

    public Livro pesquisaTitulo(String titulo) {
        Livro livroTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroTitulo = livro;
                    break;
                }
            }
        }
        return livroTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.addLivro("harry", "j", 2011);
        catalogo.addLivro("potter", "j", 2012);
        catalogo.addLivro("harry potter", "Askaban", 2013);
        catalogo.addLivro("prisioneiro", "Askaban", 2014);
        catalogo.addLivro("escrava", "isaura", 1300);

        System.out.println(catalogo.pesquisarAutor("Askaban"));
        System.out.println(catalogo.pesquisarAno(2011,2013));
        System.out.println(catalogo.pesquisaTitulo("escrava"));


    }

}
