package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaDesplegable {
    //inicioDeSesion
    public static Target USUARIO_SELECCIONADO = Target.the("Opción con el nombre de usuario").located(By.xpath("//div[@class='select2-result-label']"));

    public static Target OPCIONES_DE_LA_LISTA = Target.the("Opciones de la lista desplegable").located(By.xpath("//div[@id='select2-drop']//div[@role='option']"));
}
