package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

import com.mycompany.app.Interfaces.Pessoavel;
import com.mycompany.app.Model.*;

public class PessoaTest {
    @Test
    public void testGetNome() {
        // Cria uma instância da classe Pessoa
        Pessoavel pessoa = new Pessoa("Jessica", 25);
        // Atribuir um nome para a pessoa
        pessoa.setNome("Jess");
        // Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }
}