package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Add {
    public static final Target BAG = Target.the("Bolso").located(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
}
