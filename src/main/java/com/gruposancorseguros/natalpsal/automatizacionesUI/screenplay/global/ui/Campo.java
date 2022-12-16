package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Campo {
    //Login
    public static Target USUARIO_LOGIN      = Target.the("Campo para ingresar el Usuario").located(By.xpath("//input[@name='username']"));
    public static Target CONTRASENIA_LOGIN  = Target.the("Campo para ingresar la contrasenia").located(By.xpath("//input[@type='password']"));

    //Carga logistica de Solicitudes
    public static Target AFILIADO  = Target.the("Campo para ingresar afiliado").located(By.xpath("//input[@id='s2id_autogen1']"));
    public static Target SELECCIONAR_ARCHIVO  = Target.the("Campo para ingresar ruta archivo").located(By.xpath("//input[@name='files[0]']"));
    public static Target MAIL = Target.the("Campo para ingresar mail").located(By.xpath("//input[(@id = 'Email')] "));




}
