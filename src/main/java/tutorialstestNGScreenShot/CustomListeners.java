//this custom listeners purpose to take screenshot of failed or succesed test cases 
//for that we have to extend our base class as well as implement one default interface 
//once we implement ITestListener several methods will come by default no need to change the name of thm they are bydefault 

package tutorialstestNGScreenShot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends Base implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test case"); //here just printing 
		failed(result.getMethod().getMethodName());  // this method name comes from base class directly 
		//what does this testNGListeners do lets say if our test case fail immeditately it will come over here 
		// it will print our statement then it will check if the method which we called get fail then it will take a screen shot 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
