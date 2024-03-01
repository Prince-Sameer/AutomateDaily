package serach_and_store.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import search_and_strore.Abstract.Abstract;

public class SearchResult extends Abstract {

	public SearchResult(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@jsname='UWckNb']")
	List<WebElement>linksele;
	
	String[] links= new String[10];
	
	public void store()
	{
		if(linksele.size()<10)
		{
			Actions a= new Actions(driver);
			a.scrollToElement(driver.findElement(By .xpath("(//a[@jsname='UWckNb'])[9]")));
			
			
		}
		for(int i=0;i<10;i++)
		{
			links[i]=linksele.get(i).getAttribute("href");
			System.out.println(links[i]);
		}
		
	}

}
