package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Enlace {

    public static Target PARA_MAYOR_INFORMACION = Target.the("Para mayor información sobre el producto, haga click aquí").located(By.xpath("//*[@id='collapseProductsBenefitsTemplate']/div/fieldset/div[2]/div[1]/p[1]"));

}
