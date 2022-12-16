package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElNumeroDeRegistros implements Question<String> {

    private Target elemento;

    public ElNumeroDeRegistros(Target elemento) {
        this.elemento = elemento;
    }

    public static ElNumeroDeRegistros de(Target elemento) {
        return new ElNumeroDeRegistros(elemento);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(elemento, isVisible()).forNoMoreThan(20).seconds());
        return String.valueOf(elemento.resolveAllFor(actor).size());
    }
}
