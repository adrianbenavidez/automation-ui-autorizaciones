package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckBox {

    //CargaSolicitudLogistica
    public static Target INFORMACION_NO_DISPONIBLE = Target.the("Checkbox que indica que no tiene información del prescriptor").located(By.xpath("//label[contains(.,'Información no disponible')]"));


    //CargaSolicitudesDirectas
    public static Target URGENCIA_MEDICA = Target.the("Checkbox que indica que no tiene Urgencia Médica").located(By.xpath("//div[@class = \"radio\"]/label[@for=\"practiceUrgencyNo\"]"));
    public static Target ACEPTAR = Target.the("Checkbox para aceptar entre todas las opciones de auditoría Médica").located(By.xpath("//*[@id=\"divMedicalAudit\"]/div[1]/div[1]/div[1]/div/ins"));
    public static Target ACEPTAR_D = Target.the("Checkbox para aceptar entre todas las opciones de auditoría Médica").located(By.xpath("//div[@id='divAutomaticAuthorization']/div/ins"));


    public static Target ACEPTAR_1 = Target.the("ACEPTAR").located(By.xpath("(//a[contains(text(),'Aceptar')])[64]"));


    //Cca
    public static Target RESULTADO_BUSQUEDA_SOLICITUD = Target.the("Primer registro resultado de la búsqueda de solicitudes").located(By.xpath("//*[@id=\"authorization-proposal-grid\"]/tbody/tr[1]/td[1]/i"));


}
