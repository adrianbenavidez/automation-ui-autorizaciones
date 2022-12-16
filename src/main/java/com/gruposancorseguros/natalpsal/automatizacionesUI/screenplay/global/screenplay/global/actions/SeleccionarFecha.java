package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.actions;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui.Calendario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SeleccionarFecha implements Interaction {
    private Target campo;
    private String anio;
    private String mes;
    private String dia;

    public SeleccionarFecha(Target campo, String fecha) {
        this.campo = campo;
        this.anio = getAnio(fecha);
        this.mes = getNombreDelMes(fecha);
        this.dia = getDia(fecha);
    }

    @Step("{0} selecciona la fecha #texto en el #target")
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Enter.theValue(texto).into(campo));
        actor.attemptsTo(Click.on(campo));
        actor.attemptsTo(Click.on(Calendario.TITULO_MES_ANIO));
        actor.attemptsTo(Click.on(Calendario.TITULO_ANIO));
        String rangoAnios = Calendario.TITULO_RANGO_ANIOS.resolveFor(actor).getText();
        String anioDesde = rangoAnios.split("-")[0];
        String anioHasta = rangoAnios.split("-")[1];
        while (anioFueraDelRango(anioDesde, anioHasta, this.anio)) {
            //moverse de año
            if (anioAnteriorAlRango(anioDesde)) {
                actor.attemptsTo(Click.on(Calendario.RANGO_ANTERIOR));
            } else {
                actor.attemptsTo(Click.on(Calendario.RANGO_POSTERIOR));
            }
            rangoAnios = Calendario.TITULO_RANGO_ANIOS.resolveFor(actor).getText();
            anioDesde = rangoAnios.split("-")[0];
            anioHasta = rangoAnios.split("-")[1];
        }
        actor.attemptsTo(
                Recorrer.losElementosDe(Calendario.ANIOS).ySeleccionarLaOpcion(this.anio)
        );
        actor.attemptsTo(
                Recorrer.losElementosDe(Calendario.MESES).ySeleccionarLaOpcion(this.mes)
        );
        actor.attemptsTo(
                Recorrer.losElementosDe(Calendario.DIAS).ySeleccionarLaOpcion(this.dia)
        );
    }

    private boolean anioFueraDelRango(String anioDesde, String anioHasta, String anio) {
        boolean resultado = false;
        if (Integer.parseInt(anio) < Integer.parseInt(anioDesde)
                || Integer.parseInt(anio) > Integer.parseInt(anioHasta)) {
            resultado = true;
        }
        return resultado;
    }

    private boolean anioAnteriorAlRango(String anioDesde) {
        return Integer.parseInt(this.anio) < Integer.parseInt(anioDesde);
    }

    private String getAnio(String fecha) {
        //La fecha debe estar en el formato dd/mm/YYYY
        return fecha.split("/")[2];
    }

    private String getDia(String fecha) {
        //La fecha debe estar en el formato dd/mm/YYYY
        String dia = fecha.split("/")[0];
        //Elimina los ceros a la izquierda en caso de haberlos
        int diaNumero = Integer.parseInt(dia);
        return String.valueOf(diaNumero);
    }

    private String getNombreDelMes(String fecha) {
        //La fecha debe estar en el formato dd/mm/YYYY
        String[] meses = {
                "ene.", "feb.", "mar.", "abr.", "may.", "jun.", "jul.", "ago.", "sep.", "oct.", "nov.", "dic."
        };
        String mes = fecha.split("/")[1];
        return meses[Integer.parseInt(mes) - 1];
    }
}
