package datadriventestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilityExcel.Xls_Reader;

public class datatest2 {

	public static void main(String[] args) {
		
		

		Xls_Reader reader = new Xls_Reader("C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\excell files\\spotify.xlsx");
		
		
		String firstname = reader.getCellData("sheet1", "firstname", 2);
		System.out.println(firstname);
		
		String lastname = reader.getCellData("sheet1", "lastname", 2);
		System.out.println(lastname);
		
		
		String usernmae = reader.getCellData("sheet1", "username", 2);
		System.out.println(usernmae);
		
		
		
		String password = reader.getCellData("sheet1", "password", 2);
		System.out.println(password);
		
		
		String confirmpassword = reader.getCellData("sheet1", "confirmpassword", 2);
		System.out.println(confirmpassword);
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(usernmae);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(confirmpassword);
		 driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		 
		 driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}


	
		
	}










