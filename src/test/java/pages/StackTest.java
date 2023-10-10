package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class StackTest extends HomeTest {

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
	public void clickGetStarted_Stack() {
		String url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GetStarted=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/a"));
		GetStarted.click();
		LoggerLoad.info("User is able to click on the Get started link of the Stack");
		
	}
	@Test(priority=3)
	public void OperationsInStack() {
		String url="https://dsportalapp.herokuapp.com/stack/";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement OperationsInStack=driver.findElement(By.partialLinkText("Operations"));
		OperationsInStack.click();
		LoggerLoad.info("User can select the link: Operations In Stack");
	}
	@Test(dependsOnMethods="OperationsInStack")
    public void TryHereLinkOperationsInStack(){
		String url="https://dsportalapp.herokuapp.com/stack/operations-in-stack/";
		driver.get(url);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Operations In Stack");
    	
    }
	@Test(dependsOnMethods="TryHereLinkOperationsInStack")
    public void TextboxToEnterTheCode_OperatkonsInStack() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	@Test(priority=4)
	public void ImplementationClick() {
		String url="https://dsportalapp.herokuapp.com/stack/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Implementationlink=driver.findElement(By.partialLinkText("Implementation"));
		Implementationlink.click();
		LoggerLoad.info("User can click on: Implementation");
	}
	@Test(dependsOnMethods="ImplementationClick")
	public void TryHereImplementation() {
		String url="https://dsportalapp.herokuapp.com/stack/implementation/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Implementation");		
	}
	@Test(dependsOnMethods="TryHereImplementation")
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
	public void ApplicationsClick() {
		String url="https://dsportalapp.herokuapp.com/stack/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Applications=driver.findElement(By.partialLinkText("Applications"));
		Applications.click();
		LoggerLoad.info("User can click on Applications");
		
	}
	@Test(dependsOnMethods="ApplicationsClick")
	public void TryHereApplications() {
		String url="https://dsportalapp.herokuapp.com/stack/stack-applications/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Applications");
		
	}
	@Test(dependsOnMethods="TryHereApplications")
    public void TextboxToEnterTheCode_Applications() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
}


		
