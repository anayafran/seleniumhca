package inClassExamples;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class CaptureErrorMessage {
    WebDriver driver;
    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumLabs/LabEnvironment/SeleniumServers/chromedriver.exe");
		
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        }
        @AfterTest
        public void tearDown() throws Exception {
            //driver.quit();
        }
        @Test
        public void captureSignInErrorMessage() {
            WebElement parentSignIn = driver.findElement(By.className("login-form "));
            WebElement childEmail = parentSignIn.findElement(By.id("login-email"));
            WebElement childPassword = parentSignIn.findElement(By.id("login-password"));
           // WebElement childSignInButton = parentSignIn.findElement(By.xpath("//*[@id='login-submit']"));
            WebElement childSignInButton = parentSignIn.findElement(By.name("Sign in"));
            
            // Enter Email and Password then Click the Sign In button
            childEmail.sendKeys("me@moi.com");
            childPassword.sendKeys("34Tester");
            childSignInButton.click();

            // Capture the error messages
            String firstSignInErrorMessage = driver.findElement(By.xpath("//div[@class='alert error']//strong")).getText();
            System.out.println(firstSignInErrorMessage);
        }
    }
