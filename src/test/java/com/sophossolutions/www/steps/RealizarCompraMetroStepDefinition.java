package com.sophossolutions.www.steps;

import com.sophossolutions.www.questions.ValidarProducto;
import com.sophossolutions.www.tasks.BuscarProducto;
import com.sophossolutions.www.tasks.SeleccionarProducto;
import com.sophossolutions.www.userinterfaces.Carrito;
import com.sophossolutions.www.userinterfaces.HomeMetro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class RealizarCompraMetroStepDefinition {

    private HomeMetro metro;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Necesito realizar una compra$")
    public void necesitoRealizarUnaCompra() {
        theActorCalled("Practica").wasAbleTo(Open.browserOn(metro));
    }

    @When("^Selecciono el producto \"([^\"]*)\"$")
    public void seleccionoElProducto(String producto) {
        theActorInTheSpotlight().attemptsTo(
                BuscarProducto.buscarProducto(producto),
                SeleccionarProducto.seleccionarProducto()
        );
    }

    @Then("^Valido que el producto fue agregado exitosamente \"([^\"]*)\"$")
    public void validoQueElProductoFueAgregadoExitosamente(String producto) {
        theActorInTheSpotlight().should(
            seeThat(ValidarProducto.validarProducto(Carrito.PRODUCTO_CARRITO), equalTo(producto))
        );
    }
}
