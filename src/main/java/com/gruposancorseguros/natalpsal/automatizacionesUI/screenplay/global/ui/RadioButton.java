package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RadioButton {

    public static Target PRACTICA_AMBULATORIA  = Target.the("Radio Button práctica ambulatoria").located(By.xpath("//*[@id=\"Práctica Ambulatoria\"]") );
    public static Target INTERNACION  = Target.the("Radio Button internación").located(By.xpath("//*[@id=\"Internación\"]") );
    public static Target PROTESIS  = Target.the("Radio Button prótesis").located(By.xpath("//*[@id=\"Prótesis\"]") );


}
