package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.elements.Boton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnElBotonIniciarSesion implements Task {

    public EnElBotonIniciarSesion() {}

    public static EnElBotonIniciarSesion conElValor() {
        return instrumented(EnElBotonIniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(Boton.INICIAR_SESION));
    }
}
