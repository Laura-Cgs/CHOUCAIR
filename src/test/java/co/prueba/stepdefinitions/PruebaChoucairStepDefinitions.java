package co.prueba.stepdefinitions;

import co.prueba.tasks.AddProducts;
import co.prueba.tasks.Login;
import co.prueba.tasks.OpenPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PruebaChoucairStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Laura wants to enter the page and buy products$")
    public void lauraWantsToEnterThePageAndBuyProducts() {
        OnStage.theActorCalled("Laura").wasAbleTo(OpenPage.thePage());
    }

    @Then("^she enters the page and enter the username and password$")
    public void sheEntersThePageAndEnterTheUsernameAndPassword() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.automationPracticePage());
    }

    @When("^she will add the products to the cart, enter the data and buy them$")
    public void sheWillAddTheProductsToTheCartEnterTheDataAndBuyThem() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProducts.toTheCart());
    }
}
