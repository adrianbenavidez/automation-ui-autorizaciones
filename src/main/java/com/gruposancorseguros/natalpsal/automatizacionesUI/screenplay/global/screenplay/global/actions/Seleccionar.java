package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.actions;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Seleccionar {
    private String texto;

    public Seleccionar(String texto) {
        this.texto = texto;
    }

    public static Seleccionar laFecha(String fecha) {
        return new Seleccionar(fecha);
    }

    public SeleccionarFecha enEl(Target campo) {
        return Tasks.instrumented(SeleccionarFecha.class, campo, this.texto);
    }

    public static Seleccionar laOpcion(String opcion) {
        return new Seleccionar(opcion);
    }

    public SeleccionarOpcion enLa(Target lista) {
        return Tasks.instrumented(SeleccionarOpcion.class, lista, this.texto);
    }

    public SeleccionarOpcion enLa(Target lista, boolean esperar) {
        return Tasks.instrumented(SeleccionarOpcion.class, lista, this.texto, esperar);
    }

    public SeleccionarOpcionIngresandoTexto ingresandoTextoEnEl(Target campo) {
        return Tasks.instrumented(SeleccionarOpcionIngresandoTexto.class, campo, this.texto);
    }

    public SeleccionarOpcionIngresandoTextoCompleto ingresandoTextoCompletoEnEl(Target campo) {
        return Tasks.instrumented(SeleccionarOpcionIngresandoTextoCompleto.class, campo, this.texto);
    }
}
