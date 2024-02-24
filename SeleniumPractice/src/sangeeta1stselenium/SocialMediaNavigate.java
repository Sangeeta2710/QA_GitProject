package sangeeta1stselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMediaNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		ChromeDriver browserObject=new ChromeDriver();
		// 3. Open the web page https://www.itlearn360.com/

		 browserObject.get("https://www.itlearn360.com/");
			// 4. Locate facebook icons using className locator and perform click
		        browserObject.findElement(By.className("fa-facebook")).click();
		        
		     // 5. Navigate back on main page using navigate and back method 
		        browserObject.navigate().back();
		        
		     // 6. Locate twitter icons using className locator and perform click
		        browserObject.findElement(By.className("fa-twitter")).click();
	}

}
