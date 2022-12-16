package com.gruposancorseguros.natalpsal.autorizaciones.steps.global;


import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.tasks.LoguearseEnNatal;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.ScreenplaySetup;

import io.cucumber.java.Before;

import io.cucumber.java.es.Dado;



import net.serenitybdd.screenplay.Actor;

public class PrecondicionesStepDef {
    private Actor elUsuarioRegistrado;


    @Before
    public void prepararElEscenario() {
        ScreenplaySetup.cargarElEscenario("usuarioAutorizado");
        elUsuarioRegistrado = ScreenplaySetup.obtenerActor();
    }

    @Dado("que el usuario {string} esta en la pagina principal de login")
    public void queElUsuarioEstaEnLaPaginaPrincipalDeLogin(String usuario) {
        //En la tarea 'Loguearse en el sitio', ingresamos a Natal y nos logueamos con un Usuario Generico
        elUsuarioRegistrado.wasAbleTo(LoguearseEnNatal.correctamente());

    }
}
