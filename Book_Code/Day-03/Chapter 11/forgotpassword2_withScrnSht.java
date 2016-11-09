package LinkedInHomePage;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class ForgotPassword2
{
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumLabs/LabEnvironment/SeleniumServers/chromedriver.exe");
		driver = new ChromeDriver();
		// Go to LinkedIn’s Home Page
		driver.get("https://www.linkedin.com/");                  
	}

	@Test	
	public void clickForgotPassword() {
		driver.findElement(By.partialLinkText("Forgot")).click();
	}
	
	 public static String getRandomString(int length){ 
		 StringBuilder sb = new StringBuilder(); 
		 String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGH1234567890";
		 for (int i =0; i< length; i++){
			 int index = (int)(Math.random()* characters.length());
			 sb.append(characters.charAt(index));
		 }
		 return sb.toString();
	 }
	
	@AfterTest
	public void tearDown() throws Exception {
		String fileName= "LinkedIn_ "+ getRandomString(5) + ".png"; 
		String directory = "C://Users//Administrator//Desktop//";
		
		File sourceFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory+ fileName));  
		driver.quit();
	}


}
