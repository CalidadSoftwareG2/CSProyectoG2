package com.example.prueba2.smokeTest;

import com.example.prueba2.Sistema;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

public class SignupTest {

    @Mock
    private Sistema sistema;

    public SignupTest() {
    }

    @Before
    public void setUp(){
        sistema = new Sistema();
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
