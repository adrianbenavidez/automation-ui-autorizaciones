package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Loguearse implements Ability {
    private String usuario;
    private String nombreUsuario;
    private String contraseniaUsuario;

    public Loguearse(String usuario) {
        this.usuario = usuario;
        switch (usuario) {
            case "Integral":
                this.nombreUsuario = tipoDeUsuarios.INTEGRAL.nombreUsuario;
                this.contraseniaUsuario = tipoDeUsuarios.INTEGRAL.contraseniaUsuario;
                break;
        }
    }

    public static Loguearse conCredencialesDe(String usuario) {
        return new Loguearse(usuario);
    }

    public static Loguearse como(Actor actor) {
        if (actor.abilityTo(Loguearse.class) == null) {
            throw new NoSePuedeLoguearException(actor.getName());
        }
        return actor.abilityTo(Loguearse.class);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public enum tipoDeUsuarios {
        INTEGRAL("GCAINZO715717", "Blanco5600");
        String nombreUsuario;
        String contraseniaUsuario;

        tipoDeUsuarios(String nombreUsuario, String contraseniaUsuario) {
            this.nombreUsuario = nombreUsuario;
            this.contraseniaUsuario = contraseniaUsuario;
        }
    }

    private static class NoSePuedeLoguearException extends RuntimeException {
        public NoSePuedeLoguearException(String nombreActor) {
            super("El actor " + nombreActor + "no tiene la habilidad de logearse de esa forma");
        }
    }
}
