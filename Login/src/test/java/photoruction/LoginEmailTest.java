package photoruction;

import org.testng.annotations.Test;
import base.BaseTest;

public class LoginEmailTest extends BaseTest {
	LoginEmail lg;
	@Test
	public void loginFail(){
		/* Khởi tạo object */
		lg = new LoginEmail(driver);

		// Nhập giá trị
		String email = "cuong@dq62.com";
		lg.loginemail(email);
	}
}