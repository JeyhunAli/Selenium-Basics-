package tutorialsTestNG;

import org.testng.annotations.Test;

public class Invovationcounttestng {

	
	
	@Test(invocationCount=10)  //if you want to execute same test cases multiple time for that we use invocationCount method 
	public void mult() {
		int a = 20;
		int b = 25;
		int c =a*b;
		System.out.println(c);
	}
}
