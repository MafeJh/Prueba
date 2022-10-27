package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.example.userinterfaces.Cart.CART;

public class ValidateCart implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return CART.resolveFor(actor).isVisible();
    }
    public static ValidateCart cart() {
        return new ValidateCart();
    }
}
