package pagefactory;

import java.rmi.server.ExportException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagefactory {
	
	WebDriver driver;
	WebDriverWait wait;
	// User dropdown
	@FindBy(css = "span.oxd-userdropdown-tab")
	private WebElement userDropdown;
	
	// Logout link
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logoutLink;
	
	public HomePagefactory(WebDriver driver1){
		this.driver = driver1; 
		wait = new WebDriverWait(driver1, Duration.ofSeconds(50));
		PageFactory.initElements(driver1, this);
	}
	
	public void logout() {
		wait.until(ExpectedConditions.elementToBeClickable(userDropdown)).click();
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
	}
}
