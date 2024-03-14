package CheckBox.Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {

	String url;
	public WebDriver driver;
	@BeforeTest
	public void setUp() throws FileNotFoundException, IOException, ParseException
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		JSONParser parser= new JSONParser();
		JSONObject obj= (JSONObject) parser.parse(new FileReader(System.getProperty("user.dir")+"/src/test/resources/data.JSON"));
		url= (String) obj.get("URL");
		driver.get(url);
	}
}
