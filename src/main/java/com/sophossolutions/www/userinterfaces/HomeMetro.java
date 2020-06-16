package com.sophossolutions.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.metro.pe/especiales/cybermetro")
public class HomeMetro extends PageObject {
    public static final Target INPUT_BUSQUEDA = Target.the("Input busqueda")
            .located(By.id("search-autocomplete-input"));
}
