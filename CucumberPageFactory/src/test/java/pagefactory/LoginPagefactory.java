package pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagefactory {
	// To maitain same session, need to pass WebDriver same from LoginSteps in constructor
		
	
	@FindBy(name = "username")
	@CacheLookup //locator is not going to change, then you can change.
	WebElement txt_username;
	
	@FindBy(name = "password") 
	WebElement txt_Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_login;
	
	WebDriver driver;
	WebDriverWait wait;
	public LoginPagefactory(WebDriver driver1) {
		// When object of this class is created, it will initialize all element using initElements method
		driver = driver1;
		//wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		AjaxElementLocatorFactory ajaxfactory = new AjaxElementLocatorFactory(driver1, 30); // if working with ajax application use this to avoid error
		PageFactory.initElements(ajaxfactory, this); //LoginPagefactory.class or following
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver1, 30), this); //LoginPagefactory.class
	}
	
	public void enterUsername(String username) {
		/* BEST PRACTICE (Recommended) ➜ Put WAIT inside PageFactory, not in Step file */
		wait.until(ExpectedConditions.visibilityOf(txt_username)).sendKeys(username);
		//txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_Password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	
	//WebElement txt_logout;
}
