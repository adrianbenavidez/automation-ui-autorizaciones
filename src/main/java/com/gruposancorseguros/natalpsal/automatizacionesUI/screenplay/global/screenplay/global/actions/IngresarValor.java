package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.actions;

import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks.EnElCampoContrasenia;
import com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.tasks.EnElCampoUsuario;

public class IngresarValor {

    private static String valor;

    public IngresarValor(String valor) {
        IngresarValor.valor = valor;
    }

    public static EnElCampoUsuario enElCampoUsuario(String valor) {
        return new EnElCampoUsuario(valor);
    }

    public static EnElCampoContrasenia enElCampoPassword(String valor) {
        return new EnElCampoContrasenia(valor);
    }
}
