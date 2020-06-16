package com.sophossolutions.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carrito extends PageObject {
    public static final Target PRODUCTO_CARRITO = Target.the("Producto seleccionado")
            .located(By.xpath("//*[@id=\"cart-page\"]/div[8]/div/div[3]/div[1]/div[4]/div[2]/div/div[3]/a"));
}
