package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	@Test
	
	public  void logintotechfios () {
		
		// setting chromedriver properties
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//making  connection with the driver and chrome browser
		WebDriver driver = new ChromeDriver();
		
		//driver.get means going to the specific website
		driver.get("http://techfios.com/test/billing/?ng=login/");
		
		//for identifying a certain element we are using find element
		//for typing in the element we are using send keys
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		driver.close();
		driver.quit();
		
		
	}

}
