package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	@Test
	public void openGoogleSite() {
		
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		
		
		Driver.get("http://demo.guru99.com/test/newtours/");
				
				
		Driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
		
				 
		Driver.findElement(By.id("First Name")).sendKeys("Rabin ");
		Driver.findElement(By.id("Last name")).sendKeys("Basnet");
		
		Driver.findElement(By.id("phone")).sendKeys("6827158397");
		Driver.findElement(By.id("email")).sendKeys("rabinbasnet@gmail.com");
		Driver.findElement(By.id("address")).sendKeys("5637 Coventry park Drive");
		Driver.findElement(By.id("city")).sendKeys("Haltom");
		Driver.findElement(By.id("state")).sendKeys("Texas");
		Driver.findElement(By.id("Postal Code")).sendKeys("76117");
		Driver.findElement(By.id("submit")).click();
		
		
	}
	
	}
	
	


