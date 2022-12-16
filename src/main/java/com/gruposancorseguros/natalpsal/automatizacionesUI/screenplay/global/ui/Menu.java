package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Menu {

    public static Target AUTORIZACIONES = Target.the("Autorizaciones").located(By.xpath("//a[contains(text(),'Autorizaciones')]"));

    public static final Target COBERTURAS = Target.the("Menú Coberturas").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Coberturas')]"));
    public static final Target SOLICITUD_AFILIACION = Target.the("Menú Solicitud de afiliación").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Solicitud Afiliac')]"));
    public static final Target INCORPORACIONES = Target.the("Menú incorporaciones").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Incorporaciones')]"));
    public static final Target OBRAS_SOCIALES = Target.the("Menú Obras Sociales").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@role='button' and contains(text(),'Obra')]"));
    public static final Target REPORTES = Target.the("Menú Reportes").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@href='/Report' and contains(text(),'Reportes')]"));
    public static final Target AFILIACIONES = Target.the("Menú Afiliaciones").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@role='button' and contains(text(),'Afiliaciones')]"));
    public static final Target CREDENCIALES = Target.the("Menú Cedenciales").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@role='button' and contains(text(),'Reintegros')]"));
    public static final Target FACTURACION = Target.the("Menú Factuación").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@role='button' and contains(text(),'Facturacion')]"));
    public static final Target CONTROL_PRESTACIONAL = Target.the("Menú Control prestacional").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@role='button' and contains(text(),'Control Prestacional')]"));
    public static final Target FARMACIAS = Target.the("Menú Farmacias").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@role='button' and contains(text(),'Farmacias')]"));
    public static final Target HOME = Target.the("Menú Home").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'zz')]"));

    public static final Target PRESTADORES = Target.the("Menú Prestadores").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Prestadores')]"));
    public static final Target RECETAS = Target.the("Menú Recetas").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Recetas')]"));
    public static final Target CONSULTAS = Target.the("Menú Consultas").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Consultas')]"));
    public static final Target AUDITORIA_FACT = Target.the("Menú Auditoria Facturación").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Auditoria')]"));
    public static final Target DOCUMENTACION= Target.the("Menú Documentacion").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Documentación')]"));
    public static final Target GESTION_SUR = Target.the("Menú Gestion Sur").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Gestión SUR')]"));
    public static final Target EXPEDIENTES = Target.the("Menú Expedientes").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Expedientes')]"));
    public static final Target PROCESOS_BATCH = Target.the("Menú Procesos Batch").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Batch')]"));
    public static final Target TARIFAS = Target.the("Menú Tarifas").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Tarifas')]"));
    public static final Target CENSOS = Target.the("Menú Censos").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Censos')]"));
    public static final Target RECIBOS = Target.the("Menú Recibos").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Recibos')]"));
    public static final Target FIDELIZACION_CLIENTES = Target.the("Menú Fidelizacion").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Fidelización')]"));
    public static final Target COBRANZAS = Target.the("Menú COBRANZAS").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Cobranzas')]"));
    public static final Target PADRONES = Target.the("Menú PADRONES").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Padrones')]"));
    public static final Target REINTEGROS = Target.the("Menú Reintegros").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Reintegros')]"));
    public static final Target CONVENIOS = Target.the("Menú CONVENIOS").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Convenios')]"));
    public static final Target PRESAGIO = Target.the("Menú PRESAGIO").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Presagio')]"));
    public static final Target GEST_APORTES = Target.the("Menú Gestión de aportes").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Aportes')]"));
    public static final Target COMERCIAL_CORPORACION = Target.the("MENÚ Comercial Corporacion").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Corpo')]"));
    public static final Target PRELIQUIDACION = Target.the("Menú Peliquidación").located(net.serenitybdd.core.annotations.findby.By.xpath("//a[contains(text(),'Preliquidación')]"));




}
