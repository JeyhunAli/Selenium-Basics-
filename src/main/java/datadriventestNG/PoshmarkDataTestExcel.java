package datadriventestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility2.utilityTest2;



public class PoshmarkDataTestExcel {
	
	
	
	WebDriver driver;
	
	@BeforeMethod 
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://poshmark.com/signup");
	}
	
	
	@DataProvider(name="getTestData")
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData =utilityTest2.getDataFromExcel();// here we are calling xls_reader just by name because its static in nature 
		//here testDatalist hold entire value
		return testData.iterator();
		
	}
	
	@Test(dataProvider="getTestData", dataProviderClass = utilityTest2.class)
	public void porshMarkTest(String firstname, String lastname, String email, String username, 
			String password, String gender, String Country) {
		
		driver.findElement(By.xpath("//input[@id='sign_up_form_first_name']")).clear();
		driver.findElement(By.xpath("//input[@id='sign_up_form_first_name']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id='sign_up_form_last_name']")).clear();
		driver.findElement(By.xpath("//input[@id='sign_up_form_last_name']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@id='sign_up_form_email']")).clear();
		driver.findElement(By.xpath("//input[@id='sign_up_form_email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@id='sign_up_form_username']")).clear();
		driver.findElement(By.xpath("//input[@id='sign_up_form_username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='sign_up_form_password']")).clear();
		driver.findElement(By.xpath("//input[@id='sign_up_form_password']")).sendKeys(password);
		
		WebElement gen = driver.findElement(By.xpath("//select[@id='sign_up_form_gender']"));
		WebElement country = driver.findElement(By.xpath("//select[@id='sign_up_form_home_domain']"));
		
		Select select = new Select(gen);
		select.selectByVisibleText("male");
		select.selectByVisibleText("female");
	
		Select select1 = new Select(country);
		select1.selectByVisibleText("united state");
	}
		
	
		
	
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
	
	}


