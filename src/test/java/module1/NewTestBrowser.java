package module1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class NewTestBrowser {

    private WebDriver chromedriver;
    private WebDriver firefoxdriver;

    @Parameters("browser")
    @BeforeClass
  
    public void setup(@Optional("chrome") String browser) { 
        if (browser.equalsIgnoreCase("chrome")) {
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            chromedriver = new ChromeDriver();
        }
    
      if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.geckodriver", "/Users/shreyajoshi/Downloads/geckodriver");
            firefoxdriver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser specified");
        }
    }

    @Test
  public void herokuapplogin() {
    	
    	 if (chromedriver != null) {
		String url = "https://dsportalapp.herokuapp.com/home";
		String expected = "NumpyNinja";
		chromedriver.get(url);
		String actual = chromedriver.getTitle();
		AssertJUnit.assertEquals(actual,expected);
		WebElement registerLink = chromedriver.findElement(By.linkText("Register"));
		registerLink.click();
        }
    	
    
	    if (firefoxdriver != null) {
	    	String url = "https://dsportalapp.herokuapp.com/home";
			String expected = "NumpyNinja";
			firefoxdriver.get(url);
			String actual = firefoxdriver.getTitle();
			AssertJUnit.assertEquals(actual,expected);
			WebElement registerLink = firefoxdriver.findElement(By.linkText("Register"));
			registerLink.click();
        
        }
	}
  

    @AfterClass
    public void tearDown() {
        if (chromedriver != null) {
            chromedriver.quit();
        }

        if (firefoxdriver != null) {
            firefoxdriver.quit();
        }
    }
    
    }