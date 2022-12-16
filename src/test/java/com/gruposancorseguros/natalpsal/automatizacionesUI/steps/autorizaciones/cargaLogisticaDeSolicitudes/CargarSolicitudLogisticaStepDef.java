package com.gruposancorseguros.natalpsal.autorizaciones.steps.cargaLogisticaDeSolicitudes;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks.HacerClick;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks.IngresarElValor;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.tasks.Buscar;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.cargaLogisticaDeSolicitudes.tasks.DarDeAlta;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.ui.*;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.ScreenplaySetup;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.questions.ElTexto;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks.Ingresar;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class CargarSolicitudLogisticaStepDef {

    private Actor elUsuarioRegistrado;
    Date someDate = new Date();
    Date someDate2 = new Date();

    Date newDate = new Date(someDate.getTime() + TimeUnit.DAYS.toMillis( -1 ));
    Date egDate = new Date(someDate2.getTime() + TimeUnit.DAYS.toMillis( 1 ));

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    String strDate= formatter.format(newDate);
    String strDate2= formatter.format(egDate);


    @Before
    public void prepararElEscenario() {
        ScreenplaySetup.cargarElEscenario("usuarioAutorizado");
        elUsuarioRegistrado = ScreenplaySetup.obtenerActor();
    }

    @Cuando("selecciona la opcion Carga Logistica de Solicitudes del menu Autorizaciones")
    public void selecciona_la_opcion_Carga_Logistica_de_Solicitudes_del_menu_Autorizaciones() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.AUTORIZACIONES, SubMenu.CARGA_LOGISTICA_DE_SOLICITUDES));
    }

    @Cuando("ingresa afiliado (.*)")
    public void ingresa_afiliado(String afiliado) {

        elUsuarioRegistrado.attemptsTo(Buscar.afiliado(afiliado));
    }

    @Cuando("carga una solicitud del tipo (.*)")
    public void carga_una_solicitud_del_tipo (String tipoAutorizacion) {
        //System.out.println("Post carga afiliado");
        elUsuarioRegistrado.attemptsTo(DarDeAlta.unaSolicitudlogistica(tipoAutorizacion));

    }

    @Cuando("carga una autorización de tipo {string}")
    public void carga_una_autorizacion_del_tipo (String tipoAutorizacion) {

        elUsuarioRegistrado.attemptsTo(DarDeAlta.unaSolicitudlogistica(tipoAutorizacion));

    }




    @Entonces("visualiza un mensaje indicando que la solicitud se creo correctamente")
    public void visualiza_un_mensaje_indicando_que_la_solicitud_se_creo_correctamente() {
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(PopUp.MENSAJE_CARGA_LOGISTICA_EXITOSA, isVisible()).forNoMoreThan(40).seconds());
        elUsuarioRegistrado.should(seeThat((ElTexto.de(PopUp.MENSAJE_CARGA_LOGISTICA_EXITOSA)), equalTo("Registro exitoso")));

    }
    @Dado("que existe una solicitud logistica para el afiliado: (.*)")
    public void que_existe_una_solicitud_logistica_para_el_afiliado(String afiliado) {

        elUsuarioRegistrado.wasAbleTo(Ingresar.al(Menu.AUTORIZACIONES, SubMenu.CARGA_LOGISTICA_DE_SOLICITUDES));
        elUsuarioRegistrado.wasAbleTo(Buscar.afiliado(afiliado));

    }
    @Y("es del tipo: (.*)")
    public  void es_del_tipo(String tipoAutorizacion)
    {
        elUsuarioRegistrado.wasAbleTo(DarDeAlta.unaSolicitudlogistica(tipoAutorizacion));
    }


    @Cuando("selecciona la opcion solicitudes directas del menu Autorizaciones")
    public void seleccionaLaOpcionSolicitudesDirectasDelMenuAutorizaciones() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.AUTORIZACIONES, SubMenu.CARGA_DIRECTA_AUTORIZACIONES));
    }

    @Entonces("visualiza un mensaje que se encuentra en el submenú de directas")
    public void visualizaUnMensajeQueSeEncuentraEnElSubmenúDeDirectas() {
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.MENU_SUBDIRECTA, isVisible()).forNoMoreThan(40).seconds());

    }

    @Cuando("selecciona la opcion Carga solicitud de reintegro del menu Reintegro")
    public void seleccionaLaOpcionCargaSolicitudDeReintegroDelMenuReintegro() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.REINTEGROS, SubMenu.CARGA_SOLICITUD_REINTEGRO));
    }

    @Entonces("visualiza un mensaje indicando que se encuentre el submenu cagar solicitud de reintegro")
    public void visualizaUnMensajeIndicandoQueSeEncuentreElSubmenuCagarSolicitudDeReintegro() {
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.MENU_REINTEGROS, isVisible()).forNoMoreThan(40).seconds());

    }

    @Cuando("selecciona la opcion Nuevo proceso del menú procesos batch")
    public void seleccionaLaOpcionNuevoProcesoDelMenúProcesosBatch() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.PROCESOS_BATCH, SubMenu.NUEVO_PROCESO_BATCH));
    }

    @Entonces("visualiza un mensaje indicando que se encuentre el submenu nuevo poceso del menú procesos batch")
    public void visualizaUnMensajeIndicandoQueSeEncuentreElSubmenuNuevoPocesoDelMenúProcesosBatch() {
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.MENU_BATCH, isVisible()).forNoMoreThan(40).seconds());
    }

    @Cuando("selecciona la opcion Listas de procesos del menú procesos batch")
    public void seleccionaLaOpcionListasDeProcesosDelMenúProcesosBatch() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.PROCESOS_BATCH, SubMenu.LISTA_BATCHS));
    }

    @Entonces("visualiza un mensaje indicando que se encuentre el submenu listas de pocesos del menú procesos batch")
    public void visualizaUnMensajeIndicandoQueSeEncuentreElSubmenuListasDePocesosDelMenúProcesosBatch() {
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.LISTA_BATCHS, isVisible()).forNoMoreThan(40).seconds());
    }

    @Cuando("selecciona la opcion Gestión de afiliados del menú Afiliaciones")
    public void seleccionaLaOpcionGestiónDeAfiliadosDelMenúAfiliaciones() {
        elUsuarioRegistrado.attemptsTo(Ingresar.al(Menu.AFILIACIONES, SubMenu.GESTION_AFILIADOS));
    }

    @Entonces("visualiza un mensaje indicando que se encuentre el submenu gestión de afiliados del menú afiliaciones")
    public void visualizaUnMensajeIndicandoQueSeEncuentreElSubmenuGestiónDeAfiliadosDelMenúAfiliaciones() {
        elUsuarioRegistrado.attemptsTo(WaitUntil.the(Etiqueta.GESTION_AFILIADOS, isVisible()).forNoMoreThan(40).seconds());

    }
}
