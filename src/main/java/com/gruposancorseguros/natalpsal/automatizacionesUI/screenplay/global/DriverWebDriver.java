package com.gruposancorseguros.natalpsal.autorizaciones.screenplay.global;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Collections;

// propiedades del navegador

public class DriverWebDriver implements DriverSource {
    @Override

    public WebDriver newDriver() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");

        if (maximized()) {
            options.addArguments("--start-maximized");
        }
        if (!detectAutomation()) {
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);
        }

        //para no acceder al drivers para cambiar la configuración, agregamos una variable en serenity properties.
        options.setHeadless(mheadless());

        return new ChromeDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }

    public boolean mheadless() {
        String vHeadless = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("headless");
        vHeadless = (vHeadless == null) ? "false" : vHeadless;
        return vHeadless.equals("true");
    }

    public boolean maximized() {
        String vMaximized = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("maximized");
        vMaximized = (vMaximized == null) ? "false" : vMaximized;
        return vMaximized.equals("true");
    }

    public boolean detectAutomation() {
        String vDetectAutomation = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("detectAutomation");
        vDetectAutomation = (vDetectAutomation == null) ? "false" : vDetectAutomation;
        return vDetectAutomation.equals("true");
    }
}