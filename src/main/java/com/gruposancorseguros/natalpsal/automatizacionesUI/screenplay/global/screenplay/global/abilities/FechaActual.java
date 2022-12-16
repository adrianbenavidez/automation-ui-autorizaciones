package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.abilities;

import net.serenitybdd.screenplay.Ability;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaActual implements Ability {
    private static FechaActual instance;

    private FechaActual() {
    }

    public static FechaActual calcularFecha() {
        if (instance == null) {
            instance = new FechaActual();
        }
        return instance;
    }

    public static String getFecha() {
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        return formateador.format(fecha);
    }

    public static String getTime() {
        Date fecha = new Date();
        return Long.toString(fecha.getTime());
    }

    public static String sumarDiasAFechaActual(int dias){
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");

        if (dias == 0) return formateador.format(fecha);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);

        return formateador.format(calendar.getTime());
    }
}


