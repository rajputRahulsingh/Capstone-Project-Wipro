package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DrivereFactory;
public class BaseTest {
	public static  WebDriver driver;
   @BeforeMethod
   public void setup() {
	   
	   driver = DrivereFactory.initializeBrowser();
   }
   @AfterMethod
   public void tearDown() {
	   
	   driver.quit();
   }
   public void scrollToElement(WebElement element) {

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
