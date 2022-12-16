package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.elements;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Boton {
    public static Target INICIAR_SESION = Target.the("Botón Iniciar Sesión").located(By.xpath("//button/span[contains(text(),\"Iniciar sesión\")]"));
}
