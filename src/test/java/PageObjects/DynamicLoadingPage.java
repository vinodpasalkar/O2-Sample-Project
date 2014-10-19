package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DynamicLoadingPage extends Page {
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Example 1:")
    private WebElement example_1_Link; //Example 1 Link
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Example 2:")
    private WebElement example_2_Link; //Example 2 Link
	
	public DynamicLoadingPage(WebDriver driver) {
        super(driver);
        
    }
	
	public void ClickOnLink(String linkname){
    	if( linkname == "Example 1" ){
    		waitForVisibility(_driver,example_1_Link);
    		example_1_Link.click();
         }else if( linkname == "Example 2"){
        	 waitForVisibility(_driver,example_2_Link);
        	 example_2_Link.click();
         }else{
         System.out.println("Link is not present on the DynamicLoadingPage , please check again");
         }
    }
	
	 
}
