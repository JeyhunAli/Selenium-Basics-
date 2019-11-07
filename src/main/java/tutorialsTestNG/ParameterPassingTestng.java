//in testng how we pass paramater from testng.xml file to class ?
//how to definie paramaters in testng.xml file by using parameter tag name then add the parameters 
//it has to be parameter name then value ; for example  <parameter name = "url" value = "https://www.yahoo.com"/>
//if we have 10 parameters then we have to write 10 line parameters 
//and here in the class whatever we have parameter in testng.xml file by writing @parameters ({inside here we are write paramater name from 
//testng.xml file })
//after defining all the parameters in testng.xml file those parameters are calls generic it means they are for general using 
//lets say in the next couple month need to reseting new password and email or some another paramaters no need to go all the codes change them inside 
// of the script just need to go to the testng.xml file and modify from there 
//we can define browser variables as well in our testng.xml file 
//whatever paramaters we define in testng.xml file we are passing them to our class @parameters as well as to method brackets too 
//we also define our environment in testng.xml file example:   <parameter name = "env" value ="QA"/>
//these all calls configuration envrionment variables they are not test data keep in the mind 
// this is the way of parameterization in testng ---->>  
// 
// 



package tutorialsTestNG;   

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassingTestng {
	
	WebDriver driver;   
	
	@Test
	@Parameters({"url", "emailid", "browser", "env"})   //adding parameters from testng.xml file  
	//lets say tomorrow we have 20,50 paramaters in testng.xml then we have to define them here in parameters and as well ass right after 
	//method name here in below 
	
	public void yahoologintest(String url, String emailid, String browser, String env) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
//here we add firefox and chrome but whatever browser in testng.xml file it will generate that browser 
		}
		driver.get(url);
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailid);//entering user nmae
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//so here we adding username just inside of the code lets say tomorrow its changed we have to channge it again here 
		//to avoidin that we are storing our all the parameteres  user name password driver either to property files or testng.xml file 
		//basically testng.xml file is for our executing all the test cases 
		//name we can give any name but it has to end with .xml 
		 
		
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();// clickin the button 
		driver.close();
	}
	
	
	
	
	
	
	

}
