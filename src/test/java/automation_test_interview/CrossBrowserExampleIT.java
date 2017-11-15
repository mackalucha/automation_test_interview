/* 
 * Requirements: 
 * 
 * 1. Access the site:  http://edteam.prodigygame.org/qa/
 *    username and password to access this site is edteam/BeanSproutMints3
 * 2. Verify the question total for skill number = 3, ie. expected question total = 45
 * 3. Default webdriver is firefox
 * 3. If you have enough time, please run the test with chrome and safari as well
 * 
 * 
 * */


/**public class CrossBrowserExampleIT {
	private WebDriver driver;


	@BeforeMethod
	public void setUp() {
		driver = new new FirefoxDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		driver.get("http://www.google.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}**/
