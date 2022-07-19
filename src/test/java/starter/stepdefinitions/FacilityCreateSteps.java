package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.FacilityCreate.POST;

public class FacilityCreateSteps {
    @Steps
    POST post;

    @Given("I success create facility")
    public void successCreateFacility() {
        post.successCreateFacility();
    }

    @When("I request POST for create facility with authorization and name facility")
    public void requestPostForCreateFacilityWithAuthorizationAndNameFacility() {
        post.requestPostForCreateFacilityWithAuthorizationAndNameFacility();

    }

    @Then("I validate the status code 200")
    public void validateTheStatus() {
        post.validateTheStatus();
    }

    @And("I validate the response message")
    public void validateTheResponseMessage() {
        post.validateTheResponseMessage();

    }
}
