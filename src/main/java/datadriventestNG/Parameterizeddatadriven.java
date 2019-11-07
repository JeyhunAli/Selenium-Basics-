package datadriventestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilityExcel.Xls_Reader;

public class Parameterizeddatadriven {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ali-c\\eclipse-workspace\\SeleniumBasics\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.close();
//


	
		Xls_Reader reader = new Xls_Reader("C:/Users/Ali-c/eclipse-workspace/SeleniumBasics/excell files/spotify.xlsx");
			
		int rowcount = reader.getRowCount("sheet1");
		reader.addColumn("sheet1", "Status");
	

		for(int rowNum =2 ;rowNum<=rowcount; rowNum++) { //parameterized only with the looping consept
			
			String firstname = reader.getCellData("sheet1", "firstname",rowNum);
			System.out.println(firstname);

			String lastname = reader.getCellData("sheet1", "lastname", rowNum);
			System.out.println(lastname);


			String usernmae = reader.getCellData("sheet1", "username", rowNum);
			System.out.println(usernmae);



			String password = reader.getCellData("sheet1", "password", rowNum);
			System.out.println(password);


			String confirmpassword = reader.getCellData("sheet1", "confirmpassword", rowNum);
			System.out.println(confirmpassword);
			
			
		
		
			driver.findElement(By.xpath("//input[@id='firstName']")).clear();
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
			
            driver.findElement(By.xpath("//input[@id='lastName']")).clear();
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
            
			driver.findElement(By.xpath("//input[@id='username']")).clear();
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys(usernmae);
            
			driver.findElement(By.xpath("//input[@name='Passwd']")).clear();
			driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(password);
			
			driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).clear();
            driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys(confirmpassword);
            
            
            driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

			reader.setCellData("sheet1", "Status", rowNum, "pass");
            


		}	

	}

}
