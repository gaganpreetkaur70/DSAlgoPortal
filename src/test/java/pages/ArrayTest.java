package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;
import io.qameta.allure.Step;

public class ArrayTest extends HomeTest {
	
	@Step("To open the website")
    @Test(priority=1)	
	public void OpenWebsite() {
		String url="https://dsportalapp.herokuapp.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
    
    @Step("To click on Get Started Link")
    @Test(dependsOnMethods="OpenWebsite")
    public void GetStartedLink() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement GetStarted=driver.findElement(By.xpath("//button[@class='btn']"));
        GetStarted.click();
    }
    @Step("User click on Sign in link")
    @Test(dependsOnMethods="GetStartedLink")
    public void SignInLink() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement SignIn= driver.findElement(By.partialLinkText("Sign"));
		SignIn.click();
    }
    @Step("User entering valid credentials to sign in to the website")
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
    @Step("User clicking on Get Started Link of Array")
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
    @Step("User is clicking on Array In Python Link")
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
    @Step("User clicking on Try Here link in the Array In Python Page")
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
    @Step("User Enter the python code in TryEditor page")
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
    @Step("User clicking on Arrays Using List")
	@Test(priority=4)
	public void ArraysUsingListClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement arrayusinglistlink=driver.findElement(By.partialLinkText("List"));
		arrayusinglistlink.click();
		LoggerLoad.info("User can click on: Arrays Using List");
	}
    @Step("User is clicking on Try Here link in Arrays Using List page")
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
    @Step("User is entering the python code in textbox editor")
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
    @Step("User click on Basic Operation List")
	@Test(priority=5)
	public void BasicOperationListClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement BasicOperationsInList=driver.findElement(By.partialLinkText("Operations"));
		BasicOperationsInList.click();
		LoggerLoad.info("User can click on Basic Operations in List");
		
	}
    @Step("User click on Try Here link in Basic Operation List page")
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
    @Step("User entering the python code")
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
    @Step("User click on Application of Array Link")
	@Test(priority=6)
	public void ApplicationOfArrayClick() {
		String url="https://dsportalapp.herokuapp.com/array/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ApplicationsOfArray=driver.findElement(By.partialLinkText("Applications"));
		ApplicationsOfArray.click();
		LoggerLoad.info("User can click on Application of Array");
	}
	@Step("User click on Try Here Link")
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
	@Step("User enter the python code")
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
