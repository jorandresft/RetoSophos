package com.sophossolutions.www.tasks;

import com.sophossolutions.www.userinterfaces.Resultado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(Resultado.BOTON_NO_GRACIAS.resolveFor(actor).isVisible())
                .andIfSo(Click.on(Resultado.BOTON_NO_GRACIAS)),
                Click.on(Resultado.BOTON_AGREGAR),
                Click.on(Resultado.BOTON_IR_A_CARRITO),
                Click.on(Resultado.BOTON_VER_CARRITO)
        );
    }

    public static SeleccionarProducto seleccionarProducto(){
        return Tasks.instrumented(SeleccionarProducto.class);
    }
}
