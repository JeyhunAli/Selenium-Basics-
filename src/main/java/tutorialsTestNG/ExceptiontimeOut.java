package tutorialsTestNG;

import org.testng.annotations.Test;

public class ExceptiontimeOut {
	
	//this method helps us to stop some infinite executing after some amount of time 
	//but its better to avoid this kind of coding 
	//theres anothor method lets say im waiting some exception in my program and still i want to execute my program
	//for that we use exepted exception method 
	//once declare our program as exceptde exception despite of the error program will run and execute 
	@Test(timeOut=200)  //
	public void infiniteloop() {
		
		int i = 10;
		while(i==10) {
		//	System.out.println(i);
			
		}
		
		
	}
	
	@Test(expectedExceptions=NumberFormatException.class)  // this is the consept of excepted exception lets say im waiting soe exception but still i 
	                                 //i want to execute my test cases for that we use this consept 
	                                // try catch blog also is available for that 
	public void test1() {                  //but in selenium we cannot do that we have to mark it as a failure test case
		String c = "200A";
		Integer.parseInt(c);
		
		
	}
	
	
	

}
