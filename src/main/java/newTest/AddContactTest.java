package newTest;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddContactTest {
	
	@Test
	
	public void Useradd () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver getDriver = new ChromeDriver();
		//set driver properties
		getDriver.manage().window().maximize();
		getDriver.manage().deleteAllCookies();
		//set implicit wait.Applies to all. Set it once in the beginning
		getDriver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS );
		
		//2. get to techfios site
		getDriver.get("http://techfios.com/test/billing/?ng=login/");
		
		//to stop and observe
		//Thread.sleep(3000);
		//3. type username and submit
		getDriver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		getDriver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("abc123");
		getDriver.findElement(By.xpath("//button [contains(text(),'Sign']")).click();
		
		//Store an element
		
		boolean pagedisplay;
		try {
				WebElement PAGE_TITLE_ELEMENT = getDriver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
				pagedisplay = true;}
		catch(NoSuchElementException e) {
			pagedisplay = false;
		}
				
				
				//By PAGE_TITLE_LOCATOR = By.xpath("//h2[contains(text(),'Dashboard')]");
		/*
		 * PAGE_TITLE_ELEMENT.isDisplayed();
		 * getDriver.findElement(PAGE_TITLE_LOCATOR).isDisplayed();
		 * getDriver.findElement(PAGE_TITLE_LOCATOR).click();
		 */
		
		/*
		 * //Explicit wait given to the driver WebDriverWait wait = new
		 * WebDriverWait(getDriver,5);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(PAGE_TITLE_LOCATOR))
		 * ; wait.until(ExpectedConditions.invisibilityOf(PAGE_TITLE_ELEMENT));
		 */
				Assert.assertTrue("Dashboard title didnot display", pagedisplay);
				//Assert.assertTrue("Dashboard title didnot display",getDriver.findElement(PAGE_TITLE_LOCATOR).isDisplayed());

		

		

		/*
		 * //close the driver getDriver.close();
		 * 
		 * 
		 * //ends the webdriver session getDriver.quit();
		 */
		
	}

		}


