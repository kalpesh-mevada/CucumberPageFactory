package BackgroundDemoSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoSteps {

	@Given("user is on login page")
	public void user_is_on_logged_page() {
		System.out.println("--------user is on login page-----");
	}

	@When("user enter uname and pswd")
	public void user_enter_uname_and_pswd() {
		System.out.println("user enter uname and pswd-----");
	}

	@And("user click on login link")
	public void user_click_on_login_link() {
		System.out.println("user click on login link-----");
	}

	@Then("user should redirect to home page")
	public void user_should_redirect_to_home_page() {
		System.out.println("user should redirect to home page-----");
	}

	@When("user click on Welcome link")
	public void user_click_on_welcome_link() {
		System.out.println("user click on Welcome link------");
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed() {
		System.out.println("logout link is displayed--------");
	}

	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
		System.out.println("user clicks on dashboard link-----");
	}

	@Then("Quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
		System.out.println("Quick launch toolbar is displayed--------");
	}

}
