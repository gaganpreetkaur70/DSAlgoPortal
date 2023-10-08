package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class HomeTest {
	
	static WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reshm\\eclipse-workspace\\DSAlgoAppTestNG\\src\\test\\resources\\driver\\chromedriver.exe");
			
	}
    @Test(priority=1)	
	public void OpenWebsite() {
		String url="https://dsportalapp.herokuapp.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
   

	
}