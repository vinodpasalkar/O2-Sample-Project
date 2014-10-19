package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import PageObjects.DynamicLoadingPage;
import PageObjects.DynamicLoadingPage1;
import PageObjects.HomePage;

 public class SampleO2 {

   private WebDriver driver;
  
  @Before
  public void driverSetUp() throws Exception {

	driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
  }

  @Test
  public void SampleO2Test() throws Exception {

	  HomePage homepage = new HomePage(driver);
	  homepage.LoadHomePage();
	  homepage.ClickOnLink("Dynamic Loading");
      
	  DynamicLoadingPage dynamicloadingpage = new DynamicLoadingPage(driver);
	  dynamicloadingpage.ClickOnLink("Example 1");
	  
	  DynamicLoadingPage1 dynamicloadingpage1 = new DynamicLoadingPage1(driver);
	  dynamicloadingpage1.ClickOnObject("Start Button");
	  dynamicloadingpage1.AssertSucessMessage();
}

  @After
  public void tearDown() throws Exception {
    driver.quit();   
  } 

}
