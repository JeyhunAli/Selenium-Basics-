package tutorialsTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngconsept {
	
	//prerequest preconditions of annotations starts with @before 
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite "+ "setup");
	}
	
	@BeforeTest  
	public void launcBrowser() {
		System.out.println("@BeforeTest "+ "launchbrowser");
	}

	@BeforeClass
	public void enterurl() {
		System.out.println("@BeforeClass "+"enter url");
		
	}
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod "+ "login");
	}
	//here we have only one test cases . test cases counting only with test annotations 
	//we can have multiple test cases in one class with the addthe rate test annotations
	//if we have 2,3 or multiple test annotations in the console its gonna print some pair of @before @after and @testannotations 
	//in a real time project we are not creating all these annotations 
	//interview questions how many annotations? 
	//1pre request annotations test and post canditions annotations 
	//after test annotations we can define them 1st,2nd or3rd as priority so when we execute them they are gonna print as they are sequenced 
	//anoteher good feature of testng its generating good report on index.html
	@Test (priority=1)    //test cases 
	public void googleTitleTest() {
		System.out.println("Test "+ "googleTitleTest");
	}
	
	@Test(priority=2)
	public void search() {
		System.out.println("test "+ "search");
		int a =9/0;  //this statement by me  this statement is gonna give error because 9devide to 0 gives error 
		System.out.println(a);
	}
	
	@Test(priority=3)
	public void isdisplayed() {
		System.out.println("test1 "+ "isdisplayed");
	}
	// postconditions annotations starts with @after 
	@AfterMethod
	public void logout(){
		System.out.println("@AfterMethod "+"logout");
	} 
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass "+"closeBrowser");
	}
	
	
	@AfterTest
	public void deleteallcookies() {
		System.out.println("@AfterTest "+ "deleteallcookies");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
