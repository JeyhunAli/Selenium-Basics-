package tutorialsTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestNG {
	
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
	}
	//how will you give the sequence to your test cases ? answer by providing priority keyword
	//here we are giving priority of the test cases at time of executing it will run as our set of sequence 
	//another feature of testng is grouping consept, lets say we have 50 test cases we can group them in relative groups then we can execute them in a systematic way 
	//for this feature we use groups keyword 
	@Test(priority=2,groups="logo") 
	public void googlelogo() {
		boolean d = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
		}
	@Test(priority=1,groups="gmaillink")
	public void gmaillink() {
		boolean d = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		
		}
	@Test(priority=3,groups="test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=4,groups="test")
	public void test2() {
		System.out.println("test2");

	}
	
	@Test(priority=5,groups="test")
	public void test3() {
		System.out.println("test3");
	
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
