package com.gruposancorseguros.natalpsal.automatizacionesUI.steps.autorizaciones.cargaDirectaDeSolicitudes;

import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.ScreenplaySetup;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions.ElAtributo;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions.ElElemento;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions.ElSubTexto;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.questions.ElTexto;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.tasks.*;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.tasks.Buscar;
import com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.*;

public class CargaDirectaDeSolicitudesStepDef {

    private Actor elUsuarioRegistrado;

    @Before
    public void prepararElEscenario() {
        ScreenplaySetup.cargarElEscenario("usuarioAutorizado");
        elUsuarioRegistrado = ScreenplaySetup.obtenerActor();
    }

    @Cuando("selecciona la opción Solicitudes Directas del menu Autorizaciones")
    public void seleccionaLaOpcionSolicitudesDirectasDelMenuAutorizaciones() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.AUTORIZACIONES, SubMenu.SOLICITUDES_DIRECTAS));
    }

    @Cuando("ingresa el afiliado (.*)")
    public void ingresaElAfiliado(String afiliado) {
        elUsuarioRegistrado.attemptsTo(Buscar.afiliado(afiliado));
    }

    @Cuando("selecciona la opción Medicamentos en el radioButton Tipo de Autorización")
    public void seleccionaLaOpcionMedicamentosEnElRadioButtonTipoDeAutorizacion() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.TIPO_DE_AUTORIZACION_MEDICAMENTOS));
    }


    @Entonces("accede a la pantalla Solicitud Directa")
    public void accedeALaPantallaSolicitudDirecta() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.SOLICITUD_DIRECTA), equalTo("Solicitud directa")));
    }

    @Entonces("se muestra el colapsable con la información del Afiliado")
    public void seMuestraElColapsableConLaInformacionDelAfiliado() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.INFORMACION_DEL_AFILIADO), equalTo("Información del Afiliado")));
    }

    @Entonces("se muestra la opción Urgencia Medica")
    public void seMuestraLaOpcionUrgenciaMedica() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.URGENCIA_MEDICA), equalTo("Urgencia Médica")));
    }

    @Y("selecciona la opción Si")
    public void seleccionaLaOpcionSi() {
        //elUsuarioRegistrado.attemptsTo(WaitUntil.the(RadioButton.URGENCIA_MEDICA_SI, isVisible()).forNoMoreThan(20).seconds());
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.URGENCIA_MEDICA_SI));
    }

    @Cuando("completa el email (.*)")
    public void completaElEmail(String email) {
        elUsuarioRegistrado.attemptsTo(IngresarElValor.enEl(Campo.EMAIL, email));
    }

    @Y("tilda la opción Información no disponible en Prescriptor")
    public void YLaOpcionInformacionNoDisponibleEnPrescriptor() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(CheckBox.INFORMACION_NO_DISPONIBLE));
    }

    @Entonces("se oculta el campo para ingresar la matricula o nombre del prescriptor")
    public void seOcultaElCampoParaIngresarLaMatriculaONombreDelPrescriptor() {
        elUsuarioRegistrado.asksFor(ElElemento.estaOculto(Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR));
        //elUsuarioRegistrado.should(seeThat(ElTexto.de(Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR), nullValue()));
    }

    @Cuando("ingresa en la sección Detalle Historia de Situación Terapeutica (.*)")
    public void ingresaEnLaSeccionDetalleHistoriaDeSituacionTerapeuticaSituacionTerapeutica(String situacionTerapeutica) {
        elUsuarioRegistrado.attemptsTo(BuscarYCargar.en(Campo.HISTORIA_DE_SITUACION_TERAPEUTICA, situacionTerapeutica));
    }

    @Entonces("se completa automaticamente el campo Diagnóstico")
    public void seCompletaAutomaticamenteElCampoDiagnostico() {
        //elUsuarioRegistrado.asksFor(ElElemento.estaOculto(Campo.DIAGNOSTICO_INGRESO));
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Campo.DIAGNOSTICO_INGRESO), notNullValue()));
    }

    @Y("agrega el Efector (.*)")
    public void agregaElEfector(String efector) {
        elUsuarioRegistrado.attemptsTo(BuscarYCargar.en(Campo.EFECTOR, efector));
    }

    @Cuando("busca un Producto (.*) que valida el sexo del afiliado")
    public void buscaUnProductoQueValidaElSexoDelAfiliado(String producto) {
        elUsuarioRegistrado.attemptsTo(BuscarYCargar.en(Campo.PRODUCTO, producto));
    }

    @E("indica la cantidad (.*)")
    public void indicaLaCantidad(String cantidad) {
        elUsuarioRegistrado.attemptsTo(IngresarElValor.enEl(Campo.CANTIDAD, cantidad));
    }

    @Y("presiona el botón agregar")
    public void presionaElBotonAgregar() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.ICONO_AGREGAR));
    }

    @Entonces("se muestra el mensaje de validación de sexo")
    public void seMuestraElMensajeDeValidacionDeSexo() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.MENSAJE_ERROR_SEXO), equalTo("Medicamento fuera de cobertura porque no corresponde al sexo biológico del afiliado")));
    }

    @Cuando("presiona el botón Aceptar")
    public void presionaElBotonAceptar() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.ACEPTAR_MENSAJE_ERROR_SEXO));
    }

    @Entonces("se cierra la ventana emergente")
    public void seCierraLaVentanaEmergente() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.NO_SE_HAN_AGREGADO_PRODUCTOS), equalTo("No se han agregado productos.")));
    }

    @Y("selecciona la opción No")
    public void seleccionaLaOpcionNo() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.URGENCIA_MEDICA_NO));
    }

    @Entonces("se agrega el producto")
    public void seAgregaElProducto() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Tabla.CELDA_PRODUCTO)));
    }

    @Y("se muestra el enlace para obtener mayor información")
    public void seMuestraElEnlaceParaObtenerMayorInformacion() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Enlace.PARA_MAYOR_INFORMACION), equalTo("Para mayor información sobre el producto, haga click aquí")));
    }

    @Y("agrega un archivo en la sección documentación")
    public void agregarUnArchivoEnLaSeccionDocumentacion() {

        elUsuarioRegistrado.attemptsTo(CargarArchivo.en());
    }

    @Y("selecciona Aceptar en auditoría médica")
    public void seleccionaAceptarEnAuditoriaMedica() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.AUDITORIA_MEDICA_ACEPTAR));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.ACEPTAR_SOLICITUD_DIRECTA));
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Enlace.PARA_MAYOR_INFORMACION), equalTo("Para mayor información sobre el producto, haga click aquí")));
    }

    @Y("presiona aceptar la solicitud")
    public void presionaAceptarLaSolicitud() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.ACEPTAR_SOLICITUD_DIRECTA));
    }

    @Entonces("accede se informa el numero de Autorización")
    public void accedeSeInformaElNumeroDeAutorizacion() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.TITULO_NUMERO_DE_AUTORIZACION), containsString("Registrar Solicitud de Autorización N°")));

    }

    @Cuando("ingresa el código de afiliado (.*)")
    public void ingresaElCodigoDeAfiliadoAfiliado(String afiliado) {
        elUsuarioRegistrado.attemptsTo(Buscar.afiliado(afiliado));
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.INFORMACION_DEL_AFILIADO), equalTo("Información del Afiliado")));
    }


    @Y("selecciona el tipo de Autorización")
    public void seleccionaElTipoDeAutorizacion() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.TIPO_DE_AUTORIZACION_MEDICAMENTOS));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.URGENCIA_MEDICA_NO));
    }

    @Y("completa los demás campos obligatorios Email (.*), Situación Terapeutica (.*) y diagnostico")
    public void completaLosDemasCamposObligatoriosEmailSituacionTerapeuticaDiagnostico(String email, String st) {
       /* elUsuarioRegistrado.attemptsTo(IngresarElValor.enEl(Campo.EMAIL, email));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(CheckBox.INFORMACION_NO_DISPONIBLE));
        elUsuarioRegistrado.asksFor(ElElemento.estaOculto(Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR));
        elUsuarioRegistrado.attemptsTo(BuscarYCargar.en(Campo.HISTORIA_DE_SITUACION_TERAPEUTICA, st));
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Campo.DIAGNOSTICO_INGRESO), notNullValue()));
        */
        elUsuarioRegistrado.attemptsTo(CompletarDatosObligatorios.en(Campo.EMAIL, Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR, Campo.HISTORIA_DE_SITUACION_TERAPEUTICA, Campo.DIAGNOSTICO_INGRESO, email, st));

    }

    @E("ingresa un Producto (.*) y la cantidad (.*)")
    public void ingresaUnProductoProductoYLaCantidadCantidad(String producto, String cantidad) {
        elUsuarioRegistrado.attemptsTo(BuscarYCargar.en(Campo.PRODUCTO, producto));
        elUsuarioRegistrado.attemptsTo(IngresarElValor.enEl(Campo.CANTIDAD, cantidad));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.ICONO_AGREGAR));
    }

    @Entonces("se visualiza el mensaje de validación {string}")
    public void seVisualizaElMensajeDeValidacion(String mensaje) {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.MENSAJE_ERROR_SEXO), equalTo(mensaje)));
    }


    @Y("completa los demás campos obligatorios Email (.*), Situación Terapeutica (.*)")
    public void completaLosDemasCamposObligatoriosEmailSituacionTerapeutica(String email, String st) {
       /* elUsuarioRegistrado.attemptsTo(IngresarElValor.enEl(Campo.EMAIL, email));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(CheckBox.INFORMACION_NO_DISPONIBLE));
        elUsuarioRegistrado.asksFor(ElElemento.estaOculto(Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR));
        elUsuarioRegistrado.attemptsTo(BuscarYCargar.en(Campo.HISTORIA_DE_SITUACION_TERAPEUTICA, st));
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Campo.DIAGNOSTICO_INGRESO), notNullValue()));
        */
        elUsuarioRegistrado.attemptsTo(CompletarDatosObligatorios.en(Campo.EMAIL, Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR, Campo.HISTORIA_DE_SITUACION_TERAPEUTICA, Campo.DIAGNOSTICO_INGRESO, email, st));

    }


    @Y("completa los demás campo obligatorios Email (.*), Situación Terapeutica (.*), Diagnostico (.*) y Efector (.*)")
    public void completaLosDemasCampoObligatoriosEmailEmailSituacionTerapeuticaSituacionTerapeuticaDiagnosticoYEfector(String email, String st, String diagnostico, String efector) {
    /* elUsuarioRegistrado.attemptsTo(IngresarElValor.enEl(Campo.EMAIL, email));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(CheckBox.INFORMACION_NO_DISPONIBLE));
        elUsuarioRegistrado.asksFor(ElElemento.estaOculto(Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR));
        elUsuarioRegistrado.attemptsTo(BuscarYCargar.en(Campo.HISTORIA_DE_SITUACION_TERAPEUTICA, st));
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Campo.DIAGNOSTICO_INGRESO), notNullValue()));
        */
        elUsuarioRegistrado.attemptsTo(CompletarDatosObligatoriosDiagnostico.en(Campo.EMAIL, Campo.MATRICULA_O_NOMBRE_DEL_PRESTADOR, Campo.HISTORIA_DE_SITUACION_TERAPEUTICA, Campo.DIAGNOSTICO, Campo.EFECTOR, email, st, diagnostico, efector));

    }

    @Entonces("se visualiza debajo del producto agregado el mensaje {string}")
    public void seVisualizaDebajoDelProductoAgregadoElMensaje(String mensaje) {


        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.TEXTO_ALERTA_FARMACIA)));

        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_ALERTA_FARMACIA));

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.TEXTO_PARA_MAYOR_INFORMACION), equalTo(mensaje)));
    }

    @Cuando("selecciona Rechazar en auditoría médica")
    public void seleccionaRechazarEnAuditoriaMedica() {


    }

    @Cuando("selecciona Rechazar en auditoría médica, indicando el motivo (.*)")
    public void seleccionaRechazarEnAuditoriaMedicaIndicandoElMotivoMotivo(String motivo) {
       /* elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.AUDITORIA_MEDICA_RECHAZAR));
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(ListaDesplegable.MOTIVO_DE_RECHAZO, isVisible()).forNoMoreThan(120).seconds());
        elUsuarioRegistrado.attemptsTo(Recorrer.losElementosDe(ListaDesplegable.MOTIVO_DE_RECHAZO).ySeleccionarLaOpcion(motivo));*/
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.AUDITORIA_MEDICA_RECHAZAR));

        elUsuarioRegistrado.attemptsTo(WaitUntil.the(ListaDesplegable.MOTIVO_DE_RECHAZO, isVisible()).forNoMoreThan(120).seconds());
        elUsuarioRegistrado.attemptsTo(HacerClick.en(ListaDesplegable.MOTIVO_DE_RECHAZO));

        elUsuarioRegistrado.attemptsTo(WaitUntil.the(ListaDesplegable.AFILIADO_EN_MORA, isVisible()).forNoMoreThan(120).seconds());
        elUsuarioRegistrado.attemptsTo(HacerClick.en(ListaDesplegable.AFILIADO_EN_MORA));


        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.ACEPTAR_SOLICITUD_DIRECTA));
    }


    @Cuando("selecciona Derivar a auditoría médica, indicando que se Deriva a: (.*)")
    public void seleccionaDerivarAAuditoriaMedicaIndicandoQueSeDerivaAAuditoriaMedicaNivel(String nivel) {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.AUDITORIA_MEDICA_DERIVAR));
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(ListaDesplegable.DERIVAR_A, isVisible()).forNoMoreThan(120).seconds());
        elUsuarioRegistrado.attemptsTo(HacerClick.en(ListaDesplegable.DERIVAR_A));
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(ListaDesplegable.DERIVAR_NIVEL2, isVisible()).forNoMoreThan(120).seconds());
        elUsuarioRegistrado.attemptsTo(HacerClick.en(ListaDesplegable.DERIVAR_NIVEL2));
        //elUsuarioRegistrado.attemptsTo(Recorrer.losElementosDe(ListaDesplegable.DERIVAR_A).ySeleccionarLaOpcion(nivel));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.ACEPTAR_SOLICITUD_DIRECTA));
    }

    @Entonces("se informa registro exitoso")
    public void seInformaRegistroExitoso() {

        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.REGISTRO_EXITOSO, isVisible()).forNoMoreThan(240).seconds());

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.REGISTRO_EXITOSO), containsString("Registro exitoso")));

        elUsuarioRegistrado.remember("numeroSolicitud", ElSubTexto.de(Etiqueta.REGISTRO_EXITOSO_NRO_SOLICITUD));
    }

    @Cuando("selecciona la opción Grilla de supervisión del menu Autorizaciones")
    public void seleccionaLaOpcionGrillaDeSupervisionDelMenuAutorizaciones() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.AUTORIZACIONES, SubMenu.GRILLA_DE_SUPERVISION));
    }

    @Entonces("accede a la pantalla Grilla de supervisión de solicitudes")
    public void accedeALaPantallaGrillaDeSupervisionDeSolicitudes() {
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.GRILLA_DE_SUPERVISION_DE_SOLICITUDES), equalTo("Grilla de supervisión de solicitudes")));
    }


    @Cuando("consulta una solicitud")
    public void consultaUnaSolicitud() {
        String soli = elUsuarioRegistrado.recall("numeroSolicitud");
        elUsuarioRegistrado.attemptsTo(IngresarElValor.enEl(Campo.NRO_DE_SOLICITUD, soli));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_ANCLA));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_BUSCAR_SOLICITUD));

        //System.out.println("Numero de solicitud recordada: " + soli);
    }

    @Entonces("se muestra la informacion de la solicitud (.*)")
    public void seMuestraLaInformacionDeLaSolicitudNivel(String estado) {

        switch (estado) {
            case "Nivel 2":
                elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.GSS_NIVEL), equalTo(estado)));
                break;
            case "Registrar Autorizacion y Notificar":
                elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.GSS_ESTADO_REGISTRAR_AUTORIZACION_Y_NOTIFICAR), equalTo(estado)));
                break;
        }


    }

    @Cuando("se gestiona la solicitud y se acepta el dictamen")
    public void seGestionaLaSolicitudYSeAceptaElDictamen() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.CHECK_FILA_SOLICITUD));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_GESTIONAR_SOLICITUD));


        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.AUDITAR_SOLICITUD), containsString("Auditar Solicitud de Autorización")));


        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.TEXTO_PARA_MAYOR_INFORMACION_LINK, isVisible()).forNoMoreThan(240).seconds());

        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_GUARDAR));

    }

    @Entonces("regresa a la pantalla grilla de supervisión de solicitudes pero con el estado: Registrar autorización y notificar")
    public void regresaALaPantallaGrillaDeSupervisionDeSolicitudesPeroConElEstadoRegistrarAutorizacionYNotificar() {

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.TITULO_GRILLA_SUPERVISION_DE_SOLICITUDES), containsString("Grilla de supervisión de solicitudes")));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_BUSCAR_SOLICITUD));

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.GSS_ESTADO_REGISTRAR_AUTORIZACION_Y_NOTIFICAR), equalTo("Registrar Autorizacion y Notificar")));

    }

    @Cuando("se gestiona la solicitud")
    public void seGestionaLaSolicitud() {
        elUsuarioRegistrado.attemptsTo(HacerClick.en(RadioButton.CHECK_FILA_SOLICITUD));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_GESTIONAR_SOLICITUD));

    }

    @Entonces("se muestra la información del afiliado, de la solicitud y los productos")
    public void seMuestraLaInformacionDelAfiliadoDeLaSolicitudYLosProductos() {

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.TITULO_NUMERO_DE_AUTORIZACION), containsString("Registrar Solicitud de Autorización")));

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.INFORMACION_DEL_AFILIADO), containsString("Información del Afiliado")));

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.GSS_CODIGO), containsString("17887")));

        elUsuarioRegistrado.should(seeThat(ElAtributo.de(Etiqueta.EMAIL), containsString("hbenavidez@ext.sancorseguros.com")));

    }

    @Cuando("se registra y notifica")
    public void seRegistraYNotifica() {

        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_REGISTRAR_Y_NOTIFICAR));
    }

    @Entonces("se genera la autorización")
    public void seGeneraLaAutorizacion() {

        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.MENSAJE_RESULTADO_OPERACION), containsString("Se ha generado la autorización")));
        elUsuarioRegistrado.attemptsTo(HacerClick.en(Boton.BOTON_ACEPTAR));

        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.TITULO_AUTORIZACION, isVisible()).forNoMoreThan(240).seconds());
        elUsuarioRegistrado.should(seeThat(ElTexto.de(Etiqueta.TITULO_AUTORIZACION), containsString("Autorización")));
    }
}
