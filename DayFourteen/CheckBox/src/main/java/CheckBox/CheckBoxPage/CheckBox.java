package CheckBox.CheckBoxPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CheckBox.Abstract.Abstract;

public class CheckBox extends Abstract {
	
	

    @FindBy(xpath="//input[@value='red']")
    WebElement CheckB;
    
    By tagName= By.tagName("input");

    public CheckBox(WebDriver driver) {
        super(driver);
        
        PageFactory.initElements(driver, this);
    }

    public void check() throws InterruptedException {
    	wait(tagName);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", CheckB);
        CheckB.clear();
        CheckB.click();
       
    }
}

