package youtube.Base;

import org.testng.annotations.Test;

import youtube.PageObjects.HomePage;

public class Tests extends Base{

	@Test(priority=0)
	public void scroll()
	{
		HomePage h= new HomePage(driver);
		h.scroll(0, 1000);
	}
	
	@Test(priority=1)
	public void play()
	{
		HomePage h= new HomePage(driver);
		h.click();
	}
}
