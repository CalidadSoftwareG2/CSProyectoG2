package com.example.prueba2.cucumber;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.prueba2.Sistema;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class añadirCarpeta {

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

    @When("^añado una carpeta$")
    public void añadir_carpeta(){
        sistema.addFolder("carpeta");
    }

    @Then("^comprobamos que se haya añadido")
    public void comprobar_carpeta(){
        assertTrue(sistema.getCarpetas().size() != 0);
    }


}
