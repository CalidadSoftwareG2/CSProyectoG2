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
public class DeleteNotesTest {

    @Mock
    private Sistema sistema;

    @Before
    public void setUp(){
        sistema = new Sistema();
        sistema.addIdea("Prueba", "Nota de prueba", 1, null, 2);
        sistema.register("User", "password");
        sistema.logIn("User", "password");
    }

    @Given("^hay alguna nota en el sistema$")
    public void hay_alguna_nota_en_el_sistema() {
        assertTrue(sistema.getIdeas().size() != 0 && sistema.getLogedUser() != null);
    }

    @When("^pulso el botón de eliminar notas$")
    public void pulso_el_boton_de_eliminar_notas() {
        sistema.deleteAllIdeas();
    }

    @Then("^se borran todas las notas de la aplicación$")
    public void se_borran_todas_las_notas_de_la_aplicacion() {
        assertTrue(sistema.getIdeas().size() == 0);
    }
}
