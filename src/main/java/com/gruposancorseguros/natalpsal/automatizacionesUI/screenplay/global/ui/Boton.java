package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui;

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



}
