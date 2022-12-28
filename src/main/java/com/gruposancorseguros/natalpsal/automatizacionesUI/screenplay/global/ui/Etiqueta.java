package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

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






    //region Etiquetas Productos
    public static Target SOLICITUD_DIRECTA = Target.the("Titulo Solicitud Directa").located(By.xpath("//h1[contains(text(),'Solicitud directa')]"));

    public static Target INFORMACION_DEL_AFILIADO = Target.the("Titulo del colapsable Información del Afiliado").located(By.xpath("//a[contains(text(),'Información del Afiliado')]"));

    public static Target URGENCIA_MEDICA = Target.the("Titulo del radio button Urgencia Médica").located(By.xpath("//label[contains(text(),'Urgencia Médica')]"));

    public static Target MENSAJE_ERROR_SEXO = Target.the("Mensaje de error para la validación del sexo").located(By.xpath("//p[contains(text(),'Medicamento fuera de cobertura porque no correspon')]"));

    public static Target NO_SE_HAN_AGREGADO_PRODUCTOS = Target.the("Mensaje indicando que no se han agregado productos").located(By.xpath("//p[contains(text(),'No se han agregado productos.')]"));

    public static Target TITULO_NUMERO_DE_AUTORIZACION = Target.the("Titulo con el número de Autorización").located(By.xpath("//h1[contains(text(),'Registrar Solicitud de Autorización N°')]"));

    public static Target TEXTO_PARA_MAYOR_INFORMACION = Target.the("Texto para mayor información sobre el producto, haga click aquí").located(By.xpath("//body/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/fieldset[1]/div[2]/div[1]/p[1]"));

    public static Target MENSAJE_ERROR_RANGO_ETARIO = Target.the("Mensaje de error para la validación del sexo").located(By.xpath("//p[contains(text(),'Afiliado se encuentra fuera del rango etario habil')]"));

    public static Target REGISTRO_EXITOSO = Target.the("Registro exitoso").located(By.xpath("/html/body/div/div/h4"));

    public static Target REGISTRO_EXITOSO_NRO_SOLICITUD = Target.the("Registro exitoso número de solicitud").located(By.xpath("//strong[contains(text(),'N°')]"));

    public static Target TEXTO_ALERTA_FARMACIA = Target.the("Texto alerta farmacia").located(By.xpath("//body[1]/section[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[6]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]"));

    public static Target GRILLA_DE_SUPERVISION_DE_SOLICITUDES = Target.the("Titulo Grilla de supervisión de solicitudes").located(By.xpath("//h1[contains(text(),'Grilla de supervisión de solicitudes')]"));

    public static Target GSS_NIVEL = Target.the("Columna Nivel en la Grilla de supervisión de solicitudes").located(By.xpath("//td[contains(text(),'Nivel 2')]"));

    public static Target GSS_ESTADO_REGISTRAR_AUTORIZACION_Y_NOTIFICAR = Target.the("Columna Nivel en la Grilla de supervisión de solicitudes").located(By.xpath("//td[contains(text(),'Registrar Autorizacion y Notificar')]"));

    public static final Target AUDITAR_SOLICITUD = Target.the("Titulo Auditar Solicitud").located(By.xpath("//h1[contains(text(),'Auditar Solicitud de Autorización')]"));

    public static final Target TITULO_GRILLA_SUPERVISION_DE_SOLICITUDES = Target.the("Titulo Grilla de supervisión de solicitudes").located(By.xpath("//h1[contains(text(),'Grilla de supervisión de solicitudes')]"));

    public static Target GSS_CODIGO = Target.the("Columna Código en la Grilla de supervisión de solicitudes").located(By.xpath("//td[contains(text(),'17887') and @data-bind='text: Id'] "));

    public static Target GSS_ESTADO_NIVEL_2 = Target.the("Columna Código en la tabla Productos").located(By.xpath("//td[contains(text(),'Nivel 2')]"));

    public static Target EMAIL = Target.the("Email del afiliado").located(By.xpath("//input[@id='EmailAddressAccepted']"));

    public static Target MENSAJE_RESULTADO_OPERACION = Target.the("Mensaje: Se ha generado la autorización").located(By.xpath("//p[@id='registerMessage']"));

    public static Target TITULO_AUTORIZACION = Target.the("Mensaje: Se ha generado la autorización").located(By.xpath("//h1[contains(text(),'Autorización')]"));

    public static Target TEXTO_PARA_MAYOR_INFORMACION_LINK = Target.the("Mensaje: Para mayor información sobre el producto, haga click").located(By.xpath("//a[contains(text(),'aquí')]"));
    //endregion








}
