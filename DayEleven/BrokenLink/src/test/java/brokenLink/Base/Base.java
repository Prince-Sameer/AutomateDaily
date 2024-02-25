package brokenLink.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Base {

    public WebDriver driver;

    @BeforeMethod
    @DataProvider(name="url")
    public Object[][] getUrl() {
        return new Object[][] {
            { "https://rahulshettyacademy.com/AutomationPractice/" }
        };
    }

    public String takeScreenShots(String testName, WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File ss = ts.getScreenshotAs(OutputType.FILE);
        File f = new File(System.getProperty("user.dir"), "reports/" + testName + ".png");
        try {
            FileUtils.copyFile(ss, f);
        } catch (IOException e) {
            e.printStackTrace();
        }
		return System.getProperty("user.dir")+"reports/" + testName + ".png";
    }
}