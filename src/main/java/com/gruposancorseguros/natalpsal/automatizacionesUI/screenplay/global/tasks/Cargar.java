package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Boton;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Campo;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.HacerClick;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cargar implements Task {
    private final String ruta_archivo;


    public Cargar(String ruta_archivo) {
        this.ruta_archivo = ruta_archivo;
    }

    public static Cargar archivo(String ruta_archivo) {
        return instrumented(Cargar.class,ruta_archivo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(HacerClick.en(Boton.AGREGAR_ARCHIVO));
        actor.attemptsTo(Enter.keyValues(ruta_archivo).into(Campo.SELECCIONAR_ARCHIVO));
    }
}
