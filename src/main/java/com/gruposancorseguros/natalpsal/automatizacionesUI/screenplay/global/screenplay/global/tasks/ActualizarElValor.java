package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.ui.PopUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ActualizarElValor implements Task {
    private final String valor;
    private final Target campo;

    public ActualizarElValor(String valor, Target campo) {
        this.valor = valor;
        this.campo = campo;
    }

    public static ActualizarElValor enElCampo(String valor, Target campo) {
        return instrumented(ActualizarElValor.class, valor, campo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PopUp.BLOCK_UI, isNotPresent()).forNoMoreThan(15).seconds());
        actor.attemptsTo(WaitUntil.the(campo, isPresent()).forNoMoreThan(20).seconds());
        actor.attemptsTo(Clear.field(campo));
        actor.attemptsTo(Enter.theValue(valor).into(campo).thenHit(Keys.TAB));
    }
}
