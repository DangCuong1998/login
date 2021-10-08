package github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import github.Login;

public class LoginTest extends BaseTest {
	Login lg;
	String LoginLabel1;
	String LoginLabel2;
	String LoginLabel3;
	String LoginLabel4;
	String LoginLabel5;
	String LoginLabel6;
	String LoginLabel7;
	String LoginLabel8;
	String LoginLabel9;
	String LoginLabel10;
	String LoginLabel11;
	String LoginLabel12;
	String LoginLabel13;
	String LoginLabel14;
	String LoginLabel15;
	String PlaceHolderEmail;
	String PlaceHolderPassword;
	
//	
//	@Test
//	public void ChecktextTC03() {
//		 LoginLabel1 = driver.findElement(By.xpath("//h1[contains(text(),'Sign in to GitHub')]")).getText();
// Assert.assertEquals( LoginLabel1, "Sign in to GitHub");	
//		 System.out.print("dung");
//		 }
//	
//	@Test
//	public void ChecktextTC04() {
//		 LoginLabel2 = driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")).getText();
//	 Assert.assertEquals( LoginLabel2, "Username or email address");	
//		 System.out.print("dung");
//
//	}
//
//
//	@Test
//	public void ChecktextTC05() {
//		 LoginLabel4 = driver.findElement(By.xpath("//label[contains(text(),'Password')]")).getText();
//		 Assert.assertEquals( LoginLabel4, "Password");	
//		 System.out.print("dung");
//		 }
	
//	@Test
//	public void ChecktextTC06() {
//		 LoginLabel4 = driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).getText();
//		 Assert.assertEquals( LoginLabel4, "Forgot password?");	
//		 System.out.print("dung");
//		 }
//	
//	
//	@Test
//	public void ChecktextTC07() {
//		 LoginLabel4 = driver.findElement(By.xpath("//input[@value='Sign in']")).getAttribute("value");
//		 Assert.assertEquals( LoginLabel4, "Sign in");	
//		 System.out.print("dung");
//		 }
//
//	@Test
//	public void ChecktextTC09() {
//		 LoginLabel5 = driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).getText();
//		 Assert.assertEquals( LoginLabel5, "Create an account");	
//		 System.out.print("dung");
//		 }
	
//	
//	@Test
//	public void ChecktextTC10() {
//		 LoginLabel6 ="New to GitHub?";
//		 Assert.assertEquals( LoginLabel6, "New to GitHub?");	
//		 System.out.print("dung");
//		 }
//	
//	 @Test
//			public void ChecktextTC11() {
//		 		 driver.findElement(By.xpath("//body/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[12]")).click();
//				 LoginLabel7 = driver.findElement(By.xpath("//body/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]")).getText();
//				 Assert.assertEquals( LoginLabel7, "Incorrect username or password.");	
//				 System.out.print("dung");	 	 
//	 }
	 
//	 @Test
//			public void ChecktextTC12() {
//				 LoginLabel8 = driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).getText();
//				 Assert.assertEquals( LoginLabel8, "Terms");	
//				 System.out.print("dung");	 
//		 
// }
//	 @Test
//		public void ChecktextTC13() {
//			 LoginLabel9 = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).getText();
//			 Assert.assertEquals( LoginLabel9, "Privacy");	
//			 System.out.print("dung");	 
//	 
//}
//		 
//	 @Test
//		public void ChecktextTC14() {
//			 LoginLabel10 = driver.findElement(By.xpath("//a[contains(text(),'Security')]")).getText();
//			 Assert.assertEquals( LoginLabel10, "Security");	
//			 System.out.print("dung");	 
//	 	 
//}	 
		 
//	 @Test
//		public void ChecktextTC15() {
//			 LoginLabel11 = driver.findElement(By.xpath("//a[contains(text(),'Contact GitHub')]")).getText();
//			 Assert.assertEquals( LoginLabel11, "Contact GitHub");	
//			 System.out.print("dung");	 	 	 
//}	 
 
		 
//	 @Test
//		public void CheckTransititonTC17() {
//		 driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();	 
//	 }
//	 @Test
//		public void CheckTransititonTC18() {
//		 driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();	 
//	 }
//		 
//	 @Test
//		public void CheckTransititonTC19() {
//		 driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();	 
//	 }	 
//		 
//	 @Test
//		public void CheckTransititonTC20() {
//		 driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();	 
//	 }
//	 
//	 @Test
//		public void CheckTransititonTC21() {
//		 driver.findElement(By.xpath("//a[contains(text(),'Security')]")).click();	 
//	 }	 	
//		 
//	 @Test
//		public void CheckTransititonTC22() {
//		 driver.findElement(By.xpath("//a[contains(text(),'Contact GitHub')]")).click();	 
//	 }	 	 
		 	 
		 		 
//	@Test
//	public void loginFailTC23(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "";
//		String password = "DangCuong1998";
//
//		lg.login(emailorusername, password);
//		}
//	@Test
//	public void loginFailTC24(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "cuongdq";
//		String password = "DangCuong1998";
//
//		lg.login(emailorusername, password);
//		}
//	@Test
//	public void loginFailTC25(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "cuongdq@";
//		String password = "DangCuong1998";
//
//		lg.login(emailorusername, password);
//		}
//	public void loginFailTC26(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "c uongdq@62.vn";
//		String password = "DangCuong1998";
//
//		lg.login(emailorusername, password);
//		}
//	public void loginFailTC27(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "cuongdang@gmail.com";
//		String password = "DangCuong1998";
//
//		lg.login(emailorusername, password);
//		}
//	
//	public void loginFailTC28(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.com";
//		String password = "cuong";
//
//		lg.login(emailorusername, password);
//		}
//		
//	public void loginFailTC29(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.con";
//		String password = "cuongdangquang";
//
//		lg.login(emailorusername, password);
//		}
//	public void loginFailTC30(){
////		/* Khởi tạo object */
//		lg = new Login(driver);
//		// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.con";
//		String password = "cuongdangquang123";
//
//		lg.login(emailorusername, password);
//		}
//	@Test
//public void loginsuccessTC31(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.com";
//		String password = "dangquangcuong1998";
//	lg.login(emailorusername, password);
//	}
//	@Test
//	public void loginFailTC32(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "cuongtiphu";
//		String password = "dangquangcuong1998";
//	lg.login(emailorusername, password);
//	}	
//	//	@Test
//	public void loginFailTC33(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "cuongtiphu@";
//		String password = "dangquangcuong1998";
//	lg.login(emailorusername, password);
//	}	
//	//	@Test
//	public void loginFailTC34(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "c uongtiphu@gmail.com";
//		String password = "dangquangcuong1998";
//	lg.login(emailorusername, password);
//	}	
//	@Test
//	public void loginFailTC35(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
// //Nhập giá trị
//		String emailorusername = "cuongdq62@wru.vn";
//		String password = "dangquangcuong1998";
//		lg.login(emailorusername, password);
//	}	
////	@Test
//	public void loginFailTC36(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "";
//		String password = "";
//	lg.login(emailorusername, password);
//	}
//	@Test
//	public void loginFailTC37(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.com";
//		String password = "";
//	lg.login(emailorusername, password);
//	}	
//	@Test
//	public void loginFailTC38(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.com";
//		String password = "ffdfgfg";
//	lg.login(emailorusername, password);
//	}	
//		@Test
//	public void loginFailTC39(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.com";
//		String password = "cuongdang";
//	lg.login(emailorusername, password);
//	}	
//	@Test
//	public void loginFailTC40(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "cuongtiphu98@gmail.com";
//		String password = "cuongdangquang";
//	lg.login(emailorusername, password);
//	}	
//	@Test
//	public void loginFailTC41(){
//		/* Khởi tạo object */
//		lg = new Login(driver);
//
//// Nhập giá trị
//		String emailorusername = "dangcuong";
//		String password = "dangquangcuong1998";
//	lg.login(emailorusername, password);
//	}
	@Test
	public void loginsuccessTC41(){
		/* Khởi tạo object */
		lg = new Login(driver);

// Nhập giá trị
		String emailorusername = "dangcuong1998";
		String password = "dangquangcuong1998";
	lg.login(emailorusername, password);
	}	
}


