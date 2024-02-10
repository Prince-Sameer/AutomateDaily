package Logon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
	WebDriver driver;
	String url, email, pass, browser;
	
	@BeforeTest
	public void data() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser= new JSONParser();
		Object obj= parser.parse(new FileReader(System.getProperty("user.dir")+"/src/test/resources/data.json"));
		JSONObject data= (JSONObject) obj;
	    url=(String) data.get("Url");
	    email=(String) data.get("Email");
	    pass=(String) data.get("Pass");
	    browser=(String) data.get("Browser");
	    
	    if (browser.equalsIgnoreCase("chrome"))
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
	    	System.out.print("Please correct vrowser details in data.json");
	    }
	    
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
