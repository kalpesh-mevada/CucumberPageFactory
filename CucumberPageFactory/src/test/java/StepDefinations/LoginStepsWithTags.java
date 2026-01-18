package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsWithTags {
	@Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("User enters credentials");
    }

    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        System.out.println("User logged in successfully");
    }
}
