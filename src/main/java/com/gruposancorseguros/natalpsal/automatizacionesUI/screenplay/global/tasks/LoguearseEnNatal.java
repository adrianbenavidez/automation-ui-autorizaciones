package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Menu;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.PopUp;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.pages.Login;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.abilities.UsuarioLogin;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.Navegar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.IngresarElValor;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.HacerClick;
import net.serenitybdd.screenplay.conditions.Check;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Campo;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Boton;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.remote.server.handler.GetTitle;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LoguearseEnNatal implements Task {

    public LoguearseEnNatal(){ }

    public static LoguearseEnNatal correctamente() {
        return instrumented(LoguearseEnNatal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.can(UsuarioLogin.cargarUsuario());

        String usuario      = UsuarioLogin.getNombre();
        String contrasenia  = UsuarioLogin.getContrasenia();

        actor.attemptsTo(Navegar.hacia(Login.class));

        actor.attemptsTo(Check.whether(Boton.NO_ES_MI_CUENTA.resolveFor(actor).isPresent())
                .andIfSo(
                        HacerClick.en(Boton.NO_ES_MI_CUENTA)));

        actor.attemptsTo(Check.whether(Boton.INICIAR_SESION.resolveFor(actor).isPresent())
                .andIfSo(
                        IngresarElValor.enEl(Campo.USUARIO_LOGIN, usuario),
        IngresarElValor.enEl(Campo.CONTRASENIA_LOGIN, contrasenia),
        HacerClick.en(Boton.INICIAR_SESION)));

        actor.attemptsTo(WaitUntil.the(Boton.CON_LOGIN, isVisible()).forNoMoreThan(40).seconds());


    }
}

