package com.mycompany.app.Model;

import com.mycompany.app.Interface.AutorInteface;

public class Artigo implements AutorInteface{
    
    @Override
    public void publicar() {
        System.out.println("Arigo publicando...");
    }
}
