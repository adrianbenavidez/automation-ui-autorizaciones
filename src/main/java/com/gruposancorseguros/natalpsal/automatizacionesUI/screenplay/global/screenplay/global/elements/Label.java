package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.elements;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {
    public static Target TITULO_DE_PAGINA = Target.the("Titulo de la pagina").located(By.xpath("//*[@id=\"mainABMdiv\"]/div[1]/div/h1"));
    public static Target BUSCANDO_SELECTOR = Target.the("Mensaje de buscando en selector de usuarios").located(By.xpath("//*[@class=\"select2-searching\"]"));
}
