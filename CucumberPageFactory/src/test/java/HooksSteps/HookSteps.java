package HooksSteps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookSteps {
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	// Browser Setup hook is getting initiated after every scenarios
	// To execute multiple Before setup, we can use order or it will execute it in written sequence.

	//@Before(order=1)
	@Before(value="@smoke", order=1) //conditional hook 
	public void browserSetup() {
		System.out.println("I am inside before via Hook");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	}
	
	@Before(order=0)
	public void Setup2() {
		System.out.println("Setup");
	}
	// Browser tear down hook is getting initiated after every scenarios
	@After(order=1)
	public void tearDown() {
		System.out.println("I am inside After via Hook");
	        if (driver != null) {
				driver.close();
				driver.quit();
	        }		
	}
	@After(order=2)
	public void tearDown2() {
		System.out.println("I am inside Tear Down 2");	
	}
	
	@BeforeStep
	public static void beforeSteps() {
		System.out.println(" --------- I am inside Before Steps");
	}
	
	@AfterStep
	public static void afterSteps() {
		System.out.println(" --------- I am inside After Steps");
	}
	
	@Given("user is on the login page of hooks")
	public void user_is_on_the_login_page_of_hooks() {
		System.out.println("Login");
	}


	@When("end user enters username and password")
	public void end_user_enters_username_and_password() {
		System.out.println("enter");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("click");
	}

	@Then("user is navigated to the home")
	public void user_is_navigated_to_the_home() {
		System.out.println("Home");
	}
}
