package photoruction;

import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTest extends BaseTest {
	Login lg;
	@Test
	public void loginFail(){
		/* Khởi tạo object */
		lg = new Login(driver);

		// Nhập giá trị
		String email = "cuong@dq62.com";
		String password = "fdfdf";

		lg.login(email, password);
	}
//	@Test
//	public void loginsuccess(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//	// Nhập giá trị
//		String email = "cuong@dq623.com";
//		String password = "fdfdf";
//	lg.login(email, password);
//	}
}

