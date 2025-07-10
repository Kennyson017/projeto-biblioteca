package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.app.Model.*;

public class AutorTest {

    Autor autor1 = new Autor("Stan Lee", "Estadunidense", false);   

    @Test
    public void TestGetutorUsuario() {
        assertEquals(false, autor1.getautorUsuario());
    }

    @Test
    public void TestSetutorUsuario() {
        autor1.setautorUsuario(true) 
        assertEquals(true, autor1.getautorUsuario());
    }
}