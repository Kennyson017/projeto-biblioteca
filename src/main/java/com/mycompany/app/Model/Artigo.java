package com.mycompany.app.Model;

import com.mycompany.app.Interface.AutorInteface;

public class Artigo implements AutorInteface{
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Artigo(String titulo, Autor autor, String genero, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
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
        System.out.println("Arigo publicando...");
    }
}
