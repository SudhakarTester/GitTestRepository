package TestPackage;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
 @Test				
	public void testEasy() {	
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("Tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:/DevopsforTestingTraining/chromedriver.exe");
      driver = new ChromeDriver();     
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("SeleniumIntegrationwithJenkins");
	  System.out.println(driver.getTitle());
	  
  }

}
