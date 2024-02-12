package cucumb.Tests;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/resources", glue="cucumb.stepdef" , monochrome=true, plugin= {"html:target/cucumber.html"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
