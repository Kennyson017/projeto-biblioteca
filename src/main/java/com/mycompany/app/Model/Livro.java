package com.mycompany.app.Model;

import com.mycompany.app.Interface.AutorInteface;

public class Livro implements AutorInteface {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor.getNome();
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void validarDisponibilidade(boolean status) {
        this.disponivel = status;
    }

    @Override
    public void publicar() {
        System.out.println("Livro publicando...");
    }
}
