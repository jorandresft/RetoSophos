package com.sophossolutions.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarProducto implements Question<String> {

    private Target producto;

    public ValidarProducto(Target producto) {
        this.producto = producto;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(producto).viewedBy(actor).asString();
    }

    public static ValidarProducto validarProducto(Target producto){
        return new ValidarProducto(producto);
    }
}
