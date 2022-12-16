package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ScreenplaySetup {
    private static ScreenplaySetup instance;
    private static Actor actor;

    // El constructor es privado, no permite que se genere un constructor por defecto
    private ScreenplaySetup(String nombreActor) {
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled(nombreActor);
    }
    //método llamado 'cargarElEscenario()' se crea una instancia de está clase, si no se ha creado todavía:
    public static void cargarElEscenario(String nombreActor) {
        if (instance == null) {
            instance = new ScreenplaySetup(nombreActor);
        }
    }

    public static Actor obtenerActor() {
        return actor;
    }
}