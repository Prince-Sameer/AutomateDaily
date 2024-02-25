package brokenLink.Tests;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import BrokenLinks.PageObjects.PageObjects;
import brokenLink.Base.Base;

public class BrokenLinkTest extends Base {
	
	@Test(dataProvider="url")
	public void checkBrokenLink(String webUrl) throws Exception
	{
		driver= new ChromeDriver();
		driver.get(webUrl);
		PageObjects p= new PageObjects(driver);
		p.checkBroken();
				
	}

}
