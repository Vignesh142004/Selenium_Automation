package automation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void onStart(ITestContext context) // it will execute only once.
	{
	    System.out.println("Test Execution starts..");
	}
	
	public void onTestStart(ITestResult result) // it will execute before all test method.
	{
	    System.out.println("Test starts..");
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Passed..");
	}
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Failed..");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Skiped..");
	}
	
	public void onFinish(ITestContext context) 
	{
		System.out.println("Test execution is completed..");
	}
	
	
    
}
