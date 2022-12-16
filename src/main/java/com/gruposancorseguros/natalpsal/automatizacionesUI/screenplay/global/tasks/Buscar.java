package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Campo;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Etiqueta;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.ListaDesplegable;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions.Recorrer;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.IngresarElValor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Buscar implements Task {
    private final String afiliado;


    public Buscar(String afiliado) {
        this.afiliado = afiliado;
    }

    public static Buscar afiliado(String afiliado) {
        return instrumented(Buscar.class,afiliado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String contrato = afiliado.split("-")[0];
        actor.attemptsTo(IngresarElValor.enEl(Campo.AFILIADO,contrato));
        actor.attemptsTo(WaitUntil.the(Etiqueta.ESPERANDO_RESULTADO, isNotPresent()).forNoMoreThan(120).seconds());
        actor.attemptsTo(WaitUntil.the(ListaDesplegable.RESULTADOS_BUSQUEDA_AFILIADO, isVisible()).forNoMoreThan(120).seconds());
        actor.attemptsTo(Recorrer.losElementosDe(ListaDesplegable.RESULTADOS_BUSQUEDA_AFILIADO).ySeleccionarLaOpcion(afiliado));

    }
}
