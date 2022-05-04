package com.example.prueba2.tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.prueba2.Sistema;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class LogoutTest {

    @Mock
    private Sistema sistema;

    @Before
    public void setUp(){
        sistema = new Sistema();
    }

    @Test
    public void logoutRegisteredUser(){
        String name = "RegisteredName";
        String password = "RegisteredPassword";
        sistema.register(name, password);
        sistema.logIn(name, password);
        assertTrue(sistema.logOut());
    }

    @Test
    public void logoutNonRegisteredUser(){
        String name = "NonRegisteredName";
        String password = "NonRegisteredPassword";
        assertFalse(sistema.logOut());
    }

}
