package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.elements.Input;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnElCampoContrasenia implements Task {

    private final String valor;

    public EnElCampoContrasenia(String valor) {
        this.valor = valor;
    }

    public static EnElCampoContrasenia conElValor(String valor) {return instrumented(EnElCampoContrasenia.class, valor);}

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Enter.theValue(valor).into(Input.CONTRASENIA));
    }
}
