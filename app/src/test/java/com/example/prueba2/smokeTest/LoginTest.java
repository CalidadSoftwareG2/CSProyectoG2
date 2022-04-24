package com.example.prueba2.smokeTest;

import com.example.prueba2.Sistema;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {

    private final Sistema sistema;

    public LoginTest(Sistema sistema) {
        this.sistema = sistema;
    }

    @Test
    public void loginRegisteredUser(){
        String name = "RegisteredName";
        String password = "RegisteredPassword";
        sistema.register(name, password);
        assertTrue(sistema.logIn(name, password));
    }

    @Test
    public void loginNonRegisteredUser(){
        String name = "NonRegisteredName";
        String password = "NonRegisteredPassword";
        assertFalse(sistema.logIn(name, password));
    }

}
