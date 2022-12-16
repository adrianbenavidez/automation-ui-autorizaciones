package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaDesplegable {
    public static Target RESULTADOS_BUSQUEDA_AFILIADO          = Target.the("Lista de resultados busqueda afiliado").located(By.xpath("//div[@id='select2-drop']//div[@role='option']"));


}
