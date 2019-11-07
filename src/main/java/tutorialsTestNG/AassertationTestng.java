package tutorialsTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AassertationTestng {

	WebDriver driver;  //initializing web driver

	@BeforeMethod   //pre requesting all these we are writing in beforemethod 
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority=6,groups="title")
	public void testGoogleTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "Title is not matching");//this calls assertion validation of the page title if is correct 
		//here no need to write if else condition . inside of the bracket we have option to write the message just in case if failed 
		//that message will print 
	}
	public void googlelogo() {
		boolean d = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed(); //this method to make sure if elements is displayed
		Assert.assertTrue(d, "logo is not displayed");   //assert.assertTrue methods lets u know if its true 
		}
	@AfterMethod
	public void teardown() {
		driver.close();
		//driver.quit();
	}

}
