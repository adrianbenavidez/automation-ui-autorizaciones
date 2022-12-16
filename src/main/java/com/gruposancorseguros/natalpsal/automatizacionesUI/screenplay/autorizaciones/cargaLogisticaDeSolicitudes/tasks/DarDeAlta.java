package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.autorizaciones.cargaLogisticaDeSolicitudes.tasks;
import net.serenitybdd.screenplay.Actor;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.tasks.Cargar;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.*;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions.ElTexto;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.HacerClick;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.IngresarElValor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.File;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DarDeAlta implements Task {

    private String tipoAutorizacion;
    public static  String nroSolicitud;
    File archivo = new File("src\\test\\resources\\files\\En blanco.pdf");
    String ruta_final = archivo.getAbsolutePath();


    public DarDeAlta(String tipoAutorizacion) {
        this.tipoAutorizacion = tipoAutorizacion;
    }

    public static DarDeAlta unaSolicitudlogistica(String tipoAutorizacion) {
        return instrumented(DarDeAlta.class,tipoAutorizacion);
    }


    @Override
    public  <T extends Actor> void performAs(T actor) {

        switch (tipoAutorizacion)
        {
            case "Practica Ambulatoria":
                actor.attemptsTo(WaitUntil.the(RadioButton.PRACTICA_AMBULATORIA,isEnabled()));
                actor.attemptsTo(HacerClick.en(Etiqueta.PRACTICA_AMBULATORIA));
                break;
            case "Internacion":
                actor.attemptsTo(WaitUntil.the(RadioButton.INTERNACION, isEnabled()));
                actor.attemptsTo(HacerClick.en(Etiqueta.INTERNACION));
                break;
            case "Protesis":
                actor.attemptsTo(WaitUntil.the(RadioButton.PROTESIS, isEnabled()));
                actor.attemptsTo(HacerClick.en(Etiqueta.PROTESIS));
                break;
        }
        actor.attemptsTo(IngresarElValor.enEl(Campo.MAIL,"mmusso@sancorseguros.com"));
        actor.attemptsTo(HacerClick.en(CheckBox.INFORMACION_NO_DISPONIBLE));
        actor.attemptsTo(Cargar.archivo(ruta_final));
        actor.attemptsTo(HacerClick.en(Boton.ENVIAR));
        nroSolicitud = ElTexto.de(PopUp.NUMERO_SOLICITUD_AUTORIZACION).answeredBy(actor).replaceAll("\\D+", "");

    }
}
