package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.abilities;

import net.serenitybdd.screenplay.Ability;

public class UsuarioLogin implements Ability {
    private static String nombre;
    private static String contrasenia;
    private static String email;
    private static UsuarioLogin instance;

    private UsuarioLogin() {
        nombre = "svcAutomatPsal";
        contrasenia = "AP+2021lr";
        email = "svcAutomatPsal@sancorseguros.com";
    }

    public static UsuarioLogin cargarUsuario() {
        if (instance == null) {
            instance = new UsuarioLogin();
        }
        return instance;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getContrasenia() {
        return contrasenia;
    }

    public static String getEmail() {
        return email;
    }
}
