package search_and_store.Components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	
	protected WebDriver driver;
	Properties pro;
	
	@BeforeTest
	public void setUp() throws FileNotFoundException, IOException
	{
		pro= new Properties();
		pro.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/prod.properties"));
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(pro.getProperty("url"));
		
	}

}
