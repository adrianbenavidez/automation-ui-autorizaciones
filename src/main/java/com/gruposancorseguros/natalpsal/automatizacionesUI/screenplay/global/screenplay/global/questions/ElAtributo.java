package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ElAtributo implements Question<String> {

    private final Target campo;

    public ElAtributo(Target campo) {
        this.campo = campo;
    }

    public static ElAtributo de(Target campo) {
        return new ElAtributo(campo);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(campo, isVisible()).forNoMoreThan(20).seconds());
        //return Text.of(campo).viewedBy(actor).asString().trim();
        return Attribute.of(campo).named("value").viewedBy(actor).asString();

    }
}

