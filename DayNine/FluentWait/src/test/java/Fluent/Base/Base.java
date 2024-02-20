package Fluent.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Base {
	
	protected WebDriver driver;
	protected String product="";
	@BeforeTest
	public void before() throws Exception
	{
		
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Properties pro= new Properties();
		pro.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/prod.properties"));
		driver.get(pro.getProperty("url"));
		product=pro.getProperty("product");
		
		
		
	}

}
