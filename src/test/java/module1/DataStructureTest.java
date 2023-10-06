package module1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import dsutilities.LoggerLoad;

	public class DataStructureTest {
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
	    @Test(dependsOnMethods="OpenWebsite")
	    public void GetStartedLink() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement GetStarted=driver.findElement(By.xpath("//button[@class='btn']"));
	        GetStarted.click();
	    }
	    @Test(dependsOnMethods="GetStartedLink")
	    public void SignInLink() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	WebElement SignIn= driver.findElement(By.partialLinkText("Sign"));
			SignIn.click();
	    }
	
	
 @Test(dependsOnMethods="SignInLink")
 public void login() {
 	String url="https://dsportalapp.herokuapp.com/login";
 	driver.get(url);
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	WebElement unametextbox=driver.findElement(By.id("id_username"));
		unametextbox.sendKeys("abc123@gmail.com");
		WebElement passwdtextbox=driver.findElement(By.id("id_password"));
		passwdtextbox.sendKeys("Aaa@1234");
		WebElement LoginButton=driver.findElement(By.xpath("//div//form//input[@type='submit']"));
		LoginButton.click();
		LoggerLoad.info("User logged in to the website successfully");
 }
	
	@Test (dependsOnMethods="login")
	public void openDataStructure() {
		
		 driver.findElement(By.xpath("//div[3]/div/div/div/a")).click();
		 LoggerLoad.info("Data Structure page opened");
	}
	
	@Test (dependsOnMethods="openDataStructure")
	public void openTimeComplexity() {
		
		 driver.findElement(By.xpath("//div[2]/ul/a[@class='list-group-item']")).click();
		 LoggerLoad.info("Time Complexity page opened");
	}
	
	
	
	@Test(dependsOnMethods="openTimeComplexity")
	public void TryHereLinkDataStructure(){
		String url="https://dsportalapp.herokuapp.com/array/arrays-in-python/";
		driver.get(url);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of DataStrcture");
    	
    }
	@Test(dependsOnMethods="TryHereLinkDataStructure")
    public void TextboxToEnterTheCode_DataStrcture() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	@Test (dependsOnMethods="TextboxToEnterTheCode_DataStrcture")
	public void openPracticeQuestion() {
		String url="https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/";
	 	driver.get(url);
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//div[2]/div/div/div/a[@class='list-group-item list-group-item-light text-info']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 LoggerLoad.info("Practice Question page opened");	 
	}
}
