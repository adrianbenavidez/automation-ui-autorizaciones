package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.actions;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.abilities.Loguearse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoguearseEnElSitio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(NavegarHacia.laPantallaDeLogin(),
                MaximizarElNavegador.correctamente(),
                IngresarValor.enElCampoUsuario(credenciales(actor).getNombreUsuario()),
                IngresarValor.enElCampoPassword(credenciales(actor).getContraseniaUsuario()),
                HacerClick.enElBotonIniciarSesion());
    }
    private Loguearse credenciales (Actor actor) {
        return Loguearse.como(actor);
    }

    public static LoguearseEnElSitio correctamente() {
        return instrumented(LoguearseEnElSitio.class);
    }

}
