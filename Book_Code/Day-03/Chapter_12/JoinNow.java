package LinkedInHomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
public class JoinNow {
    WebDriver driver;
    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumLabs/LabEnvironment/SeleniumServers/chromedriver.exe");
		
        driver = new ChromeDriver();
        driver.get("https: //www.linkedin.com/");
        }
        @AfterTest
        public void tearDown() throws Exception {
            driver.quit();
        }
        @Test
        public void clickJoinNowButton() {
            // This button can be clicked using submit() or click()
            driver.findElement(By.tagName("button")).submit();
        }
    }
