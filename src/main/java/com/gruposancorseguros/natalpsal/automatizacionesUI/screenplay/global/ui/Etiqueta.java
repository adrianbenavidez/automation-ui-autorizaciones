package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Etiqueta {

    public static Target ESPERANDO_RESULTADO = Target.the("Mensaje de buscando en selector de afiliado").located(By.xpath("//*[@class='select2-searching']"));
    public static Target PRACTICA_AMBULATORIA = Target.the("Etiqueta radio button práctica ambulatoria").located(By.xpath("(//div[@class=\"iradio_natal\"])[1]"));
    public static Target AMBULATORIA_DIRECTA = Target.the("Etiqueta radio button práctica ambulatoria Directa").located(By.xpath(("(//div[@class=\"iradio_natal\"])[1]")));
    public static Target INTERNACION = Target.the("Etiqueta radio button internación").located(By.xpath("(//div[@class=\"iradio_natal\"])[2]"));
    public static Target PROTESIS = Target.the("Etiqueta radio button prótesis").located(By.xpath("(//div[@class=\"iradio_natal\"])[3]"));


    public static Target MENU_SUBDIRECTA = Target.the("Etiqueta subdirectas").located(By.xpath("//h1[contains(text(),'Solicitud directa')]"));
    public static Target MENU_REINTEGROS = Target.the("Etiqueta pantalla reintegros nueva solicitud").located(By.xpath("//label[contains(text(),'Nro, apellido y nombre o cuil/cuit')]"));
    public static Target MENU_BATCH = Target.the("Etiqueta nuevo batch").located(By.xpath("//label[contains(text(),'Tipo de archivo')]"));
    public static Target LISTA_BATCHS = Target.the("Etiqueta lista batchs").located(By.xpath("//a[contains(text(),'Crear Lote')]"));
    public static Target GESTION_AFILIADOS = Target.the("Etiqueta gestión afiliados").located(By.xpath("//h2[contains(text(),'Busqueda de Afiliados')]"));


}
