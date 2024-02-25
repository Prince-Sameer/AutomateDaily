package BrokenLinks.PageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BrokenLink.Abstract.Abstract;

public class PageObjects extends Abstract {
	
	HashMap<String, String> brokenLinks= new HashMap<String, String>();
	public PageObjects(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='gf-li']/a")
	List <WebElement> footerlinks;
	
	@FindBy(id="gf-BIG")
	WebElement Footer;
	
	
	
	public void checkBroken() throws Exception, IOException
	{
		
		
		scrollTo(Footer);
		ListIterator<WebElement> a=footerlinks.listIterator();
		while(a.hasNext())
		{
			WebElement link= a.next();
			String url= link.getAttribute("href");
			
			if(url!=null && !url.isEmpty())
			{
				HttpURLConnection connection= (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				int responseCode= connection.getResponseCode();
				if(responseCode>399)
				{
					brokenLinks.put(link.getText(), url);
				}
				else
				{
					Assert.assertTrue(true);
				}
				
			}
			
		}
		
		driver.quit();
	}
	
	
	
	

}
