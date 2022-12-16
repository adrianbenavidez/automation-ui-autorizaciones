package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopUp {
    public static Target MENSAJE_CARGA_LOGISTICA_EXITOSA   = Target.the("Mensaje que indica generación exitosa de solicitud").located(By.xpath("//h4[@class='ui-pnotify-title']"));
    public static Target NUMERO_SOLICITUD_AUTORIZACION   = Target.the("Numero solicitud autorización").located(By.xpath("//div[@class='ui-pnotify-text']/strong"));

}
