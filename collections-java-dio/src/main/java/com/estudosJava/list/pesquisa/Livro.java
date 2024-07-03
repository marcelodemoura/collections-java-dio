package com.estudosJava.list.pesquisa;

public class Livro {

    private String titulo;
    private String autor;
    private int publicacao;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPublicacao() {
        return publicacao;
    }

    public Livro(String titulo, String autor, int publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
    }

    @Override
    public String toString() {
        return titulo + autor + publicacao;
    }
}
