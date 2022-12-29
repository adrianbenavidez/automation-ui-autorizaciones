package com.gruposancorseguros.natalpsal.automatizacionesUI.screenplay.global.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Tabla {
    public static Target CELDA_PRACTICA_1  = Target.the("Celda practica de la grilla de Practicas").located(By.xpath("//table[@id='medical-practices-grid']/tbody/tr/td[2]"));
    public static Target CELDA_PRACTICA_2  = Target.the("Celda practica de la grilla de Practicas").located(By.xpath("//table[@id='medical-practices-grid']/tbody/tr[2]/td[2]"));
    public static Target CELDA_REQUIERE_AUTORIZACION_1  = Target.the("Celda requiere autorizacion de la grilla de Practicas").located(By.xpath("//table[@id='medical-practices-grid']/tbody/tr/td[5]"));
    public static Target CELDA_REQUIERE_AUTORIZACION_2  = Target.the("Celda requiere autorizacion practica de la grilla de Practicas").located(By.xpath("//table[@id='medical-practices-grid']/tbody/tr[2]/td[5]"));

    //region Target para tabla
    public static Target CELDA_PRODUCTO  = Target.the("Producto cargado en la grilla").located(By.xpath("//td[contains(text(),'50845')]"));
    //endregion

}
