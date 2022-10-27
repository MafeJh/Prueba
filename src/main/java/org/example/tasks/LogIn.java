package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;


import static org.example.userinterfaces.Add.BAG;
import static org.example.userinterfaces.LogIn.*;

public class LogIn implements Task {
    Map<String, String> formlist;

    public LogIn(Map<String, String> formlist) {
        this.formlist = formlist;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(formlist.get("user")).into(INPUT_USER),
                Enter.theValue(formlist.get("password")).into(INPUT_PWD),
                Click.on(SIGIN),
                Click.on(BAG)
        );
    }
    public static LogIn login(Map<String, String> formlist){
        return Tasks.instrumented(LogIn.class, formlist);
    }

}
