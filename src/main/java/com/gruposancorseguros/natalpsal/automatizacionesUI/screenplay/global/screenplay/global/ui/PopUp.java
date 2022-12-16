package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.screenplay.global.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopUp {
    public static Target BLOCK_UI = Target.the("Bloqueo de componentes").located(By.xpath("//*[@class='blockUI blockOverlay']"));
}
