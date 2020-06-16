package com.sophossolutions.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Resultado extends PageObject {

    public static final Target BOTON_AGREGAR = Target.the("Boton agregar")
            .located(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[2]/div[4]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[5]/button[1]"));
    public static final Target BOTON_IR_A_CARRITO = Target.the("Boton Ir a carrito")
            .located(By.xpath("/html[1]/body[1]/div[19]/div[1]/button[2]"));
    public static final Target BOTON_VER_CARRITO = Target.the("Boton ver carrito")
            .located(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[3]/div[2]/div[2]/a[1]"));
    public static final Target BOTON_NO_GRACIAS = Target.the("Boton no gracias")
            .located(By.id("onesignal-popover-cancel-button"));
}
