package openitlearn360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formfill2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chromedriver", "C:\\Program Files\\chromedriver.exe");
//Initialize Webdriver object through ChromeDriver class.
ChromeDriver browserObject = new ChromeDriver ();
// Open form page of http://www.training.qaonlinetraining.com/testpage.php
browserObject.get ("http://www.training.qaonlinetraining.com/testpage.php");
browserObject.findElement(By.name("name")).sendKeys("Sangeeta");

browserObject.findElement(By.name("email")).sendKeys("sangb@gmail.com");
browserObject.findElement(By.name("website")).sendKeys("ITLearn360");

browserObject.findElement(By.name("comment")).sendKeys("This is a good website");
browserObject.findElement(By.name("submit")).click();;	
	
	}

 }

  
  