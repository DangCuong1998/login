package photoruction;

import org.testng.annotations.Test;
import base.BaseTest;

public class LoginPasswordTest extends BaseTest {
	LoginPassword lg;
	@Test
	public void loginFail(){
		/* Khởi tạo object */
		lg = new LoginPassword(driver);

		// Nhập giá trị
		String password = "fdfdf";

		lg.loginpassword(password);
	}
}