package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaDesplegable {
    public static Target RESULTADOS_BUSQUEDA_AFILIADO          = Target.the("Lista de resultados busqueda afiliado").located(By.xpath("//div[@id='select2-drop']//div[@role='option']"));


    //region Target para lista desplegable
    public static Target MOTIVO_DE_RECHAZO         = Target.the("Lista de motivos de rechazo").located(By.xpath("//select[@id='RejectedReasonId']"));

    public static Target DERIVAR_A         = Target.the("Lista de niveles de auditorias").located(By.xpath("//*[@id='select2-chosen-14']"));

    public static Target DERIVAR_NIVEL1       = Target.the("Lista de niveles de auditorias").located(By.xpath("//*[@id='select2-results-14']/li[1]"));

    public static Target DERIVAR_NIVEL2       = Target.the("Lista de niveles de auditorias").located(By.xpath("//*[@id='select2-results-14']/li[2]"));

    public static Target AFILIADO_EN_MORA         = Target.the("Opción afiliado en Mora").located(By.xpath("//option[contains(text(),'Afiliado en Mora')]"));
    //endregion


}
