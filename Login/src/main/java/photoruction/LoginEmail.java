package photoruction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEmail {
	@FindBy(xpath = "//input[@id='user_email']")
	//*[@id="user_email"]
	WebElement eleEmail;
	@FindBy(xpath = "//button[@class='btn info medium']")
	WebElement eleLoginbtn;

	WebDriver driver;

	public LoginEmail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginemail(String email) {
		eleEmail.sendKeys(email);
		eleLoginbtn.click();
	}
}