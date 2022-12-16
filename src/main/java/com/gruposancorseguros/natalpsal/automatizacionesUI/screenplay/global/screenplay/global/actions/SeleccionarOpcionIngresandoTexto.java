package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.actions;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui.ListaDesplegable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarOpcionIngresandoTexto implements Interaction {
    private final Target OPCIONES = ListaDesplegable.OPCIONES_DE_LA_LISTA;
    private Target campo;
    private String opcion;
    private String texto;

    public SeleccionarOpcionIngresandoTexto(Target campo, String opcion) {
        this.campo = campo;
        this.opcion = opcion;
        this.texto = getTextoABuscar(opcion);
        /*if (opcion.length() >= 4) {
            this.texto = opcion.substring(0, 4);
        } else {
            this.texto = opcion;
        }*/

    }

    @Step("{0} selecciona la opción #texto en la #target")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.texto).into(this.campo));
        actor.attemptsTo(WaitUntil.the(OPCIONES, isVisible()).forNoMoreThan(20).seconds());
        actor.attemptsTo(
                Recorrer.losElementosDe(OPCIONES).ySeleccionarLaOpcion(this.opcion)
        );
    }

    // Devuelve el texto a ingresar en el campo para la busqueda
    private String getTextoABuscar(String textoCompleto) {
        int cont = 0;
        String texto = "";
        int longitud = Math.min(opcion.length(), 4);
        while (cont <= longitud) {
            if (textoCompleto.substring(cont, cont + 1).matches("[A-Za-z0-9]")) {
                texto += textoCompleto.substring(cont, cont + 1);
            }
            cont++;
        }
        return texto;
    }
}
