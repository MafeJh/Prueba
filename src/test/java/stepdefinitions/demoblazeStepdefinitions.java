package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.questions.ValidateCart;
import org.example.tasks.LogIn;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class demoblazeStepdefinitions {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^the user is on the web page$")
    public void theUserIsOnTheWebPageDemoblaze() {
        theActorCalled("Mafe").wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^the user enter a user and a password$")
    public void theUserEnterAUserAndAPassword(Map<String, String> formlist) {
        theActorInTheSpotlight().attemptsTo(LogIn.login(formlist));
    }

    @Then("^he see the item in the cart$")
    public void heSeeTheItemInTheCart() {
        theActorInTheSpotlight().should(seeThat(ValidateCart.cart()));
    }
}
