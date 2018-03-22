package devops.vdit.testmaven.Maven;

import static org.testng.Assert.assertTrue;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstMavenTest {
  @Test
  public void SeleniumTutorialTest1() throws InterruptedException, IOException {  
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver","lib\\thirdParty\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");
		System.out.println("Get Title : "+driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle(),"Title Matched");
		assertTrue(driver.getTitle().equals("Google"), "Title Matched");
		
		System.out.println("Current URL : "+driver.getCurrentUrl());
		// Print a Log In message to the screen
		// driver.findElement(By.id("lst-ib")).sendKeys("Google"); // By ID
		// driver.findElement(By.name("q")).sendKeys("Google"); // By Name
		// driver.findElement(By.linkText("Gmail")).click(); // By Link Text
		// driver.findElement(By.partialLinkText("Gm")).click(); // By Partial Link Text
		
		// driver.findElement(By.className("gb_P")).click(); // By Class Name
		// driver.findElement(By.xpath("//img[@id,'hplogo']")).click();;
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Google");
		//System.out.println(" From Google Search : "+driver.findElement(By.id("lst-ib")).getText().toString());
		
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(2000);
		//File fileScr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(fileScr, new File("D:\\ScreenShot.jpg"));
		
/*		driver.navigate().back();
		System.out.println("Get Title : "+driver.getTitle());
		System.out.println("Current URL : "+driver.getCurrentUrl());
*/		// //*[@id="hplogo"] 
		
		
		// driver.navigate().to("http://www.softwaretestinghelp.com/selenium-interview-questions-answers/");
		// 
		//Wait for 5 Sec
		Thread.sleep(5000);

		// Close the driver
		driver.quit();
	}
}
