package tutorialstestNGScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;  //initialazing static webdriver in order to access it directly
	
	public static void initialazing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	//here we pass the testmethod 
	public void failed (String testMethodName) {    
		File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshotfile, new File("C:/Users\\Ali-c/eclipse-workspace/SeleniumBasics/ScreenShots/"+ testMethodName
					+"_"+  " .jpg")); //here dont forget to give jpg and filepathname 
		//	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
