package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Moverse implements Interaction {

    public static Moverse aLaNuevaPestania() {
        return instrumented(Moverse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

    }
}
