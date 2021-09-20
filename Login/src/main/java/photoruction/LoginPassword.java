package photoruction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPassword {
	@FindBy(xpath = "//input[@id='user_pass']")
	WebElement elePass;

	@FindBy(xpath = "//button[@class='btn info medium']")
	WebElement eleLoginbtn;

	WebDriver driver;

	public LoginPassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginpassword(String password) {
		elePass.sendKeys(password);
		eleLoginbtn.click();
	}

}


