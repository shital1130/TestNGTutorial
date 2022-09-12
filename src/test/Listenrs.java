package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listenrs implements ITestListener {
@Override
public void onTestSuccess(ITestResult result)
{
	System.out.println("I successfully executed Listeners pass code");
	
	}

	
	
}
