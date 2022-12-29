package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class ElElemento implements Question<Boolean> {

    private final Target campo;

    public ElElemento(Target campo) {
        this.campo = campo;
    }

    public static ElElemento estaOculto(Target campo) {
        return new ElElemento(campo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        //actor.attemptsTo(WaitUntil.the(campo, isNotVisible()));
        actor.attemptsTo(
                WaitUntil.the(campo, isNotVisible()).forNoMoreThan(10).seconds()
        );
        //return CurrentVisibility.of(campo).viewedBy(actor).asBoolean();
        return Presence.of(campo).viewedBy(actor).asBoolean();
    }
}


