package CucumbExcel.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;

public class Base {
	
	WebDriver driver;
	String url, email, password;

	@Given("^I set up env")
	public void setUp() throws IOException
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Data.xlsx");
		XSSFWorkbook xs= new XSSFWorkbook(fi);
		XSSFSheet credentials=xs.getSheet("credentilas");
		url= credentials.getRow(1).getCell(0).getStringCellValue();
		email= credentials.getRow(1).getCell(1).getStringCellValue();
		password=credentials.getRow(1).getCell(2).getStringCellValue();
	}
}
