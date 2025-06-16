package com.mycompany.app.Model;

import java.util.ArrayList;

import com.mycompany.app.Interface.AutorInteface;

public class Usuario extends Pessoa implements AutorInteface {
    private ArrayList<String> livros;
    private ArrayList<String> historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome, idade);
        this.livros = new ArrayList<>();
        this.historicoEmprestimos = new ArrayList<>();
    }

    public void adicionarLivro(String livro) {
        livros.add(livro);
        historicoEmprestimos.add("Emprestado: " + livro);
    }


    public void devolverLivro(String livro) {
        livros.remove(livro);
        historicoEmprestimos.remove("Devolvido: " + livro);
    }

    public void mostrarLivros() {
        System.out.println("Livros com o usuário: ");
        for (String livro: livros) {
            System.out.println("- " + livro);
        }
    }

    public void mostrarHistorico() {
        System.out.println("Historico de Empréstimos: ");
        for (String registro: historicoEmprestimos) {
            System.out.println("- " + registro);
        }
    }

    @Override
    public void publicar() {
        System.out.println("Usuario publicando...");
    }
}