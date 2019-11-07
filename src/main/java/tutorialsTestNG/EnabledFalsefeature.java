package tutorialsTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledFalsefeature {
	
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
	
	
	
	@Test(priority=1, enabled=false)  //enabled false method helps u to avoid  executing of unwanted test cases 
	                                 // if u want to enabled to execute it just change from false to true 
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("test2");

	}
	
	@Test(priority=3)
	public void test3() {
		System.out.println("test3");
	
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		//driver.quit();
	}
	
	

}
