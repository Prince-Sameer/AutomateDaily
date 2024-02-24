package extentReports.Tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.reporters.Files;

public class Base {
	
	public WebDriver driver;
	String browser, url, email, pass, prod;
	
	@BeforeTest
	public void setup() throws ParseException, FileNotFoundException, IOException
	{
		JSONParser parcer= new JSONParser();
		Object obj= parcer.parse(new FileReader(System.getProperty("user.dir")+"/src/test/resources/data.JSON"));
		JSONObject data= (JSONObject) obj;
	    browser= (String) data.get("browser");
	    url=(String) data.get("url");
	    email=(String) data.get("email");
	    pass=(String) data.get("password");
	    prod=(String) data.get("product");
	    
	    if(browser.equalsIgnoreCase("chrome"))
	    {
	    	driver=new ChromeDriver();
	    }
	    else if(browser.equalsIgnoreCase("edge"))
	    {
	    	driver= new EdgeDriver();
	    	
	    }
	    else if(browser.equalsIgnoreCase("firefox"))
	    {
	    	driver= new FirefoxDriver();
	    }
	    else
	    {
	    	System.out.print("Please modify data.JSON file");
	    }
	    
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    
	}
	
	public String getStringshots(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"/report/"+testCaseName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"/report/"+testCaseName+".png";
		
		
	}

}
