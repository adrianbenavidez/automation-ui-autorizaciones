package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class IngresarElValor implements Task {
    private final String valor;
    private final Target campo;

    public IngresarElValor(Target campo,String valor) {
        this.valor = valor;
        this.campo = campo;
    }

    public static IngresarElValor enEl(Target campo, String valor) {
        return instrumented(IngresarElValor.class, campo, valor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(campo, isPresent()).forNoMoreThan(60).seconds());
        actor.attemptsTo(Enter.theValue(valor).into(campo));
    }
}
