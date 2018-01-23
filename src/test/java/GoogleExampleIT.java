/*
 * Requirement:
 * 
 *  1. please fix all the bug in this file 
 *  2. please run it
 *  3. sent your test result and the fixed the file to us
 * 
 * 
 * */

package kalucha.mac;

import java.util.logging.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class GoogleExampleIT {
	
		private static final Logger logger = Logger.getLogger(GoogleExampleIT.class.getName());
		private WebDriver driver;
		@FindBy(css = "[name='q']")
		
		private WebElement searchBar;

		
	@BeforeMethod
		public void setUp() {
		
		
		System.setProperty("webdriver.gecko.driver",
                "C:/Users/mac.kalucha/Downloads/geckodriver-v0.19.0-win64/geckodriver.exe");
				driver = new FirefoxDriver();
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
			driver.get("http://www.google.com");
			
	}
			
	@AfterMethod
		public void tearDown() {
			driver.close();
		}

	@Test(enabled = true)
		public void googleCheeseExample() throws Exception {
			searchBar.clear();
			searchBar.sendKeys("Cheese!");
			searchBar.sendKeys(Keys.ENTER);
			logger.info("Page title is: " + driver.getTitle());
			Assert.assertTrue(driver.getTitle().equals("Google"));
		}
	@Test(enabled = true)
		public void googleMilkExample() throws Exception {
			searchBar.clear();
			searchBar.sendKeys("Milk!");
			searchBar.sendKeys(Keys.ENTER);
			logger.info("Page title is: " + driver.getTitle());
			Assert.assertTrue(driver.getTitle().equals("Google"));
		}

}
