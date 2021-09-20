package photoruction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath = "//input[@id='user_email']")
	//*[@id="user_email"]
	WebElement eleEmail;

	@FindBy(xpath = "//input[@id='user_pass']")
	WebElement elePass;

	@FindBy(xpath = "//button[@class='btn info medium']")
	WebElement eleLoginbtn;

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String email, String password) {
		eleEmail.sendKeys(email);
		elePass.sendKeys(password);
		eleLoginbtn.click();
	}

}

