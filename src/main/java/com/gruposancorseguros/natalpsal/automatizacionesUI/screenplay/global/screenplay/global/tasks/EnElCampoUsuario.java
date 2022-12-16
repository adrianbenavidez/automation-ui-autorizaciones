package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.elements.Input;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnElCampoUsuario implements Task {

    private final String valor;

    public EnElCampoUsuario(String valor) {
        this.valor = valor;
    }

    public static EnElCampoUsuario conElValor(String valor) {
        return instrumented(EnElCampoUsuario.class, valor);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Enter.theValue(valor).into(Input.USUARIO));
    }
}
