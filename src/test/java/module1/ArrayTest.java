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

public class ArrayTest {
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
	@Test(dependsOnMethods="login")
	public void clickGetStarted_Array() {
		String url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GetStarted=driver.findElement(By.xpath("//div//div//div//a[@href='array']"));
		GetStarted.click();
		LoggerLoad.info("User is able to click on the Get started link of the array");
		
	}
	@Test(priority=3)
	public void ArrayInPython() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ArrayInPythonLink=driver.findElement(By.partialLinkText("Python"));
		ArrayInPythonLink.click();
		LoggerLoad.info("User can select the link: Array in Python");
	}
	@Test(dependsOnMethods="ArrayInPython")
    public void TryHereLinkArrayInPython(){
		String url="https://dsportalapp.herokuapp.com/array/arrays-in-python/";
		driver.get(url);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Arrays in Python");
    	
    }
	@Test(dependsOnMethods="TryHereLinkArrayInPython")
    public void TextboxToEnterTheCode_ArrayInPython() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	@Test(priority=4)
	public void ArraysUsingListClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement arrayusinglistlink=driver.findElement(By.partialLinkText("List"));
		arrayusinglistlink.click();
		LoggerLoad.info("User can click on: Arrays Using List");
	}
	@Test(dependsOnMethods="ArraysUsingListClick")
	public void TryHereArraysUsingList() {
		String url="https://dsportalapp.herokuapp.com/array/arrays-using-list/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Arrays Using List");		
	}
	@Test(dependsOnMethods="TryHereArraysUsingList")
    public void TextboxToEnterTheCode_ArrayUsingList() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	@Test(priority=5)
	public void BasicOperationListClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement BasicOperationsInList=driver.findElement(By.partialLinkText("Operations"));
		BasicOperationsInList.click();
		LoggerLoad.info("User can click on Basic Operations in List");
		
	}
	@Test(dependsOnMethods="BasicOperationListClick")
	public void TryHereBasicOperationList() {
		String url="https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Basic Operations in List");
		
	}
	@Test(dependsOnMethods="TryHereBasicOperationList")
    public void TextboxToEnterTheCode_BasicOperationList() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	@Test(priority=6)
	public void ApplicationOfArrayClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ApplicationsOfArray=driver.findElement(By.partialLinkText("Applications"));
		ApplicationsOfArray.click();
		LoggerLoad.info("User can click on Application of Array");
	}
	
	@Test(dependsOnMethods="ApplicationOfArrayClick")
	public void TryHereApplicationOfArray() {
		String url="https://dsportalapp.herokuapp.com/array/applications-of-array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Application of Array");
	}
	@Test(dependsOnMethods="TryHereApplicationOfArray")
    public void TextboxToEnterTheCode_ApplicationOfArray() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	
}
