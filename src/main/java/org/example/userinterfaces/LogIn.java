package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogIn {
    public static final Target INPUT_USER = Target.the("Input para ingresar usuario").located(By.xpath("//input[@id='user-name']"));
    public static final Target INPUT_PWD = Target.the("Input para ingresar la contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target SIGIN = Target.the("Botón para acceder").located(By.xpath("//input[@id='login-button']"));
}
