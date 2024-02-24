package sangeeta1stselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	// 2. Initialize Webdriver object through ChromeDriver class.
        ChromeDriver browserObject = new ChromeDriver();
	// 3. Open login page of https://admin-demo.nopcommerce.com/login
        browserObject.get("https://admin-demo.nopcommerce.com/login");
	}

}
