package pages;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

    public class NewTestBrowser {
    WebDriver driver;
    
    @Parameters("browser")
    @BeforeTest
    public void beforeMytest(String browser) 
 { 
        if (browser.equalsIgnoreCase("chrome")) {
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        	driver = new ChromeDriver();
        }
    
        else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.geckodriver", "/Users/shreyajoshi/Downloads/geckodriver");
            driver = new FirefoxDriver();
        }
            else if (browser.equalsIgnoreCase("safari")) {
                //System.setProperty("webdriver.geckodriver", "/Users/shreyajoshi/Downloads/geckodriver");
                driver = new SafariDriver(); 
        } 
        }
    
    @Test
    public void herokuapplogin() {
    		String url = "https://dsportalapp.herokuapp.com/home";
    		String expected = "NumpyNinja";
    		driver.get(url);
    		String actual = driver.getTitle();
    		AssertJUnit.assertEquals(actual,expected);
    		WebElement registerLink = driver.findElement(By.linkText("Register"));
    		registerLink.click();
    	    try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    	}
    
    
    @AfterTest
    public void endTest() {
  	  driver.quit();
    }
    
    }
    