package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.ui.ListaDesplegable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SeleccionarOpcionIngresandoTextoCompleto implements Interaction {
    private final Target OPCIONES = ListaDesplegable.OPCIONES_DE_LA_LISTA;
    private Target campo;
    private String opcion;

    public SeleccionarOpcionIngresandoTextoCompleto(Target campo, String opcion) {
        this.campo = campo;
        this.opcion = opcion;
    }

    @Step("{0} selecciona la opción #texto en la #target")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.opcion).into(this.campo));
        actor.attemptsTo(
                Recorrer.losElementosDe(OPCIONES).ySeleccionarLaOpcion(this.opcion)
        );
    }
}