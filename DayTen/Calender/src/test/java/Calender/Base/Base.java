package Calender.Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get((String)jobj.get("url"));
		year= (String)jobj.get("year");
		month=(String)jobj.get("month");
		date=(String)jobj.get("date");
		
		
	}
}
