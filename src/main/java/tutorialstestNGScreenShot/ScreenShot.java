package tutorialstestNGScreenShot;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomListeners.class)  //purpose of this annotation is its allow this class to listen some declared listener and you have to pass the 
                                  //listeners class name it has to define above the class name 
                              //basically it does( like u asking pls listen to listeners class regulations  )

public class ScreenShot extends Base{
	
	@BeforeMethod
	
	public void SetUp() {
		initialazing();   //this method directly coming from base class 
	}
	
	@AfterMethod
	
	public void teardown() {  //this method will be fail then we have to take screenshot of fail method 
		                  //for that we have to create testng listeneres . this methods create once and takes screenshot in every failed class 
		     //or we can take screen shot about success test cases as well 
		//to create the listeners we have to create separate class 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.close();  // we can do close the browser here why because we extends Base class basically inherit 
		
	}
	
    @Test 
    public void login() {
    	Assert.assertEquals(false, true);
    }
    @Test 
    public void enteremailId() {
    	Assert.assertEquals(false, true);
    }
    
    @Test 
    public void enterpassword() {
    	Assert.assertEquals(false, true);
    }
    
    @Test 
    public void clicksinInButton() {
    	Assert.assertEquals(false, true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
