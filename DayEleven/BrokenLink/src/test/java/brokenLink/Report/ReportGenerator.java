package brokenLink.Report;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	
	
	public class ReportGenerator {
		
	    private ExtentReports extentReports;

	    public ExtentReports Report() {
	        extentReports = new ExtentReports();
	        ExtentSparkReporter reporter = new ExtentSparkReporter(new File(System.getProperty("user.dir"), "reports/report.html"));
	        extentReports.attachReporter(reporter);
	        return extentReports;
	    }


}
