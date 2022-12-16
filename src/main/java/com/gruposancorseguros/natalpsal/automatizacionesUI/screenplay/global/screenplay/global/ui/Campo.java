package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Campo {
    public static Target USUARIO_BUSQUEDA   = Target.the("Campo para buscar un usuario en el menu principal").located(By.xpath("//*[@id='liUserAvailables']//input"));
}
