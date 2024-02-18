package extentReports.components;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import extentReports.Tests.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends Base implements ITestListener {
	
	ExtentTest test;
	
	ExtentReports extent = extentReports.Report.Report.getReporterObject();
	
	public void onTestStart(ITestResult result)
	{
		test=extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, "Test Passed");
	}
	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getThrowable());
		String path="";
		WebDriver driver=null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			path = getStringshots(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(path);
	}
	
	public void onFinish(ITestResult result)
	{
		extent.flush();
	}

}
