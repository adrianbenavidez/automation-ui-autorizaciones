package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global.screenplay.global.elements;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Input {
    public static Target USUARIO = Target.the("Campo de Ingreso de Usuario").located(By.name("username"));
    public static Target CONTRASENIA = Target.the("Campo de Ingreso de Password").located(By.name("password"));
    public static Target USUARIO_BUSQUEDA = Target.the("Campo de busqueda de usuarios en menu principal").located(org.openqa.selenium.By.xpath("//*[@id=\"liUserAvailables\"]/div/div/ul/li/input"));
}
