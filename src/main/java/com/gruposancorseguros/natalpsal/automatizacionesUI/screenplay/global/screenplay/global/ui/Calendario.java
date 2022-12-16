package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Calendario {
    //DatePicker
    public static Target TITULO_MES_ANIO = Target.the("Título mes y año del calendario").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-days']//th[@class='picker-switch']"));
    public static Target TITULO_ANIO = Target.the("Título año del calendario").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-months']//th[@class='picker-switch']"));
    public static Target TITULO_RANGO_ANIOS = Target.the("Título rango de años del calendario").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-years']//thead//th[@class='picker-switch']"));
    public static Target ANIOS = Target.the("Años dentro del calendario").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-years']//tbody//span[contains(@class,'year') and not(contains(@class,'disabled'))]"));
    public static Target MESES = Target.the("Meses dentro del calendario").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-months']//tbody//span[contains(@class,'month') and not(contains(@class,'disabled'))]"));
    public static Target DIAS = Target.the("Días dentro del calendario").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-days']//tbody//td[contains(@class,'day') and not(contains(@class,'disabled')) and not(contains(@class,'old')) and not(contains(@class,'new'))]"));
    public static Target RANGO_ANTERIOR = Target.the("Flecha para seleccionar un rango de años anterior").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-years']//thead//th[@class='prev']"));
    public static Target RANGO_POSTERIOR = Target.the("Flecha para seleccionar un rango de años posterior").located(By.xpath("//div[@class='datepicker']//div[@class='datepicker-years']//thead//th[@class='next']"));

    public static Target FECHA_DE_NOTIFICACION  = Target.the("Fecha de notificación de un trámite").located(By.xpath("//*[@id='NotificacionDate']/input/following-sibling::span"));


}
