package ImageToPDF;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagePage  extends Abstract{
     
	WebDriver driver;
	public ImagePage(WebDriver driver)
	{   
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(), 'Choose File')]")
	WebElement button;
	@FindBy(xpath="//div[@class='d-flex align-items-center ml-2_ mb-2 overflow-hidden']")
	WebElement file;
	
	public void fileupload() throws InterruptedException, IOException
	{
		wait(button);
		button.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"/src/test/resources/fileupload.exe");
		file.isDisplayed();
		driver.close();
		
	}
	
}

