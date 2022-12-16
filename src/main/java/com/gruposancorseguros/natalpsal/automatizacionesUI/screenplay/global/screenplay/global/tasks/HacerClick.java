package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class HacerClick implements Task {
    private final Target campo;

    public HacerClick(Target campo) {
        this.campo = campo;
    }

    public static HacerClick en(Target campo) {
        return instrumented(HacerClick.class, campo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(campo, isClickable()).forNoMoreThan(240).seconds());
        actor.attemptsTo(Click.on(campo));
    }
}

