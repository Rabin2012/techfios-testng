package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddContactTest {
	
	public void AddContact() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://techfios.com/test/billing/?ng=login/");
				
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
				
		driver.findElement(By.id("password")).sendKeys("abc123");
				
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Add Contact')]")).click();
		driver.findElement(By.id("account")).sendKeys("Rabin Basnet");
		driver.findElement(By.id("company")).sendKeys("Bla Bla");
		driver.findElement(By.id("email")).sendKeys("rabinbasnet@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("6827158397");
		driver.findElement(By.id("address")).sendKeys("5637 Coventry park Drive");
		driver.findElement(By.id("city")).sendKeys("Haltom");
		driver.findElement(By.id("state")).sendKeys("Texas");
		driver.findElement(By.id("zip")).sendKeys("76117");
		driver.findElement(By.id("submit")).click();

		

		
	}
	
	

}
