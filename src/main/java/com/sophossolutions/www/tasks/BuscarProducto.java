package com.sophossolutions.www.tasks;

import com.sophossolutions.www.userinterfaces.HomeMetro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(HomeMetro.INPUT_BUSQUEDA),
                Hit.the(Keys.ENTER).into(HomeMetro.INPUT_BUSQUEDA)
        );
    }

    public static BuscarProducto buscarProducto(String producto){
        return Tasks.instrumented(BuscarProducto.class, producto);
    }
}
