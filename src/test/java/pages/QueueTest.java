package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dsutilities.LoggerLoad;

public class QueueTest extends HomeTest {

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
	public void clickGetStarted_Queue() {
		String url="https://dsportalapp.herokuapp.com/home";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GetStarted=driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/a"));
		GetStarted.click();
		LoggerLoad.info("User is able to click on the Get started link of the Stack");
		
	}
	@Test(priority=3)
	public void ImplementationOfQueueInPython() {
		String url="https://dsportalapp.herokuapp.com/queue/";
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ImplementationOfQueueInPython=driver.findElement(By.partialLinkText("Queue"));
		ImplementationOfQueueInPython.click();
		LoggerLoad.info("User can select the link: Implementation Of Queue In Python");
	}
	@Test(dependsOnMethods="ImplementationOfQueueInPython")
    public void TryHereLinkImplementationOfQueueInPython(){
		String url="https://dsportalapp.herokuapp.com/queue/implementation-lists/";
		driver.get(url);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Implementation Of Queue In Python");
    	
    }
	@Test(dependsOnMethods="TryHereLinkImplementationOfQueueInPython")
    public void TextboxToEnterTheCode_ImplementationOfQueueInPython() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	@Test(priority=4)
	public void ImplementationUsingCollectionsDeque() {
		String url="https://dsportalapp.herokuapp.com/queue/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ImplementationUsingCollectionsDeque=driver.findElement(By.partialLinkText("Implementation"));
		ImplementationUsingCollectionsDeque.click();
		LoggerLoad.info("User can click on: Implementation Using Collections . Deque");
	}
	@Test(dependsOnMethods="ImplementationUsingCollectionsDeque")
	public void TryHereImplementationUsingCollectionsDequeClick() {
		String url="https://dsportalapp.herokuapp.com/queue/implementation-collections/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Implementation Using Collections . Deque");		
	}
	@Test(dependsOnMethods="TryHereImplementationUsingCollectionsDequeClick")
    public void TextboxToEnterTheCode_ImplementationUsingCollectionsDequeClick() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
}
	@Test(priority=5)
	public void ImplementationUsingArrayClick() {
		String url="https://dsportalapp.herokuapp.com/queue/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ImplementationUsingArray=driver.findElement(By.partialLinkText("Implementation"));
		ImplementationUsingArray.click();
		LoggerLoad.info("User can click on Implementation Using Array");
		
	}
	@Test(dependsOnMethods="ImplementationUsingArrayClick")
	public void TryHereImplementationUsingArrayClick() {
		String url="https://dsportalapp.herokuapp.com/queue/Implementation-array";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Implementation Using Array Click");
		
	}
	@Test(dependsOnMethods="TryHereImplementationUsingArrayClick")
    public void TextboxToEnterTheCode_ImplementationUsingArrayClick() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
	@Test(priority=6)
	public void QueueOperations() {
		String url="https://dsportalapp.herokuapp.com/queue/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement QueueOperations=driver.findElement(By.partialLinkText("Queue"));
		QueueOperations.click();
		LoggerLoad.info("User can click on Queue Operations");
		
	}
	@Test(dependsOnMethods="QueueOperations")
	public void TryHereQueueOperations() {
		String url="https://dsportalapp.herokuapp.com/queue/QueueOp/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement tryherelink=driver.findElement(By.partialLinkText("here"));
		tryherelink.click();
		LoggerLoad.info("User can click on Try Here Link of Queue Operations");
		
	}
	@Test(dependsOnMethods="QueueOperations")
    public void TextboxToEnterTheCode_QueueOperations() {
		String url="https://dsportalapp.herokuapp.com/tryEditor";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement txtforruncode=driver.findElement(By.xpath("//form[@id='answer_form']//div//div//div//textarea"));
		txtforruncode.sendKeys("print(\"Hello\")");
		WebElement btnRun=driver.findElement(By.xpath("//button[@type='button']"));
		btnRun.click();
	}
}


		
