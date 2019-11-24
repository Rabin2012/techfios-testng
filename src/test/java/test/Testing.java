package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	@Test
	
public void Demoguru() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		
		
		Driver.get("http://demo.guru99.com/test/newtours/");
		
			
					
				
				
		//driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
		
				 /** 
		 * driver.findElement(By.id("First Name")).sendKeys("Rabin ");
		 * driver.findElement(By.id("Last name")).sendKeys("Basnet");
		 * 
		 * driver.findElement(By.id("phone")).sendKeys("6827158397");
		 * driver.findElement(By.id("email")).sendKeys("rabinbasnet@gmail.com");
		 * driver.findElement(By.id("address")).sendKeys("5637 Coventry park Drive");
		 * driver.findElement(By.id("city")).sendKeys("Haltom");
		 * driver.findElement(By.id("state")).sendKeys("Texas");
		 * driver.findElement(By.id("Postal Code")).sendKeys("76117");
		 * driver.findElement(By.id("submit")).click();
		 */
		
	}
}



