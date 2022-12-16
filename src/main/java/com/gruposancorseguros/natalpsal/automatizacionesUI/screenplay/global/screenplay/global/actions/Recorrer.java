package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Recorrer implements Interaction {
    private Target lista;
    private String opcion;

    public Recorrer(Target lista, String opcion) {
        this.lista  = lista;
        this.opcion = opcion;
    }
    public static RecorrerBuilder losElementosDe(Target lista) {
        return new RecorrerBuilder(lista);
    }

    public static class RecorrerBuilder {

        private Target lista;

        public RecorrerBuilder(Target lista) {
            this.lista = lista;
        }

        public Recorrer ySeleccionarLaOpcion(String opcion) {
            return instrumented(Recorrer.class, lista, opcion);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (WebElementFacade item: lista.resolveAllFor(actor)){
            if(item.getText().contains(this.opcion)){
                String nom = item.getText();
                actor.attemptsTo(Click.on(item));
                break;
            }
        }
    }
}
