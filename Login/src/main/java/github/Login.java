package github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath = "//input[@id='login_field']")
	//*[@id="user_email"]
	WebElement eleEmail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement elePass;

	@FindBy(xpath = "//body/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[12]")
	WebElement eleLoginbtn;

	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String emailorusername, String password) {
		eleEmail.sendKeys(emailorusername);
		elePass.sendKeys(password);
		eleLoginbtn.click();
	}

}

