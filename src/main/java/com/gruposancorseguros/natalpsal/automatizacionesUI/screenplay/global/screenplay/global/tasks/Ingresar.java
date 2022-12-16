package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

;

public class Ingresar implements Task {

    private Target menu;
    private Target submenu;

    public Ingresar(Target menu, Target submenu) {
        this.menu    = menu;
        this.submenu = submenu;
    }

    public static Ingresar al(Target menu, Target submenu) {
        return instrumented(Ingresar.class, menu, submenu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(HacerClick.en(this.menu));
        actor.attemptsTo(HacerClick.en(this.submenu));
    }
}
