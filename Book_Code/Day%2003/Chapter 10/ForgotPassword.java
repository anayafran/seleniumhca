package LinkedInHomePage;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class ForgotPassword
{
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
	public void clickForgotPassword() {
		driver.findElement(By.linkText("Forgot password?")).click();
		}
	}

