package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MaximizarElNavegador implements Interaction {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        getDriver().manage().window().maximize();
    }

    public static MaximizarElNavegador correctamente() {
        return instrumented(MaximizarElNavegador.class);
    }
}
