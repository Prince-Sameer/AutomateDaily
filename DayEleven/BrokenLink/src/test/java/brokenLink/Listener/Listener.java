package brokenLink.Listener;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import brokenLink.Base.Base;
import brokenLink.Report.ReportGenerator;

public class Listener extends Base implements ITestListener{
	
	ExtentReports extent= new ReportGenerator().Report();
	ExtentTest test;
	public void addScreenshots(ITestResult result)
	{
		String path="";
		try {
			driver= (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		path=takeScreenShots(result.getMethod().getMethodName(), driver);
		
		test.addScreenCaptureFromPath(path);
	}
	
	public void onTestStart(ITestResult result) {
		
		test= extent.createTest(result.getMethod().getMethodName());
	    // not implemented
	  }
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test Passed");
		//addScreenshots(result);
		
		driver.quit();
	
	    // not implemented
	  }
	
	public void onTestFailure(ITestResult result) 
	{
		addScreenshots(result);
		test.log(Status.FAIL, "Test Failed");
		
		
	}
	public void onFinish(ITestContext context)
	{
	   extent.flush();
	   driver.quit();
	}

}
