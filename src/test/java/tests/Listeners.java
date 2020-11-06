package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface with implements TestNG listeners
public class Listeners implements ITestListener{

	public void onFinish(ITestContext arg0) {
	
	}

	public void onStart(ITestContext arg0) {
		System.out.println("I successfully executed Listeners Start codes");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult arg0) {
		
	}

	public void onTestSkipped(ITestResult arg0) {
	
		
	}

	public void onTestStart(ITestResult arg0) {
		 System.out.println("I successfully executed Listeners TestStart codes");
			
	}

	public void onTestSuccess(ITestResult arg0) {
	  System.out.println("I successfully executed Listeners Pass codes");
		
	}  

}
