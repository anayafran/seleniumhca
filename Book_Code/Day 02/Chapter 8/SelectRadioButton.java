// Page 179 Chaapter 8
package InClassExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class SelectRadioButton {

    WebDriver driver;
    @BeforeTest
    public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "C:/SeleniumLabs/LabEnvironment/SeleniumServers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            }
    @AfterTest
    public void tearDown() throws Exception {
            driver.quit();
            }
    @Test
    public void selectGender() {
            driver.findElement(By.xpath(" //*[@id='u_0_h']")).click();
                        }
                    }
