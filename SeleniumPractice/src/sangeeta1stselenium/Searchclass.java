package sangeeta1stselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Searchclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
		    // 2. Initialize Webdriver object through ChromeDriver class.
		  ChromeDriver  browserObject = new ChromeDriver();
		    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
		    browserObject.get("https://www.google.com/");
		    
		    browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
		    
		    browserObject.findElement(By.name("btnK")).submit();		
	}

}
