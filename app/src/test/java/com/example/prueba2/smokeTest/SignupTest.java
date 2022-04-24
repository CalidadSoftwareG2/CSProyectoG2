package com.example.prueba2.smokeTest;

import com.example.prueba2.Sistema;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignupTest {

    private final Sistema sistema;

    public SignupTest(Sistema sistema) {
        this.sistema = sistema;
    }

    @Test
    public void registerNewUser(){
        String name = "Name1";
        String password = "Password1";
        assertTrue(sistema.register(name, password));
    }

    @Test
    public void registerExistingUser(){
        String name = "Name2";
        String password = "Password2";
        sistema.register(name, password);
        assertFalse(sistema.register(name, password));
    }

}
