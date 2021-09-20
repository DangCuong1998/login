package base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.Links;
public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		//Chrome
		System.setProperty("webdriver.chrome.driver", "C://servers/chromedriver.exe");/* Thay đổi địa chỉ đúng với thư mục chứa file chromedriver.exe trong máy của bạn và lưu.Ý tải file chromedriver.exe phải nhỏ hơn hoặc bằng với verison Chrome hiện tại trong máy của bạn*/
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Links.Url_login);
	}

//	@AfterMethod
//	public void tearDown() {
//		//Wait cho page được render thành công sau 1s, Nếu sau 1s vẫn chưa xong thì sẽ throw ra exception 	 	
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		driver.quit();
//	}
}
