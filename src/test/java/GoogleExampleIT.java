/*
 * Requirement:
 * 
 *  1. please fix all the bug in this file 
 *  2. please run it
 *  3. sent your test result and the fixed the file to us
 * 
 * 
 * */


@Test(groups={"localTest"})
public class GoogleExampleIT {
	private static final Logger LOGGER = LogManager.getLogger(GoogleExampleIT.class.getName());
	private WebDriver driver;
	@FindBy(css = "[name='q']")
	private WebElement searchBar;

	@Test
	public void googleCheeseExample() throws Exception {
		searchBar.clear();
		searchBar.sendKeys("Cheese!");
		searchBar.sendKeys(Keys.ENTER);
		LOGGER.info("Page title is: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Google"));
	}

	@Test(enabled = true)
	public void googleMilkExample() throws Exception {
		searchBar.clear();
		searchBar.sendKeys("Milk!");
		searchBar.sendKeys(Keys.ENTER);
		LOGGER.info("Page title is: {}", driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Google"));
	}

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
}
