package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

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



    //region Target para los campos
    public static Target MATRICULA_O_NOMBRE_DEL_PRESTADOR = Target.the("Campo para ingresar la matrícula o nombre del prestador").located(By.xpath("//input[@id='s2id_autogen2']"));

    public static Target EMAIL = Target.the("Email en el colapsable Prestación").located(By.id("Email"));

    public static Target HISTORIA_DE_SITUACION_TERAPEUTICA = Target.the("Input de la Historia de Situación Terapeutica").located(By.xpath("//body[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/input[1]"));

    public static Target DIAGNOSTICO_INGRESO = Target.the("Input Diiagnóstico Ingreso").located(By.xpath("//*[@id='s2id_DiagnosticSelectedValue']/ul/li[1]/div"));

    public static Target DIAGNOSTICO_INGRESO_RE = Target.the("Input Diagnóstico Ingreso para rango etario").located(By.xpath("    //*[@id='s2id_autogen9']"));

    public static Target EFECTOR = Target.the("Número y Nombre del Efector").located(By.xpath("//input[@id='s2id_autogen24']"));

    public static Target EFECTOR_RE = Target.the("Número y Nombre del Efector para rango etario").located(By.xpath("//*[@id='s2id_autogen26']"));

    public static Target PRODUCTO = Target.the("Producto. Ingrese el código o nombre del producto").located(By.xpath("//body[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/input[1]"));

    public static Target CANTIDAD = Target.the("Cantidad").located(By.xpath("//input[@id='Quantity']"));

    public static Target DIAGNOSTICO = Target.the("Diagnostico").located(By.xpath("//body[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/ul[1]/li[1]/input[1]\n"));

    public static Target NRO_DE_SOLICITUD = Target.the("Nro. de Solicitud").located(By.xpath("//input[@id='SelectedProposalNumber']"));
    //endregion


}
