package LinkedInHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class JoinLinkedIn2 {
    WebDriver driver;
    @BeforeTest
    public void setUp() throws Exception {
        
    	System.setProperty("webdriver.chrome.driver", "C:/SeleniumLabs/LabEnvironment/SeleniumServers/chromedriver.exe");
    	driver = new ChromeDriver();
        // Go to LinkedIn’s Home Page
        
        driver.get("https://www.linkedin.com/");
        }
        @AfterTest
        public void tearDown() throws Exception {
            driver.quit();
        }
        @Test
        void enter_clearFirstName() {
            // Find first name via ID locator type
            WebElement userFirstName = driver.findElement(By.id("reg-firstname"));
            // Enter first name via send keys
            userFirstName.sendKeys("Test First Name");
            // Clear first name via clear
            userFirstName.clear();
        }
}
