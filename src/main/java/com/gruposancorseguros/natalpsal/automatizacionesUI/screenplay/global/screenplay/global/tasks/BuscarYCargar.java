package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions.Recorrer;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.IngresarElValor;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Campo;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Etiqueta;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.ListaDesplegable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarYCargar implements Task {

    private final Target campo;
    private final String texto;


    public BuscarYCargar(Target campo, String texto) {
        this.campo = campo;
        this.texto = texto;
    }

    public static BuscarYCargar en(Target campo, String texto) {
        return instrumented(BuscarYCargar.class, campo, texto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //String contrato = texto.split("-")[0];
        actor.attemptsTo(IngresarElValor.enEl(campo, texto));
        actor.attemptsTo(WaitUntil.the(Etiqueta.ESPERANDO_RESULTADO, isNotPresent()).forNoMoreThan(120).seconds());
        actor.attemptsTo(WaitUntil.the(ListaDesplegable.RESULTADOS_BUSQUEDA_AFILIADO, isVisible()).forNoMoreThan(120).seconds());
        actor.attemptsTo(Recorrer.losElementosDe(ListaDesplegable.RESULTADOS_BUSQUEDA_AFILIADO).ySeleccionarLaOpcion(texto));

    }
}
