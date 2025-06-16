package com.mycompany.app;

import java.util.Date;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class Main {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {

        Date hoje = new Date();
        Date devolucao = new Date(hoje.getTime() + (7L * 24 * 60 * 60 * 1000));

        Autor autor001 = new Autor("Jessica Felix", "Desconhecida");
        Livro book001 = new Livro("Java for Beginners", autor001, "Tecnologia");
        Usuario user001 = new Usuario("Lucas Rafael", 25);
        Emprestimo loan001 = new Emprestimo(user001, book001, hoje, devolucao);
        
        // Usuario user002 = new Usuario("Joao Miguel", 20);

        // try {
        //     Emprestimo loan002 = new Emprestimo(user002, book001, hoje, devolucao);
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }
        
        loan001.getAll();

        System.out.println(autor001.getNome());
    }
}