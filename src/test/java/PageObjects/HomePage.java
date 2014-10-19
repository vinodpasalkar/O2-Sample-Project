package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class HomePage extends Page{
 
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Dynamic Loading")
    private WebElement dynamic_Loading_Link; //Dynamic Loading Link
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Checkboxes")
	private WebElement checkboxes_Link; //Checkboxes Link
	
	private String baseUrl;
	
    public HomePage(WebDriver driver) {
        super(driver);
        
    }
 
    public void LoadHomePage(){
    	baseUrl = "http://the-internet.herokuapp.com/";
    	_driver.get(baseUrl);
    	
       	if (!_driver.getTitle().contains("The Internet")) {
            throw new IllegalStateException("Failed to load home page " + _driver.getCurrentUrl());
        }
    	
    }
    
    public void ClickOnLink(String linkname){
    	if( linkname == "Dynamic Loading" ){
    		dynamic_Loading_Link.click();
         }else if( linkname == "Checkboxes"){
        	 checkboxes_Link.click();
         }else{
         System.out.println("Link is not present on the HomePage, please check again");
         }
    }
    
}
