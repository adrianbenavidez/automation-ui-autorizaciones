package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Etiqueta {
    //inicioDeSesion
    public static Target ESPERANDO_RESULTADO = Target.the("Mensaje de buscando en selector de usuarios").located(By.xpath("//*[@class='select2-searching']"));
}
