package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions.ElElemento;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions.ElTexto;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.HacerClick;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.IngresarElValor;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.Campo;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.CheckBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.notNullValue;

public class CompletarDatosObligatorios implements Task {
    private final Target campo1;
    private final Target campo2;
    private final Target campo3;
    private final Target campo4;
    private final String email;
    private final String st;



    public CompletarDatosObligatorios(Target campo1, Target campo2,Target campo3,Target campo4, String email, String st) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
        this.email = email;
        this.st = st;
    }

    public static CompletarDatosObligatorios en(Target campo1,Target campo2,Target campo3, Target campo4,  String email, String st) {
        return instrumented(CompletarDatosObligatorios.class, campo1,campo2,campo3,campo4, email, st);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(IngresarElValor.enEl(campo1, email));
        actor.attemptsTo(HacerClick.en(CheckBox.INFORMACION_NO_DISPONIBLE));
        //actor.asksFor(ElElemento.estaOculto(campo2));
        actor.attemptsTo(BuscarYCargar.en(campo3, st));
        //actor.should(seeThat(ElTexto.de(campo4), notNullValue()));

    }

}
