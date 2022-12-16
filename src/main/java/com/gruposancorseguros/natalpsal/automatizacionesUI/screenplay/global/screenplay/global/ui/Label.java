package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Label {
    public static Target BUSCANDO = Target.the("Label mostrado mientras se realiza la busqueda para cargar los elementos en la lista desplegable").located(By.xpath("//li[contains(text(),'Buscando')]"));
}
