package extentReports.components;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Calender.Base.*;

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
		String path="";
		WebDriver driver = (WebDriver) result.getAttribute("driver");
		if (driver!=null)
		{
			try {
				path= getStringShots(result.getName(), driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
			path = getStringShots(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(path);
	}
	
	

	

	public void onFinish(ITestContext result)
	{
		extent.flush();
	}

}
