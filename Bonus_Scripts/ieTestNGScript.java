// Build On Prior Pages

package inClassExamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class ieTestNGScript
{
	public WebDriver driver;
	String baseURL = "google.com";
	
	@BeforeTest
		public void setUp () throws Exception
		{
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			System.setProperty("webdriver.ie.driver",
					"C:\\SeleniumLabs\\LabEnvironment\\SeleniumServers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(caps);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		@Test
		public void openBrowser (){
		//Replace with your URL
		driver.get(baseURL);
		}
	
		@AfterTest
		public void tearDown () throws Exception
		{
			if(driver!=null) {
				System.out.println("Closing IE browser");
				//driver.quit();
			}
		}
		
	}