package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.tasks.Cargar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.File;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CargarArchivo implements Task {


    File archivo = new File("src\\test\\resources\\files\\En blanco.pdf");
    String ruta_final = archivo.getAbsolutePath();


    public CargarArchivo() {

    }

    public static CargarArchivo en() {
        return instrumented(CargarArchivo.class);
    }

    @Override
    public  <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Cargar.archivo(ruta_final));
        //actor.attemptsTo(HacerClick.en(Boton.ENVIAR));
    }
}
