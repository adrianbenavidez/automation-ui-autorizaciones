package com.gruposancorseguros.natalpsal.automatizacionesUI.acceptancetests.Autorizaciones;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


// Indicamos que el proyecto se va a correr con Serenity
@RunWith(CucumberWithSerenity.class)

// plugin:      especificamos que la salida se muestre con colores
// tags:        especificamos por medio de tags, que casos vamos a ejecutar o no.


@CucumberOptions(
        //ruta de las feature que queremos ejecutar
        features = "src/test/resources/autorizaciones/features/cargaDirectaDeSolicitudes/cargaDirectaDeSolicitudes.feature",
        //ruta del paquete donde estan los step definition de la feature
        glue = {
                "com.gruposancorseguros.natalpsal.automatizacionesUI.steps.autorizaciones.cargaDirectaDeSolicitudes",
                "com.gruposancorseguros.natalpsal.automatizacionesUI.steps.global"},
        // especificamos que la salida se muestre con colores
        plugin = "pretty",
        tags   = "@regresionCargaDirecta"
)

public class CargarSolicitudDirectaRunner {
}
