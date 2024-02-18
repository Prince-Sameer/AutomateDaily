package extentReports.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {

	public static ExtentReports getReporterObject()
	{
		String path= System.getProperty("user.dir")+"/reports/report.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Md Sameer Ahmed");
		return extent;
	}
}

