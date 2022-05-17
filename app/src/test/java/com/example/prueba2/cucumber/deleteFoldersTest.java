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
public class DeleteFoldersTest {

    @Mock
    private Sistema sistema;

    @Before
    public void setUp(){
        sistema = new Sistema();
        sistema.addFolder("Prueba");
        sistema.register("User", "password");
        sistema.logIn("User", "password");
    }

    @Given("^hay alguna carpeta en el sistema$")
    public void hay_alguna_carpeta_en_el_sistema() {
        assertTrue(sistema.getCarpetas().size() != 0 && sistema.getLogedUser() != null);
    }

    @When("^pulso el botón de eliminar carpetas$")
    public void pulso_el_boton_de_eliminar_carpetas() {
        sistema.deleteAllCarpetas();
    }

    @Then("^se borran todas las carpetas de la aplicación$")
    public void se_borran_todas_las_carpetas_de_la_aplicacion() {
        assertTrue(sistema.getCarpetas().size() == 0);
    }
}
