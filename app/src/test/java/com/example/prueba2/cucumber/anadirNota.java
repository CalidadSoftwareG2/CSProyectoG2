package com.example.prueba2.cucumber;

import com.example.prueba2.Sistema;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.junit.Assert.*;

@RunWith(Cucumber.class)
public class añadirNota {

    @Mock
    private Sistema sistema;

    @Before
    public void setUp(){
        sistema = new Sistema();
    }

    @Given("^iniciamos sesion$")
    public void inicio_sesion(){
        sistema.register("user", "password");
        sistema.logIn("user", "password");
        assertNotNull(sistema.getLogedUser());
    }

    @When("^añado una nota$")
    public void añadir_nota(){
        sistema.addIdea("prueba", "descripcion", 1, null, 2);
    }

    @Then("^comprobamos que se haya añadido")
    public void comprobar_nota(){
        assertTrue(sistema.getIdeas().size() != 0);
    }


}