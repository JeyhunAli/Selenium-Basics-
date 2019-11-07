//hard asserton means in testng if any particular assertion get failed immediately after that all the releated lines 
//test cases will not be execute and this test case will mark as failed test cases 

//advanteges of hard assertion lets say we have login test case and we use hard assertion its better for that 
//because if login get failed then no need to execute other test cases

//soft assertion in testng is very good advantages if we use it very proper way what i mean proper way let me explain so 
// in every project in every program to make sure validation works perfectly fine we need assertion 
//if we use hard assertion in middle of our project it might be get failed and if it get failed imeddietly all the test cases all the methods which
//is coming after our hard assertion they will skip and our test cases will fail
//so to avoid this kind problem we use soft assertion . soft assertion we can write in any place we want but at the end of our test case i mean 
//end of the progrom no need to forget to put once we declare the   softassert.allassert();   is there still our test case will wxecute but at the 
//its gonna give us error that our test case failed or passed 
//but lets say if we used all the place of our test case just soft assert and we forget to put softassert.allassert(); at the end of our code 
//then our test case will pass and never will give any error so need to be careful 
//whenever we use soft assertion its better to use some messeges as well lets say in some case our test case failed 
//then in the testng report it gonna print that particular messeges that it got fail
package tutorialsTestNG;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertion {
	
	SoftAssert softassert = new SoftAssert();
	
	
	@Test
	public void startingtest1() {
		
		System.out.println("starting browser");
		Assert.assertEquals(true, true );
		
		System.out.println("entering url");
		
		System.out.println("entering valid login");
		
		System.out.println("entering valid password");
		
		System.out.println("hit the click button");
		Assert.assertEquals(true, true);
		
		System.out.println("validate home page");
		softassert.assertEquals(true, false ,"validatation of home page is failed ");
		
		System.out.println("go to the deals page ");
		
		System.out.println("create some deal");
		
		System.out.println("go to the contact page ");
		softassert.assertEquals(true, false, "contact page is failed ");
		
		System.out.println("create some contact");
		softassert.assertEquals(true, false, "not able to create a contact");
		
		softassert.assertAll();  //its important method i mentioned above 
	//in this test case our test will pass but in testng it will create report about failure of test case	
		
		
	}
	
	@Test
	public void test2() {
		System.out.println("logout");
		softassert.assertEquals(true, false,"got fail "); 
		softassert.assertAll();  //here if we dont put assertall then our test case will pass even though our test case 
		                         //is not macthing excepted with actual 
	}
	
	
	
	
	
 	
	
	
	

}
