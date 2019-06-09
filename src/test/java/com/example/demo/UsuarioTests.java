package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UsuarioTests {

    @Test
    public void testUsuario() {

        Usuario usuario = new Usuario();
        
        usuario.setNome("Fulano");
        usuario.setEmail("fulano@example.com");

        assertEquals("Fulano", usuario.getNome());
        assertEquals("fulano@example.com", usuario.getEmail());
    }
}