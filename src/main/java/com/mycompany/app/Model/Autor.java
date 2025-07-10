package com.mycompany.app.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Autor extends Pessoa {
    private ArrayList<Livro> obrasPublicadas;
    private boolean autorUsuario;

    public Autor(String nome, String nacionalidade, boolean autorUsuario) {
        super(nome, nacionalidade);
        this.obrasPublicadas = new ArrayList<>();
        this.autorUsuario = autorUsuario;
    }

    public TipoAutor getautorUsuario() {
        return autorUsuario;
    }

    public boolean setautorUsuario(boolean autorUsuario) {
        this.autorUsuario = autorUsuario;
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public void listarObras() {
        System.out.println("Obras publicadas por " + getNome() + ":");

        for (Livro i : obrasPublicadas) {
            System.out.println("- " + i.getTitulo() + "(" + i.getGenero() + ")");
        }
    }

    public void listarObrasPorGenero() {
        HashMap<String, ArrayList<Livro>> obrasPorGenero = new HashMap<>();

        for (Livro livro : obrasPublicadas) {
            String genero = livro.getGenero();
            obrasPorGenero.putIfAbsent(genero, new ArrayList<>());
            obrasPorGenero.get(genero).add(livro);
        }

        System.out.println("Obras por gênero de " + getNome() + ":");

        for (String genero : obrasPorGenero.keySet()) {
            System.out.println("Gênero: " + genero);
            for (Livro livro : obrasPorGenero.get(genero)) {
                System.out.println(" - " + livro.getTitulo());
            }
        }
    }    
}