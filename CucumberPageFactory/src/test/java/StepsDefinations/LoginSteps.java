package StepsDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePagefactory;
import pagefactory.LoginPagefactory;

public class LoginSteps {
	
	WebDriver driver = null;
	WebDriverWait wait=null;
	LoginPagefactory loginpage;
	HomePagefactory homepage;
	
	@Given("User opens Chrome browser for parameterization")
	public void user_opens_chrome_browser_for_parameterization() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("== i am inside login page ==");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@And("User navigates to OrangeHRM login")
	public void user_navigates_to_orange_hrm_login() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enters (.*) and (.*)")
	public void user_enters_admin_and_admin123(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
	    //driver.findElement(By.name("username")).sendKeys(username);
	    //driver.findElement(By.name("password")).sendKeys(password);
		
		loginpage = new LoginPagefactory(driver);		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		
		
		Thread.sleep(2000);
	    System.out.println("Username and password entered successfully");
	    
	}

	@And("User clicks on log-in button")
	public void user_clicks_on_log_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.findElement(By.xpath("//button[@type='submit']")).click();;
		loginpage.clickLogin();
	}

	@Then("User should be logged in successfully in orangeCRM")
	public void user_should_be_logged_in_successfully_in_orange_crm() {
	    // Write code here that turns the phrase above into concrete actions
		homepage = new HomePagefactory(driver);
		homepage.logout();
		
	    System.out.println("User should logout successfully");
	}
}
