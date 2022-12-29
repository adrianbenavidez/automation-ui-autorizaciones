package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubMenu {

    public static Target CARGA_LOGISTICA_DE_SOLICITUDES = Target.the("Carga logística de Solicitudes").located(By.xpath("//a[contains(text(),'Carga logística de Solicitudes')]"));
    public static Target CARGA_DIRECTA_AUTORIZACIONES = Target.the("Carga directa  de Solicitudes").located(By.xpath("//a[contains(text(),'Solicitudes Directas')]"));
    public static Target CARGA_SOLICITUD_REINTEGRO = Target.the("Nueva Solicitud reintegro").located(By.xpath("//a[contains(text(),'Cargar Solicitud')]"));
    public static Target NUEVO_PROCESO_BATCH = Target.the("NuevoBatch").located(By.xpath("//a[contains(text(),'Nuevo Proceso')]"));
    public static Target LISTA_BATCHS = Target.the("ListaBatchs").located(By.xpath("//a[contains(text(),'Lista de Procesos')]"));
    public static Target GESTION_AFILIADOS = Target.the("GESTIÓN AFILIADOS").located(By.xpath("//a[contains(text(),'Gestión de Afiliados')]"));


    //region Target para submenu
    public static Target SOLICITUDES_DIRECTAS = Target.the("Solicitudes Directas").located(By.xpath("//a[contains(text(),'Solicitudes Directas')]"));

    public static Target GRILLA_DE_SUPERVISION = Target.the("Grilla de supervisión").located(By.xpath("//a[contains(text(),'Grilla de supervisión')]"));
    //endregion


}
