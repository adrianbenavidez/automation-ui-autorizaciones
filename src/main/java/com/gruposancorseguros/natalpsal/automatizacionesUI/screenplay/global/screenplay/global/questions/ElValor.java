package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.questions;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.elements.Label;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElValor {

    public static Question<String> delTituloDePagina() {
        return actor -> Text.of(Label.TITULO_DE_PAGINA).viewedBy(actor).asString();
    }
}
