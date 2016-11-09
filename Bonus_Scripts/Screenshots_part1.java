package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Screenshots {
	private WebDriver driver;
	private String baseURL;
	
  @BeforeTest
  public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  baseURL = "https://www.expedia.com/";
	  
	  //Maximize the browser's Window
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

	
  @Test
  public void testScreenshots() {
	  driver.get(baseURL);
	  
	  //Step 1: Open the Flight Tab
	  driver.findElement(By.id("tab-flight-tab")).click();
	  
	  //Find Elements
		  WebElement flight_origin = driver.findElement(By.id("flight-origin"));
		
		  //flight_destination 
		  WebElement flight_destination  = driver.findElement(By.id("flight-destination"));  
		
		  //departure_date
		  WebElement departure_date = driver.findElement(By.id("flight-departing"));
		
		  //return_date
		  WebElement return_date = driver.findElement(By.id("flight-returning"));
		
		  //search
		  WebElement search = driver.findElement(By.id("search-button"));
		  
	
		  flight_origin.sendKeys("Nashville TN");
		  departure_date.sendKeys("11/09/2016");
		  return_date.clear();
		  return_date.sendKeys("11/15/2016");
		  flight_destination.sendKeys("Maputo, Mozambique");
		  search.click();
		  
  }
  
//  public static String getRandomString(int length){ 
  //}
  
  
  @AfterTest
  public void tearDown() throws Exception {
	 // driver.quit();
  }

}
