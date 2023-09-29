package module1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class LinkedList1 {

	static WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reshm\\eclipse-workspace\\DSAlgoAppTestNG\\src\\test\\resources\\driver\\chromedriver.exe");
			
	}
    @Test	
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
    @Test(dependsOnMethods="login")
    public void GetStarted_LinkedList() {
    	String url="https://dsportalapp.herokuapp.com/home";
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement GetStartedLinkList=driver.findElement(By.xpath("//div//div//div//a[@href=\"linked-list\"]"));
    	GetStartedLinkList.click();
    }
    @Test(priority=2)
    public void ClickOnLinkedList()
	{
		String url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GetStartedLink=driver.findElement(By.xpath("//div//div[3]//div//div//a[contains(@href,'linked-list')]"));
		GetStartedLink.click();
		LoggerLoad.info("User can click the link");
	}
    @Test(dependsOnMethods="ClickOnLinkedList")
    public void clickonIntroduction() {
		String url="https://dsportalapp.herokuapp.com/linked-list/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement IntroductionLink=driver.findElement(By.linkText("Introduction"));
		IntroductionLink.click();
		LoggerLoad.info("User can click the link");
	}
    @Test(dependsOnMethods="clickonIntroduction")
	public void TryHereLinkedList() {
		String url="https://dsportalapp.herokuapp.com/linked-list/introduction/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement TryHereLink =driver.findElement(By.linkText("Try here>>>"));
		TryHereLink.click();
	}
    
    
}

