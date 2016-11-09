// Build On Prior Pages

package inClassExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class SelectRadioButton2
{
	WebDriver driver;
	@BeforeTest
	public void setUp () throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumLabs/LabEnvironment/SeleniumServers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

	}


	@AfterTest
	public void tearDown () throws Exception
	{
	//driver.quit();
	}
	@Test
	public void selectGender ()
		{
		//driver.findElement(By.cssSelector("#u_0_f")).click();
		}
}
