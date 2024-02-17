package CucumbExcel.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java", glue="CucumbExcel.Tests", monochrome=true, plugin= {"html:target/cucumber-html-report.html"})
public class TestNgRun extends AbstractTestNGCucumberTests{
	
}
