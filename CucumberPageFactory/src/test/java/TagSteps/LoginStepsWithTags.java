package TagSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsWithTags {
	@Given("customer is on login page")
    public void customer_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("customer enters valid credentials")
    public void customer_enters_valid_credentials() {
        System.out.println("User enters credentials");
    }

    @Then("customer should be logged in")
    public void customer_should_be_logged_in() {
        System.out.println("User logged in successfully");
    }
}
