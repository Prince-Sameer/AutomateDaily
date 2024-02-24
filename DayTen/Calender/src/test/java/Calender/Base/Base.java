package Calender.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {

	protected WebDriver driver;
	
	protected String year;

	protected String month;

	protected String date;
	@BeforeTest
	public void setUp() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser= new JSONParser();
		Object obj= parser.parse(new FileReader(System.getProperty("user.dir")+"/src/test/resources/data.json"));
		JSONObject jobj= (JSONObject)obj;
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get((String)jobj.get("url"));
		year= (String)jobj.get("year");
		month=(String)jobj.get("month");
		date=(String)jobj.get("date");
		
		
	}
	public String getStringShots(String methodName, WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"/reports/"+methodName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"/reports/"+methodName+".png";
	}
	
    
}
