package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.abilities;

import net.serenitybdd.screenplay.Ability;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;

public class DatosAleatorios implements Ability {

    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower = upper.toLowerCase(Locale.ROOT);
    private static final String digits = "0123456789";
    private static final String alphanum = upper + lower + digits;
    private static Random random;
    private static char[] symbols;
    private static char[] buf;
    private static DatosAleatorios instance;

    public static DatosAleatorios cargarDatos() {
        if (instance == null) {
            instance = new DatosAleatorios();
        }
        return instance;
    }

    private DatosAleatorios() {
        random = new SecureRandom();
    }

    public static String getValorAlfanumerico(int longitud) {
        if (longitud < 1) throw new IllegalArgumentException();
        symbols = alphanum.toCharArray();
        buf = new char[longitud];

        for (int idx = 0; idx < buf.length; ++idx) {
            buf[idx] = symbols[random.nextInt(symbols.length)];
        }
        return new String(buf);
    }

    public static String getValorNumerico(int longitud) {
        if (longitud < 1) throw new IllegalArgumentException();
        symbols = digits.toCharArray();
        buf = new char[longitud];

        for (int idx = 0; idx < buf.length; ++idx) {
            buf[idx] = symbols[random.nextInt(symbols.length)];
        }
        return new String(buf);
    }
}
