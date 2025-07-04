package com.example.serenityrest.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    private Actor user;

    @Before
    public void setUp() {
        user = Actor.named("User").whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));
    }

    @Given("the user prepares the login API")
    public void theUserPreparesTheLoginAPI() {
        // Setup done in @Before
    }

    @When("the user sends the login request")
    public void theUserSendsTheLoginRequest() {
        user.attemptsTo(
                net.serenitybdd.screenplay.rest.interactions.Get.resource("/posts/1")
        );
    }

    @Then("the response code should be {int}")
    public void theResponseCodeShouldBe(Integer expectedStatusCode) {
        SerenityRest.lastResponse().then().statusCode(equalTo(expectedStatusCode));
    }
}
