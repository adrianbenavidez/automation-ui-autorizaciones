package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadioButton {

    public static Target PRACTICA_AMBULATORIA  = Target.the("Radio Button práctica ambulatoria").located(By.xpath("//*[@id=\"Práctica Ambulatoria\"]") );
    public static Target INTERNACION  = Target.the("Radio Button internación").located(By.xpath("//*[@id=\"Internación\"]") );
    public static Target PROTESIS  = Target.the("Radio Button prótesis").located(By.xpath("//*[@id=\"Prótesis\"]") );


    //region Target para radiobutton
    public static Target TIPO_DE_AUTORIZACION_MEDICAMENTOS  = Target.the("Tipo de Autorización").located(By.xpath("//label[contains(text(),'Medicamentos')]") );

    public static Target URGENCIA_MEDICA_SI  = Target.the("Opción Si en Urgencia Médica").located(By.xpath("//*[@id='medicalPracticeUrgency']/div/div[1]/div") );

    public static Target URGENCIA_MEDICA_NO  = Target.the("Opción No en Urgencia Médica").located(By.xpath("//*[@id='medicalPracticeUrgency']/div/div[2]/div") );

    public static Target AUDITORIA_MEDICA_ACEPTAR  = Target.the("Auditoría Medica Aceptar").located(By.xpath("//*[@id='divAccept']/div") );

    public static Target AUDITORIA_MEDICA_RECHAZAR  = Target.the("Auditoría Medica Rechazar").located(By.xpath("//*[@id='divRejected']/div") );

    public static Target AUDITORIA_MEDICA_DERIVAR  = Target.the("Derivar a Auditoria Medica").located(By.xpath("//*[@id='divDerived']/div") );

    public static Target CHECK_FILA_SOLICITUD  = Target.the("Primera fila en la grilla de supervisión de solicitudes").located(By.xpath("//tbody/tr[1]/td[1]/i[1]") );
    //endregion


}
