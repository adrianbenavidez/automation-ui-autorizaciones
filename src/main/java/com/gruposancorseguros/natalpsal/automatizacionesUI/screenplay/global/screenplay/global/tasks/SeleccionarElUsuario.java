package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui.Campo;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui.Etiqueta;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui.ListaDesplegable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class SeleccionarElUsuario implements Task {
    private String usuario;

    public SeleccionarElUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static SeleccionarElUsuario valido(String usuario) {
        return instrumented(SeleccionarElUsuario.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(IngresarElValor.enEl(Campo.USUARIO_BUSQUEDA,usuario));
        actor.attemptsTo(WaitUntil.the(Etiqueta.ESPERANDO_RESULTADO, isNotPresent()).forNoMoreThan(30).seconds());
        actor.attemptsTo(HacerClick.en(ListaDesplegable.USUARIO_SELECCIONADO));
    }
}
