package tutorialsTestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	//another feature of testNg is dependsOnMethod this method help us to make some dependency 
	//lets sat we have most important login test cases and its failed then no need to waste time to execute another following test cases 

@Test(priority=1,groups="gmaillink")  
public void gmaillink() {
	System.out.println("gmail link passed ");
	int a = 9/0;
	System.out.println(a);
	
	}
@Test(priority=3,groups="test",dependsOnMethods="gmaillink")
public void test1() {
	System.out.println("test1");
}

@Test(priority=4,groups="test")
public void test2() {
	System.out.println("test2");

}


}
