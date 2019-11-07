//in this consept the new feature is dependency consept lets say we have some more test cases and one of them most important login test cases
// and during executing the test cases we get login failure ,
//if login get failure then another tests they will not be consider tthey will ignore .
//and the test cases which is ignored they will be as a yellow color on the console it means they are skipped 

package tutorialsTestNG;

import org.testng.annotations.Test;

public class TestngFeatures {
	
	@Test
	public void logintest() {
		System.out.println("logintest");
		int a = 9/0;
		System.out.println(a); //this consept lets u to make your test case get failure 
	}

	@Test(dependsOnMethods="logintest") //here all our test cases depent on logintest case 
	public void signIn() {                   // if login test get failure there is no amy point to execute another test cases 
		System.out.println("signIn");         // even if u run it anothor test cases will skip 
	}
 
	@Test(dependsOnMethods="logintest")
	public void addargument() {
		System.out.println("addargument");
	}
 
	@Test(dependsOnMethods="logintest")
	public void signout() {
		System.out.println("signout");
	}
 
	
	
}
