package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.actions;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks.HacerClick;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui.ListaDesplegable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SeleccionarOpcion implements Interaction {
    private final Target OPCIONES = ListaDesplegable.OPCIONES_DE_LA_LISTA;
    private Target lista;
    private String opcion;
    private boolean esperar = false;

    public SeleccionarOpcion(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    public SeleccionarOpcion(Target lista, String opcion, boolean esperar) {
        this.lista = lista;
        this.opcion = opcion;
        this.esperar = esperar;
    }

    @Step("{0} selecciona la opción #texto en la #target")
    public <T extends Actor> void performAs(T actor) {
        if (this.esperar) {
            actor.attemptsTo(HacerClick.en(this.lista));
        } else {
            actor.attemptsTo(Click.on(this.lista));
        }
        actor.attemptsTo(
                Recorrer.losElementosDe(OPCIONES).ySeleccionarLaOpcion(this.opcion)
        );
    }
}
