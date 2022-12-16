package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.elements.pages.GrillaDeSupervision;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.elements.pages.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarHacia implements Task {

    private static Class sitio;

    public static NavegarHacia laPantallaDeLogin() {
        sitio = Login.class;
        return instrumented(NavegarHacia.class);
    }

    public static NavegarHacia laPantallaDeGrillaDeSupervision() {
        sitio = GrillaDeSupervision.class;
        return instrumented(NavegarHacia.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Open.browserOn().the(sitio));
    }
}
