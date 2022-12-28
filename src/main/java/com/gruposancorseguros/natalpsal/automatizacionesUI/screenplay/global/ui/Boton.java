package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Boton {
    //inicioDeSesion
    public static final Target INICIAR_SESION = Target.the("Botón Iniciar Sesión").located(By.xpath("//button/span[contains(text(),\"Iniciar sesión\")]"));
    public static final Target NO_ES_MI_CUENTA = Target.the("Botón No es mi cuenta").located(By.xpath("//a[@class='auth0-lock-alternative-link' and @href='javascript:void(0)']"));

    //Carga logistica de solicitudes - //Carga Directa de solicitudes
    public static final Target AGREGAR_ARCHIVO = Target.the("Botón Agregar Archivo").located(By.xpath("//span[@id='add-file']"));
    public static final Target ENVIAR = Target.the("Botón Enviar").located(By.xpath("//button[contains(text(),\"Enviar\")]"));

    public static final Target CON_LOGIN = Target.the("Botón LOGIN").located(By.xpath("//a[contains(text(),'Home')]"));




    //region Botones
    public static final Target ICONO_AGREGAR = Target.the("Icono para agregar").located(By.xpath("//*[@id='collapseProductsBenefitsTemplate']/div/fieldset/div[1]/div[3]/div/button"));

    public static final Target ACEPTAR_MENSAJE_ERROR_SEXO = Target.the("Botón Aceptar en el mensaje de error por la validación de sexo").located(By.xpath("//*[@id='authorizationErrorWithCustomMessage']/div[2]/a"));

    public static final Target ACEPTAR_SOLICITUD_DIRECTA = Target.the("Botón Aceptar solicitud directa").located(By.xpath("//button[@id='save']"));

    public static final Target BOTON_ALERTA_FARMACIA = Target.the("Botón para confirmar que se agrega el producto").located(By.xpath("//button[contains(text(),'Si')]"));

    public static final Target BOTON_ANCLA = Target.the("Botón para anclar el número de la solicitud").located(By.xpath("//body/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]"));

    public static final Target BOTON_BUSCAR_SOLICITUD = Target.the("Botón para buscar una solicitud").located(By.xpath("//button[contains(text(),'Buscar')]"));

    public static final Target BOTON_GESTIONAR_SOLICITUD = Target.the("Botón para gestionar una solicitud").located(By.xpath("//a[@id='manage-action']"));

    public static final Target BOTON_GUARDAR = Target.the("Botón para guardar la auditoria de la autorización").located(By.xpath("//button[@id='save']"));

    public static final Target BOTON_REGISTRAR_Y_NOTIFICAR = Target.the("Botón Registrar y notificar").located(By.xpath("//button[@id='register']"));

    public static final Target BOTON_ACEPTAR = Target.the("Botón Aceptar").located(By.xpath("//a[@id='registerSuccess']"));
    //endregion




}
