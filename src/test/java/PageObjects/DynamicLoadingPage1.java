package PageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage1 extends Page{

	@FindBy(how = How.TAG_NAME, using = "button")
    private WebElement start_Button; //Start Button
	
	public DynamicLoadingPage1(WebDriver driver) {
        super(driver);
   }
	
	public void ClickOnObject(String objectname){
    	if( objectname == "Start Button" ){
    		waitForVisibility(_driver,start_Button);
    		start_Button.click();
         }else{
         System.out.println("Button is not present on the DynamicLoadingPage1 , please check again");
         }
	}
	
	public void AssertSucessMessage(){
		WebDriverWait wait = new WebDriverWait(_driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
	
	    WebElement success_message = _driver.findElement(By.id("finish"));
	    String success_Message_Text = success_message.getText();
	    
	    assertTrue(success_Message_Text.contains("Hello World!"));
		        
	}
}
