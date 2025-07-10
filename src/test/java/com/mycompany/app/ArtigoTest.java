package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.app.Model.*;

public class ArtigoTest {

    Autor autor1 = new Autor("Stan Lee", "Estadunidense", false);   
    Artigo artigo = new Artigo("Entendendo Compiladores", autor1, "tecnologia", true);  
    

    @Test
    public void TestGetTitulo() {
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
    }

    @Test
    public void TestgetAutor() {
        assertEquals("Stan Lee", artigo.getAutor());
    }
}