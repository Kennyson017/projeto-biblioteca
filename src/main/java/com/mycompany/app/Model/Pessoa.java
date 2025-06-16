package com.mycompany.app.Model;

import com.mycompany.app.Interfaces.Pessoavel;

public class Pessoa implements Pessoavel {
    private String nome;
    private int idade;
    private String nacionalidade;

    // CONTRUTOR DE USUARIO
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // CONTRUTOR DE AUTOR
    public Pessoa(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
    return nacionalidade;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void apresentar() {
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}  